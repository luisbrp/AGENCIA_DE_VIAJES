package clases;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

import gestionDatos.Filtrador_Fechas;

import java.util.ArrayList;
import java.util.Date;

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
				Visor.mostrarUnaReserva(reserva);
				gbd.cerrar();
				break;
			case Menu.ANULAR_RESERVA:
				scan.nextLine();
				gbd.conectar();
				id = FormularioDeDatos.PedirIdReserva(id, scan);
				gbd.conectar();
				reserva= gbd.getReserva(id);
				Visor.mostrarUnaReserva(reserva);
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
				Visor.mostrarReservas(reservas);
				gbd.cerrar();
				break;
			case Menu.CONSULTAS_RESERVAS:
				int opcion_consulta;
				do {
					Menu.mostrarMenuConsultasReservas();
					
					opcion_consulta=scan.nextInt();
					
					switch(opcion_consulta) {
					
					case Menu.RESERVAS_DOS_FECHAS:
						scan.nextLine();
						gbd.conectar();
						Date fechaI;
						Date fechaF;
						
						
						fechaI = FormularioDeDatos.fechaInicio(scan);
						fechaF = FormularioDeDatos.fechaFin(scan);
						reservas= gbd.getReservas(reservas);
						
						
						reservas =Filtrador_Fechas.buscarReserva(fechaI, fechaF, reservas);
						
						Visor.mostrarReservas(reservas);
						
						gbd.cerrar();
						break;
					case Menu.RESERVAS_CLIENTE:
						scan.nextLine();
						String DNI = null;
						gbd.conectar();
						
						DNI = FormularioDeDatos.pedirDniCliente(scan, DNI);
						reservas= gbd.getReservas(reservas);
						reservas = gbd.reservasCliente(DNI);
						
						Visor.mostrarReservas(reservas);
						
						gbd.cerrar();
						
						
						break;
						
					case Menu.SALIR:
						break;
						
						
					
					}
					
				} while (opcion_consulta !=Menu.SALIR);
			case Menu.SALIR:
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}
		} while (opcion_menu != Menu.SALIR);

	}
}
