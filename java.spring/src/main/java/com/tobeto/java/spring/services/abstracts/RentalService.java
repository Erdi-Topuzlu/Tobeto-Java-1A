package com.tobeto.java.spring.services.abstracts;

import com.tobeto.java.spring.services.dtos.requests.rental.AddRentalRequest;
import com.tobeto.java.spring.services.dtos.requests.rental.UpdateRentalRequest;

public interface RentalService {
    void add(AddRentalRequest request);
    void delete(int id);
    void update(int id, UpdateRentalRequest request);

}