import axios from 'axios';

const REST_API_BASE_URL = "http://localhost:4000/employee";

//get all
export const listEmployees = () => axios.get(REST_API_BASE_URL)

//post employee
export const createEmployee = (employee) => axios.post(REST_API_BASE_URL, employee);

//get employee by id
export const getEmployeeById = (employeeId) => axios.get(REST_API_BASE_URL + '/' + employeeId);

//update (id, employee)
export const updateEmployee = (employeeId, employee) => axios.put(REST_API_BASE_URL + '/' + employeeId, employee);

//delete employee by id;
export const deleteEmployeeById = (employeeId) => axios.delete(REST_API_BASE_URL + '/' + employeeId);