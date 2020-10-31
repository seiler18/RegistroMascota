package cl.jesus.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.jesus.model.dao.MascotaDao;
import cl.jesus.model.entity.Mascota;

@Service
public class MascotaServiceImpl implements MascotaService {

	@Autowired
	MascotaDao dao;

	@Transactional(readOnly = true)
	public List<Mascota> getAllMascotas() {
		return dao.findAll();
	}
	
	
	@Transactional(readOnly = true)
	public Mascota findById(Integer id) {
		Optional<Mascota> mascota = dao.findById(id);
		if (mascota.isPresent()) {
			return mascota.get();
		}
		return null;
	}
	
	
	@Transactional
	public List<Mascota>getLista(){
		List<Mascota>listaMascota = new ArrayList<>();
		dao.findAll().forEach(mascota -> listaMascota.add(mascota));
		return listaMascota;
	}
	
	
	@Transactional
	public void update (Mascota mascota) {
		dao.save(mascota);
	}
	@Transactional
	public void save (Mascota mascota) {
		dao.save(mascota);
	}
	
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);
	}
	

}
