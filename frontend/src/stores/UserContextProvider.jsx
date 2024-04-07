import { useState, useEffect } from "react"
import UserContext from "./UserContext"

const UserContextProvider = ({children}) => {
    const [loggedIn, setLoggedIn] = useState(false);

    useEffect(() => {
        const checkIfLoggedIn = async () => {
            const response = await fetch('/api/logged-in');

            if (response.status >= 200 && response.status < 400) {
                const dto = await response.json();

                if (dto.message.toLowerCase() === 'true') {
                    setLoggedIn(true);
                }
            }
        }
        checkIfLoggedIn();
    }, []);

    const login = async (formData) => {
        const response = await fetch('/login', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            },
            body: formData
        });

        if (response.status >= 200 && response.status < 400) {
            setLoggedIn(true);
            return [true];
        } else {
            return [false, await response.json()];
        }
    }

    const logout = async () => {
        const response = await fetch("/logout", {
            method: 'POST'
        });

        if (response.status >= 200 && response.status < 400) {
            setLoggedIn(false);
            return [true];
        } else {
            return [false, 'Could not logout.'];
        }
    }

    const data = {
        loggedIn: loggedIn,
        login: login,
        logout: logout
    }

    return (
        <UserContext.Provider value={data}>
            {children}
        </UserContext.Provider>
    )
}

export default UserContextProvider;