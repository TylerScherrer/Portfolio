from PyQt5.QtWidgets import QLabel, QVBoxLayout, QPushButton, QScrollArea, QWidget, QMessageBox
import webbrowser
from APIClient import APIClient
class FoodSearchManager:
    def __init__(self, api_client: APIClient):
        self.api_client = api_client
        self.result_window = None  # Keep the result window in scope

    def search_food(self, query: str, page_size=10):  # Accept page_size parameter
        access_token = self.api_client.get_access_token()
        print(f"Access Token: {access_token}")  # Debug statement
        return self.api_client.search_food(query, access_token, page_size=page_size)  # Pass page_size to the APIClient method

    def display_food_search_results(self, foods, access_token):
        if self.result_window:
            self.result_window.close()

        self.result_window = QWidget()
        self.result_window.setWindowTitle("Search Results")
        self.result_window.resize(600, 400)

        layout = QVBoxLayout(self.result_window)
        scroll_area = QScrollArea()
        scroll_area.setWidgetResizable(True)
        content_widget = QWidget()
        scroll_area.setWidget(content_widget)
        content_layout = QVBoxLayout(content_widget)

        if isinstance(foods, dict):
            foods = [foods]

        for food in foods:
            food_id = food['food_id']
            food_name = food.get('food_name', 'N/A')
            brand_name = food.get('brand_name', 'Generic')

            result_button = QPushButton(f'{food_name} ({brand_name})')
            result_button.clicked.connect(lambda _, fid=food_id: self.open_food_details_link(fid, access_token))
            content_layout.addWidget(result_button)

        layout.addWidget(scroll_area)
        self.result_window.show()

    def open_food_details_link(self, food_id, access_token):
        food_details = self.api_client.get_food_details(food_id, access_token)
        print(f"Food Details: {food_details}")  # Debug statement
        if not food_details:
            QMessageBox.warning(None, 'Data Error', 'Failed to retrieve food details')
            return

        food_url = food_details.get('food_url', None)
        print(f"Food URL: {food_url}")  # Debug statement
        if food_url:
            webbrowser.open(food_url)
        else:
            QMessageBox.warning(None, 'URL Error', 'No URL available for this food item')
