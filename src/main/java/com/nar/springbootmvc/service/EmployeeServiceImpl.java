package com.nar.springbootmvc.service;

import com.nar.springbootmvc.model.Employee;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    @Async
    public CompletableFuture<Employee> getEmployeeFromEmpId(Integer empId) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("inside getEmployee, "+Thread.currentThread().getName());
        Employee emp = new Employee(empId, "Employee "+empId);

        return CompletableFuture.completedFuture(emp); //******How to return value
    }

}
