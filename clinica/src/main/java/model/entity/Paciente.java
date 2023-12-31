   package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Pacientes")
public class Paciente {
	
	
	@Id
    @Column(name = "id")
	private int id;
	
	private String nombre;
	private String fecha_Nacimiento;
	
	public Paciente() {
		super();
	}
	
	public Paciente(int id, String nombre, String fecha_Nacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha_Nacimiento = fecha_Nacimiento;
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

	public String getFecha_Nacimiento() {
		return fecha_Nacimiento;
	}

	public void setFechaNacimiento(String fecha_Nacimiento) {
		this.fecha_Nacimiento = fecha_Nacimiento;
	}
	
	
	

}
