package com.cnstn.entities;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Direction {
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id ;
	private String nom;
	private String description;
	
	
	
	@OneToMany
	private List<Service> sevices = new ArrayList<Service>();

	
	
	
	
	

}
