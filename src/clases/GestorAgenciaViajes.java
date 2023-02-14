package clases;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class GestorAgenciaViajes {
	public void run () throws SQLException, ParseException {
		int opcion;
		GestionDeClientes gc = new GestionDeClientes();
		GestionDeReservas gr = new GestionDeReservas();
		GestionDeHoteles gh = new GestionDeHoteles();
		do {
			Menu.mostrarMenuPrincipal();
			Scanner scan =  new Scanner(System.in);
			opcion=Integer.parseInt(scan.nextLine());

			switch (opcion) {
			case Menu.GESTIONAR_CLIENTES:
				gc.run();
				break;
			case Menu.GESTIONAR_RESERVAS:
				gr.run();
				break;
			case Menu.GESTIONAR_HOTELES:
				gh.run();
				break;
			case Menu.SALIR:
				System.out.println("Bye!!!");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}

		} while (opcion != Menu.SALIR);
	
	}
}


