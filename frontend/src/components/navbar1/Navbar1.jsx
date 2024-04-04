import styles from "./Navbar1.module.css"
import { Link } from 'react-router-dom';

export const Navbar1 = () => {
    return (
<nav className={styles.navbar}>
<Link to="/ipc" className={styles.white}>IPC</Link>
<div className={styles.navLinks}>
  <Link to="/create-claim" className={styles.white} >Claim</Link>
  <Link to="/user-info-quote" className={styles.white} >Quote</Link>
  <Link to="/login" className= {styles.white} >Login</Link>
</div>
</nav>
    )
};
export const Navbar2 = () => {
  return (
<nav className={styles.navbar2}>
<Link to="/ipc" className={styles.white}>IPC</Link>
<Link to="/login" className={`${styles.navLink} ${styles.logout} ${styles.white}`}>Logout</Link>
</nav>
  )
};

export const Navbar3 = () => {
  return (
<nav className={styles.navbar3}>

<div className={styles.navLinks}>
<Link to="/create-claim" className={styles.white2} >Claim</Link>
<Link to="/user-info-quote" className={styles.white2} >Quote</Link>
<Link to="/login" className= {styles.white2} >Login</Link>
<Link to="/contact" className= {styles.white2}>Contact Us</Link>
</div>
</nav>
  )
};
