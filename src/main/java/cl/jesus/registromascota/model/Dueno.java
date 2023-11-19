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
@SequenceGenerator(name="sq_dueno", initialValue=1, allocationSize=1,sequenceName = "sq_dueno")
public class Dueno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String rut;

    @Column
    private String nombreDueno;

    @Column
    private Integer edadDueno;


    @OneToMany(mappedBy = "dueno")
    @JsonIgnore
    private List<RegistroMascotaDueno> listaDuenos;
}