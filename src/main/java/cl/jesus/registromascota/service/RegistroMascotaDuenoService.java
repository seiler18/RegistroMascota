package cl.jesus.registromascota.service;

import cl.jesus.registromascota.dto.RegistroDTO;
import cl.jesus.registromascota.model.RegistroMascotaDueno;

import java.util.List;

public interface RegistroMascotaDuenoService {
	public List<RegistroMascotaDueno> getAllRegistros();
	public RegistroMascotaDueno findById(Integer id);
	//el metodo que trato de tomar el id de mascota y del dueño y pasarlo a un DTO
	/*public RegistroDTO tomarId(RegistroDTO registroMascotaDueno , Integer mascotaId, Integer duenoId);
	//el metodo que trato de tomar el id de mascota y del dueño y pasarlo a un DTO*/
	public List<RegistroMascotaDueno>getLista();
	public void save (RegistroMascotaDueno registroMascotaDueno);
	public void update (RegistroMascotaDueno registroMascotaDueno) ;
	public void delete (Integer id) ;
}
