import { Link } from 'react-router-dom';
import styles from'./Home.module.css';
import {Navbar1} from '../navbar1/Navbar1.jsx';

const Home= () =>{
    return (
        <div>
        <div className={styles.pinkEllipse}></div>
        <div className={styles.blueCircle}></div>
        <Navbar1/>
        <h1>Welcome to the Dashboard</h1>
        <h2>Choose an option:</h2>
        <div className={styles.container}>
        <Link className={styles.btn} to="/login">Login</Link> 
        <Link className={styles.btn} to="/sign-up">Signup</Link>
        </div> 
        </div>
    )
}

export default Home