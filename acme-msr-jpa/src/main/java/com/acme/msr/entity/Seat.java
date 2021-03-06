package com.acme.msr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Seat {

	@Id
	@GeneratedValue()
	private long id;
	
	@Column
	private String seatNo;
	
	@Column
	private String location;

	public Seat() {
		super();
	}
	public Seat(long id) {
		super();
		this.id = id;
	}
	public Seat(String seatNo, String location) {
		super();
		this.seatNo = seatNo;
		this.location = location;
	}
	public Seat(long id, String seatNo, String location) {
		super();
		this.id = id;
		this.seatNo = seatNo;
		this.location = location;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Seat [id=" + id + ", seatNo=" + seatNo + ", location=" + location + "]";
	}
	
	
}
