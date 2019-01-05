package com.nar.springbootmvc.service;

import com.nar.springbootmvc.model.Employee;

import java.util.concurrent.CompletableFuture;

public interface EmployeeService {
    CompletableFuture<Employee> getEmployeeFromEmpId(Integer empId) throws InterruptedException;

}
