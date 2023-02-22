package clases;

import java.util.ArrayList;



public class visor {

	public static void mostrarClientes(ArrayList<Cliente> clientes) {
		  
		System.out.println("Lista de Clientes:");
			   
		for (int i = 0; i < clientes.size(); i++) {
		  Cliente cliente = clientes.get(i);
		  System.out.println("----------------------------------------------------");
		  System.out.println("Dni: " + cliente.getDni());
		  System.out.println("Nombre: " + cliente.getNombre());
		  System.out.println("Apellidos: " + cliente.getApellidos());
		  System.out.println("Direccion: " + cliente.getDireccion());
		  System.out.println("Localidad: " + cliente.getLocalidad());
		  System.out.println("----------------------------------------------------");
		   }
	 }

	public static void mostrarUnaReserva(Reserva reserva) {
		System.out.println(reserva.toString());
	}
	
	public static void mostrarReservas (ArrayList<Reserva> reservas) {
		System.out.println("Estas son todas reservas:");
		for (int i = 0; i < reservas.size(); i++) {
			Reserva reserva = reservas.get(i);
			System.out.println(reserva.toString());
		}	
	}
	
	public static void mostrarHotel(Hotel hotel) {
			System.out.println(hotel.toString());
	}
	
	public static void mostrarHabitaciones(ArrayList<Habitacion> habitaciones) {
		System.out.println("Estas son todas las habitaciones:");
		for (int i = 0; i < habitaciones.size(); i++) {
			Habitacion habitacion = habitaciones.get(i);
			System.out.println(habitaciones.toString());
		}	
	}

}
