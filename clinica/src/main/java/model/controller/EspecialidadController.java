package model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.entity.Especialidad;
import model.service.EspecialidadService;

@Controller
public class EspecialidadController {

	@Autowired
	 private EspecialidadService ps;
	
	@RequestMapping(value = "/especialidades", method = RequestMethod.GET)
	public ModelAndView mostrarDoctor() {
		List<Especialidad> especialidades = ps.getAll();
				

				
		return new ModelAndView("especialidades", "especialidades", especialidades);
	}
}
