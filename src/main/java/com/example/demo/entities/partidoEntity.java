package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "partido")
public class partidoEntity {
  
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	 
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name="estadio_id")
	private estadioEntity estadio;
	
	@JsonIgnore
	@OneToMany(mappedBy = "partido")
	private List<resultadoEntity>resultados;
	
	


	
	

    


}