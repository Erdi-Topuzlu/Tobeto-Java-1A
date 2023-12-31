package com.tobeto.java.spring.controllers;

import com.tobeto.java.spring.entities.Reservation;
import com.tobeto.java.spring.services.abstracts.ReservationService;
import com.tobeto.java.spring.services.dtos.requests.reservation.AddReservationRequest;
import com.tobeto.java.spring.services.dtos.requests.reservation.UpdateReservationRequest;
import com.tobeto.java.spring.services.dtos.responses.reservation.GetListReservationResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/reservations")
public class ReservationsController {

    private ReservationService reservationService;
    @Autowired
    public ReservationsController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping
    public void add(@RequestBody @Valid AddReservationRequest request){
        reservationService.add(request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        reservationService.delete(id);
    }
    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody UpdateReservationRequest request){
        reservationService.update(id, request);
    }

    @GetMapping("between")
    public List<GetListReservationResponse> getByStartDate(@RequestParam LocalDate startDate, LocalDate startDate2){
        return reservationService.getByBetweenStartDate(startDate,startDate2);
    }
    /*private final ReservationRepository reservationRepository;

    public ReservationsController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping
    public List<Reservation> getAll(){
        List<Reservation> reservations = reservationRepository.findAll();
        return reservations;
    }

    @GetMapping("{id}")
    public Reservation getById(@PathVariable int id){
        return reservationRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Reservation reservation){
        reservationRepository.save(reservation);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        Reservation reservationToDelete = reservationRepository.findById(id).orElseThrow();
        reservationRepository.delete(reservationToDelete);
    }

    @PutMapping("{id}")
    public void updateReservation(@PathVariable int id,@RequestBody Reservation updatedReservation) {
        Reservation reservationToUpdate = reservationRepository.findById(id).orElseThrow();
        reservationToUpdate.setCustomer(updatedReservation.getCustomer());
        reservationToUpdate.setVehicle(updatedReservation.getVehicle());
        reservationToUpdate.setStartDate(updatedReservation.getStartDate());
        reservationToUpdate.setEndDate(updatedReservation.getEndDate());
        reservationToUpdate.setTotalCost(updatedReservation.getTotalCost());


        Reservation reservation1 = reservationRepository.save(reservationToUpdate);
    }*/
}
