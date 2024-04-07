import React from 'react';
import { Link } from 'react-router-dom';

const Logine = () => {
  return (
    <>
      <h2 className="fw-bold mb-4"> Employee Login</h2>
      <input type="text" className="form-control" placeholder="Email" />
      <input type="password" className="form-control" placeholder="Password" />
      <button className="btn btn-primary" type="submit">Login</button>
      <p style={{ color: 'red' }}>{/* This is where you should render your error message */}</p>
      <p className="mt-3">Don't have an account? <Link to="/sign-up">Sign Up</Link></p>
      <p className="mt-3"><Link to="/">Back to Dashboard</Link></p>
    </>
  );
}

export default Logine;
