package clases;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestorBBDD extends Conector{
		
	PreparedStatement pst;
	
	public void realizarReservas (Reserva reserva)  {
		
		Cliente cliente = new Cliente();
		Habitacion habitacion = new Habitacion();
		
		try {
			pst = con.prepareStatement("INSERT INTO reservas (id, id_habitacion, dni, desde, hasta) VALUES (?,?,?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pst.setInt(1, reserva.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pst.setInt(2, habitacion.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pst.setString(3, cliente.getDni());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pst.setDate(4, new java.sql.Date(reserva.getDesde().getTime()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pst.setDate(5, new java.sql.Date(reserva.getHasta().getTime()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("La reserva se ha realizado con exito!");
		
	}
	
	public void anularReserva(Reserva reserva) throws SQLException {
		
		pst = con.prepareStatement("DELETE FROM reservas WHERE id=? ;");
		
		pst.setInt(1, reserva.getId());
		
		pst.execute();
		
		System.out.println("La reserva ha sido anulada con exito!");
	}
	
}
