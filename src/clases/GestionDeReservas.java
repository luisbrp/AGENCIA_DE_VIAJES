package clases;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;
import java.util.ArrayList;

public class GestionDeReservas {

	

	public static void run(Scanner scan) throws SQLException, ParseException  {
		
		GestorBBDD gbd = new GestorBBDD();
		
		Reserva reserva = new Reserva();
		ArrayList<Reserva> reservas = new ArrayList<Reserva>(); 
		int opcion_menu;
		int id = 0;
		String dni = null;

		do {
			Menu.mostrarMenuHacerReserva();
			opcion_menu = scan.nextInt();
			switch (opcion_menu) {
			case Menu.REALIZAR_RESERVA:
				scan.nextLine();
				gbd.conectar();
				dni = FormularioDeDatos.pedirDniCliente(scan, dni);
				gbd.realizarReserva(dni, scan, reserva);
				gbd.cerrar();
				break;
			case Menu.ANULAR_RESERVA:
				scan.nextLine();
				gbd.conectar();
				id = FormularioDeDatos.PedirIdReserva(id, scan);
				gbd.conectar();
				gbd.anularReserva(id);
				gbd.cerrar();
				break;
			case Menu.MOSTRAR_UNA_RESERVA:
				scan.nextLine();
				gbd.conectar();
				id = FormularioDeDatos.PedirIdReserva(id, scan);
				reserva = gbd.getReserva(id);
				Visor.mostrarUnaReserva(reserva);
				break;
			case Menu.MOSTRAR_RESERVAS:
				scan.nextLine();
				gbd.conectar();
				reservas = gbd.getReservas(reservas);
				Visor.mostrarRervas(reservas);
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
