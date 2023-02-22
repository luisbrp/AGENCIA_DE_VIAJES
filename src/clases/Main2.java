package clases;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 extends GestorBBDD {

	
	//buscar por nombre hotel y sus habitaciones
	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner (System.in);
		GestorBBDD gestorBBDD = new GestorBBDD();
		
		String nombreHotel;
		Hotel hotel = new Hotel();
		ArrayList <Habitacion> habitaciones = new ArrayList<>();
		int id_hotel;
		
		System.out.println("Introduce el nombre de hotel");
		nombreHotel = scan.nextLine();
		
		hotel= gestorBBDD.buscarHotelNombre(nombreHotel);
		
		id_hotel= hotel.getId();
		
		habitaciones = gestorBBDD.buscarHabitaciones(id_hotel);
		
		Visor.mostrarHabitaciones(habitaciones);
		
	// fecha de habitaciones
		
		
		
	
		
		
		

	
		
		
		
		
		
	}
	

}