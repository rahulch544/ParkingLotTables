package com.tables.ParkingLotTables.IdClass;

import java.io.Serializable;
import java.util.Objects;

import com.tables.ParkingLotTables.Model.ParkingFloor;

import lombok.Data;

@Data
public class SlotId implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer slot_no;

    private Integer floor_no;

    private Integer parkinglot_id;
 
    
}