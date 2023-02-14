package clases;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class GestionDeAgenciaViajes {
	
	
	
	public static void run(Scanner scan) throws SQLException, ParseException {
		int opcion;
		
		
		do {
			Menu.mostrarMenuPrincipal();
			
			opcion = scan.nextInt();
			switch (opcion) {
			case Menu.GESTIONAR_CLIENTES:
				GestionDeClientes.run(scan);
				
				break;
			
			case Menu.GESTIONAR_RESERVAS:
				GestionDeReservas.run(scan);
				
				break;
			
			case Menu.GESTIONAR_HOTELES:
				GestionDeHoteles.run(scan);
				break;
				
			}
		
			
			
		}while (opcion != Menu.SALIR);
		scan.close();
		
		
		
	}
	

}
