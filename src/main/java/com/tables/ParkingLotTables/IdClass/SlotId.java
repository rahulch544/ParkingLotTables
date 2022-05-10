package com.tables.ParkingLotTables.IdClass;

import java.io.Serializable;
import java.util.Objects;

public class SlotId implements Serializable {

    private Integer slot_no;

    private Integer floor_no;


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SlotId)) {
            return false;
        }
        SlotId slot_id = (SlotId) o;
        return Objects.equals(slot_no, slot_id.slot_no) && Objects.equals(floor_no, slot_id.floor_no);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slot_no, floor_no);
    }

    public SlotId(Integer slot_no, Integer floor_no) {
        this.slot_no = slot_no;
        this.floor_no = floor_no;
    }


    public SlotId() {
    }

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

    
}