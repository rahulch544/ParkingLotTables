package com.tables.ParkingLotTables.service;


import java.util.List;

import javax.transaction.Transactional;

import com.tables.ParkingLotTables.Model.ParkingFloor;
import com.tables.ParkingLotTables.repository.ParkingFloorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingFloorService {

    @Autowired
    private ParkingFloorRepository parkingFloorRepository;

    @Transactional
    public String addParkingFloor(ParkingFloor parkingFloor) {
    	parkingFloorRepository.save(parkingFloor);
      return parkingFloor.toString();
    }


    @Transactional
    public List<ParkingFloor> getParkingFloors() {
		return parkingFloorRepository.findAll();
	}
}


