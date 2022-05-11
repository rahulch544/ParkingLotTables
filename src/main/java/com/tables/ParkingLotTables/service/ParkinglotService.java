package com.tables.ParkingLotTables.service;

import java.util.List;

import javax.transaction.Transactional;

import com.tables.ParkingLotTables.Model.Parkinglot;
import com.tables.ParkingLotTables.repository.ParkinglotRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkinglotService {
    
    @Autowired
    private ParkinglotRepository parkinglotRepository;

    @Transactional
    public String addParkinglot(Parkinglot parkinglot){
        parkinglotRepository.save(parkinglot);
        return parkinglot.toString();
    }


    @Transactional
    public List<Parkinglot> getParkinglots() {
		return parkinglotRepository.findAll();
	}
}

