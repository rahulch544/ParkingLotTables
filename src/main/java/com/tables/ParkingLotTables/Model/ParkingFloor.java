package com.tables.ParkingLotTables.Model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;

import com.tables.ParkingLotTables.IdClass.ParkingFloorId;

// Table floor as f {
//     floor_no int 
//     parkinglot_id int 
//     two_wheeler_capacity int
//     four_wheeler_capacity int
//     entries int
//     exits int
    
//       Indexes {
//       (floor_no, parkinglot_id) [pk]
//     }
//   }

@Entity
@IdClass(ParkingFloorId.class)
public class ParkingFloor {
    
    @Id
    private Integer floor_no;

    @Id
    private Integer parkinglot_id;

    private Integer two_wheeler_capacity;

    private Integer four_wheeler_capacity;

    private Integer entries;

    private Integer exits;

    @OneToMany(mappedBy = "parkingFloor", cascade = CascadeType.ALL)
    private Set<ParkingSlot> parkingSlot;



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

    public Integer getTwo_wheeler_capacity() {
        return this.two_wheeler_capacity;
    }

    public void setTwo_wheeler_capacity(Integer two_wheeler_capacity) {
        this.two_wheeler_capacity = two_wheeler_capacity;
    }

    public Integer getFour_wheeler_capacity() {
        return this.four_wheeler_capacity;
    }

    public void setFour_wheeler_capacity(Integer four_wheeler_capacity) {
        this.four_wheeler_capacity = four_wheeler_capacity;
    }

    public Integer getEntries() {
        return this.entries;
    }

    public void setEntries(Integer entries) {
        this.entries = entries;
    }

    public Integer getExits() {
        return this.exits;
    }

    public void setExits(Integer exits) {
        this.exits = exits;
    }

    public Set<ParkingSlot> getParkingSlot() {
        return this.parkingSlot;
    }

    public void setParkingSlot(Set<ParkingSlot> parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    

    @Override
    public String toString() {
        return "{" +
            " floor_no='" + getFloor_no() + "'" +
            ", parkinglot_id='" + getParkinglot_id() + "'" +
            ", two_wheeler_capacity='" + getTwo_wheeler_capacity() + "'" +
            ", four_wheeler_capacity='" + getFour_wheeler_capacity() + "'" +
            ", entries='" + getEntries() + "'" +
            ", exits='" + getExits() + "'" +
            ", parkingSlot='" + getParkingSlot() + "'" +
            "}";
    }




    public ParkingFloor() {
    }


}