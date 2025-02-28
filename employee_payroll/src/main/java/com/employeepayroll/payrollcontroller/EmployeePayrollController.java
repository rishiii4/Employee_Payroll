package com.employeepayroll.payrollcontroller;

import com.employeepayroll.dto.EmployeeDTO;
import com.employeepayroll.mapper.EmployeeMapper;
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

    // Getting an employee by id
    @GetMapping("/get/{id}")
    public ResponseEntity<Employee> getEmpById(@PathVariable int id){
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    // Removing an employee by id
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<String> deleteEmp(@PathVariable("id") int id){
        if(employeeService.deleteEmployeeById(id)){
            return ResponseEntity.ok("Deletion Successfull!");
        }else{
            return ResponseEntity.ok("Not Found!");
        }
    }

    // Updating an employee info
    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeeDTO> updateEmployeeByID(@PathVariable("id") int id,@RequestBody EmployeeDTO employeeDTO ){
        Employee updateEmployee = employeeService.updateEmployeeById(id,employeeDTO);
        if(updateEmployee != null){
            EmployeeDTO updatedDTO = EmployeeMapper.INSTANCE.toDto(updateEmployee);
            return ResponseEntity.ok(updatedDTO);
        }else{
            return ResponseEntity.notFound().build();
        }
    }


}




