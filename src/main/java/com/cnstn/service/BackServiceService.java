package com.cnstn.service;

import java.util.List;


import com.cnstn.entities.Service;

public interface BackServiceService {

	List<Service> AfficherListService();

	Service addService(Service service);

	Service loadService(Long id);

	void deleteservice(Long id);

	Service updateservice(Service service);

}
