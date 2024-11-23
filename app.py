from flask import Flask, request, jsonify

app = Flask(__name__)

# This will store the data in memory
data_store = {}
workout_log_store = []

@app.route('/upload_data', methods=['POST'])
def upload_data():
    try:
        data = request.json
        if 'steps' not in data or 'caloriesBurned' not in data:
            raise ValueError("Invalid data format")
        print("Received data:", data)  # Logging the received data
        data_store['latest'] = data
        response = jsonify({"status": "success"})
        response.status_code = 200
        response.headers["Content-Type"] = "application/json"
        return response
    except Exception as e:
        print("Error in upload_data:", str(e))
        response = jsonify({"status": "error", "message": str(e)})
        response.status_code = 500
        response.headers["Content-Type"] = "application/json"
        return response

@app.route('/get_data', methods=['GET'])
def get_data():
    try:
        response = jsonify(data_store.get('latest', {'steps': 0, 'caloriesBurned': 0}))
        response.status_code = 200
        response.headers["Content-Type"] = "application/json"
        return response
    except Exception as e:
        print("Error in get_data:", str(e))
        response = jsonify({"status": "error", "message": str(e)})
        response.status_code = 500
        response.headers["Content-Type"] = "application/json"
        return response

@app.route('/upload_workout_log', methods=['POST'])
def upload_workout_log():
    try:
        data = request.json
        print("Received workout log data:", data)  # Logging the received data
        for workout in data:
            workout['id'] = len(workout_log_store) + 1  # Ensure each workout has a unique id
            workout_log_store.append(workout)
        response = jsonify({"status": "success"})
        response.status_code = 200
        response.headers["Content-Type"] = "application/json"
        return response
    except Exception as e:
        print("Error in upload_workout_log:", str(e))
        response = jsonify({"status": "error", "message": str(e)})
        response.status_code = 500
        response.headers["Content-Type"] = "application/json"
        return response

@app.route('/workouts', methods=['GET'])
def get_workouts():
    try:
        response = jsonify(workout_log_store)
        response.status_code = 200
        response.headers["Content-Type"] = "application/json"
        return response
    except Exception as e:
        print("Error in get_workouts:", str(e))
        response = jsonify({"status": "error", "message": str(e)})
        response.status_code = 500
        response.headers["Content-Type"] = "application/json"
        return response

@app.route('/delete_workout', methods=['POST'])
def delete_workout():
    try:
        data = request.json
        workout_name = data.get('name')
        if not workout_name:
            raise ValueError("Workout name is required")

        global workout_log_store
        workout_log_store = [workout for workout in workout_log_store if workout['name'] != workout_name]

        response = jsonify({"status": "success"})
        response.status_code = 200
        response.headers["Content-Type"] = "application/json"
        return response
    except Exception as e:
        print("Error in delete_workout:", str(e))
        response = jsonify({"status": "error", "message": str(e)})
        response.status_code = 500
        response.headers["Content-Type"] = "application/json"
        return response

@app.route('/update_workout_weight', methods=['POST'])
def update_workout_weight():
    try:
        data = request.json
        workout_name = data.get('name')
        new_weight = data.get('current_weight')
        if not workout_name or new_weight is None:
            raise ValueError("Workout name and new weight are required")

        for workout in workout_log_store:
            if workout['name'] == workout_name:
                workout['current_weight'] = new_weight
                response = jsonify({"status": "success"})
                response.status_code = 200
                response.headers["Content-Type"] = "application/json"
                return response

        raise ValueError("Workout not found")
    except Exception as e:
        print("Error in update_workout_weight:", str(e))
        response = jsonify({"status": "error", "message": str(e)})
        response.status_code = 500
        response.headers["Content-Type"] = "application/json"
        return response

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000, debug=True)
