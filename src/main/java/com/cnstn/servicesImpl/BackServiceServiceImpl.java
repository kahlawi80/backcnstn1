package com.cnstn.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cnstn.dao.DemandeRepository;
import com.cnstn.dao.MaterielsRepository;
import com.cnstn.dao.ServiceRepository;
import com.cnstn.entities.Demande_mat_info;
import com.cnstn.entities.Materiels;
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

	







}
