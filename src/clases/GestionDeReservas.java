package clases;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;
import java.util.ArrayList;

public class GestionDeReservas {

	private static final boolean ALTA = false;

	public static void run() throws SQLException, ParseException  {
		Scanner scan = new Scanner(System.in);
		GestorBBDD gbd = new GestorBBDD();
		Date desde = null;
		Date hasta = null;
		visor visors = new visor();
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
				gbd.conectar();
				dni = FormularioDeDatos.pedirDniCliente(scan, dni);
				gbd.realizarReserva(dni, scan, reserva);
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
				visor.mostrarUnaReserva(reserva);
				break;
			case Menu.MOSTRAR_RESERVAS:
				gbd.conectar();
				reservas = gbd.getReservas(reservas);
				visor.mostrarRervas(reservas);
				gbd.cerrar();
				break;
			case Menu.CONSULTAR_RESERVA:
				gbd.conectar();
				reserva = FormularioDeDatos.PedirFechaReserva(reserva, scan);
				gbd.getReservaPorFecha(desde, hasta);
				visor.mostrarUnaReserva(reserva);
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
