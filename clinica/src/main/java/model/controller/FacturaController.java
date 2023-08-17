package model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.entity.Factura;
import model.service.FacturaService;

@Controller
public class FacturaController {

	@Autowired
	 private FacturaService ps;
	
	@RequestMapping(value = "/facturas", method = RequestMethod.GET)
	public ModelAndView mostrarFactura() {
		List<Factura> facturas = ps.getAll();
				

				
		return new ModelAndView("facturas", "facturas", facturas);
	}
}
