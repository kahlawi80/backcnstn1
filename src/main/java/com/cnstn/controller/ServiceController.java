package com.cnstn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnstn.entities.Direction;
import com.cnstn.entities.Service;
import com.cnstn.service.BackServiceDirection;
import com.cnstn.service.BackServiceService;
import com.cnstn.servicesImpl.BackServiceServiceImpl;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("services")
public class ServiceController {
	@Autowired
	BackServiceService  backServiceService;
	
	@PostMapping
	public Service AddService(@RequestBody Service service){
        Service savedService = backServiceService.addService(service);
        return savedService;
    }
	
	@GetMapping("list")
	 public List<Service> getAllService(){
	        List<Service> services = backServiceService.AfficherListService();
	        return services;
	    }


}
