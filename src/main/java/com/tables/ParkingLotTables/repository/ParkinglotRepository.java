package com.tables.ParkingLotTables.repository;


import com.tables.ParkingLotTables.Model.Parkinglot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkinglotRepository extends JpaRepository<Parkinglot,Integer> {
    
}