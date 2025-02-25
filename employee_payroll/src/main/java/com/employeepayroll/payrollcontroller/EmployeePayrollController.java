package com.employeepayroll.payrollcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {


    // Testing the Connectivity
    @GetMapping
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("Connection Successful!");
    }


}




