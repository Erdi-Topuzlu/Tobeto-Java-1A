package com.tobeto.java.spring.controllers;

import com.tobeto.java.spring.entities.Employee;
import com.tobeto.java.spring.entities.Rental;
import com.tobeto.java.spring.repositories.RentalRepository;
import com.tobeto.java.spring.services.abstracts.RentalService;
import com.tobeto.java.spring.services.dtos.requests.rental.AddRentalRequest;
import com.tobeto.java.spring.services.dtos.requests.rental.UpdateRentalRequest;
import com.tobeto.java.spring.services.dtos.responses.rental.GetListRentalResponse;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/rentals")
public class RentalsController {

    private RentalService rentalService;

    public RentalsController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @PostMapping
    public void add(@RequestBody AddRentalRequest request){
        rentalService.add(request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        rentalService.delete(id);
    }

    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody UpdateRentalRequest request){
        rentalService.update(id, request);
    }

    @GetMapping("cost")
    public List<GetListRentalResponse> getByRentalCostDto(@RequestParam BigDecimal cost){
        return rentalService.getByRentalCostDto(cost);
    }

    @GetMapping("date")
    public List<GetListRentalResponse> getByRentalDateDto(@RequestParam LocalDate date){
        return  rentalService.getByRentalDateDto(date);
    }



    /*private final RentalRepository rentalRepository;

    public RentalsController(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }

    @GetMapping
    public List<Rental> getAll(){
        List<Rental> rentals = rentalRepository.findAll();
        return rentals;
    }

    @PostMapping
    public void add(@RequestBody Rental rental){
        rentalRepository.save(rental);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        Rental rentalToDelete = rentalRepository.findById(id).orElseThrow();
        rentalRepository.delete(rentalToDelete);
    }

    @PutMapping("{id}")
    public void updateRental(@PathVariable int id,@RequestBody Rental updatedRental) {
        Rental rentalToUpdate = rentalRepository.findById(id).orElseThrow();
        rentalToUpdate.setEmployee(updatedRental.getEmployee());
        rentalToUpdate.setVehicle(updatedRental.getVehicle());
        rentalToUpdate.setCustomer(updatedRental.getCustomer());
        rentalToUpdate.setReservation(updatedRental.getReservation());
        rentalToUpdate.setRentalDate(updatedRental.getRentalDate());
        rentalToUpdate.setRentalCost(updatedRental.getRentalCost());


        Rental rental1 = rentalRepository.save(rentalToUpdate);
    }*/
}
