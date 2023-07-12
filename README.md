# Employee Management System

Employee entity is used to represent both the user and employee information. The EmployeeRepository provides CRUD operations for the Employee entity. The EmployeeService defines the contract for handling employee operations. The EmployeeController handles the incoming requests and interacts with the EmployeeService.

The Employee Management System is a simple application built using Spring Boot that allows you to perform CRUD operations on employees. It provides the following features:

- Create a new employee
- Retrieve employee details by ID
- Update employee information
- Delete an employee
- Retrieve all employees

## Installation

- JDK 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman or API Tester

- GET /employees: Get all employees.
- GET /employees/{id}: Get an employee by ID.
- POST /employees: Create a new employee.
- PUT /employees/{id}/salary: Update salary of an employee.
- DELETE /employees/{id}: Delete an employee. 


to search first name ==> http://localhost:8080/employees/search?firstName=name

to search both department and first name 
==> http://localhost:8080/employees/search?firstName=Subrahmanya&department=Dev




