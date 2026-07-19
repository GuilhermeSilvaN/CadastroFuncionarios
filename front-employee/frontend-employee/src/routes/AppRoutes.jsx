import {BrowserRouter, Routes, Route} from "react-router-dom";
import Login from '../pages/Login';
import EmployeeRegister from "../pages/EmployeeRegister";
import Dashboard from '../pages/Dashboard';

function AppRoutes () {
    return (
        <BrowserRouter>
            <Routes>
                {/*Get http://localhost:4000 */}
                <Route path="/" element={<Login/>}/>
                {/*Get http://localhost:4000/employee */}
                <Route path="/dashboard" element={<Dashboard/>}/>
                {/*Get http://localhost:4000/employee */}
                <Route path='/addEmployee' element={<EmployeeRegister/>}/>
                {/*Get http://localhost:4000/employee/id */}
                <Route path='/updateEmployee/:id' element={<EmployeeRegister/>}/>
            </Routes>
        </BrowserRouter>
    )
}

export default AppRoutes;