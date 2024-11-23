from PyQt5.QtWidgets import QLabel, QVBoxLayout, QLineEdit, QPushButton, QMessageBox, QHBoxLayout, QWidget, QDateEdit
from PyQt5.QtCore import QDate
import sqlite3

class CalorieTracker:
    def __init__(self, db_path):
        self.db_connection = sqlite3.connect(db_path)
        self.total_calories = 0
        self.total_protein = 0
        self.total_fat = 0
        self.total_carbs = 0
        self.total_calories_label = QLabel("Total Calories: 0")  
        self.total_protein_label = QLabel("Total Protein: 0")  
        self.total_fat_label = QLabel("Total Fat: 0")  
        self.total_carbs_label = QLabel("Total Carbs: 0")  
        self.load_total_nutrients(QDate.currentDate().toString("yyyy-MM-dd"))

    def setup_ui(self, layout):
        self.food_name_input = QLineEdit()
        self.food_name_input.setPlaceholderText("Food name")
        layout.addWidget(self.food_name_input)

        self.calorie_input = QLineEdit()
        self.calorie_input.setPlaceholderText("Calories")
        layout.addWidget(self.calorie_input)

        self.protein_input = QLineEdit()
        self.protein_input.setPlaceholderText("Protein (g)")
        layout.addWidget(self.protein_input)

        self.fat_input = QLineEdit()
        self.fat_input.setPlaceholderText("Fat (g)")
        layout.addWidget(self.fat_input)

        self.carbs_input = QLineEdit()
        self.carbs_input.setPlaceholderText("Carbs (g)")
        layout.addWidget(self.carbs_input)

        self.date_input = QDateEdit(QDate.currentDate())
        self.date_input.setCalendarPopup(True)
        layout.addWidget(self.date_input)

        self.add_food_button = QPushButton("Add Food")
        self.add_food_button.clicked.connect(self.add_food)
        layout.addWidget(self.add_food_button)

        layout.addWidget(self.total_calories_label)  
        layout.addWidget(self.total_protein_label)  
        layout.addWidget(self.total_fat_label)  
        layout.addWidget(self.total_carbs_label)  

        self.food_list_layout = QVBoxLayout()
        layout.addLayout(self.food_list_layout)

        self.view_totals_button = QPushButton("View Daily Totals")
        self.view_totals_button.clicked.connect(self.view_daily_totals)
        layout.addWidget(self.view_totals_button)

    def load_total_nutrients(self, date):
        cursor = self.db_connection.cursor()
        cursor.execute("SELECT SUM(Calories), SUM(Protein), SUM(Fat), SUM(Carbs) FROM Calorie_Counter WHERE date = ?", (date,))
        result = cursor.fetchone()
        self.total_calories = result[0] if result[0] is not None else 0
        self.total_protein = result[1] if result[1] is not None else 0
        self.total_fat = result[2] if result[2] is not None else 0
        self.total_carbs = result[3] if result[3] is not None else 0
        self.update_labels()

    def update_labels(self):
        self.total_calories_label.setText(f"Total Calories: {self.total_calories}")
        self.total_protein_label.setText(f"Total Protein: {self.total_protein}")
        self.total_fat_label.setText(f"Total Fat: {self.total_fat}")
        self.total_carbs_label.setText(f"Total Carbs: {self.total_carbs}")

    def add_food(self):
        food_name = self.food_name_input.text()
        calorie_value = self.calorie_input.text()
        protein_value = self.protein_input.text()
        fat_value = self.fat_input.text()
        carbs_value = self.carbs_input.text()
        date = self.date_input.date().toString("yyyy-MM-dd")
        
        if not food_name or not calorie_value or not protein_value or not fat_value or not carbs_value:
            QMessageBox.warning(self.add_food_button, 'Input Error', 'Please enter all values')
            return

        try:
            calorie_value = float(calorie_value)
            protein_value = float(protein_value)
            fat_value = float(fat_value)
            carbs_value = float(carbs_value)
            cursor = self.db_connection.cursor()
            cursor.execute("INSERT INTO Calorie_Counter (Food, Calories, Protein, Fat, Carbs, date) VALUES (?, ?, ?, ?, ?, ?)", 
                           (food_name, calorie_value, protein_value, fat_value, carbs_value, date))
            self.db_connection.commit()
        except ValueError:
            QMessageBox.warning(self.add_food_button, 'Input Error', 'Please enter valid numbers')
            return

        self.load_total_nutrients(date)
        self.load_food_list(date)

    def load_food_list(self, date):
        cursor = self.db_connection.cursor()
        cursor.execute("SELECT id, Food, Calories, Protein, Fat, Carbs FROM Calorie_Counter WHERE date = ?", (date,))
        rows = cursor.fetchall()
        for i in reversed(range(self.food_list_layout.count())): 
            self.food_list_layout.itemAt(i).widget().setParent(None)

        for row in rows:
            food_label = QLabel(f"{row[1]} - Calories: {row[2]}, Protein: {row[3]}, Fat: {row[4]}, Carbs: {row[5]}")
            remove_button = QPushButton("Remove")
            remove_button.clicked.connect(lambda _, food_id=row[0]: self.remove_food(food_id))
            food_layout = QHBoxLayout()
            food_layout.addWidget(food_label)
            food_layout.addWidget(remove_button)
            food_widget = QWidget()
            food_widget.setLayout(food_layout)
            self.food_list_layout.addWidget(food_widget)

    def remove_food(self, food_id):
        cursor = self.db_connection.cursor()
        cursor.execute("DELETE FROM Calorie_Counter WHERE id = ?", (food_id,))
        self.db_connection.commit()
        date = self.date_input.date().toString("yyyy-MM-dd")
        self.load_total_nutrients(date)
        self.load_food_list(date)

    def subtract_calories(self):
        calorie_value = self.calorie_input.text()
        protein_value = self.protein_input.text()
        fat_value = self.fat_input.text()
        carbs_value = self.carbs_input.text()
        date = self.date_input.date().toString("yyyy-MM-dd")

        if not calorie_value or not protein_value or not fat_value or not carbs_value:
            QMessageBox.warning(self.subtract_calories_button, 'Input Error', 'Please enter values to subtract')
            return

        try:
            calorie_value = float(calorie_value)
            protein_value = float(protein_value)
            fat_value = float(fat_value)
            carbs_value = float(carbs_value)
            cursor = self.db_connection.cursor()
            cursor.execute("INSERT INTO Calorie_Counter (Food, Calories, Protein, Fat, Carbs, date) VALUES ('Calorie Adjustment', ?, ?, ?, ?, ?)", 
                           (-calorie_value, -protein_value, -fat_value, -carbs_value, date))
            self.db_connection.commit()
        except ValueError:
            QMessageBox.warning(self.subtract_calories_button, 'Input Error', 'Please enter valid numbers')
            return

        self.load_total_nutrients(date)
        self.load_food_list(date)

    def view_daily_totals(self):
        cursor = self.db_connection.cursor()
        cursor.execute("SELECT date, SUM(Calories), SUM(Protein), SUM(Fat), SUM(Carbs) FROM Calorie_Counter GROUP BY date")
        rows = cursor.fetchall()

        if not rows:
            QMessageBox.information(None, 'No Data', 'No records found.')
            return

        message = "Daily Totals:\n\n"
        for row in rows:
            message += (f"Date: {row[0]}\n"
                        f"  Calories: {row[1]}\n"
                        f"  Protein: {row[2]}\n"
                        f"  Fat: {row[3]}\n"
                        f"  Carbs: {row[4]}\n\n")
        
        QMessageBox.information(None, 'Daily Totals', message)
