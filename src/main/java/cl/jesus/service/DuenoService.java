package cl.jesus.service;

import java.util.List;

import cl.jesus.model.entity.Dueno;

public interface DuenoService {
	public List<Dueno> getAllDuenos();
	public Dueno findById(Integer id);
	public List<Dueno>getLista();
	public void save (Dueno dueno);
	public void update(Dueno dueno);
	public void delete(Integer id) ;
	
}
