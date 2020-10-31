package cl.jesus.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.jesus.model.entity.Dueno;
@Repository
public interface DuenoDao extends JpaRepository<Dueno, Integer> {
@Query("FROM Dueno WHERE id = ?1 and nombre_dueno = ?2")
public List<Dueno> findByIdAndNombre(Integer id, String nombreDueno);
}
