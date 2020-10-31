package cl.jesus.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name="sq_mascota", initialValue=1, allocationSize=1,sequenceName = "sq_mascota")
public class Mascota {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sq_mascota")
	private Integer id;
	private String nombreMascota;
	private Integer edadMascota;
	private String descripcion;

}
