package cl.jesus.registromascota.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name="sq_mascota", initialValue=1, allocationSize=1,sequenceName = "sq_mascota")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nombreMascota;

    @Column
    private Integer edadMascota;

    @Column
    private String descripcion;

    @Column
    private String direccion;

    @Column
    private String region;

    @Column
    private String comuna;

    @Column
    private String tipo;

    @Column
    private String raza;

    @Column
    private String sexo;

    @OneToMany(mappedBy = "mascota")
    @JsonIgnore
    private List<RegistroMascotaDueno> listaMascotas;
}