
import {Navbar2} from '../../navbar1/Navbar1.jsx';
import styles from "./UserAddVehicle.module.css";
import {HomeLinkButton, MultipurposeButton} from '../../commonButton/CommonButton.jsx';

const UserAddVehicle= () => {
return (
    <div>
    <Navbar2/>
    <div className={styles.pinkElipse}></div>
    <div className={styles.blueCircle}></div>
    <div className = {styles.head}>User Information</div>
    <div className={styles.container}>
    <input type="text" className={styles.infoholder} placeholder="VIN" />
      <input type="text" className={styles.infoholder} placeholder="Year" />
      <input type="text" className={styles.infoholder} placeholder="Make" />
      <input type="text" className={styles.infoholder} placeholder="Model" />
      <input type="text" className={styles.infoholder} placeholder="Mileage" />
    </div>
    <div className={styles.buttonRow}>
    <HomeLinkButton/>
    <MultipurposeButton>Add a vehicle</MultipurposeButton>
    </div>
    </div>
  );
}

export default UserAddVehicle;