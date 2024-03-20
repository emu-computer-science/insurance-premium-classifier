import { Link } from 'react-router-dom';
import { Navbar2 } from '../../navbar1/Navbar1.jsx';
import styles from "./ViewAllUsers.module.css";

const users = [
    { User_Id: "0001", UserName: "Space_Cowboy", Lname: "Spiegel", PaymentStatus: "Not Paid" },
    { User_Id: "0002", UserName: "ExCop",  Lname: "Black", PaymentStatus: "Paid" },
    { User_Id: "0003", UserName: "noMem",  Lname: "Valentine", PaymentStatus: "Not Paid" }
];

const title = {User_Id: "User Id", UserName: "Username", Lname: "Lname", PaymentStatus: "Payment Status"}

const DisplayItem = ({user}) => {
    return (
        <>
            <div className={styles.display}>
                <p className={styles.UserID}>{user.User_Id}</p>
                <p className={styles.UserName}>{user.UserName}</p>
                <p className={styles.Lname}>{user.Lname}</p>
                <p className={styles.PaymentStatus}>{user.PaymentStatus}</p>
            </div>
        </>
    )

}

const ViewAllUsers= () =>{
    
    return (
        
        <>
         <div className={styles.pagecontainer}>
                <Navbar2 />
                <div className={styles.pinkElipse}></div>
                <div className={styles.blueCircle}></div>
                <div className={styles.head}>All Users</div>
                <div className={styles.contentContainer}>
                    <div className={styles.search}>
                        <input className={styles.searchbar}
                            onChange={() => { }}
                        />
                        <button className={styles.searchButton}>Search</button>
                    </div>
                    <div className='resultsContainer'>
                        <b><DisplayItem user = {title} /></b>
                       
                       {
                        users.map(user => (
                            <DisplayItem user = {user} />
                        ))
                       }

                       
                    </div>
                </div>
            </div>
            
        
        
        </>



    )


}

export default ViewAllUsers