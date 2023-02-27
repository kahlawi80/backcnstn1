package com.cnstn.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.cnstn.dao.ServiceRepository;

import com.cnstn.entities.Service;
import com.cnstn.service.BackServiceService;


@org.springframework.stereotype.Service
public class BackServiceServiceImpl implements BackServiceService{
	@Autowired
	ServiceRepository serviceRepository;

	@Override
	public List<Service> AfficherListService() {
		List<Service> services= serviceRepository.findAll();
		return services;
	}

	@Override
	public Service addService(Service service) {
		// TODO Auto-generated method stub
		return serviceRepository.save(service);
	}

	@Override
	public Service loadService(Long id) {
		// TODO Auto-generated method stub
		Optional<Service> optionalservice = serviceRepository.findById(id);
		return  optionalservice.get() ;
		
	}

	@Override
	public void deleteservice(Long id) {
		// TODO Auto-generated method stub
		serviceRepository.deleteById(id);
		
	}

	@Override
	public Service updateservice(Service service) {
		// TODO Auto-generated method stub

	      Service existingService = serviceRepository.findById(service.getId()).get();
	       
	        existingService.setDescription(service.getDescription());
	        
	        existingService.setNom(service.getNom());

	       Service updatedService = serviceRepository.save(existingService);
	        return updatedService;
	}

	

	 




}
