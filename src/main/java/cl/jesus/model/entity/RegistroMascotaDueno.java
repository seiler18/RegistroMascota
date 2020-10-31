package cl.jesus.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "sq_registromascotadueno", initialValue = 1, allocationSize = 1, sequenceName = "sq_registromascotadueno")
public class RegistroMascotaDueno {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_registromascotadueno")
	private Integer id;       
	
	//Estos atributos los pude haber puesto en la entidad mascota tambien
	//dando a entender que es la mascota que se registra.
	private String Direccion;
	private String Region;
	private String Comuna;
	private String Tipo;
	private String Raza;
	private String Sexo;
	
	// (cascade = CascadeType.ALL, mappedBy = "RegistroMascotaDueno")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@OneToOne //en realidad puede ser ManyToMany o ManyToOne tambien depende la relacion que le quiera dar
//	@JoinColumn(name = "duenoId")
	private Dueno dueno;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@OneToOne
//	@JoinColumn(name = "mascotaId")
	private Mascota mascota;
}
