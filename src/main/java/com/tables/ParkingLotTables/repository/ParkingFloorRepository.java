package com.tables.ParkingLotTables.repository;

import com.tables.ParkingLotTables.IdClass.ParkingFloorId;
import com.tables.ParkingLotTables.Model.ParkingFloor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingFloorRepository extends JpaRepository<ParkingFloor,ParkingFloorId> {
    
}