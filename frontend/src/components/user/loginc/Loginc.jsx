import {Navbar1} from '../../navbar1/Navbar1.jsx';
import styles from "./Loginc.module.css";
import { useNavigate } from 'react-router-dom';

const Loginc = () => {
  const navigateUserDashboard = useNavigate();
  const handleClickLogin = () => {
    navigateUserDashboard('/user-dashboard');
  };
  const navigate = useNavigate();
  const handleClickRegister = () => {
  navigate('/sign-up');
  };
  return (
      <div className="div">
        <Navbar1/>
        <div className={styles.pinkElipse}></div>
        <div className={styles.blueCircle}></div>
        <form className={styles.loginForm}>
        <input type="text" className={styles.inputField} placeholder="Member id, employee id or email" />
        <input type="password" className={styles.inputField} placeholder="Password" />
        <button type="button" className={styles.loginButton} onClick={handleClickLogin} >Login</button>
        <div className={styles.text}>Forgot password?</div>
        <button type="button" className={styles.registerButton} onClick={handleClickRegister} >Register</button>
        </form>
      </div>
  );
}

export default Loginc;
