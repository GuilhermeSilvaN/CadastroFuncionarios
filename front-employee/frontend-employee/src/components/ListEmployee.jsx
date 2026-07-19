import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

import { listEmployees, deleteEmployeeById } from "../services/EmployeeService";

const ListEmployee = () =>{
   
    const [employees, setEmployees] = useState([]);

    const navigate = useNavigate();

    useEffect(()=>{
        getAllEmployees();

    }, []);

    function getAllEmployees(){
        listEmployees().then((response) => {
            setEmployees(response.data);
        }).catch(error => {
            console.error(error);
        })
    }

    function addNewEmployee(){
        navigate('/addEmployee');
    }

    function updateEmployee(id){
        navigate(`/updateEmployee/${id}`);
    }

    function removeEmployeeById(id){
        deleteEmployeeById(id).then((response) => {
            getAllEmployees();
        }).catch(error => {
            console.error(error);
        })
    }


    return (
        <div className="container">

            <h2>List of Employee</h2>
            <button type="button" onClick={addNewEmployee}>ADD EMPLOYEE</button>

            <table className="tableEmployee">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Birthday</th>
                        <th>Email</th>
                        <th>CPF</th>

                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        employees.map(employee =>
                            <tr key={employee.id}>
                                <td className="fieldEmp">{employee.id}</td>
                                <td className="fieldEmp">{employee.firstName}</td>
                                <td className="fieldEmp">{employee.lastName}</td>
                                <td className="fieldEmp">{employee.email}</td>
                                <td className="fieldEmp">
                                    <button className='btnAdd' onClick={() =>{
                                        updateEmployee(employee.id)
                                    }}>Update</button>

                                    <button className='btnDelete' onClick={() =>{
                                        removeEmployeeById(employee.id);
                                    }}>
                                    Delete
                                </button>
                                </td>
                            </tr>
                        )
                    }
                </tbody>
            </table>
        </div>
    )
}

export default ListEmployee