import { useEffect } from 'react';
import './Home.css'
import { Link, useParams } from 'react-router-dom';
import { v4 } from 'uuid';

const Home= () =>{
    const host = "http://localhost:9000";
    const responseType = "code";
    const clientId = "web-client";
    const redirectUri = "http:%2f%2flocalhost:5173%2f";
    const scope = "READ";
    const state = v4();
    const url = `${host}/oauth2/authorize?response_type=${responseType}&client_id=${clientId}&redirect_uri=${redirectUri}&scope=${scope}&state=${state}`;

    useEffect(() => {
        const params = new URLSearchParams(window.location.search);
        const code = params.get('code');
        if (code) {
            const getToken = async () => {
                const response = await fetch(`${host}/oauth2/token?code-${code}&client_id=${clientId}&redirect_uri=${redirectUri}&grant_type=authorization_code`, {
                    method: "POST", 
                    body: JSON.stringify({
                        'redirect_uri': 'http://localhost:5173/',
                    })
                })
        
                console.log(response);
            }
            getToken();
        }

        fetch("http://localhost:8080/api/claims", {
            method: "POST"
        }).then(response => console.log(response.status));
    }, []);
    
    
    return (
        
        <>
        
        <div className="container">
        <h1>Welcome to the Dashboard</h1>
        <p>Choose an option:</p>
        <a href={url} className="btn" to="/login">Login</a>
        <Link className="btn" to="/sign-up">Signup</Link>
        
        </div> 
        
        
        </>



    )


}

export default Home