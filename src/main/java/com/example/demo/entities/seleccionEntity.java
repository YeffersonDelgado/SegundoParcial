package com.example.demo.entities;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "seleccion")
@Entity
public class seleccionEntity {

		


	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="continente_id")
	private continenteEntity continente;
	
	private String grupo;

		
	}
	

