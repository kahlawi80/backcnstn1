package com.cnstn.service;

import java.util.List;

import com.cnstn.entities.Direction;


public interface BackServiceDirection {

	List<Direction> AfficherListDir();
	Direction addDirections(Direction direction);

}
