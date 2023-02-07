package clases;

import java.sql.Date;

public class Reservas {
	private int id;
	private int habitacion;
	private String dni;
	private Date desde;
	private Date hasta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(int habitacion) {
		this.habitacion = habitacion;
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
		return "Reservas [id=" + id + ", habitacion=" + habitacion + ", dni=" + dni + ", desde=" + desde + ", hasta="
				+ hasta + "]";
	}
}
