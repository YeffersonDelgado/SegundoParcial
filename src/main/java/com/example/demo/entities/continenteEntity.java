package com.example.demo.entities;


import lombok.Data;

import java.io.Serializable;

import javax.persistence.*;




@Data
@Entity
public class continenteEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;

}
