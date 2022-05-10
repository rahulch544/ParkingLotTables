package com.tables.ParkingLotTables.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.tables.ParkingLotTables.IdClass.SlotId;

@Entity
@IdClass(SlotId.class)
public class ParkingSlot {
    
    @Id
    private Integer slot_no;

    @Id
    private Integer floor_no;

    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="vehicle_no" , referencedColumnName ="regd_no")
    private Vehicle vehicle;


    public Integer getSlot_no() {
        return this.slot_no;
    }

    public void setSlot_no(Integer slot_no) {
        this.slot_no = slot_no;
    }

    public Integer getFloor_no() {
        return this.floor_no;
    }

    public void setFloor_no(Integer floor_no) {
        this.floor_no = floor_no;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "{" +
            " slot_no='" + getSlot_no() + "'" +
            ", floor_no='" + getFloor_no() + "'" +
            ", vehicle='" + getVehicle() + "'" +
            "}";
    }

}   