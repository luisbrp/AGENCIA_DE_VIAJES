package clases;

import java.util.Scanner;


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
	public static String pedirDniCliente( Scanner scan) {
		
		Cliente cliente = new Cliente();
		
		System.out.println("Introduce el Dni del cliente a eliminar");
		cliente.setDni(scan.nextLine());
		
		String dni = cliente.getDni();
		
		return dni;	
	}
	
}
