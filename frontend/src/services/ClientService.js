// services/ClientService.js
import axios from 'axios';
class ClientService {
  constructor() {
    this.employees = [];
  }

  addClient(client) {
      return axios.post('http://localhost:8080/api/clients/client', client)
            .then(response => response.data)
            .catch(error => {
                console.error('Error adding user:', error);
                throw error; // Propagate error to caller
            });
  }

  getClientById(id) {
    return axios.get(`http://localhost:8080/api/clients/client/${id}`)
        .then(response => response.data)
        .catch(error => {
            console.error('Error fetching client by ID:', error);
            throw error; // Propagate error to caller
        });
}

  getAllClients() {
    return axios.get('http://localhost:8080/api/clients/client')
        .then(response => response.data)
        .catch(error => {
            console.error('Error fetching Clients:', error);
            throw error; // Propagate error to caller
        });
}
}

export default ClientService;
