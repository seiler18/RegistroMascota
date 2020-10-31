package cl.jesus.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.jesus.model.entity.Mascota;
@Repository
public interface MascotaDao extends JpaRepository<Mascota, Integer>{
	@Query("FROM Mascota  WHERE id = ?1 and nombre_mascota = ?2")
	public List<Mascota> findByIdAndNombre(Integer id, String nombreMascota);
}
