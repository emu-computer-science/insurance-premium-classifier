import {Navbar1} from '../../navbar1/Navbar1.jsx';
import styles from './Register.module.css';
import { useNavigate } from 'react-router-dom';

const Register = () => {
  const navigate = useNavigate();
  const handleClick = () => {
    navigate('/register2');
  };
  return (
    <div>
    <Navbar1/>
    <div className={styles.pinkElipse}></div>
    <div className={styles.blueCircle}></div>
    <div className={styles.registerContainer}>
      <form className={styles.registrationForm}>
      <input type="email" className={styles.inputField} placeholder="Email" />
        <input type="text" className={styles.inputField} placeholder="Date of Birth" />
        <input type="password" className={styles.inputField} placeholder="Password" />
        
        <button type="button" className={styles.next} onClick={handleClick}>Next</button>
        </form>
        </div>
        </div>
  )
}

export default Register;