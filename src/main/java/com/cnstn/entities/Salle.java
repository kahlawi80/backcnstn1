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
public class Salle {
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String nom;
	private int nombre_place;
	
	
	
	@OneToMany(fetch=FetchType.LAZY)
	private List<Reservation> reservation= new ArrayList<Reservation>();

}
