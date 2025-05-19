package com.example.payroll.controller;

import com.example.payroll.dto.EmployeeDTO;
import com.example.payroll.model.Employee;
import com.example.payroll.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService employeeService;

    @PostMapping
    public Employee createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.addEmployee(employeeDTO);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getEmployeeList();
    }
}
