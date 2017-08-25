package com.acme.msr.api;

import com.acme.msr.entity.Seat;
import com.acme.msr.model.NewSeatVO;
import com.acme.msr.model.SeatVO;
import com.acme.msr.repository.SeatRepository;

import io.swagger.annotations.*;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-26T08:22:38.793+09:00")

@Controller
public class SeatsApiController implements SeatsApi {

	@Autowired
	private SeatRepository seatRepository;

	@Autowired
	private ModelMapper modelMapper;

    private SeatVO convertToVO(Seat seat) {
    		SeatVO vo = modelMapper.map(seat, SeatVO.class);    		
    		return vo;
    }
    
    private Seat convertToEntity(SeatVO vo) {
    		Seat seat = modelMapper.map(vo, Seat.class);
    		return seat;
    }

    public ResponseEntity<SeatVO> addSeat(@ApiParam(value = "Seat to add to the store" ,required=true )  @Valid @RequestBody NewSeatVO seat) {
        // do some magic!
        return new ResponseEntity<SeatVO>(HttpStatus.OK);
    }

    public ResponseEntity<SeatVO> addSeat(@ApiParam(value = "ID of seat to fetch",required=true ) @PathVariable("id") Long id,
        @ApiParam(value = "Seat to add to the store" ,required=true )  @Valid @RequestBody NewSeatVO seat) {
        // do some magic!
        return new ResponseEntity<SeatVO>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteSeat(@ApiParam(value = "ID of seat to delete",required=true ) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<SeatVO> findSeatById(@ApiParam(value = "ID of seat to fetch",required=true ) @PathVariable("id") Long id) {
        // do some magic!
		System.out.println("id: " + id);
		Seat seat = seatRepository.findOne(id);
		
		if(seat == null) {
			return new ResponseEntity<SeatVO>(HttpStatus.NOT_FOUND);
		} else {
			
			return new ResponseEntity<SeatVO>(convertToVO(seat), HttpStatus.OK);
		}
    }

    public ResponseEntity<List<SeatVO>> findSeats(@ApiParam(value = "seatNo to filter by") @RequestParam(value = "seatNo", required = false) String seatNo,
        @ApiParam(value = "maximum number of results to return") @RequestParam(value = "limit", required = false) Integer limit) {
        // do some magic!
     	List<Seat> seats = null;
    		if(seatNo == null || seatNo.trim().length() == 0) {
    			seats = new ArrayList<Seat>();
    			seatRepository.findAll().iterator().forEachRemaining(seats::add);
    		} else {
    			seats = seatRepository.findBySeatNoLike(seatNo);
    		}
    	
    		List<SeatVO> voList = 
    				seats.stream().map(this::convertToVO).collect(Collectors.toList());
    		
    		return new ResponseEntity<List<SeatVO>>(voList, HttpStatus.OK);        
    }

}
