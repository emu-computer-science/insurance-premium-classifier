import './Home.css'
import { Link } from 'react-router-dom';

const Home= () =>{
    
    return (
        
        <>
        
        <div className="container">
        <h1>Welcome to the Dashboard</h1>
        <p>Choose an option:</p>
        <Link className="btn" to="/login">Login</Link>
        <Link className="btn" to="/sign-up">Signup</Link>
        
        </div> 
        
        
        </>



    )


}

export default Home