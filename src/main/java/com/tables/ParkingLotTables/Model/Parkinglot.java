package com.tables.ParkingLotTables.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

// Table parkinglot as pf {
//     id int [pk, increment] // auto-increment
//     address varchar
//     two_wheeler_fees int
//     four_wheeler_fees int
//     created_at timestamp
//   }

@Entity
public class Parkinglot {
    

    @Id
    private Integer parkinglot_id;

    @Column(unique=true)
    private String address;

    private Integer two_wheeler_fees;

    private Integer four_wheeler_fees;

    private Integer created_on;

    private Integer exits;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="PARKINGLOT_ID")
    private List<ParkingFloor> parkingFloor;

    public Parkinglot() {
    }

    public Parkinglot(Integer parkinglot_id, String address, Integer two_wheeler_fees, Integer four_wheeler_fees, Integer created_on, Integer exits, List<ParkingFloor> parkingFloor) {
        this.parkinglot_id = parkinglot_id;
        this.address = address;
        this.two_wheeler_fees = two_wheeler_fees;
        this.four_wheeler_fees = four_wheeler_fees;
        this.created_on = created_on;
        this.exits = exits;
        this.parkingFloor = parkingFloor;
    }

    public Integer getParkinglot_id() {
        return this.parkinglot_id;
    }

    public void setParkinglot_id(Integer parkinglot_id) {
        this.parkinglot_id = parkinglot_id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getTwo_wheeler_fees() {
        return this.two_wheeler_fees;
    }

    public void setTwo_wheeler_fees(Integer two_wheeler_fees) {
        this.two_wheeler_fees = two_wheeler_fees;
    }

    public Integer getFour_wheeler_fees() {
        return this.four_wheeler_fees;
    }

    public void setFour_wheeler_fees(Integer four_wheeler_fees) {
        this.four_wheeler_fees = four_wheeler_fees;
    }

    public Integer getCreated_on() {
        return this.created_on;
    }

    public void setCreated_on(Integer created_on) {
        this.created_on = created_on;
    }

    public Integer getExits() {
        return this.exits;
    }

    public void setExits(Integer exits) {
        this.exits = exits;
    }

    public List<ParkingFloor> getParkingFloor() {
        return this.parkingFloor;
    }

    public void setParkingFloor(List<ParkingFloor> parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    @Override
    public String toString() {
        return "{" +
            " parkinglot_id='" + getParkinglot_id() + "'" +
            ", address='" + getAddress() + "'" +
            ", two_wheeler_fees='" + getTwo_wheeler_fees() + "'" +
            ", four_wheeler_fees='" + getFour_wheeler_fees() + "'" +
            ", created_on='" + getCreated_on() + "'" +
            ", exits='" + getExits() + "'" +
            ", parkingFloor='" + getParkingFloor() + "'" +
            "}";
    }

}