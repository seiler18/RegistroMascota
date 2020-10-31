package cl.jesus.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.jesus.model.entity.Dueno;
import cl.jesus.model.entity.Mascota;

import cl.jesus.model.entity.RegistroMascotaDueno;

import cl.jesus.service.DuenoService;
import cl.jesus.service.MascotaService;

import cl.jesus.service.RegistroMascotaDuenoService;

@RestController
@RequestMapping("/registro")
public class RegistroMascotaApi {
	@Autowired
	private DuenoService duenoService;
	@Autowired
	private MascotaService mascotaService;
	@Autowired
	private RegistroMascotaDuenoService registroMascotaDuenoService;

	@GetMapping("/registros")
	public List<RegistroMascotaDueno> registros(ModelMap mapa) {

		return registroMascotaDuenoService.getAllRegistros();

	}

	@GetMapping("/duenos")
	public List<Dueno> duenos(ModelMap mapa) {

		return duenoService.getAllDuenos();

	}

	@GetMapping("/mascotas")
	public List<Mascota> mascotas(ModelMap mapa) {

		return mascotaService.getAllMascotas();

	}

}