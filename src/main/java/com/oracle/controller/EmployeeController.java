package com.oracle.controller;

import com.oracle.dto.Employee;
import com.oracle.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/gettime")
    public String getTime(){
        return "Current Time is :: " + new Date();
    }
    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        System.out.println("Employee Save :: " + employee.getFirstName()+" :: LastName :: " + employee.getLastName());
        return employeeRepository.save(employee);
    }
}
