package com.tables.ParkingLotTables.service;

import java.util.List;

import javax.transaction.Transactional;

import com.tables.ParkingLotTables.Model.Vehicle;
import com.tables.ParkingLotTables.repository.VehicleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    
    @Autowired
    private VehicleRepository vehicleRepository;

    @Transactional
    public String addVehicle(Vehicle vehicle) {
    	vehicleRepository.save(vehicle);
      return vehicle.toString();
    }

    @Transactional
    public List<Vehicle> getVehicles() {
		return vehicleRepository.findAll();
	}
}