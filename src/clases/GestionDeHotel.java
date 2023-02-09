package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestionDeHotel {

	public static void run() throws SQLException {
		Scanner scan= new Scanner(System.in);
		int opcion;
		
		GestorBBDD gestorBBDD = new GestorBBDD();
		Hotel hotel = new Hotel();

		Menu.mostrarMenuHotel();
		hotel = FormularioDeDatos.pedirDatosHotel(scan);
		gestorBBDD.conectar();
		gestorBBDD.insertarHotel(hotel);
		gestorBBDD.cerrar();
		
		
		
		opcion = scan.nextInt();
		
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


