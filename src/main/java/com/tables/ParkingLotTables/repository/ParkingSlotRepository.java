package com.tables.ParkingLotTables.repository;

import com.tables.ParkingLotTables.IdClass.SlotId;
import com.tables.ParkingLotTables.Model.ParkingSlot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSlotRepository extends JpaRepository<ParkingSlot,SlotId>{
    
}