package model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.entity.Doctor;
import model.repository.IDoctorRepository;

@Service
public class DoctorService {

	@Autowired
	private IDoctorRepository docRepo;

	public DoctorService() {
		super();
	}

	public List<Doctor> getAll() {
		return docRepo.findAll();
	}

	public Doctor getOne(int id) {
		return docRepo.getOne(id);
	}

	public void create(Doctor d) {
		docRepo.save(d);
	}

	public void update(Doctor d) {
		docRepo.save(d);
	}

	public void delete(int id) {
		docRepo.delete(docRepo.getOne(id));
	}
}
