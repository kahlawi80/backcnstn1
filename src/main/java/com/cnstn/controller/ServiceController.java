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


import com.cnstn.entities.Service;

import com.cnstn.service.BackServiceService;


import lombok.AllArgsConstructor;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@AllArgsConstructor
@RequestMapping("services")
public class ServiceController {
	@Autowired
	BackServiceService backServiceService;

	@PostMapping
	public Service AddService(@RequestBody Service service) {
		Service savedService = backServiceService.addService(service);
		return savedService;
	}

	@GetMapping("list")
	public List<Service> getAllService() {
		List<Service> services = backServiceService.AfficherListService();
		return services;
	}
	
	
	
	

	@GetMapping("{id}")
	public Service loadService( @PathVariable ("id") Long id )
	{
	Service service = backServiceService.loadService(id);
    return service;
	
	}
	
	
	
	 @DeleteMapping("{id}")
	    public   ResponseEntity<String> deleteService(@PathVariable("id") Long id){
	        backServiceService.deleteservice(id);
	        return  ResponseEntity.noContent().build();
	        
	    }

	 @PutMapping("{id}")
	    public ResponseEntity<Service> updateservice(@PathVariable("id") Long id,
	                                           @RequestBody Service service){
	       service.setId(id);
	        Service updatedservice = backServiceService.updateservice(service);
	        return new ResponseEntity<>(updatedservice, HttpStatus.OK);
	    }
	 	
	
	
	
	
	
	

}
