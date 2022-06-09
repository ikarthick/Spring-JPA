package com.srikar.learning.jpa.learnjpa.entity;


import javax.persistence.*;

@Entity
@Table(name= "employee")
public class Employee {

    public Employee(){}

    @GeneratedValue
    @Id
    Integer empId;

    @Column(name= "Employee_Name")
    String empName;

    @Column(name ="Salary")
    Double empSalary;

    public Employee(Integer empId, String empName, Double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }


}
