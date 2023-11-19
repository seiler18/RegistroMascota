package cl.jesus.registromascota.service.impl;

import cl.jesus.registromascota.dto.RegistroDTO;
import cl.jesus.registromascota.dao.RegistroMascotaDuenoDao;
import cl.jesus.registromascota.model.Dueno;
import cl.jesus.registromascota.model.Mascota;
import cl.jesus.registromascota.model.RegistroMascotaDueno;
import cl.jesus.registromascota.service.RegistroMascotaDuenoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service

public class RegistroMascotaDuenoServiceImpl implements RegistroMascotaDuenoService {
	@Autowired
	RegistroMascotaDuenoDao Dao;


	@Transactional(readOnly = true)
	public List<RegistroMascotaDueno> getAllRegistros() {
		return Dao.findAll();
	}

	@Transactional(readOnly = true)
	public RegistroMascotaDueno findById(Integer id) {
		Optional<RegistroMascotaDueno> registro = Dao.findById(id);
		if (registro.isPresent()) {
			return registro.get();
		}
		return null;
	}
	
	
	@Transactional
	public List<RegistroMascotaDueno>getLista(){
		List<RegistroMascotaDueno>listaRegistro = new ArrayList<>();
		Dao.findAll().forEach(registro -> listaRegistro.add(registro));
		return listaRegistro;
	}

	@Transactional
	public void save (RegistroMascotaDueno registroMascotaDueno, Dueno dueno, Mascota mascota) {
		Dao.save(registroMascotaDueno);
	}
	
	@Transactional
	public void update (RegistroMascotaDueno registroMascotaDueno) {
		Dao.save(registroMascotaDueno);
	}
	
	@Transactional
	public void delete(Integer id) {
		Dao.deleteById(id);
	}

	/*@Override
	public RegistroDTO tomarId(RegistroDTO registroMascotaDueno, Integer mascotaId, Integer duenoId) {
		Dao.save(registroMascotaDueno);
		return registroMascotaDueno;	
	}*/

	@Override
	public void save(RegistroMascotaDueno registroMascotaDueno) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
