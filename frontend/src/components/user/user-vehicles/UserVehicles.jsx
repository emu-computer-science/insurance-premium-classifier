import {Navbar2} from '../../navbar1/Navbar1.jsx';
import styles from "./UserVehicles.module.css";
import { useNavigate } from 'react-router-dom';
import {HomeLinkButton, MultipurposeButton} from '../../commonButton/CommonButton.jsx';
import VehicleService from '../../../services/VehicleService.js';
import Vehicle from '../../../models/Vehicle.js';
import { Link,useParams } from 'react-router-dom';
import React, { useState, useEffect } from 'react';

const UserInfoQuote= () => {
const navigateAddVehicle = useNavigate();
const handleAddVehicle=() =>
{
  navigateAddVehicle('add-vehicle');
}
const [vehicle, setVehicles] = useState([]);
const params = useParams();
useEffect(() => {
    const fetchVehicles= async () => {
    try{
        const clientId = localStorage.getItem('clientId');
        const vehicleService = new VehicleService();
        const data = await vehicleService.getVehicleById(clientId);
        const vehiclesList = data.map(vehicle  => new Vehicle(vehicle.id,vehicle.vin,vehicle.make,vehicle.model,vehicle.year,vehicle.miles,vehicle.plate));
        setVehicles(vehiclesList);
        }
        catch(error) {
            console.error('Error fetching Vehicle for Client:', error);
        };
    }
   fetchVehicles();
}, [params]);
return (
    

    <div>
    <Navbar2/>
        <div className={styles.pinkElipse}></div>
        <div className={styles.blueCircle}></div>
        <div className = {styles.head}>Your Vehicles</div>
    <div className={styles.userCarRow}>
      <div className={styles.headingRow}>
        {Object.keys(vehicle).map((property, index) => (
          <div key={index}>
            {property}
          </div>
        ))}
        <div>Delete</div>
      </div>
      {vehicle.map((vehicles, vehicleIndex) => (
        <div className={styles.valueRow} key={vehicleIndex}>
          {Object.values(vehicles).map((value, index) => (
            <div key={index}>
              {value}
            </div>
          ))}
        <div >
        <input className={styles.checkbox} type="checkbox" id="carCheckbox"/>
        </div>
        </div>
      ))}
    </div>
    <div className={styles.buttonRow}>
    <HomeLinkButton/>
    <MultipurposeButton onClick={handleAddVehicle}>Add a Vehicle</MultipurposeButton>
    </div>
    </div>

  );
}

export default UserInfoQuote