package model.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.entity.Paciente;
import model.service.PacienteService;

@Controller
public class PacienteController {

	@Autowired
	 private PacienteService ps;
	
	@RequestMapping(value = "/pacientes", method = RequestMethod.GET)
	public ModelAndView mostrarPaciente() {
		List<Paciente> pacientes = ps.getAll();
				

				
		return new ModelAndView("pacientes", "pacientes", pacientes);
	}
}
