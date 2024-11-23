from PyQt5 import QtWidgets, QtCore, QtGui
from PyQt5.QtWidgets import QMessageBox, QLineEdit, QPushButton, QVBoxLayout, QAbstractScrollArea, QLabel, QWidget, QScrollArea, QMainWindow, QCheckBox, QTabWidget, QApplication, QHBoxLayout, QTableWidget, QTableWidgetItem
from PyQt5.QtCore import QThread, pyqtSignal, QObject
import requests
import webbrowser
import sys
import sqlite3
from datetime import datetime
from APIClient import APIClient
from WorkoutManager import WorkoutManager
from FoodSearchManager import FoodSearchManager
from CalorieTracker import CalorieTracker
from WeightTracker import WeightTracker

class FetchDataWorker(QThread):
    data_fetched = pyqtSignal(dict)
    error_occurred = pyqtSignal(str)
    def run(self):
        try:
            # Update with your EC2 public IP or DNS
            response = requests.get("http://44.205.253.152:5000/get_data")
            response.raise_for_status()
            data = response.json()
            self.data_fetched.emit(data)
        except requests.exceptions.RequestException as e:
            self.error_occurred.emit(f"Failed to fetch data from server: {e}")
class SendDataWorker(QThread):
    operation_finished = pyqtSignal(bool, str)

    def __init__(self, data, url):
        super().__init__()
        self.data = data
        self.url = url

    def run(self):
        try:
            response = requests.post(self.url, json=self.data)
            response.raise_for_status()
            self.operation_finished.emit(True, "Data sent successfully.")
        except requests.exceptions.RequestException as e:
            self.operation_finished.emit(False, str(e))
class UpdateDatabaseWorker(QThread):
    update_finished = pyqtSignal(bool)
    error_occurred = pyqtSignal(str)

    def run(self):
        try:
            response = requests.get("http://192.168.1.67:5000/workouts")  # Update with your server address
            response.raise_for_status()  # Raise an error for bad status codes
            workouts = response.json()
            self.update_local_database(workouts)
            self.update_finished.emit(True)
        except requests.exceptions.RequestException as e:
            self.error_occurred.emit(f"Failed to update local database: {e}")

    def update_local_database(self, workouts):
        conn = sqlite3.connect('workouts.db')
        cursor = conn.cursor()
        cursor.execute("DELETE FROM workouts")  # Clear the local database table
        for workout in workouts:
            cursor.execute('''
                INSERT INTO workouts (
                    id, name, body_part, equipment, target, secondary_muscles, instructions, gif_url, current_weight, removed
                ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
            ''', (
                workout.get('id'),
                workout.get('name', 'N/A'),
                workout.get('body_part', 'N/A'),
                workout.get('equipment', 'N/A'),
                workout.get('target', 'N/A'),
                workout.get('secondary_muscles', 'N/A'),
                workout.get('instructions', 'N/A'),
                workout.get('gif_url', 'N/A'),
                workout.get('current_weight', 0),
                workout.get('removed', 0)
            ))
        conn.commit()
        conn.close()

class NewWorkoutApp(QMainWindow):
    def __init__(self):
        super().__init__()
        self.api_client = APIClient(api_key='5bb7774cfbmsh9661168222eb665p159dbbjsn33e914c2c4ac',
                                    api_host='exercisedb.p.rapidapi.com',
                                    client_id='33d97a69f98a433d879aff6f8f5c9e80',
                                    client_secret='010f67ffdc1f43fb81647c54c0b1f379')
        self.workout_manager = WorkoutManager(refresh_ui_callback=self.refresh_ui)
        self.food_search_manager = FoodSearchManager(self.api_client)
        self.calorie_tracker = CalorieTracker(db_path='workouts.db')
        self.weight_tracker = WeightTracker(db_path='workouts.db')
        self.db_connection = sqlite3.connect('workouts.db')  # Initialize db_connection
        self.initUI()
        self.fetch_data_worker = FetchDataWorker()
        self.fetch_data_worker.data_fetched.connect(self.handle_data_fetched)
        self.fetch_data_worker.error_occurred.connect(self.handle_error)
        self.update_database_worker = UpdateDatabaseWorker()
        self.update_database_worker.update_finished.connect(self.handle_update_finished)
        self.update_database_worker.error_occurred.connect(self.handle_error)

    def initUI(self):
        self.setWindowTitle('Fitness and Food Finder')
        self.setGeometry(100, 100, 800, 400)
        self.centralwidget = QWidget(self)
        self.scroll_area = QScrollArea(self)
        self.scroll_area.setWidgetResizable(True)
        self.scroll_area.setWidget(self.centralwidget)
        self.setCentralWidget(self.scroll_area)
        self.main_layout = QVBoxLayout(self.centralwidget)
        self.tabWidget = QTabWidget(self.centralwidget)
        self.main_layout.addWidget(self.tabWidget)
        self.setup_workout_tab()
        self.setup_food_search_tab()
        self.setup_calorie_calculator_tab()
        self.setup_weight_tracker_tab()
        self.setup_workout_log_tab()
        self.setup_data_fetch_tab()
        self.setup_new_workout_search_tab()
        self.apply_styles()

    def setup_new_workout_search_tab(self):
        self.new_workout_tab = QWidget()
        self.tabWidget.addTab(self.new_workout_tab, "New Workout Search")
        self.new_workout_layout = QVBoxLayout(self.new_workout_tab)

        self.new_muscles_input = QLineEdit(self.new_workout_tab)
        self.new_muscles_input.setPlaceholderText("Enter muscles (e.g., biceps)")
        self.new_workout_layout.addWidget(self.new_muscles_input)

        self.new_equipment_input = QLineEdit(self.new_workout_tab)
        self.new_equipment_input.setPlaceholderText("Enter equipment (optional)")
        self.new_workout_layout.addWidget(self.new_equipment_input)

        self.new_intensity_input = QLineEdit(self.new_workout_tab)
        self.new_intensity_input.setPlaceholderText("Enter intensity level (optional)")
        self.new_workout_layout.addWidget(self.new_intensity_input)

        self.new_search_button = QPushButton("Search", self.new_workout_tab)
        self.new_search_button.clicked.connect(self.search_new_workouts)
        self.new_workout_layout.addWidget(self.new_search_button)

        self.new_results_area = QScrollArea(self.new_workout_tab)
        self.new_results_area.setWidgetResizable(True)
        self.new_results_content = QWidget()
        self.new_results_layout = QVBoxLayout(self.new_results_content)
        self.new_results_area.setWidget(self.new_results_content)
        self.new_workout_layout.addWidget(self.new_results_area)

    def search_new_workouts(self):
        muscles = self.new_muscles_input.text()
        equipment = self.new_equipment_input.text()
        intensity = self.new_intensity_input.text()
        if not muscles:
            QMessageBox.warning(self, 'Input Error', 'Please enter at least the muscles.')
            return

        try:
            results = self.api_client.search_exercises_by_new_api(muscles, equipment, intensity)
            print(f"API Results: {results}")  # Debugging output
            self.display_new_workout_results(results)
        except requests.exceptions.RequestException as e:
            QMessageBox.critical(self, 'API Error', f'Failed to search for workouts: {e}')
        except KeyError as e:
            QMessageBox.critical(self, 'API Error', f'Missing expected key in API response: {e}')
            print(f"API Response Keys: {results[0].keys()}")  # Debugging output


    def display_new_workout_results(self, results):
        # Clear previous results
        for i in reversed(range(self.new_results_layout.count())):
            widget = self.new_results_layout.itemAt(i).widget()
            if widget is not None:
                widget.deleteLater()

        for result in results:
            name = result.get('WorkOut', 'N/A')
            muscles = result.get('Muscles', 'N/A')
            equipment = result.get('Equipment', 'N/A')
            intensity_level = result.get('Intensity_Level', 'N/A')

            result_label = QLabel(
                f"Name: {name}\n"
                f"Muscles: {muscles}\n"
                f"Equipment: {equipment}\n"
                f"Intensity Level: {intensity_level}"
            )
            result_label.setWordWrap(True)
            self.new_results_layout.addWidget(result_label)



    def apply_styles(self):
        self.setStyleSheet("""
            QMainWindow {
                background-color: #F0F0F0;
            }
            QTabWidget::pane {
                border: 1px solid #CCCCCC;
                background: #FFFFFF;
            }
            QTabBar::tab {
                background: #E0E0E0;
                border: 1px solid #CCCCCC;
                padding: 10px 20px;
            }
            QTabBar::tab:selected {
                background: #FFFFFF;
                font-weight: normal;
            }
            QPushButton {
                background-color: #007BFF;
                color: white;
                border: none;
                padding: 8px 16px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 14px;
                margin: 2px 1px;
                cursor: pointer;
                border-radius: 8px;
            }
            QPushButton:hover {
                background-color: #4169e1;
            }
            QLineEdit {
                border: 1px solid #CCCCCC;
                padding: 8px;
                border-radius: 4px;
            }
            QLabel {
                font-size: 12px;
                color: #333333;
            }
            QTableWidget {
                border: 1px solid #CCCCCC;
                background: #FFFFFF;
            }
            QHeaderView::section {
                background-color: #E0E0E0;
                padding: 6px;
                border: 1px solid #CCCCCC;
            }
            QTableWidget::item {
                padding: 8px;
                border: none;
            }
        """)

    def refresh_ui(self):
        self.load_workout_log()

    def setup_calorie_calculator_tab(self):
        self.calorie_tab = QWidget()
        self.tabWidget.addTab(self.calorie_tab, "Calorie Calculator")
        self.calorie_layout = QVBoxLayout(self.calorie_tab)
        self.calorie_tracker.setup_ui(self.calorie_layout)

    def setup_workout_tab(self):
        self.search_tab = QWidget()
        self.tabWidget.addTab(self.search_tab, "Search Workouts")
        self.search_layout = QVBoxLayout(self.search_tab)
        self.lineEdit = QLineEdit(self.search_tab)
        self.search_layout.addWidget(self.lineEdit)
        self.pushButton = QPushButton(self.search_tab)
        self.pushButton.setText("Search")
        self.pushButton.clicked.connect(self.search_workouts)
        self.search_layout.addWidget(self.pushButton)

    def setup_food_search_tab(self):
        self.food_search_tab = QWidget()
        self.tabWidget.addTab(self.food_search_tab, "Search Foods")
        self.food_search_layout = QVBoxLayout(self.food_search_tab)
        self.food_input = QLineEdit(self.food_search_tab)
        self.food_search_layout.addWidget(self.food_input)
        self.food_search_button = QPushButton(self.food_search_tab)
        self.food_search_button.setText("Search")
        self.food_search_button.clicked.connect(self.search_food)
        self.food_search_layout.addWidget(self.food_search_button)

    def setup_weight_tracker_tab(self):
        self.weight_tab = QWidget()
        self.tabWidget.addTab(self.weight_tab, "Weight Tracker")
        self.weight_layout = QVBoxLayout(self.weight_tab)
        self.weight_tracker.setup_ui(self.weight_layout)

    def setup_workout_log_tab(self):
        self.workout_log_tab = QWidget()
        self.tabWidget.addTab(self.workout_log_tab, "Workout Log")
        self.workout_log_layout = QVBoxLayout(self.workout_log_tab)
        
        self.workout_log_table = QTableWidget()
        self.workout_log_table.setColumnCount(9)
        self.workout_log_table.setHorizontalHeaderLabels(["Name", "Body Part", "Equipment", "Target", "Secondary Muscles", "Instructions", "Gif URL", "Current Weight", "Remove"])
        
        self.workout_log_table.setSizePolicy(QtWidgets.QSizePolicy.Expanding, QtWidgets.QSizePolicy.Expanding)
        self.workout_log_table.setMinimumSize(800, 300)
        
        self.workout_log_table.verticalHeader().setDefaultSectionSize(40)
        for column in range(self.workout_log_table.columnCount()):
            self.workout_log_table.setColumnWidth(column, 80)
        
        self.load_workout_log()
        
        self.workout_log_layout.addWidget(self.workout_log_table)
        self.workout_log_layout.addStretch()

        self.send_log_button = QPushButton("Send Workout Log to Server")
        self.send_log_button.clicked.connect(self.send_workout_log)
        self.workout_log_layout.addWidget(self.send_log_button)

        self.update_db_button = QPushButton("Update Local Database with Server Data")
        self.update_db_button.clicked.connect(self.update_database_with_server_data)
        self.workout_log_layout.addWidget(self.update_db_button)

    def setup_data_fetch_tab(self):
        self.data_fetch_tab = QWidget()
        self.tabWidget.addTab(self.data_fetch_tab, "Fetch Data")
        self.data_fetch_layout = QVBoxLayout(self.data_fetch_tab)
        
        self.fetch_data_button = QPushButton("Fetch Data from Server", self.data_fetch_tab)
        self.fetch_data_button.clicked.connect(self.fetch_data_from_server)
        self.data_fetch_layout.addWidget(self.fetch_data_button)
        
        self.data_display_label = QLabel(self.data_fetch_tab)
        self.data_display_label.setWordWrap(True)
        self.data_fetch_layout.addWidget(self.data_display_label)
        
        self.historical_data_table = QTableWidget(self.data_fetch_tab)
        self.historical_data_table.setColumnCount(4)
        self.historical_data_table.setHorizontalHeaderLabels(["Date", "Calories", "Steps", "Remove"])
        self.historical_data_table.setMinimumHeight(200)
        self.data_fetch_layout.addWidget(self.historical_data_table)
        
        self.load_historical_data()

    def load_workout_log(self):
        self.workout_log_table.setRowCount(0)
        saved_workouts = self.workout_manager.load_saved_workouts()
        sorted_workouts = self.workout_manager.sort_exercises_by_body_part(saved_workouts)

        for body_part, target_muscles in sorted_workouts.items():
            body_part_item = QTableWidgetItem(body_part.capitalize())
            body_part_item.setFlags(body_part_item.flags() ^ QtCore.Qt.ItemIsEditable)
            body_part_item.setFont(QtGui.QFont('Arial', 10, QtGui.QFont.Bold))
            body_part_item.setBackground(QtGui.QColor('#C0C0C0'))
            self.workout_log_table.insertRow(self.workout_log_table.rowCount())
            self.workout_log_table.setItem(self.workout_log_table.rowCount() - 1, 0, body_part_item)

            for target_muscle, exercises in target_muscles.items():
                target_muscle_item = QTableWidgetItem(f"  Target Muscle: {target_muscle.capitalize()}")
                target_muscle_item.setFlags(target_muscle_item.flags() ^ QtCore.Qt.ItemIsEditable)
                target_muscle_item.setFont(QtGui.QFont('Arial', 9, QtGui.QFont.StyleItalic))
                self.workout_log_table.insertRow(self.workout_log_table.rowCount())
                self.workout_log_table.setItem(self.workout_log_table.rowCount() - 1, 0, target_muscle_item)

                for exercise in exercises:
                    row_position = self.workout_log_table.rowCount()
                    self.workout_log_table.insertRow(row_position)
                    for column, data in enumerate(exercise):
                        if column == 0:
                            name_item = QTableWidgetItem(str(data))
                            name_item.setFont(QtGui.QFont('Arial', 10, QtGui.QFont.Bold))
                            name_item.setBackground(QtGui.QColor('#ADD8E6'))
                            self.workout_log_table.setItem(row_position, column, name_item)
                        elif column == 5:
                            instructions_button = QPushButton("Instructions")
                            instructions_button.setStyleSheet("background-color: #007BFF; color: white;")
                            instructions_button.clicked.connect(lambda _, text=data: self.show_instructions(text)) 
                            self.workout_log_table.setCellWidget(row_position, column, instructions_button)
                        elif column == 6:
                            gif_button = QPushButton("Open GIF")
                            gif_button.setStyleSheet("background-color: #007BFF; color: white;")
                            gif_button.clicked.connect(lambda _, url=data: webbrowser.open(url))
                            self.workout_log_table.setCellWidget(row_position, column, gif_button)
                        elif column == 7:
                            weight_input = QLineEdit(str(data))
                            weight_input.setValidator(QtGui.QDoubleValidator(0.0, 999.99, 2))
                            weight_input.setMinimumHeight(30)
                            weight_input.editingFinished.connect(lambda row=row_position, name=exercise[0], input_field=weight_input: self.update_weight(name, input_field))
                            self.workout_log_table.setCellWidget(row_position, column, weight_input)
                        else:
                            item = QTableWidgetItem(str(data))
                            item.setTextAlignment(QtCore.Qt.AlignCenter)
                            self.workout_log_table.setItem(row_position, column, item)
                    remove_button = QPushButton("Remove")
                    remove_button.setStyleSheet("background-color: #007BFF; color: white; font-size: 14px;")
                    remove_button.setMinimumHeight(30)
                    remove_button.clicked.connect(lambda _, name=exercise[0]: self.remove_from_log(name))
                    self.workout_log_table.setCellWidget(row_position, 8, remove_button)

        print("Loaded workout log:", saved_workouts)

    def show_instructions(self, instructions):
        msg = QMessageBox()
        msg.setWindowTitle("Instructions")
        msg.setText(instructions)
        msg.exec_()

    def search_workouts(self):
        search_text = self.lineEdit.text()
        results = []

        try:
            if search_text.lower() in ["neck", "chest", "shoulders", "waist", "upper arms", "lower arms", "upper legs", "lower legs", "back"]:
                results = self.api_client.search_exercises_by_body_part(search_text)
            else:
                results = self.api_client.search_exercises_by_name(search_text)
            formatted_details = self.workout_manager.format_exercise_details(results)
            self.show_results_dialog(formatted_details, results)
        except requests.exceptions.RequestException as e:
            print(f"Request failed: {e}")

    def show_results_dialog(self, details, results):
        dialog = QtWidgets.QDialog()
        dialog.setWindowTitle("Search Results")
        dialog.resize(600, 400)

        layout = QVBoxLayout(dialog)
        results_area = QScrollArea(dialog)
        results_area.setWidgetResizable(True)
        results_content = QWidget()
        results_layout = QVBoxLayout(results_content)
        results_area.setWidget(results_content)
        layout.addWidget(results_area)

        sorted_results = self.workout_manager.sort_exercises_by_body_part(results)
        for body_part, target_muscles in sorted_results.items():
            body_part_label = QLabel(body_part.capitalize())
            body_part_label.setStyleSheet("font-weight: bold; font-size: 14px;")
            results_layout.addWidget(body_part_label)

            for target_muscle, muscle_exercises in target_muscles.items():
                target_muscle_label = QLabel(f"  Target Muscle: {target_muscle.capitalize()}")
                target_muscle_label.setStyleSheet("font-weight: bold; font-size: 12px; margin-left: 10px;")
                results_layout.addWidget(target_muscle_label)

                for exercise in muscle_exercises:
                    detail = (
                        f"Name: {exercise.get('name', 'N/A')}\n"
                        f"Body Part: {exercise.get('bodyPart', 'N/A')}\n"
                        f"Equipment: {exercise.get('equipment', 'N/A')}\n"
                        f"Target Muscle: {exercise.get('target', 'N/A')}\n"
                        f"Secondary Muscles: {', '.join(exercise.get('secondaryMuscles', []))}\n"
                        f"Instructions: {' '.join(exercise.get('instructions', []))}\n"
                        f"Gif URL: {exercise.get('gifUrl', 'N/A')}\n"
                    )
                    h_layout = QHBoxLayout()
                    checkbox = QCheckBox()
                    label = QLabel(detail)
                    label.setWordWrap(True)
                    h_layout.addWidget(checkbox)
                    h_layout.addWidget(label)
                    results_layout.addLayout(h_layout)

                    gif_url = exercise.get('gifUrl', '')
                    if gif_url:
                        gif_button = QPushButton("Open Gif")
                        gif_button.clicked.connect(lambda _, url=gif_url: webbrowser.open(url))
                        results_layout.addWidget(gif_button)

                    checkbox.stateChanged.connect(self.create_add_to_saved_lambda(checkbox, label, exercise))

        dialog.exec_()

    def create_add_to_saved_lambda(self, checkbox, label, result):
        return lambda state: self.add_to_saved(checkbox, label, result)

    def add_to_saved(self, checkbox, label, result):
        if checkbox.isChecked():
            self.workout_manager.add_workout(result)
            self.refresh_ui()

    def update_weight(self, name, input_field):
        try:
            new_weight = float(input_field.text())
            self.workout_manager.update_current_weight(name, new_weight)
            QMessageBox.information(self, 'Success', f'Updated weight for {name} to {new_weight}')

            updated_workout = self.workout_manager.get_workout_by_name(name)
            if updated_workout:
                self.refresh_workout_ui(updated_workout)
            self.load_workout_log()
        except ValueError:
            QMessageBox.warning(self, 'Input Error', 'Please enter a valid number for weight')

    def refresh_workout_ui(self, workout):
        pass

    def remove_from_saved(self, name):
        self.workout_manager.remove_workout(name)
        self.load_workout_log()

    def remove_from_log(self, name):
        self.remove_from_saved(name)
        QMessageBox.information(self, 'Success', f'Removed workout {name} from the log')

    def remove_data_entry(self, date):
        cursor = self.db_connection.cursor()
        cursor.execute("DELETE FROM calories_steps WHERE date = ?", (date,))
        self.db_connection.commit()
        self.load_historical_data()
        QMessageBox.information(self, 'Success', f'Removed entry for {date}')

    def search_food(self):
        food_name = self.food_input.text()
        if not food_name:
            QMessageBox.warning(self, 'Input Error', 'Please enter a food name')
            return

        try:
            page_size = 20
            search_results = self.food_search_manager.search_food(food_name, page_size=page_size)
            if not search_results or not search_results.get('foods_search') or not search_results['foods_search'].get('results'):
                QMessageBox.warning(self, 'No Results', 'No food items found')
                return

            access_token = self.api_client.get_access_token()
            self.food_search_manager.display_food_search_results(search_results['foods_search']['results']['food'], access_token)
        except requests.exceptions.RequestException as e:
            QMessageBox.critical(self, 'API Error', f'Failed to search for food: {e}')

    def fetch_data_from_server(self):
        self.fetch_data_worker.start()

    def handle_data_fetched(self, data):
        print("Fetched data from server:", data)
        if 'steps' in data and 'caloriesBurned' in data:
            steps = data.get('steps', 'N/A')
            calories_burned = data.get('caloriesBurned', 'N/A')
            self.data_display_label.setText(f"Steps: {steps}, Calories Burned: {calories_burned}")
            self.save_data_to_db(steps, calories_burned)
        else:
            self.data_display_label.setText("No valid data received")
            print("No valid data received:", data)
        self.load_historical_data()

    def save_data_to_db(self, steps, calories_burned):
        cursor = self.db_connection.cursor()
        date = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
        cursor.execute("INSERT INTO calories_steps (steps, calories, date) VALUES (?, ?, ?)", (steps, calories_burned, date))
        self.db_connection.commit()
        QMessageBox.information(self, 'Success', 'Data saved to database')

    def load_historical_data(self):
        self.historical_data_table.verticalHeader().setDefaultSectionSize(40)

        cursor = self.db_connection.cursor()
        cursor.execute("SELECT date, calories, steps FROM calories_steps ORDER BY date DESC")
        rows = cursor.fetchall()

        self.historical_data_table.setRowCount(0)
        for row in rows:
            row_position = self.historical_data_table.rowCount()
            self.historical_data_table.insertRow(row_position)
            for column, data in enumerate(row):
                item = QTableWidgetItem(str(data))
                item.setTextAlignment(QtCore.Qt.AlignCenter)
                self.historical_data_table.setItem(row_position, column, item)
                self.historical_data_table.setColumnWidth(column, 150)

            remove_button = QPushButton("Remove")
            remove_button.setStyleSheet("background-color: #007BFF; color: white; font-size: 12px; padding: 4px;")
            remove_button.setMinimumHeight(30)
            remove_button.clicked.connect(lambda _, date=row[0]: self.remove_data_entry(date))
            self.historical_data_table.setCellWidget(row_position, 3, remove_button)

    def handle_error(self, error_message):
        QMessageBox.critical(self, 'Error', error_message)
        self.data_display_label.setText(error_message)

    def handle_update_finished(self, success):
        if success:
            QMessageBox.information(self, 'Success', 'Local database updated successfully.')
            self.load_workout_log()
        else:
            QMessageBox.critical(self, 'Error', 'Failed to update the local database.')

    def update_database_with_server_data(self):
        self.update_database_worker.start()

    def closeEvent(self, event):
        self.db_connection.close()
        self.calorie_tracker.db_connection.close()
        self.workout_manager.conn.close()
        event.accept()

    def send_workout_log(self):
        self.workout_manager.send_workout_log()

if __name__ == "__main__":
    app = QApplication(sys.argv)

    ui = NewWorkoutApp()
    ui.show()
    sys.exit(app.exec_())
