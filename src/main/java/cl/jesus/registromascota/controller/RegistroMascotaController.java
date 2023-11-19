package cl.jesus.registromascota.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.jesus.registromascota.model.Dueno;
import cl.jesus.registromascota.model.Mascota;
import cl.jesus.registromascota.model.RegistroMascotaDueno;
import cl.jesus.registromascota.service.DuenoService;
import cl.jesus.registromascota.service.MascotaService;
import cl.jesus.registromascota.service.RegistroMascotaDuenoService;

@Controller
public class RegistroMascotaController {

    private final DuenoService duenoService;
    private final MascotaService mascotaService;
    private final RegistroMascotaDuenoService registroMascotaDuenoService;

    @Autowired
    public RegistroMascotaController(DuenoService duenoService, MascotaService mascotaService, RegistroMascotaDuenoService registroMascotaDuenoService) {
        this.duenoService = duenoService;
        this.mascotaService = mascotaService;
        this.registroMascotaDuenoService = registroMascotaDuenoService;
    }

    @GetMapping("/")
    public String home(ModelMap mapa) {
        return "index";
    }

    @PostMapping("/agregar")
    public String create(ModelMap mapa, RegistroMascotaDueno registroMascotaDueno, Mascota mascota, Dueno dueno, Integer mascotaId, Integer duenoId) {
        saveEntities(registroMascotaDueno, mascota, dueno);
        return "redirect:/listado";
    }

    @GetMapping("/eliminar")
    public String delete(Integer id, ModelMap mapa) {
        duenoService.delete(id);
        return "redirect:/home";
    }

    @GetMapping("/listado")
    public ModelAndView listarRegistrosGet() {
        return getModelAndView();
    }

    @PostMapping("/agregar/listado")
    public ModelAndView listarRegistrosPost() {
        return getModelAndView();
    }

    private ModelAndView getModelAndView() {
        ModelAndView modelAndView = new ModelAndView("listado");
        modelAndView.addObject("registros", registroMascotaDuenoService.getAllRegistros());
        modelAndView.addObject("mascotas", mascotaService.getAllMascotas());
        modelAndView.addObject("duenos", duenoService.getAllDuenos());
        return modelAndView;
    }

    private void saveEntities(RegistroMascotaDueno registroMascotaDueno, Mascota mascota, Dueno dueno) {
        registroMascotaDuenoService.save(registroMascotaDueno);
        mascotaService.save(mascota);
        duenoService.save(dueno);
        // lógica adicional si es necesario
    }
}

