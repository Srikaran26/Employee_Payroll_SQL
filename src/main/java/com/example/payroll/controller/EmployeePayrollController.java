package com.example.payroll.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeePayrollController {

    @GetMapping
    public String getEmployee() {
        return "GET - Fetch Employee Payroll";
    }

    @PostMapping
    public String createEmployee() {
        return "POST - Create Employee Payroll";
    }

    @PutMapping
    public String updateEmployee() {
        return "PUT - Update Employee Payroll";
    }

    @DeleteMapping
    public String deleteEmployee() {
        return "DELETE - Delete Employee Payroll";
    }
}
