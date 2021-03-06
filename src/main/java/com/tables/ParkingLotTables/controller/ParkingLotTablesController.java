package com.tables.ParkingLotTables.controller;

import java.util.List;

import com.tables.ParkingLotTables.Model.ParkingFloor;
import com.tables.ParkingLotTables.Model.ParkingSlot;
import com.tables.ParkingLotTables.Model.Parkinglot;
import com.tables.ParkingLotTables.Model.Vehicle;
import com.tables.ParkingLotTables.service.ParkingFloorService;
import com.tables.ParkingLotTables.service.ParkingSlotService;
import com.tables.ParkingLotTables.service.ParkinglotService;
import com.tables.ParkingLotTables.service.VehicleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingLotTablesController {
	
	@Autowired
	private VehicleService vehicleService;

	@Autowired
	private ParkingSlotService parkingSlotService;

	@Autowired
	private ParkingFloorService parkingFloorService;

	@Autowired
	private ParkinglotService parkinglotService;
	
	@RequestMapping(value ="info", method = RequestMethod.GET)
	public String info() {
		return "Working applciation";
	}

	@RequestMapping(value ="addVehicle", method = RequestMethod.POST)
	public String addVehicle(@RequestBody Vehicle vehicle) {
		return vehicleService.addVehicle(vehicle);
	}

	@RequestMapping(value ="getVehicles", method = RequestMethod.GET)
	public List<Vehicle> getVehicles() {
		return vehicleService.getVehicles();
	}


	@PostMapping("/addParkingSlot/")
	public String addParkingSlot(@RequestBody ParkingSlot parkingSlot) {
		return parkingSlotService.addParkingSlot(parkingSlot);
	}

	@GetMapping("/getParkingSlots")
	public List<ParkingSlot> getParkingSlots() {
		return parkingSlotService.getParkingSlots();
	}

	@PostMapping("/addParkingFloor")
	public String addParkingFoor(@RequestBody ParkingFloor parkingFloor) {
		return parkingFloorService.addParkingFloor(parkingFloor);
	}

	@GetMapping("/getParkingFloors")
	public List<ParkingFloor> getParkingFoors() {
		return parkingFloorService.getParkingFloors();
	}

	@PostMapping("/addParkinglot")
	public String addParkingLot(@RequestBody Parkinglot parkinglot) {
		return parkinglotService.addParkinglot(parkinglot);
	}
	
	@GetMapping("/getParkinglots")
	public List<Parkinglot> getParkinglots() {
		return parkinglotService.getParkinglots();
	}
}
