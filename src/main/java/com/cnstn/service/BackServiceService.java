package com.cnstn.service;

import java.util.List;

import com.cnstn.entities.Demande_mat_info;
import com.cnstn.entities.Materiels;
import com.cnstn.entities.Service;


public interface BackServiceService {
	List<Service> AfficherListService();
	Service addService(Service service );
	


}
