package model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.entity.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor, Integer>{

}
