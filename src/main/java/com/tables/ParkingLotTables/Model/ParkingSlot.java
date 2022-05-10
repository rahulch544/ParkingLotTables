package com.tables.ParkingLotTables.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.tables.ParkingLotTables.IdClass.SlotId;
// Table slot as s {
//     slot_no int [pk]
//     floor_no int [pk] 
//     parkinglot_id int [pk]
//     vehicle_no varchar
//   }
@Entity
@IdClass(SlotId.class)
public class ParkingSlot {
    
    @Id
    private Integer slot_no;

    @Id
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name="SLOT_FLOOR", referencedColumnName="FLOOR_NO"),
        @JoinColumn(name="SLOT_LOT_ID", referencedColumnName="PARKINGLOT_ID")
    })
    private ParkingFloor parkingFloor;

    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="vehicle_no" , referencedColumnName ="regd_no")
    private Vehicle vehicle;


    public Integer getSlot_no() {
        return this.slot_no;
    }

    public void setSlot_no(Integer slot_no) {
        this.slot_no = slot_no;
    }

    public ParkingFloor getParkingFloor() {
        return this.parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
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
            ", parkingFloor='" + getParkingFloor() + "'" +
            ", vehicle='" + getVehicle() + "'" +
            "}";
    }


    public ParkingSlot() {
    }

    public ParkingSlot(Integer slot_no, ParkingFloor parkingFloor, Vehicle vehicle) {
        this.slot_no = slot_no;
        this.parkingFloor = parkingFloor;
        this.vehicle = vehicle;
    }

}   