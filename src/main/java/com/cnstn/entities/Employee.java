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
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private int cin;
	private int tel;
	private int matricule;
	private String adresse;
	private String poste;

	@ManyToOne
	private Service service;

	@OneToMany
	private List<Reservation> reservations = new ArrayList<Reservation>();

	@OneToMany
	private List<Materiels> materiels = new ArrayList<Materiels>();

	@OneToMany(mappedBy = "employee")
	private List<Demande_mat_info> demandes = new ArrayList<Demande_mat_info>();

}
