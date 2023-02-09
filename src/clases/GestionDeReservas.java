package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestionDeReservas {
	
	public static void run(Scanner scan) throws SQLException {

		
		GestorBBDD gbd = new GestorBBDD();
		Reserva reserva = new Reserva();
		int opcion_menu;

		do {
			Menu.mostrarMenuHacerReserva();
			opcion_menu=Integer.parseInt(scan.nextLine());
			switch (opcion_menu) {
			
			case Menu.REALIZAR_RESERVA:
				reserva = FormularioDeDatos.pedirDatosReserva(scan);
				gbd.conectar();
				gbd.realizarReservas();
				gbd.cerrar();
				break;
			case Menu.ANULAR_RESERVA:
				int id = FormularioDeDatos.PedirIdReserva(scan);
				gbd.conectar();
				gbd.anularReserva(id);
				gbd.cerrar();
				
				break;
			case Menu.SALIR:
				
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}
		} while (opcion_menu != Menu.SALIR);
		
	}
}
