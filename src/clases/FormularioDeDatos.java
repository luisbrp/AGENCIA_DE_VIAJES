package clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import clases.*;

public class FormularioDeDatos {
	
	//PEDIR DATOS CLIENTE PARA INSERTAR LINEAS
		public static Cliente PedirDatosCliente(Scanner scan) {
			
			Cliente cliente = new Cliente();
			System.out.println("Introduce el Dni del cliente");
			cliente.setDni(scan.nextLine());
			
			System.out.println("Introduce el nombre del cliente");
			cliente.setNombre(scan.nextLine());
			
			System.out.println("Introduce el apellido del cliente");
			cliente.setApellidos(scan.nextLine());
			
			System.out.println("introduce la direccion del cliente");
			cliente.setDireccion(scan.nextLine());
			
			System.out.println("introduce la localidad del cliente");
			cliente.setLocalidad(scan.nextLine());
			
			return cliente;
		}
		
		//MODIFICAR DATOS CLIENTE
		public static Cliente ModificarDatosCliente(Cliente cliente,Scanner scan) {
			
			System.out.println("Introduce el Dni del cliente");
			cliente.setDni(scan.nextLine());
			
			System.out.println("Introduce el nombre del cliente");
			cliente.setNombre(scan.nextLine());
			
			System.out.println("Introduce el apellido del cliente");
			cliente.setApellidos(scan.nextLine());
			
			System.out.println("introduce la direccion del cliente");
			cliente.setDireccion(scan.nextLine());
			
			System.out.println("introduce la localidad del cliente");
			cliente.setLocalidad(scan.nextLine());
			
			return cliente;
		}
		//PEDIR DNI CLIENTE PARA ELIMINAR CLIENTES
		public static String pedirDniCliente( Scanner scan, String dni) {
			
			Cliente cliente = new Cliente();
			
			System.out.println("Introduce el Dni del cliente a eliminar");
			cliente.setDni(scan.nextLine());
			
			dni = cliente.getDni();
			
			return dni;	
		}
		public static String pedirDniClientealta( Scanner scan) {
			
			Cliente cliente = new Cliente();
			
			System.out.println("Introduce el Dni del cliente a consultar");
			cliente.setDni(scan.nextLine());
			
			String dni = cliente.getDni();
			
			return dni;	
		}
	
	public static Reserva pedirDatosReserva(Scanner scan, Reserva reserva) {
		
		
		System.out.println("Introduce el id de la habitacion:");
		reserva.setId_Habitacion(Integer.parseInt(scan.nextLine()));

		System.out.println("Introduce el dni:");
		reserva.setDni(scan.nextLine());
		
		SimpleDateFormat desde = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Introduce desde cuando se realiza la reserva en este formato(dd/MM/yyyy");
		try {
			reserva.setDesde(desde.parse(scan.nextLine()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleDateFormat hasta = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Introduce hasta cuando se realizara la reserva en este formato(dd/MM/yyyy");
		
		try {
			reserva.setHasta(hasta.parse(scan.nextLine()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return reserva;
	}
	
	public static int PedirIdReserva(int id, Scanner scan) {
		Reserva reserva = new Reserva();
		System.out.println("Introduce el id de la reserva:");
		reserva.setId(Integer.parseInt(scan.nextLine()));
		id = reserva.getId();
		return id;
	}
}
