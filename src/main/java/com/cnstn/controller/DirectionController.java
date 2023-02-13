package com.cnstn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnstn.entities.Direction;
import com.cnstn.service.BackServiceDirection;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("dir")
public class DirectionController {
	@Autowired
	BackServiceDirection backservice;
	
	@PostMapping
	public Direction createDir(@RequestBody Direction direction){
        Direction savedDir = backservice.addDirections(direction);
        return savedDir;
    }
	
	@GetMapping("directions")
	 public List<Direction> getAllDir(){
	        List<Direction> directions = backservice.AfficherListDir();
	        return directions;
	    }

}
