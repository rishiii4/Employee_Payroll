package com.employeepayroll.payrollcontroller;

import com.employeepayroll.dto.EmployeeDTO;
import com.employeepayroll.model.Employee;
import com.employeepayroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    EmployeeService employeeService;


    // Testing the Connectivity
    @GetMapping
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("Connection Successful!");
    }

    // Adding an Employee
    @PostMapping("/add")
    public ResponseEntity<Employee> addEmp(@RequestBody EmployeeDTO employeeDTO){
        return ResponseEntity.ok(employeeService.addEmployee(employeeDTO));
    }

    // Getting list of all Employee
    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }


}




