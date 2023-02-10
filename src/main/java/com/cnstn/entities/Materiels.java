package com.cnstn.entities;

import java.sql.Date;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type" ,length=4)
public abstract class Materiels {
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private long serialnumber;
	private Date dateachat; 
	private String nom;
	private long codeinv;
	 
	@ManyToOne(fetch=FetchType.LAZY)
	Employee employee;
	

}
