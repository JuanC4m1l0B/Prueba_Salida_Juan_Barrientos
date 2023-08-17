package model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.entity.Doctor;
import model.service.DoctorService;


@Controller
public class DoctorController {

	@Autowired
	 private DoctorService ps;
	
	@RequestMapping(value = "/doctores", method = RequestMethod.GET)
	public ModelAndView mostrarDoctor() {
		List<Doctor> doctores = ps.getAll();
				

				
		return new ModelAndView("doctores", "doctores", doctores);
	}
}
