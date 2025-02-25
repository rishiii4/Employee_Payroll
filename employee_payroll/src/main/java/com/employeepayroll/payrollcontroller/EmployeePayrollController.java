package com.employeepayroll.payrollcontroller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    // Testing the server using CURL Commands
    @GetMapping
    public String greet(){
        return "Hello, This is Employee Payroll!";
    }

}




