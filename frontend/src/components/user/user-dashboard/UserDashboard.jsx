import {Navbar2} from '../../navbar1/Navbar1.jsx';
import styles from "./UserDashboard.module.css"
import {LinkButton} from '../../commonButton/CommonButton.jsx';
import React, { useState, useEffect } from 'react';
import { Link,useParams } from 'react-router-dom';
import ClientService from '../../../services/ClientService';
import Client from '../../../models/Client';
const UserDashboard = () => {
  const [clients, setClients] = useState([]);
  const params = useParams();
  useEffect(() => {
      const fetchClients= async () => {
      try{
          const clientService = new ClientService();
          const client  = await clientService.getUserInfo();
          const clientList = new Client(client.id,client.address,client.firstName,client.lastName,client.email,client.dob,client.password,client.vehicles);
          setClients(clientList);
          localStorage.setItem('clientId', fetchedClient.id);
          console.log(client);
          }
          catch(error) {
              console.error('Error fetching Clients:', error);
          };
      }
     fetchClients();
  }, [params]);
    return (
      <div>
        <Navbar2/>
        <div className={styles.pinkElipse}></div>
        <div className={styles.blueCircle}></div>
        <div className={styles.welcome}>Welcome, {clients.firstName}</div>
        <div className={styles.mainContainer}>
        <div className={styles.row1}>
        <LinkButton to = "../create-claim" className= {styles.claim}>Claim</LinkButton>
        <LinkButton to="../bill" className= {styles.bills}>Bills</LinkButton>
        <LinkButton to="../vehicles" className= {styles.vehicles}>Vehicles</LinkButton>
        </div>
        <div className={styles.row2}>
        <LinkButton to ="../info-quote" className= {styles.quote} >Quote</LinkButton>
        <LinkButton to ="../profile" className= {styles.profile}>Profile</LinkButton>
          </div>
        </div>
      </div>
    )            
}

export default UserDashboard




