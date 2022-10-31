package org.example;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("employee")
    public Employee getEmployeeDetails(){
        Employee employee = new Employee(getDepartmentDetails());
        employee.setEmpId(101);
        employee.setEmpName("L Lawleitte");
        employee.setSalary(880000.50);
        return employee;
    }

    @Bean
    public Department getDepartmentDetails(){
        return new Department(145,"Teacher");
    }
}