package cl.jesus.registromascota.dao;

import cl.jesus.registromascota.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MascotaDao extends JpaRepository<Mascota, Integer> {

    @Query("SELECT m FROM Mascota m WHERE m.id = ?1 AND m.nombreMascota = ?2")
    List<Mascota> findByIdAndNombre(Integer id, String nombreMascota);
}
