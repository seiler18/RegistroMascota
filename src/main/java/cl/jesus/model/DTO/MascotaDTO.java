package cl.jesus.model.DTO;


import java.util.List;

import cl.jesus.model.entity.Mascota;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MascotaDTO {
private Mascota mascota;
private List<Mascota>mascotas;
}
