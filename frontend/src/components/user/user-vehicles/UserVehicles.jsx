import {Navbar2} from '../../navbar1/Navbar1.jsx';
import styles from "./UserVehicles.module.css";
import { useNavigate } from 'react-router-dom';
import {HomeLinkButton, MultipurposeButton} from '../../commonButton/CommonButton.jsx';


const userCars = [
    { VIN: "1HGC82", Make: "Honda", Model: "Civic", Year: 2020, Mileage: "25 mpg" },
    { VIN: "2T1BR1", Make: "Toyota", Model: "Camry", Year: 2021, Mileage: "30 mpg" },
    { VIN: "1HGCM82", Make: "Honda", Model: "Camry", Year: 2020, Mileage: "40 mpg" }
];
const UserInfoQuote= () => {
const navigateAddVehicle = useNavigate();
const handleAddVehicle=() =>
{
  navigateAddVehicle('add-vehicle');
}
return (
    <div>
    <Navbar2/>
        <div className={styles.pinkElipse}></div>
        <div className={styles.blueCircle}></div>
        <div className = {styles.head}>Your Vehicles</div>
    <div className={styles.userCarRow}>
      <div className={styles.headingRow}>
        {Object.keys(userCars[0]).map((property, index) => (
          <div key={index}>
            {property}
          </div>
        ))}
        <div>Delete</div>
      </div>
      {userCars.map((car, carIndex) => (
        <div className={styles.valueRow} key={carIndex}>
          {Object.values(car).map((value, index) => (
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