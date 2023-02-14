package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestionDeHoteles {

	public static void run(Scanner scan) throws SQLException {
		
		int opcion;
		
		GestorBBDD gestorBBDD = new GestorBBDD();
		Hotel hotel = new Hotel();

		Menu.mostrarMenuHotel();
		hotel = FormularioDeDatos.pedirDatosHotel(scan);
		gestorBBDD.conectar();
		gestorBBDD.insertarHotel(hotel);
		gestorBBDD.cerrar();
		
		
		
		
		do {
			
			Menu.mostrarMenuHabitacionSalir();
			opcion = scan.nextInt();
			

			switch (opcion) {
			
				case Menu.CREAR_HABITACION:
					Habitacion habitacion = new Habitacion();
					habitacion = FormularioDeDatos.pedirDatosHabitacion(scan);
					gestorBBDD.conectar();
					gestorBBDD.insertarHabitacion(habitacion);
					gestorBBDD.cerrar();
					
					break;
				case Menu.SALIR:
					
					
					
					
			}
			System.out.println("");
			} while (opcion != Menu.SALIR);
		
}
}


