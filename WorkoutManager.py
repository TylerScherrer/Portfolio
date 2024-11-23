import sqlite3
import os
import requests
from typing import List, Dict, Tuple
from PyQt5.QtWidgets import QLabel, QVBoxLayout, QHBoxLayout, QCheckBox, QPushButton, QLineEdit, QMessageBox
import webbrowser

class WorkoutManager:
    def __init__(self, refresh_ui_callback=None):
        self.db_path = os.path.join(os.getcwd(), 'workouts.db')
        self.conn = sqlite3.connect(self.db_path)
        self.cursor = self.conn.cursor()
        self._create_table()
        self._verify_schema()
        self.refresh_ui_callback = refresh_ui_callback

    def _create_table(self):
        self.cursor.execute('''
            CREATE TABLE IF NOT EXISTS workouts (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                name TEXT,
                body_part TEXT,
                equipment TEXT,
                target TEXT,
                secondary_muscles TEXT,
                instructions TEXT,
                gif_url TEXT,
                current_weight REAL DEFAULT 0,
                removed INTEGER DEFAULT 0
            )
        ''')
        self.conn.commit()
        print("Table 'workouts' created or already exists.")  # Debug line

    def _verify_schema(self):
        self.cursor.execute("PRAGMA table_info(workouts)")
        columns = [column[1] for column in self.cursor.fetchall()]
        print("Current schema columns:", columns)  # Debug line
        if 'removed' not in columns:
            print("Column 'removed' does not exist. Adding it now.")
            self.cursor.execute('ALTER TABLE workouts ADD COLUMN removed INTEGER DEFAULT 0')
            self.conn.commit()

    def add_workout(self, result: Dict):
        print("Adding workout to 'workouts' table:", result)  # Debug line
        workout = self.get_workout_by_name(result.get('name', ''))
        if workout:
            self.cursor.execute('''
                UPDATE workouts SET 
                    body_part = ?, 
                    equipment = ?, 
                    target = ?, 
                    secondary_muscles = ?, 
                    instructions = ?, 
                    gif_url = ?,
                    removed = 0
                WHERE name = ?
            ''', (
                result.get('bodyPart', 'N/A'),
                result.get('equipment', 'N/A'),
                result.get('target', 'N/A'),
                ', '.join(result.get('secondaryMuscles', [])),
                '\n'.join(result.get('instructions', [])),
                result.get('gifUrl', ''),
                result.get('name', 'N/A')
            ))
        else:
            self.cursor.execute('''
                INSERT INTO workouts (
                    name, 
                    body_part, 
                    equipment, 
                    target, 
                    secondary_muscles, 
                    instructions, 
                    gif_url, 
                    current_weight,
                    removed
                ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
            ''', (
                result.get('name', 'N/A'),
                result.get('bodyPart', 'N/A'),
                result.get('equipment', 'N/A'),
                result.get('target', 'N/A'),
                ', '.join(result.get('secondaryMuscles', [])),
                '\n'.join(result.get('instructions', [])),
                result.get('gifUrl', ''),
                result.get('current_weight', 0),
                0
            ))
        self.conn.commit()
        print("Database contents after insertion:")
        self.debug_database_contents()  # Debugging line
        if self.refresh_ui_callback:
            self.refresh_ui_callback()

    def update_current_weight(self, name: str, new_weight: float):
        print(f"Updating weight for {name} to {new_weight}")  # Debug line
        self.cursor.execute('UPDATE workouts SET current_weight = ? WHERE name = ?', (new_weight, name))
        self.conn.commit()
        print(f"Updated weight for {name}")
        self.debug_database_contents()  # Debugging line
        if self.refresh_ui_callback:
            self.refresh_ui_callback()

    def load_saved_workouts(self) -> List[Tuple]:
        self.cursor.execute('SELECT name, body_part, equipment, target, secondary_muscles, instructions, gif_url, current_weight FROM workouts WHERE removed = 0')
        workouts = self.cursor.fetchall()
        print("Fetched saved workouts:", workouts)  # Debug line
        return workouts

    def get_workout_by_name(self, name: str) -> Dict:
        self.cursor.execute('SELECT name, body_part, equipment, target, secondary_muscles, instructions, gif_url, current_weight FROM workouts WHERE name = ?', (name,))
        row = self.cursor.fetchone()
        if row:
            return {
                'name': row[0],
                'body_part': row[1],
                'equipment': row[2],
                'target': row[3],
                'secondary_muscles': row[4],
                'instructions': row[5],
                'gif_url': row[6],
                'current_weight': row[7]
            }
        return None

    def format_exercise_details(self, exercises: List[Dict]) -> List[str]:
        details = []
        for exercise in exercises:
            detail = (
                f"Name: {exercise.get('name', 'N/A')}\n"
                f"Body Part: {exercise.get('bodyPart', 'N/A')}\n"
                f"Equipment: {exercise.get('equipment', 'N/A')}\n"
                f"Target Muscle: {exercise.get('target', 'N/A')}\n"
                f"Secondary Muscles: {', '.join(exercise.get('secondaryMuscles', []))}\n"
                f"Instructions: {' '.join(exercise.get('instructions', []))}\n"
                f"Gif URL: {exercise.get('gifUrl', 'N/A')}\n"
            )
            details.append(detail)
        return details

    def sort_exercises_by_body_part(self, exercises: List) -> Dict[str, Dict[str, List]]:
        sorted_exercises = {
            "neck": {}, "chest": {}, "shoulders": {}, "waist": {}, "upper arms": {}, "lower arms": {}, "upper legs": {}, "lower legs": {}, "back": {}
        }
        for exercise in exercises:
            if isinstance(exercise, dict):
                body_part = exercise.get('bodyPart', 'other').lower()
                target_muscle = exercise.get('target', 'other').lower()
            elif isinstance(exercise, tuple):
                body_part = exercise[1].lower()
                target_muscle = exercise[3].lower()
            if body_part in sorted_exercises:
                if target_muscle not in sorted_exercises[body_part]:
                    sorted_exercises[body_part][target_muscle] = []
                sorted_exercises[body_part][target_muscle].append(exercise)
        return sorted_exercises

    def remove_workout(self, name: str):
        print(f"Marking workout as removed in 'workouts' table: {name}")  # Debug line
        self.cursor.execute('UPDATE workouts SET removed = 1 WHERE name = ?', (name,))
        self.conn.commit()
        print(f"Marked workout as removed: {name}")
        self.debug_database_contents()  # Debugging line
        self.send_remove_request(name)
        if self.refresh_ui_callback:
            self.refresh_ui_callback()

    def send_remove_request(self, name: str):
        try:
            response = requests.post("http://192.168.1.67:5000/delete_workout", json={"name": name})
            response.raise_for_status()
            print(f"Removed workout '{name}' from server: {response.json()}")
        except requests.exceptions.RequestException as e:
            print(f"Failed to remove workout '{name}' from server: {e}")

    def debug_database_contents(self):
        self.cursor.execute('SELECT * FROM workouts')
        rows = self.cursor.fetchall()
        print("Current database contents:")
        for row in rows:
            print(row)
            
    def send_workout_log(self):
        workouts = self.load_saved_workouts()
        workout_log_data = []
        for workout in workouts:
            workout_log_data.append({
                'name': workout[0],
                'body_part': workout[1],
                'equipment': workout[2],
                'target': workout[3],
                'secondary_muscles': workout[4],
                'instructions': workout[5],
                'gif_url': workout[6],
                'current_weight': workout[7]
            })

        try:
            response = requests.post("http://192.168.1.67:5000/upload_workout_log", json=workout_log_data)
            response.raise_for_status()
            print("Workout log data sent successfully:", response.json())
        except requests.exceptions.RequestException as e:
            print("Failed to send workout log data:", e)