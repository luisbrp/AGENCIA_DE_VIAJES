package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestionDeHotel {

	public static void run() throws SQLException {
		Scanner scan= new Scanner(System.in);
		int opcion;
		String HabitSalir="";
		GestorBBDD gestorBBDD = new GestorBBDD();
		Hotel hotel = new Hotel();

		do {
			Menu.mostrarMenuHotel();
			opcion = scan.nextInt();
			

			switch (opcion) {

			case Menu.DATOS_HOTEL:
				hotel = FormularioDeDatos.pedirDatosHotel(scan);
				gestorBBDD.conectar();
				gestorBBDD.insertarHotel(hotel);
				gestorBBDD.cerrar();
				break;
			
			case Menu.CREAR_HABITACION_SALIR:
				
				HabitSalir=FormularioDeDatos.elegirHabitacionSalir(scan);
				
				if (HabitSalir.equals("H")) {
					
					Menu.mostrarMenuHabitacion();
					Habitacion habitacion = new Habitacion();
					habitacion = FormularioDeDatos.pedirDatosHabitacion(scan);
					gestorBBDD.conectar();
					gestorBBDD.insertarHabitacion(habitacion);
					gestorBBDD.cerrar();
					
					
				}
				else if (HabitSalir.equals("S")) {
					
					break;
				}
				
				
			
			}
			System.out.println("");
		} while (HabitSalir.equals("S"));
	}
}


