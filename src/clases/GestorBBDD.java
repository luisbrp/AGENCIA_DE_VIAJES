package clases;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestorBBDD extends Conector {
	
	PreparedStatement preparedSt;
	
	public void insertarHotel(Hotel hotel) throws SQLException {
		
			preparedSt=con.prepareStatement ("INSERT INTO hoteles(cif,"
					+ "nombre, gerente, estrellas, compania)" 
					+"VALUES (?,?,?,?,?)");
			preparedSt.setString(1, hotel.getCif());
			preparedSt.setString(2, hotel.getNombre());
			preparedSt.setString(3, hotel.getGerente());
			preparedSt.setInt(4, hotel.getEstrellas());
			preparedSt.setString(5, hotel.getCompania());
			
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
