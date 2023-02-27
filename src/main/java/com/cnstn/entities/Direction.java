package com.cnstn.entities;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Direction {
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id ;
	private String nom;
	private String description;
	
	
	
	@OneToMany(mappedBy ="direction", fetch = FetchType.LAZY)

	@JsonIgnoreProperties("direction")

	private List<Service> sevices = new ArrayList<Service>();
	
	
	
	
	

}
