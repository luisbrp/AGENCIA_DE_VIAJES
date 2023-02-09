package clases;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.ArrayList;

public class GestionDeReservas {

	public static void run() throws SQLException {
		Scanner scan = new Scanner(System.in);
		GestorBBDD gbd = new GestorBBDD();
		Visor visor = new Visor();
		Reserva reserva = new Reserva();
		ArrayList<Reserva> reservas = new ArrayList<Reserva>(); 
		int opcion_menu;
		int id = 0;
		String dni;

		do {
			Menu.mostrarMenuHacerReserva();
			opcion_menu = Integer.parseInt(scan.nextLine());
			switch (opcion_menu) {
			case Menu.REALIZAR_RESERVA:
				gbd.conectar();
				dni = FormularioDeDatos.pedirDniClientealta(scan);
				reserva = FormularioDeDatos.pedirDatosReserva(scan);
				gbd.realizarReservas(dni, scan);
				gbd.cerrar();
				break;
			case Menu.ANULAR_RESERVA:
				gbd.conectar();
				int ids = FormularioDeDatos.PedirIdReserva(scan);
				gbd.anularReserva(id);
				gbd.cerrar();
				break;
			case Menu.MOSTRAR_UNA_RESERVA:
				gbd.conectar();
				id = FormularioDeDatos.PedirIdReserva(scan);
				reserva = gbd.getReserva(id);
				Visor.mostrarUnaReserva(reserva);
				break;
			case Menu.MOSTRAR_RESERVAS:
				gbd.conectar();
				reservas = gbd.getReservas();
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
