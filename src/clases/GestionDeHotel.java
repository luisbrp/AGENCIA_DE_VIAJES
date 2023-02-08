package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionDeHotel {

	public static void run(Scanner scan) {
		
		int opcion;
		GestorBBDD gestorBBDD = new GestorBBDD();
		Hotel hotel = new Hotel();
		int id_hotel;
		ArrayList <Hotel> hoteles = new ArrayList <Hotel>();
		
		do {
			Menu.mostrarMenuHotel();
			opcion= scan.nextInt();
			
			switch(opcion) {
			
			case Menu.ALTA_DE_HOTEL:
				hotel=FormularioDeDatos.pedirDatosHotel(scan);
				gestorBBDD.conectar();
				gestorBBDD.insertarHotel(hotel);
				gestorBBDD.cerrar();
				break;
			
			}
		} while (opcion != Menu.SALIR);
		
	}
	
}
