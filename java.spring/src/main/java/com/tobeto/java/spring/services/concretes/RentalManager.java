package com.tobeto.java.spring.services.concretes;

import com.tobeto.java.spring.entities.Rental;
import com.tobeto.java.spring.repositories.RentalRepository;
import com.tobeto.java.spring.services.abstracts.RentalService;
import com.tobeto.java.spring.services.dtos.requests.rental.AddRentalRequest;
import com.tobeto.java.spring.services.dtos.requests.rental.UpdateRentalRequest;
import org.springframework.stereotype.Service;

@Service
public class RentalManager implements RentalService {
    private RentalRepository rentalRepository;

    public RentalManager(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }

    @Override
    public void add(AddRentalRequest request){
        Rental rental = new Rental();
        rental.setEmployee(request.getEmployeeId());
        rental.setVehicle(request.getVehicleId());
        rental.setCustomer(request.getCustomerId());
        rental.setReservation(request.getReservationId());
        rental.setRentalDate(request.getRentalDate());
        rental.setReturnDate(request.getReturnDate());
        rental.setRentalCost(request.getTotalCost());
        rentalRepository.save(rental);
    }

    public void delete(int id){
        Rental deleteToRental = rentalRepository.findById(id).orElseThrow();
        rentalRepository.delete(deleteToRental);
    }

    @Override
    public void update(int id, UpdateRentalRequest request){
        Rental updateToRental = rentalRepository.findById(id).orElseThrow();
        updateToRental.setEmployee(request.getEmployeeId());
        updateToRental.setVehicle(request.getVehicleId());
        updateToRental.setCustomer(request.getCustomerId());
        updateToRental.setReservation(request.getReservationId());
        updateToRental.setRentalDate(request.getRentalDate());
        updateToRental.setReturnDate(request.getReturnDate());
        updateToRental.setRentalCost(request.getTotalCost());
        rentalRepository.save(updateToRental);
    }
}
