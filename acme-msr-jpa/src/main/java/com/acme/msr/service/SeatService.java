package com.acme.msr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.msr.entity.Seat;
import com.acme.msr.repository.SeatRepository;

@Service
public class SeatService {
	
	private SeatRepository seatRepository;
	
	@Autowired
	public SeatService(SeatRepository seatRepository) {
		this.seatRepository = seatRepository;
	}
	
	public Seat createSeat(String seatNo, String location) {
		return this.seatRepository.save(new Seat(seatNo, location));
	}
	
	public Seat createSeat(Seat seat) {
		return this.seatRepository.save(seat);
	}
}
