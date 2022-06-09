package com.srikar.learning.jpa.learnjpa.service;

import com.srikar.learning.jpa.learnjpa.dao.EmployeeRepository;
import com.srikar.learning.jpa.learnjpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @PersistenceContext
    EntityManager entityManager;

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> addAllEmployee(List<Employee> employees){
        return employeeRepository.saveAll(employees);
    }


}
