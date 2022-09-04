package com.example.springboottest.controller;

import com.example.springboottest.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Employee firstPage(){
        Employee employee = new Employee();
        employee.setName("Kaneki");
        employee.setDesignation("Ghoul");
        employee.setSalary(1000000);
        employee.setEmpId("1");

        return employee;
    }
}
