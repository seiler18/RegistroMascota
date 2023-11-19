package cl.jesus.registromascota.service;

import cl.jesus.registromascota.model.Mascota;

import java.util.List;

public interface MascotaService {
	public List<Mascota> getAllMascotas() ;
	public Mascota findById(Integer id) ;
	public List<Mascota>getLista();
	public void update (Mascota mascota);
	public void save (Mascota mascota);
	public void delete(Integer id);
	
	
}
