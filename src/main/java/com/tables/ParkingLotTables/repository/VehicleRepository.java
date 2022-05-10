package com.tables.ParkingLotTables.repository;

import com.tables.ParkingLotTables.Model.Vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,String> {
    

}