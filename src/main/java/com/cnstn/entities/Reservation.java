package com.cnstn.entities;

import java.sql.Date;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

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

	@JoinColumn(name = "employee_id")

	@JsonBackReference("employee-reservation")

	private Employee employee;

	@ManyToOne

	@JoinColumn(name = "salle_id")

	@JsonBackReference("reservation-salle")

	private Salle salle;
}
