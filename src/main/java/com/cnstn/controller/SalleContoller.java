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

import com.cnstn.entities.Salle;

import com.cnstn.service.BackServiceSalle;


import lombok.AllArgsConstructor;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@AllArgsConstructor
@RequestMapping("salles")

public class SalleContoller {
	

	
		@Autowired
		BackServiceSalle backServiceSalle;

		@PostMapping
		public Salle AddSalle(@RequestBody Salle salle) {
			Salle savedSalle = backServiceSalle.addSalle(salle);
			return savedSalle;
		}

		@GetMapping("list")
		public List<Salle> getAllSalle() {
			List<Salle> salle = backServiceSalle.AfficherListSalle();
			return salle;
		}
		
		
		
		

		@GetMapping("{id}")
		public Salle loadSalle( @PathVariable ("id") Long id )
		{
			Salle salle = backServiceSalle.loadSalle(id);
	    return salle;
		
		}
		
		
		
		 @DeleteMapping("{id}")
		    public   ResponseEntity<Object> deleteSalle(@PathVariable("id") Long id){
		        backServiceSalle.deleteSalle(id);
		        return  ResponseEntity.noContent().build();
		        
		    }

		 @PutMapping("{id}")
		    public ResponseEntity<Salle> updateservice(@PathVariable("id") Long id,
		                                           @RequestBody Salle salle){
			 salle.setId(id);
			 Salle updatedSalle = backServiceSalle.updateSalle(salle);
		        return new ResponseEntity<>(updatedSalle, HttpStatus.OK);
		    }
		 	

}
