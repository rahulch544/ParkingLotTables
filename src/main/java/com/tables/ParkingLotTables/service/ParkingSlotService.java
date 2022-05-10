package com.tables.ParkingLotTables.service;
import java.util.List;

import javax.transaction.Transactional;

import com.tables.ParkingLotTables.Model.ParkingSlot;
import com.tables.ParkingLotTables.repository.ParkingSlotRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingSlotService {
    

    @Autowired
    private ParkingSlotRepository parkingSlotRepository;

    @Transactional
    public String addParkingSlot(ParkingSlot parkingSlot) {
    	parkingSlotRepository.save(parkingSlot);
      return parkingSlot.toString();
    }

    @Transactional
    public List<ParkingSlot> getParkingSlots() {
		return parkingSlotRepository.findAll();
	}
}