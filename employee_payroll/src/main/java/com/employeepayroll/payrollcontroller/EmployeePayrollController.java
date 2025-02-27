package com.employeepayroll.payrollcontroller;

import com.employeepayroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


}




