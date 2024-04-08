import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Home from './components/home/Home'
import Loginc from './components/user/loginc/Loginc'
import Register from './components/user/register/Register'
import Register2 from './components/user/register/Register2';
import User from './components/user/User';
import Employee from './components/employee/Employee';
import Contact from './components/home/Contact';
import './App.css'


function App() {
  return (
    <Router>
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/login' index element={<Loginc />} />
        <Route path='/sign-up' element={<Register />} />
      
        <Route path="/user/*" element={<User />} />
        <Route path="/employee/*" element={<Employee />} />
        <Route path= '/contact' element ={<Contact />} />
      </Routes>
    </Router>
  )
}

export default App
