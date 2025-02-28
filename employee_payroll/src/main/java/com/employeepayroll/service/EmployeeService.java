package com.employeepayroll.service;

import com.employeepayroll.dto.EmployeeDTO;
import com.employeepayroll.mapper.EmployeeMapper;
import com.employeepayroll.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class EmployeeService implements EmployeeServiceInterface{

    private final List<Employee> employeeList = new ArrayList<>();


    @Override
    public Employee addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.INSTANCE.toEntity(employeeDTO);
        employee.setId(employeeList.size()+1);
        log.info("Adding Employee: {}", employeeDTO.getName());
        employeeList.add(employee);
        return employee;
    }

    @Override
    public boolean deleteEmployeeById(int id) {
        log.info("Deleting an Employee by his Id");
        for(Employee emp: employeeList){
            if(id ==  emp.getId()){
                employeeList.remove(emp);
                return true;
            }
        }
        return false;
    }

    @Override
    public Employee updateEmployeeById(int id, EmployeeDTO employeeDTO) {
        log.info("Employee Update Process Started");
        for(Employee emp: employeeList){
            if(id ==  emp.getId()){
                emp.setName(employeeDTO.getName());
                emp.setSalary(employeeDTO.getSalary());
                return emp;
            }
        }
        log.info("Process Completed, Employee Not Found!");
        return null;
    }

    @Override
    public Employee getEmployeeById(int id) {
        log.info("Getting an Employee by his Id");
        for(Employee emp: employeeList){
            if(id ==  emp.getId()){
                return emp;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getAllEmployee() {
        log.info("Fetching all employees");
        return employeeList;
    }
}
