package com.cnstn.servicesImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnstn.dao.DirectionRepository;

import com.cnstn.entities.Direction;

import com.cnstn.service.BackServiceDirection;

@Service
public class BackServiceDirectionImpl implements BackServiceDirection{
	

	
	@Autowired
	DirectionRepository directionRepository;





	@Override
	public List<Direction> AfficherListDir() {
		List<Direction> Listdir=directionRepository.findAll();
		return Listdir;
	}

	@Override
	public Direction addDirections(Direction direction) {
		
		return directionRepository.save(direction);
	}


	

}


