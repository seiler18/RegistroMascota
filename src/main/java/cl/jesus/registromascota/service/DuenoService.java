package cl.jesus.registromascota.service;

import cl.jesus.registromascota.model.Dueno;

import java.util.List;

public interface DuenoService {
	public List<Dueno> getAllDuenos();
	public Dueno findById(Integer id);
	public List<Dueno>getLista();
	public void save (Dueno dueno);
	public void update(Dueno dueno);
	public void delete(Integer id) ;
	
}
