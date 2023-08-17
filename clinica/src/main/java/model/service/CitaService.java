package model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entity.Cita;
import model.repository.ICitaRepository;


@Service
public class CitaService {

	@Autowired
	private ICitaRepository citaRepo;

	public CitaService() {
		super();
	}

	public List<Cita> getAll() {
		return citaRepo.findAll();
	}

	public Cita getOne(int id) {
		return citaRepo.getOne(id);
	}

	public void create(Cita c) {
		citaRepo.save(c);
	}

	public void update(Cita c) {
		citaRepo.save(c);
	}

	public void delete(int id) {
		citaRepo.delete(citaRepo.getOne(id));
	}
}
