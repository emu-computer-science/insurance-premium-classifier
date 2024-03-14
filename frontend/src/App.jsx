import { useState } from 'react'
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Home from './components/home/Home'
import Loginc from './components/user/loginc/Loginc'
import Register from './components/user/register/Register'
import Register2 from './components/user/register/Register2';
import CreateClaim from './components/user/create-a-claim/CreateClaim'
import UserAddVehicle from './components/user/user-add-vehicle/UserAddVehicle'
import UserBill from './components/user/user-bill/UserBill'
import UserDashboard from './components/user/user-dashboard/UserDashboard'
import UserInfoQuote from './components/user/user-info-quote/UserInfoQuote'
import UserProfile from './components/user/user-profile/UserProfile'
import UserQuoteResult from './components/user/user-quote-result/UserQuoteResult'
import UserVehicleQuote from './components/user/user-vehicle-quote/UserVehicleQuote'
import UserVehicles from './components/user/user-vehicles/UserVehicles'
import EmployeeDashboard from './components/employee/employee-dashboard/EmployeeDashboard'
import UserMissedPayments from './components/employee/users-missed-payments/UserMissedPayments'
import ViewAllUsers from './components/employee/view-all-users/ViewAllUsers'
import ViewAllVehicles from './components/employee/view-all-vehicles/ViewAllVehicles'
import './App.css'

function App() {
  const [count, setCount] = useState(0)
  return (
    <Router>
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/login' element={<Loginc />} />
        <Route path='/sign-up' element={<Register />} />
        <Route path="/register2" element={<Register2 />} />
        <Route path='/create-claim' element={<CreateClaim/>} />
        <Route path='/user-add-vehicle' element={<UserAddVehicle/>} />
        <Route path='/user-bill' element={<UserBill/>} />
        <Route path='/user-dashboard' element={<UserDashboard/>} />
        <Route path='/user-info-quote' element={<UserInfoQuote/>} />
        <Route path='/user-profile' element={<UserProfile/>} />
        <Route path='/user-quote-result' element={<UserQuoteResult/>} />
        <Route path='/user-vehicle-quote' element={<UserVehicleQuote/>} />
        <Route path='/user-vehicles' element={<UserVehicles/>} />
        <Route path='/employee-dashboard' element={<EmployeeDashboard/>} />
        <Route path='/users-missed-payments' element={<UserMissedPayments/>} />
        <Route path='/view-all-users' element={<ViewAllUsers/>} />
        <Route path='/view-all-vehicles' element={<ViewAllVehicles/>} />
      </Routes>
    </Router>
  )
}

export default App
