package cl.jesus.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.jesus.model.DTO.RegistroDTO;
import cl.jesus.model.entity.Dueno;
import cl.jesus.model.entity.Mascota;
import cl.jesus.model.entity.RegistroMascotaDueno;
import cl.jesus.service.DuenoService;
import cl.jesus.service.MascotaService;
import cl.jesus.service.RegistroMascotaDuenoService;

@Controller

public class RegistroMascotaControler {

	@Autowired
	private DuenoService duenoService;
	@Autowired
	private MascotaService mascotaService;
	@Autowired
	private RegistroMascotaDuenoService registroMascotaDuenoService;

//put y addAttribute vienen siendo lo mismo

	@RequestMapping("/")
	public String home(ModelMap mapa) {

		return "home";
	}

	@PostMapping("/agregar")
	public String create(ModelMap mapa, RegistroMascotaDueno registroMascotaDueno, Mascota mascota, Dueno dueno, Integer mascotaId, Integer duenoId) {

		// por si quiero mostrar todo los registros despues de agregados tengo la opcion
		// :
		mapa.put("registro", registroMascotaDuenoService.getAllRegistros());
		mascotaService.save(mascota);
		duenoService.save(dueno);
//	posibilidad de obtener el id para usarlo y añadirlo a la tabla	registroMascotaDuenoService.tomarId(registroMascotaDueno, mascotaId, duenoId);
		registroMascotaDuenoService.save(registroMascotaDueno);
		return "home";
	}

	@GetMapping("/eliminar")
	public String delete(Integer id, ModelMap mapa) {
		duenoService.delete(id);

		return "home";
	}

	@GetMapping("/listarRegistros")
	public String listarRegistros(ModelMap mapa) {
		return "home";
		// Esto lo usare para cuando quiera mostrar los registros que existen de
		// mascota, dueños
		// en una tabla
//		mapa.put("duenos", duenoService.getAllDuenos());
//		mapa.put("mascota", mascotaService.getAllMascotas());
//		mapa.put("registros", registroMascotaDuenoService.mostrarTodo());
	}
}
