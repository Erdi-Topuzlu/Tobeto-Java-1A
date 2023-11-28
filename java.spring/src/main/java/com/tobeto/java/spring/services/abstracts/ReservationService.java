package com.tobeto.java.spring.services.abstracts;

import com.tobeto.java.spring.services.dtos.requests.reservation.AddReservationRequest;
import com.tobeto.java.spring.services.dtos.requests.reservation.UpdateReservationRequest;

public interface ReservationService {
    void add(AddReservationRequest request);
    void delete(int id);

    void update(int id, UpdateReservationRequest request);
}
