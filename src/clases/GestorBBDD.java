package clases;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestorBBDD extends Conector {
	
	PreparedStatement preparedSt;
	
	public void insertarHotel(Hotel hotel) throws SQLException {
		
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
		
	}
	
	public void insertarHabitacion(Habitacion habitacion) {
		
		try {
			preparedSt= con.prepareStatement("INSERT INTO `habitaciones`(`id`, `id_hotel`, "
					+ "`numero`, `descripcion`, `precio`)"
					+ "VALUES (?,?,?,?,?)");
			preparedSt.setInt(1, habitacion.getId());
			preparedSt.setInt(2, habitacion.getId_hotel());
			preparedSt.setString(3,habitacion.getNumero());
			preparedSt.setString(4, habitacion.getDescripcion());
			preparedSt.setDouble(5, habitacion.getPrecio());
			
			
			preparedSt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
