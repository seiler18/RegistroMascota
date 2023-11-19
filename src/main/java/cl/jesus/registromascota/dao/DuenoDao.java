package cl.jesus.registromascota.dao;

import cl.jesus.registromascota.model.Dueno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DuenoDao extends JpaRepository<Dueno, Integer> {

    @Query("SELECT d FROM Dueno d WHERE d.id = ?1 AND d.nombreDueno = ?2")
    List<Dueno> findByIdAndNombre(Integer id, String nombreDueno);
}
