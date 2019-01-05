package com.nar.springbootmvc.controller;

import com.nar.springbootmvc.model.Employee;
import com.nar.springbootmvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getEmployeeHome () {
        return "index";
    }


    //Async test
    //Reference: https://spring.io/guides/gs/async-method/
    @GetMapping(path = "/getAllEmployees")
    @ResponseBody
    public List<Employee> getAllEmployees () throws Exception {
        // Start the clock
        long start = System.currentTimeMillis();

        CompletableFuture<Employee> emp1 = employeeService.getEmployeeFromEmpId(1);
        CompletableFuture<Employee> emp2 = employeeService.getEmployeeFromEmpId(2);
        CompletableFuture<Employee> emp3 = employeeService.getEmployeeFromEmpId(3);

        // Wait until they are all done
        CompletableFuture.allOf(emp1, emp2, emp3).join();

        System.out.println("Elapsed time: " + (System.currentTimeMillis() - start));

        List<Employee> empList = Arrays.asList(emp1.get(), emp2.get(), emp3.get()); //*****need to call get method
        return empList;

    }


}
