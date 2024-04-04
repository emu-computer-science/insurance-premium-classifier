import { Link } from 'react-router-dom';
import styles from './Home.module.css';
import { Navbar1, Navbar3 } from '../navbar1/Navbar1.jsx';
import BottomSection from './BottomSection.jsx';


const Home = () => {
    return (
        <div className = {styles.page}>
            <div className={styles.pinkEllipse}></div>
            <div className={styles.blueCircle}></div>
            <Navbar3 />
            <div className = {styles.imgContainer}>
                <img src = "../images/people-driving-car.jpg" className= {styles.topPicture} />
            </div>
            <div className ={styles.leftBlurb}>
                <h1>We provide the best value <b>insurance</b></h1>
                <p>Simple Steps You Can Take to Improve Your Financial Well-Being for the rest of Your Life</p>
            </div>
            <div className = {styles.quoteForm}>
                
              
                <form className= {styles.Form}>
                <h2>Get a Quote</h2>
                    <input type = "text" placeholder = "Your name" className={styles.formField}></input>
                    <input type = "text" placeholder = "Phone" className={styles.formField}></input>
                    <input type = "text" placeholder = "Email" className={styles.formField}></input>
                    {/* <select name = "Insurance type" placeholder = "Insurance Type">
                        <option>Insurance Type</option>
                        <option value = "Car" className={styles.options}>Car</option>
                        <option value = "Home">Home</option>
                        <option value = "Travel">Travel</option>
                        <option value = "Pet">Pet</option>
                    </select> */}
                   
                    <input type = "submit" value = "Get a quote" className= {styles.submitButton} />
                </form>
            </div>
                <BottomSection />
{/*             <div className={styles.container}>
                <Link className={styles.btn} to="/login">Login</Link>
                <Link className={styles.btn} to="/sign-up">Signup</Link>
            </div> */}
        </div>
    )
}

export default Home