package com.tables.ParkingLotTables.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


//Table vehicle as v {
//    regd_no varchar
//    type varchar
//    color varchar
//}


@Entity
public class Vehicle {
	
	@Id
	@Column(name="regd_no")
	private String regd_no;
	
	@Column
	private int type;
	
	@Column
	private String color;

	

	public String getRegd_no() {
		return regd_no;
	}



	public void setRegd_no(String regd_no) {
		this.regd_no = regd_no;
	}



	public int getType() {
		return type;
	}



	public void setType(int type) {
		this.type = type;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	@Override
	public String toString() {
		return "{" +
			" regd_no='" + getRegd_no() + "'" +
			", type='" + getType() + "'" +
			", color='" + getColor() + "'" +
			"}";
	}


	
}
