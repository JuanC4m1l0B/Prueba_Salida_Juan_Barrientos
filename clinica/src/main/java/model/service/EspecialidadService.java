package model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entity.Especialidad;
import model.repository.IEspecialidadRepository;

@Service
public class EspecialidadService {

	@Autowired
	private IEspecialidadRepository espRepo;

	public EspecialidadService() {
		super();
	}

	public List<Especialidad> getAll() {
		return espRepo.findAll();
	}

	public Especialidad getOne(int id) {
		return espRepo.getOne(id);
	}

	public void create(Especialidad e) {
		espRepo.save(e);
	}

	public void update(Especialidad e) {
		espRepo.save(e);
	}

	public void delete(int id) {
		espRepo.delete(espRepo.getOne(id));
	}
}
