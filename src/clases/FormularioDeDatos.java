package clases;

import java.util.Scanner;

import java.text.ParseException;
import java.text.SimpleDateFormat;


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
			
			System.out.println("Introduce el Dni ");
			cliente.setDni(scan.nextLine());
			
			dni = cliente.getDni();
			
			return dni;	
		}
	
	public static String pedirCadenaCliente(Scanner scan) {
		
		String cadena;
		
		System.out.println("Introduce una cadena de caratereres");
		cadena=scan.nextLine();
		
		return cadena;
	}
	
	public static Reserva pedirDatosReserva(Scanner scan, Reserva reserva) throws ParseException {
		
		
		System.out.println("Introduce el id de la habitacion:");
		reserva.setId_Habitacion(scan.nextInt());

		scan.nextLine();
		System.out.println("Introduce el dni:");
		reserva.setDni(scan.nextLine());
		
		
		SimpleDateFormat desde = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Introduce desde cuando se realiza la reserva en este formato(dd/MM/yyyy");
		reserva.setDesde(desde.parse(scan.nextLine()));
		
		SimpleDateFormat hasta = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Introduce hasta cuando se realizara la reserva en este formato(dd/MM/yyyy");
		reserva.setHasta(hasta.parse(scan.nextLine()));
		
		return reserva;
	}
	
	public static int PedirIdReserva(int id, Scanner scan) {
		Reserva reserva = new Reserva();
		System.out.println("Introduce el id de la reserva:");
		reserva.setId(Integer.parseInt(scan.nextLine()));
		id = reserva.getId();
		return id;
	}
	
	public static Date PedirFechaDesde (Scanner scan ) throws ParseException {
		Date date; 
	
		SimpleDateFormat desde = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Introduce cuando se realizo la reserva. En este formato por favor. (dd/MM/yyyy)");
		date = desde.parse(scan.nextLine());

		return date;
	}
	
	public static Date PedirFechaHasta (Scanner scan) throws ParseException {
		Date date;
		
		SimpleDateFormat hasta = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Introduce hasta cuando se realizo la reserva. En este formato por favor. (dd/MM/yyyy)");
		date = hasta.parse(scan.nextLine());
		
		return date;
	}
	
	
	//formulario hotel
		
	public static Hotel pedirDatosHotel(Scanner scan) {
		Hotel hotel = new Hotel();
		String cif;
		String nombre;
		String gerente;
		int estrellas;
		String compania;
		scan.nextLine();
		
		
		System.out.println("Introduce el cif de hotel");
		cif= scan.nextLine();
		
		System.out.println("Introduce el nombre del hotel");
		nombre= scan.nextLine();
		
		System.out.println("Introduce el gerente del hotel");
		gerente= scan.nextLine();
		
		System.out.println("Introduce las estrellas de hotel");
		estrellas= scan.nextInt();
		
		scan.nextLine();
		System.out.println("Introduce la compañia del hotel");
		compania= scan.nextLine();
		
		hotel.setCif(cif);
		hotel.setNombre(nombre);
		hotel.setGerente(gerente);
		hotel.setEstrellas(estrellas);
		hotel.setCompania(compania);
		
		return hotel;
	}
	
	public static int pedirIdHotel (Scanner scan) {
		int id;
		System.out.println("Introduce el id del hotel:");
		id=scan.nextInt();
		return id;
	}
	

	
	public static Habitacion pedirDatosHabitacion(Scanner scan) {
		
		Habitacion habitacion = new Habitacion();
		
		int idHotel;
		String numero;
		String descripcion;
		Double precio;
		
		scan.nextLine();
		
		System.out.println("Introduce el id del hotel");
		idHotel= scan.nextInt();
		
		System.out.println("Introduce el numero de habitacion");
		scan.nextLine();
		numero= scan.nextLine();
		
		System.out.println("Introduce la descripcion de la habitación");
		descripcion= scan.nextLine();
		
		System.out.println("Introduce el precio de la habitación");
		precio= scan.nextDouble();
		
		habitacion.setId_hotel(idHotel);
		habitacion.setNumero(numero);
		habitacion.setDescripcion(descripcion);
		habitacion.setPrecio(precio);
		
		return habitacion;
		
		
	}
}
	

	


