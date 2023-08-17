package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Doctores")
public class Doctor {
	
	@Id
    @Column(name = "id")
	private int id;
	
	private String nombre;
	private int especialidad_Id;
	private int experiencia;
	
	public Doctor() {
		super();
	}
	
	
	public Doctor(int id, String nombre, int especialidad_Id, int experiencia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especialidad_Id = especialidad_Id;
		this.experiencia = experiencia;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEspecialidad_Id() {
		return especialidad_Id;
	}


	public void setEspecialidad_Id(int especialidad_Id) {
		this.especialidad_Id = especialidad_Id;
	}


	public int getExperiencia() {
		return experiencia;
	}


	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	
}
