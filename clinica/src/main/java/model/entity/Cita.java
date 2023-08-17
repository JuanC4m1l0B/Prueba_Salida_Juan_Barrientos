package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Citas")
public class Cita {
	
	@Id
    @Column(name = "id")
	private int id;
	
	private int paciente_Id;
	private int doctor_Id;
	private String fecha;
	private int factura_Id;
	
	
	public Cita() {
		super();
	}
	public Cita(int id, int paciente_Id, int doctor_Id, String fecha, int factura_Id) {
		super();
		this.id = id;
		this.paciente_Id = paciente_Id;
		this.doctor_Id = doctor_Id;
		this.fecha = fecha;
		this.factura_Id = factura_Id;
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
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getFactura_Id() {
		return factura_Id;
	}
	public void setFactura_Id(int factura_Id) {
		this.factura_Id = factura_Id;
	}
	
	
	
	
	
	
}
