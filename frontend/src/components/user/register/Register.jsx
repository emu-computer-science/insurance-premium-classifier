import {Navbar1} from '../../navbar1/Navbar1.jsx';
import styles from './Register.module.css';
import { useNavigate } from 'react-router-dom';

const Register = () => {
  const navigate = useNavigate();
  const handleClick = () => {
    navigate('/register2');
  };
  return (
    <div className="div">
    <Navbar1/>
    <div className={styles.pinkElipse}></div>
    <div className={styles.blueCircle}></div>
    <div className={styles.registerContainer}>
      <form className={styles.registrationForm}>
      <div>
      <label>First Name:</label>
      <input type="text" className={styles.inputField} placeholder="First Name" />
      </div>
      <div>
      <label>Last Name:</label>
      <input type="text" className={styles.inputField} placeholder="Last Name" />
      </div>
      <div>
      <label>Email:</label>
      <input type="email" className={styles.inputField} placeholder="Email" />
      </div>
      <div>
      <label>Date of Birth:</label>
      <input type="text" className={styles.inputField} placeholder="Date of Birth" />
      </div>
        <button type="button" className={styles.next} onClick={handleClick}>Next</button>
        </form>
        </div>
        </div>
  )
}

export default Register;