from PyQt5.QtWidgets import QLabel, QVBoxLayout, QLineEdit, QPushButton, QMessageBox, QListWidget, QListWidgetItem
import sqlite3
import matplotlib.pyplot as plt

class WeightTracker:
    def __init__(self, db_path):
        self.db_path = db_path
        self.conn = sqlite3.connect(self.db_path)
        self.cursor = self.conn.cursor()
        self._create_table()

    def _create_table(self):
        self.cursor.execute('''
            CREATE TABLE IF NOT EXISTS weights (
                date TEXT,
                weight REAL
            )
        ''')
        self.conn.commit()

    def setup_ui(self, layout):
        self.date_input = QLineEdit()
        self.date_input.setPlaceholderText("Date (YYYY-MM-DD)")
        layout.addWidget(self.date_input)

        self.weight_input = QLineEdit()
        self.weight_input.setPlaceholderText("Weight")
        layout.addWidget(self.weight_input)

        self.add_weight_button = QPushButton("Add Weight")
        self.add_weight_button.clicked.connect(self.add_weight)
        layout.addWidget(self.add_weight_button)

        self.plot_weight_button = QPushButton("Plot Weights")
        self.plot_weight_button.clicked.connect(self.plot_weights)
        layout.addWidget(self.plot_weight_button)

        self.weight_list = QListWidget()
        layout.addWidget(self.weight_list)

        self.remove_weight_button = QPushButton("Remove")
        self.remove_weight_button.clicked.connect(self.remove_weight)
        layout.addWidget(self.remove_weight_button)

        self.load_weights()

    def add_weight(self):
        date = self.date_input.text()
        weight = self.weight_input.text()
        if not date or not weight:
            QMessageBox.warning(self.add_weight_button, 'Input Error', 'Please enter both date and weight')
            return

        try:
            weight = float(weight)
        except ValueError:
            QMessageBox.warning(self.add_weight_button, 'Input Error', 'Please enter a valid number for weight')
            return

        self.cursor.execute('INSERT INTO weights (date, weight) VALUES (?, ?)', (date, weight))
        self.conn.commit()

        self.load_weights()

    def load_weights(self):
        self.weight_list.clear()
        self.cursor.execute('SELECT rowid, date, weight FROM weights ORDER BY date')
        for rowid, date, weight in self.cursor.fetchall():
            item_text = f"Date: {date}, Weight: {weight}"
            item = QListWidgetItem(item_text)
            item.setData(1, rowid)
            self.weight_list.addItem(item)

    def remove_weight(self):
        selected_item = self.weight_list.currentItem()
        if not selected_item:
            QMessageBox.warning(self.remove_weight_button, 'Selection Error', 'Please select an item to remove')
            return

        rowid = selected_item.data(1)
        self.cursor.execute('DELETE FROM weights WHERE rowid = ?', (rowid,))
        self.conn.commit()

        self.load_weights()

    def plot_weights(self):
        self.cursor.execute('SELECT date, weight FROM weights ORDER BY date')
        data = self.cursor.fetchall()
        if not data:
            QMessageBox.warning(self.plot_weight_button, 'No Data', 'No data to plot')
            return

        dates, weights = zip(*data)
        plt.figure()
        plt.plot(dates, weights, marker='o')
        plt.xlabel('Date')
        plt.ylabel('Weight')
        plt.title('Weight Tracker')
        plt.xticks(rotation=45)
        plt.tight_layout()
        plt.show()
