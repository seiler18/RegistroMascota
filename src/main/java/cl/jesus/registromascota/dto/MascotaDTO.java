package cl.jesus.registromascota.dto;


import cl.jesus.registromascota.model.Mascota;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MascotaDTO {
private Mascota mascota;
private List<Mascota>mascotas;
}
