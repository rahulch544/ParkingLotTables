package com.tables.ParkingLotTables.IdClass;

import java.io.Serializable;
import java.util.Objects;

import com.tables.ParkingLotTables.Model.ParkingFloor;

public class SlotId implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer slot_no;

    private Integer floor_no;

    private Integer parkinglot_id;


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SlotId)) {
            return false;
        }
        SlotId slotId = (SlotId) o;
        return Objects.equals(slot_no, slotId.slot_no) && Objects.equals(parkingFloor, slotId.parkingFloor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slot_no, parkingFloor);
    }

    public SlotId() {
    }


    public SlotId(Integer slot_no, ParkingFloor parkingFloor) {
        this.slot_no = slot_no;
        this.parkingFloor = parkingFloor;
    }
 
    
}