package model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entity.Historia_Clinica;
import model.repository.IHistoria_ClinicaRepository;

@Service
public class Historia_ClinicaService {

	@Autowired
	private IHistoria_ClinicaRepository histRepo;

	public Historia_ClinicaService() {
		super();
	}

	public List<Historia_Clinica> getAll() {
		return histRepo.findAll();
	}

	public Historia_Clinica getOne(int id) {
		return histRepo.getOne(id);
	}

	public void create(Historia_Clinica h) {
		histRepo.save(h);
	}

	public void update(Historia_Clinica h) {
		histRepo.save(h);
	}

	public void delete(int id) {
		histRepo.delete(histRepo.getOne(id));
	}
}


