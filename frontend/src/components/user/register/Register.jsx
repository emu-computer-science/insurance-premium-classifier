import React from 'react';
import { Link } from 'react-router-dom';

const Register = () => {
  return (
    <>
    <body>
    <div className="container">
       <h2 className="fw-bold mb-4">Create Account</h2>
        <input type="text" className="form-control" placeholder="First Name" />
        <input type="text" className="form-control" placeholder="Last Name" />
        <input type="text" inputMode="numeric" className="form-control" placeholder="(XXX) XXX-XXXX"  mask="(000) 000-0000" />
        <input type="text" className="form-control" placeholder="Email" />
        <input type="text" className="form-control" placeholder="Address" />
        <input type="text" className="form-control" placeholder="City" />
        <input type="text" className="form-control" placeholder="Zipcode" />
        <input type="password" className="form-control" placeholder="Password" />
        <input type="password" className="form-control" placeholder=" Confirm Password" />
        <p style={{textAlign: 'left', marginBottom: '10px'}}>
          * Must be at least 16 characters <br />
          * Must contain an upper case character <br />
          * Must contain a lower case character <br />
          * Must contain at least one number <br />
          * Must contain at least one special character
        </p>
        
        <button className="btn btn-primary" type="submit">Create New Account</button>        
        <div className="error-Validation">
            <p>{/* This is where you should render your error message */}</p>
        </div>
        <p className="mt-3"><Link to="/">Back to Dashboard</Link></p>
    </div> 
    </body>
    </>
  );
}

export default Register;
