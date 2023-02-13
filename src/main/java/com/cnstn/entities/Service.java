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
public class Service {
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String description;
	
	@ManyToOne
	Direction direction;
	
	@OneToMany(fetch=FetchType.LAZY)
	private List<Employee> employees= new ArrayList<Employee>();
	
}

