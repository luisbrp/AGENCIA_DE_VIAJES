package clases;

import java.util.ArrayList;

public class Visor {
	public static void mostrarCliente(Cliente cliente) {
		System.out.println("Cliente");
		System.out.println("----------------------------------------------------");
		System.out.println("Dni: " + cliente.getDni());
		System.out.println("Nombre: " + cliente.getNombre());
		System.out.println("Apellidos: " + cliente.getApellidos());
		System.out.println("Direccion: " + cliente.getDireccion());
		System.out.println("Localidad: " + cliente.getLocalidad());
		System.out.println("----------------------------------------------------");
		
	}
	public static void mostrarClientes(ArrayList<Cliente> clientes) {
		  
		System.out.println("Lista de Clientes:");
	    for (Cliente cliente : clientes) {
	    	 mostrarCliente(cliente);
		}
		
	 }

	public static void mostrarUnaReserva(Reserva reserva) {
		System.out.println("Reserva");
		System.out.println("----------------------------------------------------");
		System.out.println("ID: " + reserva.getId());
		System.out.println("Id_Habitacion: " + reserva.getId_Habitacion());
		System.out.println("DNI: " + reserva.getDni());
		System.out.println("Desde: " + reserva.getDesde());
		System.out.println("Hasta: " + reserva.getHasta());
		System.out.println("----------------------------------------------------");
	}
	
	public static void mostrarReservas (ArrayList<Reserva> reservas) {
		System.out.println("Estas son todas reservas:");
		for (Reserva reserva : reservas) {
			mostrarUnaReserva(reserva);
		}
		}
	
	
	public static void mostrarHotel(Hotel hotel) {
		System.out.println("Datos Hotel");
		System.out.println("----------------------------------------------------");
		System.out.println("ID: " + hotel.getId());
		System.out.println("CIF: " + hotel.getCif());
		System.out.println("Nombre: " + hotel.getNombre());
		System.out.println("Gerente: " + hotel.getGerente());
		System.out.println("Estrellas: " + hotel.getEstrellas());
		System.out.println("Compañia: " + hotel.getCompania());
		System.out.println("----------------------------------------------------");
	}
	
	public static void mostrarHoteles(ArrayList<Hotel> hoteles) {
		System.out.println("Listado hoteles");
		for (Hotel hotel : hoteles) {
			mostrarHotel(hotel);
		}
	}
	
	public static void mostrarHabitacion(Habitacion habitacion) {
		System.out.println("Datos Habitacion");
		System.out.println("----------------------------------------------------");
		System.out.println("ID: " + habitacion.getId());
		System.out.println("ID_Hotel: " + habitacion.getId_hotel());
		System.out.println("Numero: " + habitacion.getNumero() );
		System.out.println("Descripcion: " + habitacion.getDescripcion());
		System.out.println("Precio: " + habitacion.getPrecio());
		System.out.println("----------------------------------------------------");
	}
	public static void mostrarHabitaciones(ArrayList<Habitacion> habitaciones) {
		System.out.println("Estas son todas las habitaciones:");
		
		for (Habitacion habitacion : habitaciones) {
			mostrarHabitacion(habitacion);
		}	
	}
}
