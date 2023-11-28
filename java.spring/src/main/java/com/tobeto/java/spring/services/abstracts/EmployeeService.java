package com.tobeto.java.spring.services.abstracts;

import com.tobeto.java.spring.services.dtos.requests.employee.AddEmployeeRequest;
import com.tobeto.java.spring.services.dtos.requests.employee.UpdateEmployeeRequest;

public interface EmployeeService {
    void add(AddEmployeeRequest request);
    void delete(int id);
    void update(int id, UpdateEmployeeRequest request);
}
