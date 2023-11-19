package cl.jesus.registromascota.dao;

import cl.jesus.registromascota.model.RegistroMascotaDueno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistroMascotaDuenoDao extends JpaRepository<RegistroMascotaDueno, Integer> {

    @Query("FROM RegistroMascotaDueno rmd WHERE rmd.dueno.id = ?1 AND rmd.mascota.id = ?2")
    List<RegistroMascotaDueno> findByDuenoAndMascota(Integer dueno_id, Integer mascota_id);
//@Modifying
//@Query("insert into RegistroMascotaDueno (id,direccion, comuna_id, dueno_id, mascota_id, raza_id, region_id, sexo_id, tipo_id) select :id,:direccion,:comuna_id, :dueno_id, :mascota_id, :raza_id, :region_id, :sexo_id, :tipo_id from RegistroMascotaDueno")
//public int modifyingQueryInsertRegistro(@Param("id")Integer id, @Param("direccion")String direccion, @Param("comuna_id")Integer comuna_id,@Param("dueno_id")Integer dueno_id,
//		@Param("mascota_id")Integer mascota_id, @Param("raza_id")Integer raza_id,@Param("region_id")Integer region_id, @Param("sexo_id")Integer sexo_id,@Param("tipo_id")Integer tipo_id
//		);

}
