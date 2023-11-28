package com.tobeto.java.spring.repositories;

import com.tobeto.java.spring.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
