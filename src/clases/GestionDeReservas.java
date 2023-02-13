package clases;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.ArrayList;

public class GestionDeReservas {

	private static final boolean ALTA = false;

	public static void run() throws SQLException  {
		Scanner scan = new Scanner(System.in);
		GestorBBDD gbd = new GestorBBDD();
		Visor visor = new Visor();
		Cliente cliente = new Cliente();
		Reserva reserva = new Reserva();
		ArrayList<Reserva> reservas = new ArrayList<Reserva>(); 
		int opcion_menu;
		int id = 0;
		String dni = null;

		do {
			Menu.mostrarMenuHacerReserva();
			opcion_menu = Integer.parseInt(scan.nextLine());
			switch (opcion_menu) {
			case Menu.REALIZAR_RESERVA:
				dni = FormularioDeDatos.pedirDniCliente(scan, dni);
				reserva = FormularioDeDatos.pedirDatosReserva(scan, reserva);
				gbd.conectar();
				gbd.realizarReservas(reserva);
				gbd.cerrar();
				break;
			case Menu.ANULAR_RESERVA:
				gbd.conectar();
				id = FormularioDeDatos.PedirIdReserva(id, scan);
				gbd.conectar();
				gbd.anularReserva(id);
				gbd.cerrar();
				break;
			case Menu.MOSTRAR_UNA_RESERVA:
				gbd.conectar();
				id = FormularioDeDatos.PedirIdReserva(id, scan);
				reserva = gbd.getReserva(id);
				Visor.mostrarUnaReserva(reserva);
				break;
			case Menu.MOSTRAR_RESERVAS:
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
