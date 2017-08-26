package com.acme.msr.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.acme.msr.entity.Seat;


public interface SeatRepository extends CrudRepository<Seat, Long> {
	List<Seat> findBySeatNoLike(String seatNo);
}
