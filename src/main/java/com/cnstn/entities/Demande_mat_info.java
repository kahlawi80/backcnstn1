package com.cnstn.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Demande_mat_info {
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private Date date_demmande;
	private Date materiel_demmander;
	
	@ManyToOne
	private Employee employee;
	
	

}
