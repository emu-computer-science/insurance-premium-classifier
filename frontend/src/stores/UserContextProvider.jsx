import { useState } from "react"
import UserContext from "./UserContext"

const UserContextProvider = ({children}) => {
    const [user, setUser] = useState(null);

    const data = {
        user: user
    }

    return (
        <UserContext.Provider value={data}>
            {children}
        </UserContext.Provider>
    )
}

export default UserContextProvider;