package clases;

import java.util.Scanner;


public class FormularioDeDatos {

	//PEDIR DATOS CLIENTE
	public static Cliente PedirDatosCliente(Scanner scan) {
		
		Cliente cliente = new Cliente();
		System.out.println("Introduce el Dni del cliente");
		cliente.setDni(scan.nextLine());
		
		System.out.println("Introduce el nombre del cliente");
		cliente.setNombre(scan.nextLine());
		
		System.out.println("Introduce el apellido del cliente");
		cliente.setApellidos(scan.nextLine());
		
		System.out.println("introduce el numero de paginas del libro");
		cliente.setDireccion(scan.nextLine());
		
		System.out.println("introduce el numero de paginas del libro");
		cliente.setDireccion(scan.nextLine());
		
		return cliente;
	}
}
