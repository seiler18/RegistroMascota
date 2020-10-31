package cl.jesus.service;

import java.util.List;

import cl.jesus.model.entity.Mascota;

public interface MascotaService {
	public List<Mascota> getAllMascotas() ;
	public Mascota findById(Integer id) ;
	public List<Mascota>getLista();
	public void update (Mascota mascota);
	public void save (Mascota mascota);
	public void delete(Integer id);
	
	
}
