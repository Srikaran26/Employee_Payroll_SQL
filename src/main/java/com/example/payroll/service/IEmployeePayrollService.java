package com.example.payroll.service;

import com.example.payroll.dto.EmployeeDTO;
import com.example.payroll.model.Employee;

import java.util.List;

public interface IEmployeePayrollService {
    Employee addEmployee(EmployeeDTO employeeDTO);
    List<Employee> getEmployeeList();
}
