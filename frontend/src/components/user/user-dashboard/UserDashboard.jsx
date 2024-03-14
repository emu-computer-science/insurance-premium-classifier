import {Navbar2} from '../../navbar1/Navbar1.jsx';
import styles from "./UserDashboard.module.css"
import {LinkButton} from '../../commonButton/CommonButton.jsx';

const UserDashboard = () => {
  return (
<div>
  <Navbar2/>
  <div className={styles.pinkElipse}></div>
  <div className={styles.blueCircle}></div>
  <div className={styles.welcome}>Welcome, User</div>
  <div className={styles.mainContainer}>
  <div className={styles.row1}>
  <LinkButton to = "/create-claim" className= {styles.claim}>Claim</LinkButton>
  <LinkButton to="/user-bill" className= {styles.bills}>Bills</LinkButton>
  <LinkButton to="/user-vehicles" className= {styles.vehicles}>Vehicles</LinkButton>
  </div>
  <div className={styles.row2}>
  <LinkButton to ="/user-info-quote" className= {styles.quote} >Quote</LinkButton>
  <LinkButton to ="/user-profile" className= {styles.profile}>Profile</LinkButton>
    </div>
  </div>
  </div>
    )            
    }

export default UserDashboard




