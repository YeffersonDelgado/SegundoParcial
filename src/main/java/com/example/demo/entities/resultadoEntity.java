package com.example.demo.entities;



import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "resultado")
public class resultadoEntity {
   
	
	
	@Id
	@SequenceGenerator(name="resultado_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "resultado_id_seq")
	private Integer id;

    // Otros atributos de la entidad Resultado
    
    private Integer goles;
    private Integer amarillas;
    private Integer rojas;

    @ManyToOne
    @JoinColumn(name = "seleccion_id")
    private seleccionEntity seleccion;

    @ManyToOne
    @JoinColumn(name = "partido_id")
    private partidoEntity partido;
    


  
    
    
}
