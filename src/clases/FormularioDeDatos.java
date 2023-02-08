package clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FormularioDeDatos {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public Reserva pedirDatosReserva(Scanner scan) {
		
		Reserva reserva = new Reserva();
		
		System.out.println("Introduce el id de la habitacion:");
		reserva.setId_Habitacion(Integer.parseInt(scan.nextLine()));

		System.out.println("Introduce el dni:");
		reserva.setDni(scan.nextLine());
		
		SimpleDateFormat desde = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Introduce desde cuando se realiza la reserva:"+desde);
		try {
			reserva.setDesde((java.sql.Date)desde.parse(scan.nextLine()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		SimpleDateFormat hasta = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Introduce hasta cuando se realizara la reserva:"+ hasta);
		try {
			reserva.setHasta((java.sql.Date)hasta.parse(scan.nextLine()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return reserva;
	}
}
