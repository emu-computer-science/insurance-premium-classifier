import { Navbar2 } from '../../navbar1/Navbar1.jsx';
import styles from "./UserProfile.module.css";
import { HomeLinkButton, MultipurposeButton } from '../../commonButton/CommonButton.jsx';
import React, { useState, useEffect } from 'react';
import { Link,useParams } from 'react-router-dom';
import ClientService from '../../../services/ClientService';
import Client from '../../../models/Client';
const UserProfile = () => {
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
      <Navbar2 />
      <div className={styles.pinkElipse}></div>
      <div className={styles.blueCircle}></div>
      <div className={styles.head}>Your Profile</div>
      <div className={styles.container}>
        <div className={styles.registrationForm}>
          <div>
            <label>First Name:</label>
            <input type="text" className={styles.inputField} placeholder="First Name" value={clients.firstName} />
          </div>
          <div>
            <label>Last Name:</label>
            <input type="text" className={styles.inputField} placeholder="Last Name" value={clients.lastName}  />
          </div>
          <div>
            <label>Date of Birth:</label>
            <input type="text" className={styles.inputField} placeholder="Date of Birth" value={clients.dob}/>
            </div>
          <div>
            <label>Email:</label>
            <input type="email" className={styles.inputField} placeholder="Email" value={clients.email}/>
          </div>
          <HomeLinkButton />
        </div>
        <div className={styles.registrationForm}>
          <div className={styles.text}>Change Password</div>
          <label>
            New Password:
            <input className={styles.password} type="password" placeholder='New Password' />
          </label>
          <div className={styles.passwordStrength}>
            <div className={styles.indicatorText}></div>
          </div>
          <label>
            Re-enter Password:
            <input className={`${styles.password} ${styles.pass3}`} type="password" placeholder='Re-enter Password' />
          </label>
          <MultipurposeButton>Submit</MultipurposeButton>
        </div>
      </div>
    </div>
  )
}

export default UserProfile;
