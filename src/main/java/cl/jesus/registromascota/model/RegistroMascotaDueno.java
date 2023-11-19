package cl.jesus.registromascota.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
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
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;


    // (cascade = CascadeType.ALL, mappedBy = "RegistroMascotaDueno")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    @ManyToOne
    @JoinColumn(name = "duenoId")
    private Dueno dueno;

    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    @ManyToOne
    @JoinColumn(name = "mascotaId")
    private Mascota mascota;
}
