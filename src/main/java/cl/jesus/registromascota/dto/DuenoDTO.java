package cl.jesus.registromascota.dto;


import cl.jesus.registromascota.model.Dueno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DuenoDTO {
 private Dueno dueno;
 private List<Dueno>duenos;
}
