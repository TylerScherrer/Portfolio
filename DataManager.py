import sqlite3
from datetime import datetime

class DataManager:
    def __init__(self, db_path='workouts.db'):
        self.conn = sqlite3.connect(db_path)
        self.cursor = self.conn.cursor()
        self._create_calories_steps_table()

    def _create_calories_steps_table(self):
        self.cursor.execute('''
            CREATE TABLE IF NOT EXISTS calories_steps (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                date TEXT,
                calories REAL,
                steps REAL
            )
        ''')
        self.conn.commit()

    def save_data_to_db(self, steps, calories_burned):
        date = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
        self.cursor.execute("INSERT INTO calories_steps (steps, calories, date) VALUES (?, ?, ?)", (steps, calories_burned, date))
        self.conn.commit()

    def load_historical_data(self):
        self.cursor.execute("SELECT date, calories, steps FROM calories_steps ORDER BY date DESC")
        return self.cursor.fetchall()

    def remove_data_entry(self, date):
        self.cursor.execute("DELETE FROM calories_steps WHERE date = ?", (date,))
        self.conn.commit()

    def close(self):
        self.conn.close()
