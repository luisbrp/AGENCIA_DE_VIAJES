package clases;


import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import gestionDatos.BuscadorFecha;

public class Main2 extends GestorBBDD {

	
	//buscar por nombre hotel y sus habitaciones
	public static void main(String[] args) throws SQLException, ParseException {
		Scanner scan = new Scanner (System.in);
		
		GestorBBDD gestorBBDD = new GestorBBDD();
		
		String nombreHotel;
		Hotel hotel = new Hotel();
		ArrayList <Habitacion> habitaciones = new ArrayList<>();
		int id_hotel;
		
		System.out.println("Introduce el nombre de hotel");
		nombreHotel = scan.nextLine();
		gestorBBDD.conectar();
		hotel= gestorBBDD.buscarHotelNombre(nombreHotel);
		
		id_hotel= hotel.getId();
		
		habitaciones = gestorBBDD.buscarHabitaciones(id_hotel);
		
		Visor.mostrarHabitaciones(habitaciones);
		
		gestorBBDD.cerrar();
	// fecha de habitaciones
		
		Date fecha;
		
		ArrayList <Reserva> reservas = new ArrayList <>();
		
		gestorBBDD.conectar();
		
		System.out.println("Introduce la fecha para ver las habitaciones");
		
		SimpleDateFormat formatoLecturaFecha = new SimpleDateFormat ("dd-MM-yyyy");
		
		fecha = formatoLecturaFecha.parse(scan.nextLine());
		
		reservas = gestorBBDD.getReservas(reservas);
		
		reservas= BuscadorFecha.buscarReserva(fecha, reservas);
		
		
		Visor.mostrarReservas(reservas);
		
		gestorBBDD.cerrar();
		
		
	}
	
	
	

}