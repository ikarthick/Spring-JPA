package com.srikar.learning.jpa.learnjpa.controller;

import com.srikar.learning.jpa.learnjpa.entity.Employee;
import com.srikar.learning.jpa.learnjpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }


    @PostMapping("/addAllEmployees")
    public List<Employee> addEmployees(@RequestBody List<Employee> employeeList){
        return employeeService.addAllEmployee(employeeList);
    }

}
