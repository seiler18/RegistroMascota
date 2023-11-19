package cl.jesus.registromascota.service.impl;

import cl.jesus.registromascota.dao.DuenoDao;
import cl.jesus.registromascota.model.Dueno;
import cl.jesus.registromascota.service.DuenoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DuenoServiceImpl implements DuenoService {

	@Autowired
	DuenoDao dao;

	@Transactional(readOnly = true)
	public List<Dueno> getAllDuenos() {
		return dao.findAll();
	}

	@Transactional(readOnly = true)
	public Dueno findById(Integer id) {
		Optional<Dueno> dueno = dao.findById(id);
		if (dueno.isPresent()) {
			return dueno.get();
		}
		return null;
	}
	
	
	@Transactional
	public List<Dueno>getLista(){
		List<Dueno>listaDueno = new ArrayList<>();
		dao.findAll().forEach(dueno -> listaDueno.add(dueno));
		return listaDueno;
	}
	
	
	@Transactional
	public void  save(Dueno dueno) {
		dao.save(dueno);
	}

	@Transactional
	public void update(Dueno dueno) {
		 dao.save(dueno);
	}
	
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);
	}

}
