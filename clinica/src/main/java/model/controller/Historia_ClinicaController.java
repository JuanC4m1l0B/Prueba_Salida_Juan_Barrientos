package model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.entity.Historia_Clinica;
import model.service.Historia_ClinicaService;

@Controller
public class Historia_ClinicaController {

	@Autowired
	 private Historia_ClinicaService ps;
	
	@RequestMapping(value = "/historia_clinica", method = RequestMethod.GET)
	public ModelAndView mostrarHistoria_Clinica() {
		List<Historia_Clinica> historia_clinica = ps.getAll();
				

				
		return new ModelAndView("historia_clinica", "historia_clinica", historia_clinica);
	}
}
