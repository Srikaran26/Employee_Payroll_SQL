package com.example.payroll.service;

import com.example.payroll.dto.EmployeeDTO;
import com.example.payroll.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    private final List<Employee> employeeList = new ArrayList<>();
    private final AtomicInteger counter = new AtomicInteger();

    @Override
    public Employee addEmployee(EmployeeDTO dto) {
        Employee employee = new Employee(counter.incrementAndGet(), dto.getName(), dto.getSalary());
        employeeList.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
