package cl.jesus.model.DTO;




import java.util.List;

import cl.jesus.model.entity.Dueno;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DuenoDTO {
 private Dueno dueno;
 private List<Dueno>duenos;
}
