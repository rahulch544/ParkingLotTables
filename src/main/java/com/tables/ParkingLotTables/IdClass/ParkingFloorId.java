package com.tables.ParkingLotTables.IdClass;


import java.io.Serializable;
import java.util.Objects;

public class ParkingFloorId implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer floor_no;

    private Integer parkinglot_id;


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ParkingFloorId)) {
            return false;
        }
        ParkingFloorId parkingFloorId = (ParkingFloorId) o;
        return Objects.equals(floor_no, parkingFloorId.floor_no) && Objects.equals(parkinglot_id, parkingFloorId.parkinglot_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floor_no, parkinglot_id);
    }

    public ParkingFloorId() {
    }

    public ParkingFloorId(Integer floor_no, Integer parkinglot_id) {
        this.floor_no = floor_no;
        this.parkinglot_id = parkinglot_id;
    }


    public Integer getFloor_no() {
        return this.floor_no;
    }

    public void setFloor_no(Integer floor_no) {
        this.floor_no = floor_no;
    }

    public Integer getParkinglot_id() {
        return this.parkinglot_id;
    }

    public void setParkinglot_id(Integer parkinglot_id) {
        this.parkinglot_id = parkinglot_id;
    }

    
}