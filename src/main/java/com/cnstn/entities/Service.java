package com.cnstn.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	
	@ManyToOne(fetch = FetchType.LAZY)

	@JoinColumn(name = "direction_id")

	@JsonBackReference("service-direction")

	Direction direction;

	@OneToMany(mappedBy = "service", fetch = FetchType.LAZY , cascade = CascadeType.ALL, orphanRemoval = true)

	//@JsonIgnoreProperties("service")

	private List<Employee> employees= new ArrayList<Employee>();
	
}

