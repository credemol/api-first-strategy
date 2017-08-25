package com.acme.msr.api;

import org.joda.time.LocalDate;
import com.acme.msr.model.NewReservationVO;
import com.acme.msr.model.ReservationVO;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-25T16:13:09.168+09:00")

@Controller
public class ReservationsApiController implements ReservationsApi {



    public ResponseEntity<Void> cancelReservation(@ApiParam(value = "reservation id",required=true ) @PathVariable("reservationId") Long reservationId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<ReservationVO>> findReservationsByUser(@ApiParam(value = "user id",required=true ) @PathVariable("userId") String userId,
        @ApiParam(value = "the begining date of search") @RequestParam(value = "from", required = false) LocalDate from,
        @ApiParam(value = "the end date of search") @RequestParam(value = "to", required = false) LocalDate to) {
        // do some magic!
        return new ResponseEntity<List<ReservationVO>>(HttpStatus.OK);
    }

    public ResponseEntity<List<ReservationVO>> findSeats( @NotNull@ApiParam(value = "date when you want to reserve a seat", required = true) @RequestParam(value = "date", required = true) LocalDate date,
        @ApiParam(value = "available or occupied, upon this value is null, all seats will be returned", allowableValues = "available, occupied") @RequestParam(value = "status", required = false) String status) {
        // do some magic!
        return new ResponseEntity<List<ReservationVO>>(HttpStatus.OK);
    }

    public ResponseEntity<ReservationVO> reserveSeat(@ApiParam(value = "reservation information" ,required=true )  @Valid @RequestBody NewReservationVO body) {
        // do some magic!
        return new ResponseEntity<ReservationVO>(HttpStatus.OK);
    }

    public ResponseEntity<ReservationVO> updateReservation(@ApiParam(value = "reservation id",required=true ) @PathVariable("reservationId") Long reservationId,
        @ApiParam(value = "reservation information" ,required=true )  @Valid @RequestBody NewReservationVO reservation) {
        // do some magic!
        return new ResponseEntity<ReservationVO>(HttpStatus.OK);
    }

    public ResponseEntity<ReservationVO> viewReservation(@ApiParam(value = "reservation id",required=true ) @PathVariable("reservationId") Long reservationId) {
        // do some magic!
        return new ResponseEntity<ReservationVO>(HttpStatus.OK);
    }

}
