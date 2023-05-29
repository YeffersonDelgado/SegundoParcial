package com.example.demo.entities;



import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Table(name = "seleccion")
@Entity
public class seleccionEntity {

		


	@Id
	@SequenceGenerator(name="seleccion_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seleccion_id_seq")
	private Integer id;
	
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="continente_id")
	private continenteEntity continente;
	
	private String grupo;

		
	}
	

