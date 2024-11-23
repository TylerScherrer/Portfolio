import requests
from requests.auth import HTTPBasicAuth
from typing import List, Dict

class APIClient:
    def __init__(self, api_key: str, api_host: str, client_id: str, client_secret: str):
        self.api_key = api_key
        self.api_host = api_host
        self.client_id = client_id
        self.client_secret = client_secret
        self.base_url = 'https://exercisedb.p.rapidapi.com/exercises'
        self.token_url = 'https://oauth.fatsecret.com/connect/token'
        self.search_endpoint = 'https://platform.fatsecret.com/rest/server.api'
        self.new_api_url = 'https://work-out-api1.p.rapidapi.com/search'

    def _get_headers(self) -> Dict[str, str]:
        return {
            'X-RapidAPI-Key': self.api_key,
            'X-RapidAPI-Host': self.api_host
        }

    def get_access_token(self) -> str:
        data = {
            'grant_type': 'client_credentials',
            'scope': 'basic premier'
        }
        response = requests.post(self.token_url, auth=HTTPBasicAuth(self.client_id, self.client_secret), data=data)
        response.raise_for_status()
        return response.json().get('access_token')

    def search_exercises_by_name(self, exercise_name: str) -> List[Dict]:
        url = f'{self.base_url}/name/{exercise_name.lower()}'
        response = requests.get(url, headers=self._get_headers())
        response.raise_for_status()
        return response.json()

    def search_exercises_by_body_part(self, body_part: str) -> List[Dict]:
        url = f'{self.base_url}/bodyPart/{body_part.lower()}'
        response = requests.get(url, headers=self._get_headers())
        response.raise_for_status()
        return response.json()

    def search_exercises_by_new_api(self, muscles: str, equipment: str = '', intensity_level: str = '') -> List[Dict]:
        headers = {
            'x-rapidapi-key': self.api_key,
            'x-rapidapi-host': 'work-out-api1.p.rapidapi.com'
        }
        params = {
            'Muscles': muscles,
            'Equipment': equipment,
            'Intensity_Level': intensity_level
        }
        response = requests.get(self.new_api_url, headers=headers, params=params)
        response.raise_for_status()
        return response.json()
