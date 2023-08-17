package model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entity.Factura;
import model.repository.IFacturaRepository;

@Service
public class FacturaService {

	@Autowired
	private IFacturaRepository facRepo;

	public FacturaService() {
		super();
	}

	public List<Factura> getAll() {
		return facRepo.findAll();
	}

	public Factura getOne(int id) {
		return facRepo.getOne(id);
	}

	public void create(Factura d) {
		facRepo.save(d);
	}

	public void update(Factura d) {
		facRepo.save(d);
	}

	public void delete(int id) {
		facRepo.delete(facRepo.getOne(id));
	}
}

