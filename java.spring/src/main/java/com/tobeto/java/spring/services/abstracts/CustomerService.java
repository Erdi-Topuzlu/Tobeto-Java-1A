package com.tobeto.java.spring.services.abstracts;

import com.tobeto.java.spring.services.dtos.requests.customer.AddCustomerRequest;
import com.tobeto.java.spring.services.dtos.requests.customer.UpdateCustomerRequest;

public interface CustomerService {
    void add(AddCustomerRequest request);
    void delete(int id);
    void update(int id, UpdateCustomerRequest request);
}
