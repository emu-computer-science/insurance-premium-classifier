import {Navbar2} from '../../navbar1/Navbar1.jsx';
import styles from "./CreateClaim.module.css";
import {HomeLinkButton, MultipurposeButton} from '../../commonButton/CommonButton.jsx';

const userCars = [
    { VIN: "1HGC", Make: "Honda", Model: "Civic", Year: 2020, Mileage: "25 mpg" },
    { VIN: "2T1B", Make: "Toyota", Model: "Camry", Year: 2021, Mileage: "30 mpg" },
    { VIN: "1HGCM", Make: "Honda", Model: "Camry", Year: 2020, Mileage: "40 mpg" }
];

const CreateClaim= () => {
return (
    <div>
    <Navbar2/>
        <div className={styles.pinkElipse}></div>
        <div className={styles.blueCircle}></div>
        <div className = {styles.head}>Create a Claim</div>
    <div className={styles.userCarRow}>
      <div className={styles.headingRow}>
        {Object.keys(userCars[0]).map((property, index) => (
          <div key={index}>
            {property}
          </div>
        ))}
        <div>Claim</div>
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
    <HomeLinkButton className={styles.btn}></HomeLinkButton>
    <MultipurposeButton className={styles.btn}>Create a Claim</MultipurposeButton>
    </div>
    </div>

  );
 }
export default CreateClaim