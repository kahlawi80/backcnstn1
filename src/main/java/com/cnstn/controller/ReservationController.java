package com.cnstn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cnstn.entities.Reservation;

import com.cnstn.service.BackServiceReservation;

import lombok.AllArgsConstructor;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@AllArgsConstructor
@RequestMapping("reserv")

public class ReservationController {
	

	
	
	@Autowired
	BackServiceReservation backServiceReservation;

	@PostMapping
	public Reservation AddReRervation(@RequestBody Reservation reservation) {
		Reservation savedreservation = backServiceReservation.addReservation(reservation);
		return savedreservation;
	}

	@GetMapping("list")
	public List<Reservation> getAllReservation() {
		List<Reservation> reservation= backServiceReservation.AfficherListRes();
		return reservation;
	}

	@GetMapping("{id}")
	public Reservation loadReservation(@PathVariable("id") Long id) {
		Reservation reservation = backServiceReservation.loadReservation(id);
		return reservation;

	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteReservationn(@PathVariable("id") Long id) {
		backServiceReservation.deleteReservation(id);
		return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);

	}

	@PutMapping("{id}")
	public ResponseEntity<Reservation> updateReservation(@PathVariable("id") Long id, @RequestBody Reservation reservation) {
		reservation.setId(id);
		Reservation updatedReservation = backServiceReservation.updateReservation(reservation);
		return new ResponseEntity<>(updatedReservation, HttpStatus.OK);
	}

}
