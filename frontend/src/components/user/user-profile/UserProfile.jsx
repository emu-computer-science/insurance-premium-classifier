import {Navbar2} from '../../navbar1/Navbar1.jsx';
import styles from "./UserProfile.module.css";
import {HomeLinkButton, MultipurposeButton} from '../../commonButton/CommonButton.jsx';

const UserProfile= () =>{
  return (
    <div>
      <Navbar2/>
      <div className={styles.pinkElipse}></div>
      <div className={styles.blueCircle}></div>
      <div className = {styles.head}>Your Profile</div>
      <div className={styles.container}>
      <div className = {styles.registrationForm}>
      <input type="number" className={styles.inputField} placeholder="Member ID" />
      <input type="text" className={styles.inputField} placeholder="First Name" />
      <input type="text" className={styles.inputField} placeholder="Last Name" />
      <input type="text" className={styles.inputField} placeholder="Date of Birth" />
      <input type="tel" className={styles.inputField} placeholder="Phone Number" />
      <input type="email" className={styles.inputField} placeholder="Email" />
      <HomeLinkButton/>
    </div>
    <div className={styles.container2}>
        <input className={`${styles.password} ${styles.pass1}`} type = "password" placeholder='Current Password'/>
        <div className={styles.text}>Change Password</div>
        <input className={styles.password} type = "password" placeholder='New Password'/>
        <div className={styles.passwordStrength}>
          <div className={styles.indicatorBar} />
          <div className={styles.indicatorText}>Strong</div>
        </div>
        <input className={`${styles.password} ${styles.pass3}`} type = "password" placeholder='Re enter Password'/>
        <MultipurposeButton>Submit</MultipurposeButton>
      </div>
        </div>
        </div>
    )
}

export default UserProfile