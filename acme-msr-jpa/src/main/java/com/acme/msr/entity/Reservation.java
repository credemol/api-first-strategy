package com.acme.msr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {
	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String date;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Seat seat;
	
	@Column
	private ReservationStatus status;

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservation(long id) {
		super();
		this.id = id;
	}

	public Reservation(long id, String date, User user, Seat seat, ReservationStatus status) {
		super();
		this.id = id;
		this.date = date;
		this.user = user;
		this.seat = seat;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public ReservationStatus getStatus() {
		return status;
	}

	public void setStatus(ReservationStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", date=" + date + ", user=" + user + ", seat=" + seat + ", status=" + status
				+ "]";
	}
	
	
}
