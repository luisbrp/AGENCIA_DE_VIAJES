package clases;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestorBBDD extends Conector{
		
	PreparedStatement pst;
	
	
	
	
	
	
	
	//comprobar si el cliente esta registrado o no
	
	
	public void realizarReservas ()  {
		
		Reserva reserva=new Reserva();
		
		
		//funcionalidad de mostrar habitaciones
			
			try {
				pst=con.prepareStatement("INSERT INTO reservas (id_habitacion, dni, desde, hasta) VALUES(?,?,?,?)");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				pst.setInt(1, reserva.getId_Habitacion());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				pst.setString(2, reserva.getDni());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				pst.setDate(3, new Date(reserva.getDesde().getTime()));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				pst.setDate(4, new Date(reserva.getHasta().getTime()));
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
			System.out.println("La reserva se ha realizado con exito");
	}
	
	public void anularReserva(int id)  {
		
		try {
			pst = con.prepareStatement("DELETE FROM reservas WHERE id=? ;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pst.setInt(1, id);
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
		
		System.out.println("La reserva ha sido anulada con exito!");
	}
	
	public Reserva getReserva(int id) {
		
		try {
			pst = con.prepareStatement("SELECT * FROM reservas WHERE id=? ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reserva reserva = new Reserva();
		
		try {
			pst.setInt(1, id);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ResultSet resultado = null;
		try {
			resultado = pst.executeQuery();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			if (resultado.next()) {
				reserva.setId(resultado.getInt(1));
				reserva.setId_Habitacion(resultado.getInt(2));
				reserva.setDni(resultado.getString(3));
				reserva.setDesde(resultado.getDate(4));
				reserva.setHasta(resultado.getDate(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return reserva;
		
	}
	
	
	// GetReservas
	

	
}
