package clases;

import java.util.Scanner;

public class FormularioDeDatos {

	//formulario hotel
	public static Hotel pedirDatosHotel(Scanner scan) {
		Hotel hotel = new Hotel();
		String cif;
		String nombre;
		String gerente;
		int estrellas;
		String compania;
		
		
		System.out.println("Introduce el cif de hotel");
		cif= scan.nextLine();
		
		System.out.println("Introduce el nombre del hotel");
		nombre= scan.nextLine();
		
		System.out.println("Introduce el gerente del hotel");
		gerente= scan.nextLine();
		
		System.out.println("Introduce las estrellas de hotel");
		estrellas= scan.nextInt();
		
		scan.nextLine();
		System.out.println("Introduce la compañia del hotel");
		compania= scan.nextLine();
		
		hotel.setCif(cif);
		hotel.setNombre(nombre);
		hotel.setGerente(gerente);
		hotel.setEstrellas(estrellas);
		hotel.setCompania(compania);
		
		return hotel;
	}
	
	public static String elegirHabitacionSalir (Scanner scan) {
		String opcionAS;
		
		opcionAS= scan.nextLine();
		
		return opcionAS;
	}
	
	public static Habitacion pedirDatosHabitacion(Scanner scan) {
		
		Habitacion habitacion = new Habitacion();
		
		int idHotel;
		String numero;
		String descripcion;
		Double precio;
		
		scan.nextLine();
		
		System.out.println("Introduce el id del hotel");
		idHotel= scan.nextInt();
		
		System.out.println("Introduce el numero de habitacion");
		scan.nextLine();
		numero= scan.nextLine();
		
		System.out.println("Introduce la descripcion de la habitación");
		descripcion= scan.nextLine();
		
		System.out.println("Introduce el precio de la habitación");
		precio= scan.nextDouble();
		
		habitacion.setId_hotel(idHotel);
		habitacion.setNumero(numero);
		habitacion.setDescripcion(descripcion);
		habitacion.setPrecio(precio);
		
		return habitacion;
		
		
	}
	
	//
	

}
