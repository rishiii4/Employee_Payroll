package com.employeepayroll.service;

import com.employeepayroll.dto.EmployeeDTO;
import com.employeepayroll.mapper.EmployeeMapper;
import com.employeepayroll.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceInterface{

    private final List<Employee> employeeList = new ArrayList<>();


    @Override
    public Employee addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.INSTANCE.toEntity(employeeDTO);
        employee.setId(employeeList.size()+1);
        employeeList.add(employee);
        return employee;
    }

    @Override
    public void deleteEmployeeById(int id) {

    }

    @Override
    public Employee updateEmployeeById(int id) {
        return null;
    }

    @Override
    public Employee getEmployeeById(int id) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeList;
    }
}
