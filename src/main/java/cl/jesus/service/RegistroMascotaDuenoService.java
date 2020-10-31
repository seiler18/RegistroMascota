package cl.jesus.service;

import java.util.List;

import cl.jesus.model.DTO.RegistroDTO;
import cl.jesus.model.entity.RegistroMascotaDueno;

public interface RegistroMascotaDuenoService {
	public List<RegistroMascotaDueno> getAllRegistros();
	public RegistroMascotaDueno findById(Integer id);
	//el metodo que trato de tomar el id de mascota y del dueño y pasarlo a un DTO
	public RegistroDTO tomarId(RegistroDTO registroMascotaDueno ,Integer mascotaId, Integer duenoId);
	//el metodo que trato de tomar el id de mascota y del dueño y pasarlo a un DTO
	public List<RegistroMascotaDueno>getLista();
	public void save (RegistroMascotaDueno registroMascotaDueno);
	public void update (RegistroMascotaDueno registroMascotaDueno) ;
	public void delete (Integer id) ;
}
