package model.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.entity.Paciente;
import model.repository.IPacienteRepository;

@Service
public class PacienteService {

	@Autowired
	private IPacienteRepository paciRepo;
	
    public PacienteService() {
        super();
    }

    public List<Paciente> getAll() {
		return paciRepo.findAll();
    }

    public Paciente getOne(int id) {
    	return paciRepo.getOne(id);
    }

    public void create(Paciente p) {
    	paciRepo.save(p);
    }

    public void update(Paciente p) {
    	paciRepo.save(p);
    }

    public void delete(int id) {
    	paciRepo.delete(paciRepo.getOne(id));
    }
}