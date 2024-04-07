import styles from './UserBill.module.css';
import {Navbar2} from '../../navbar1/Navbar1.jsx';
import {HomeLinkButton, MultipurposeButton} from '../../commonButton/CommonButton.jsx';

const UserBill = () => {
  const userCars = [
    { name: 'Vehicle 1', amount: '$100' },
    { name: 'Vehicle 2', amount: '$200' },
     {name: 'Vehicle 3', amount: '$150' },
  ];
  return (
      <div>
      <Navbar2/>
          <div className={styles.pinkElipse}></div>
          <div className={styles.blueCircle}></div>
          <div className = {styles.head}>Your Vehicles</div>
      <div className={styles.userCarRow}>
        {userCars.map((car, carIndex) => (
          <div className={styles.valueRow} key={carIndex}>
            {Object.values(car).map((value, index) => (
              <div key={index}>
                {value}
              </div>
            ))}
          </div>
        ))}
        <div className={styles.total}>
            <div> Total</div>
            <div> $Amount</div>
        </div>
        <input type="number" className={styles.payAmt} placeholder="Payment Amount" />
      </div>
      <div className={styles.buttonRow}>
      <HomeLinkButton/>
      <MultipurposeButton>Pay Now</MultipurposeButton>
      </div>
      </div>
    );
 }

export default UserBill;