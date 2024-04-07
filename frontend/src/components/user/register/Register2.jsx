import {Navbar1} from '../../navbar1/Navbar1.jsx';
import styles from"./Register2.module.css"
import { useNavigate } from 'react-router-dom';

const Register2 = () => {
  const navigate = useNavigate();
  const handleClick = () => {
    navigate('/login');
  };
  return (
    <div>
      <Navbar1 />
      <div className={styles.pinkElipse}></div>
      <div className={styles.blueCircle}></div>
      <form className={styles.container}>
        <input className={styles.password} type = "password" placeholder='Password'/>
        <div className={styles.passwordStrength}>
          <div className={styles.indicatorBar} />
          <div className={styles.indicatorText}>Strong</div>
        </div>
        <input className={styles.password} type = "password" placeholder='Re enter Password'/>
        <button type="button" className={styles.next} onClick={handleClick}>Next</button>
      </form>
      </div>
      
      )
    }
    
  export default Register2;
