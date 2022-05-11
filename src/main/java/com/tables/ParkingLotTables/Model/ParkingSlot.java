package com.tables.ParkingLotTables.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
    @Column(name ="SLOT_NO")
    private Integer slot_no;

    @Id
    @Column(name ="FLOOR_NO")
    private Integer floor_no;

    @Id
    @Column(name ="PARKINGLOT_ID")
    private Integer parkinglot_id;

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

    public Integer getParkinglot_id() {
        return this.parkinglot_id;
    }

    public void setParkinglot_id(Integer parkinglot_id) {
        this.parkinglot_id = parkinglot_id;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    public ParkingSlot() {
    }


    public ParkingSlot(Integer slot_no, Integer floor_no, Integer parkinglot_id, Vehicle vehicle) {
        this.slot_no = slot_no;
        this.floor_no = floor_no;
        this.parkinglot_id = parkinglot_id;
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "{" +
            " slot_no='" + getSlot_no() + "'" +
            ", floor_no='" + getFloor_no() + "'" +
            ", parkinglot_id='" + getParkinglot_id() + "'" +
            ", vehicle='" + getVehicle() + "'" +
            "}";
    }
  

}   