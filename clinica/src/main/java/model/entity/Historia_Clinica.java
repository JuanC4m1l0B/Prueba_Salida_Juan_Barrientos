package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Historia_Clinica")
public class Historia_Clinica {
	
	@Id
    @Column(name = "id")
	private int id;
	
	private int paciente_Id;
	private int doctor_Id;
	private String fecha_Cita;
	private String sintomas;
	private String diagnostico;
	private String tratamiento;
	
	public Historia_Clinica() {
		super();
	}

	public Historia_Clinica(int id, int paciente_Id, int doctor_Id, String fecha_Cita, String sintomas,
			String diagnostico, String tratamiento) {
		super();
		this.id = id;
		this.paciente_Id = paciente_Id;
		this.doctor_Id = doctor_Id;
		this.fecha_Cita = fecha_Cita;
		this.sintomas = sintomas;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPaciente_Id() {
		return paciente_Id;
	}

	public void setPaciente_Id(int paciente_Id) {
		this.paciente_Id = paciente_Id;
	}

	public int getDoctor_Id() {
		return doctor_Id;
	}

	public void setDoctor_Id(int doctor_Id) {
		this.doctor_Id = doctor_Id;
	}

	public String getFecha_Cita() {
		return fecha_Cita;
	}

	public void setFecha_Cita(String fecha_Cita) {
		this.fecha_Cita = fecha_Cita;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	
	
	
	



	
}
