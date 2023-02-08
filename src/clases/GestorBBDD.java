package clases;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestorBBDD extends Conector{
		
	PreparedStatement pst;
	
	public void realizarReservas (Reserva reserva) throws SQLException {
		
		Cliente cliente = new Cliente();
		Habitacion habitacion = new Habitacion();
		
		pst = con.prepareStatement("INSERT INTO reservas (id, id_habitacion, dni, desde, hasta) VALUES (?,?,?,?,?)");
		
		pst.setInt(1, reserva.getId());
		pst.setInt(2, habitacion.getId());
		pst.setString(3, cliente.getDni());
		pst.setDate(4, new java.sql.Date(reserva.getDesde().getTime()));
		pst.setDate(5, new java.sql.Date(reserva.getHasta().getTime()));
		
		pst.execute();
		
		System.out.println("La reserva se ha realizado con exito!");
		
	}
	
	public void anularReserva(Reserva reserva) throws SQLException {
		
		pst = con.prepareStatement("DELETE FROM reservas WHERE id=? ;");
		
		pst.setInt(1, reserva.getId());
		
		pst.execute();
		
		System.out.println("La reserva ha sido anulada con exito!");
	}
	
}
