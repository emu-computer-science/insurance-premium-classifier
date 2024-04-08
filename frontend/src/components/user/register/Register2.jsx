import {Navbar1} from '../../navbar1/Navbar1.jsx';
import styles from"./Register.module.css"
import { useNavigate } from 'react-router-dom';

const Register2 = () => {
  const navigate = useNavigate();
  const handleClick = () => {
    navigate('/login');
  };
  return (
    <div className="div">
    <Navbar1/>
    <div className={styles.pinkElipse}></div>
    <div className={styles.blueCircle}></div>
    <div className={styles.registerContainer}>
      <form className={styles.registrationForm}>
      <div>
      <label>Password:</label>
      <input type="password" className={styles.inputField} placeholder="Password" />
      </div>
      <div>
      <label>Confirm Password:</label>
      <input type="password" className={styles.inputField} placeholder="Confirm Password" />
      </div>
      <div style={{ color:'white' }}>
    * Must be at least 16 characters <br />
    * Must contain an upper case character <br />
    * Must contain a lower case character <br />
    * Must contain at least one number <br />
    * Must contain at least one special character
    </div>

        <button type="button" className={styles.next} onClick={handleClick}>Register</button>
        </form>
        </div>
        </div>
      
      )
    }
    
  export default Register2;
