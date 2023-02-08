package clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FormularioDeDatos {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void pedirDatosReserva(Reserva reserva, Scanner scan) {
		Habitacion habitacion = new Habitacion();
		Hotel hotel = new Hotel();
		Cliente cliente = new Cliente();
		
		System.out.println("Introduce el dni del cliente:");
		cliente.setDni(scan.nextLine());
		
		System.out.println("Introduce el id del hotel:");
		hotel.setId(Integer.parseInt(scan.nextLine()));
		
		
		
		//Mostrar las habitaciones del hotel
		
		
		System.out.println("Introduce el id de la habitacion:");
		habitacion.setId(Integer.parseInt(scan.nextLine()));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Introduce desde cuando sera la reserva:");
		String desde = scan.nextLine();
		try {
			Date fechaLeida = sdf1.parse(desde);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("Introduce hasta cuando sera la reserva:");
		
		
		
		
			
		}
	
}
