import { Link } from 'react-router-dom';
import { Navbar2 } from '../../navbar1/Navbar1.jsx';
import styles from "./ViewAllVehicles.module.css";


const users = [
    { User_Id: "0001", UserName: "Space_Cowboy",  Make: "Chevrolet", Model: "Impala", Year: 2006, Mileage: 250000 },
    { User_Id: "0002", UserName: "ExCop", Make: "Ford", Model: "Explorer", Year: 2024, Mileage: 5000},
    { User_Id: "0003", UserName: "noMem", Make: "Buick", Model: "Cutlass", Year: 2015, Mileage: 100000}
];

const title = {User_Id: "User Id", UserName: "Username",  Make: "Make", Model: "Model", Year: "Year", Mileage: "Mileage"}

const DisplayItem = ({user}) => {
    return (
        <>
            <div className={styles.display}>
                <p className={styles.UserID}>{user.User_Id}</p>
                <p className={styles.UserName}>{user.UserName}</p>
                <p className={styles.Make}>{user.Make}</p>
                <p className={styles.Model}>{user.Model}</p>
                <p className={styles.Year}>{user.Year}</p>
                <p className={styles.Mileage}>{user.Mileage}</p>
            </div>
        </>
    )

}

const ViewAllVehicles= () =>{
    
    return (
        
        <>
        
        <div className={styles.pagecontainer}>
                <Navbar2 />
                <div className={styles.pinkElipse}></div>
                <div className={styles.blueCircle}></div>
                <div className={styles.head}>Registered Vehicles</div>
                <div className={styles.contentContainer}>
                    <div className={styles.search}>
                        <input className={styles.searchbar}
                            onChange={() => { }}
                        />
                        <button className={styles.searchButton}>Search</button>
                    </div>
                    <div className='resultsContainer'>
                       <b> <DisplayItem user = {title} /></b>
                       
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

export default ViewAllVehicles