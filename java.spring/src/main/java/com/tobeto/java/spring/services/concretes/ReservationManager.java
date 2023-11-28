package com.tobeto.java.spring.services.concretes;

import com.tobeto.java.spring.entities.Reservation;
import com.tobeto.java.spring.repositories.ReservationRepository;
import com.tobeto.java.spring.services.abstracts.ReservationService;
import com.tobeto.java.spring.services.dtos.requests.reservation.AddReservationRequest;
import com.tobeto.java.spring.services.dtos.requests.reservation.UpdateReservationRequest;
import org.springframework.stereotype.Service;

@Service
public class ReservationManager implements ReservationService {
    private ReservationRepository reservationRepository;

    public ReservationManager(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public void add(AddReservationRequest request){
        Reservation reservation = new Reservation();
        reservation.setCustomer(request.getCustomerId());
        reservation.setVehicle(request.getVehicleId());
        reservation.setStartDate(request.getStartDate());
        reservation.setEndDate(request.getEndDate());
        reservation.setTotalCost(request.getTotalCost());
        reservationRepository.save(reservation);
    }

    public void delete(int id){
        Reservation deleteToReservation = reservationRepository.findById(id).orElseThrow();
        reservationRepository.delete(deleteToReservation);
    }

    @Override
    public void update(int id, UpdateReservationRequest request){
        Reservation updateToReservation = reservationRepository.findById(id).orElseThrow();
        updateToReservation.setCustomer(request.getCustomerId());
        updateToReservation.setVehicle(request.getVehicleId());
        updateToReservation.setStartDate(request.getStartDate());
        updateToReservation.setEndDate(request.getEndDate());
        updateToReservation.setTotalCost(request.getTotalCost());
        reservationRepository.save(updateToReservation);

    }
}
