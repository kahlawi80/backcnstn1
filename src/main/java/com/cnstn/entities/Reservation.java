package com.cnstn.entities;

import java.sql.Date;
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
public class Reservation {
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private Date date_d;
	private Date date_f;
	
	@ManyToOne
	private Employee employee;
	

	@ManyToOne
	private Salle salle;
}
