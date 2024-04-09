// services/ClientService.js
import axios from 'axios';
class VehicleService {
  constructor() {
    this.employees = [];
    this.instance = axios.create({
      withCredentials: true})
  }

  addVehicle(vehicle) {
    console.log(vehicle);
      return this.instance.post('http://localhost:8080/api/vehicles/vehicle', vehicle)
            .then(response => response.data)
            .catch(error => {
                console.error('Error adding Vehicle:', error);
                throw error; // Propagate error to caller
            });
  }

  getVehicleById(id) {
    return axios.get(`http://localhost:8080/api/vehicles/vehicle/${id}`)
        .then(response => response.data)
        .catch(error => {
            console.error('Error fetching Vehicle by ID:', error);
            throw error; // Propagate error to caller
        });
}

  getAllVehicles() {
    return axios.get('http://localhost:8080/api/vehicles/vehicle')
        .then(response => response.data)
        .catch(error => {
            console.error('Error fetching Vehicle:', error);
            throw error; // Propagate error to caller
        });
}
}

export default VehicleService;
