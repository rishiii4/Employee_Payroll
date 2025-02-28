package com.employeepayroll.service;

import com.employeepayroll.EmployeePayrollApplication;
import com.employeepayroll.dto.EmployeeDTO;
import com.employeepayroll.model.Employee;

import java.util.List;

public interface EmployeeServiceInterface {
    Employee addEmployee(EmployeeDTO employeeDTO);

    boolean deleteEmployeeById(int id);

    Employee updateEmployeeById(int id, EmployeeDTO employeeDTO);

    Employee getEmployeeById(int id);

    List<Employee> getAllEmployee();

}
