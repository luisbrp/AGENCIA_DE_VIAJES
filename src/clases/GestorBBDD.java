package clases;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestorBBDD extends Conector {
	
	PreparedStatement preparedSt;
	
	public void insertarHotel(Hotel hotel) {
		try {
			preparedSt=con.prepareStatement ("INSERT INTO hoteles(`id`, `cif`,"
					+ "nombre`, `gerente`, `estrellas`, `compania`)" 
					+"VALUES (?,?,?,?,?,?)");
			preparedSt.setInt(1, hotel.getId());
			preparedSt.setString(2, hotel.getCif());
			preparedSt.setString(3, hotel.getNombre());
			preparedSt.setString(4, hotel.getGerente());
			preparedSt.setInt(5, hotel.getEstrellas());
			preparedSt.setString(6, hotel.getCompania());
			
			preparedSt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertarHabitacion(Habitacion habitacion) {
		
		try {
			preparedSt= con.prepareStatement("INSERT INTO `habitaciones`(`id`, `id_hotel`, "
					+ "`numero`, `descripcion`, `precio`)"
					+ "VALUES (?,?,?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
