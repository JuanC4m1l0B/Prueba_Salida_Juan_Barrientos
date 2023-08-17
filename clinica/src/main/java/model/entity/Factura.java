package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Facturas")
public class Factura {
	
	@Id
    @Column(name = "id")
	private int id;
	
	private int monto;
	private String fecha_Pago;
	
	public Factura() {
		super();
	}
	
	public Factura(int id, int monto, String fecha_Pago) {
		super();
		this.id = id;
		this.monto = monto;
		this.fecha_Pago = fecha_Pago;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public String getFecha_Pago() {
		return fecha_Pago;
	}

	public void setFecha_Pago(String fecha_Pago) {
		this.fecha_Pago = fecha_Pago;
	}
	
	
	
}
