package clases;

import java.sql.Date;

public class Reserva {
	private int id;
	private int id_habitacion;
	private String dni;
	private Date desde;
	private Date hasta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_Habitacion() {
		return id_habitacion;
	}
	public void setId_Habitacion(int habitacion) {
		this.id_habitacion = habitacion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getDesde() {
		return desde;
	}
	public void setDesde(Date desde) {
		this.desde = desde;
	}
	public Date getHasta() {
		return hasta;
	}
	public void setHasta(Date hasta) {
		this.hasta = hasta;
	}
	
	
	@Override
	public String toString() {
		return "Reservas [id=" + id + ", id_habitacion=" + id_habitacion + ", dni=" + dni + ", desde=" + desde + ", hasta="
				+ hasta + "]";
	}
}
