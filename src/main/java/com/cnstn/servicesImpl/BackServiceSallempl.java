package com.cnstn.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnstn.dao.SalleRepository;
import com.cnstn.entities.Salle;
import com.cnstn.service.BackServiceSalle;

@Service
public class BackServiceSallempl implements BackServiceSalle {

	@Autowired
	SalleRepository salleRepository;


	@Override
	public Salle addSalle(Salle salle) {
		// TODO Auto-generated method stub
		return salleRepository.save(salle);
	}

	@Override
	public Salle loadSalle(Long id) {
		// TODO Auto-generated method stub
		Optional<Salle> optionalsalle = salleRepository.findById(id);
		return  optionalsalle.get() ;
		
	}

	@Override
	public void deleteSalle(Long id) {
		// TODO Auto-generated method stub
		salleRepository.deleteById(id);
		
	}

	@Override
	public Salle updateSalle( Salle salle) {
		// TODO Auto-generated method stub

		Salle existingSalle= salleRepository.findById(salle.getId()).get();
	       
	        existingSalle.setNom(salle.getNom());
	        existingSalle.setNombre_place(salle.getNombre_place());
	       

	        Salle updatedSalle = salleRepository.save(existingSalle);
	        return updatedSalle;
	}

	@Override
	public List<Salle> AfficherListSalle() {
		List<Salle> salle= salleRepository.findAll();
		return salle;
	}

	

	

}
