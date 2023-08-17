package model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.entity.Paciente;

public interface IPacienteRepository extends JpaRepository<Paciente, Integer>{

}
