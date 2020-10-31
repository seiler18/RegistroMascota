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
@SequenceGenerator(name="sq_dueno", initialValue=1, allocationSize=1,sequenceName = "sq_dueno")
public class Dueno {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sq_dueno")
	private Integer id;
	private String rut;
	private String nombreDueno;
	private Integer edadDueno;
	
}
