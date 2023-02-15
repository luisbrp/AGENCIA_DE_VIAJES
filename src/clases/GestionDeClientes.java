package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;




public class GestionDeClientes {


	public static void run(Scanner scan) throws SQLException {
		
		int opcion;
		ArrayList<Cliente> clientes = new ArrayList<>();
		Cliente cliente = new Cliente();
		GestorBBDD gbd = new GestorBBDD();
		String dni = null;
		do {
		Menu.motrarMenuClientes();
		
		opcion=scan.nextInt();
		scan.nextLine();
		
		switch (opcion) {
		case Menu.INSERTAR_CLIENTE:
		cliente = FormularioDeDatos.PedirDatosCliente(scan);
		gbd.conectar();
		gbd.insertarCliente(cliente);
		Visor.mostrarCliente(cliente);
		gbd.cerrar();
		break;
		case Menu.ELIMINAR_CLIENTE:
		dni = FormularioDeDatos.pedirDniCliente(scan, dni);
		gbd.conectar();
	    cliente= gbd.getCliente(dni);
	    Visor.mostrarCliente(cliente);
		gbd.eliminarCliente(dni);
		gbd.cerrar();
		break;
		case 
		Menu.VER_CLIENTES:
		gbd.conectar();
		clientes = gbd.verClientes();
		Visor.mostrarClientes(clientes);
		gbd.cerrar();
		break;
		case Menu.MODIFICAR_CLIENTE:
		cliente = FormularioDeDatos.ModificarDatosCliente(cliente, scan);
		gbd.conectar();
		Visor.mostrarCliente(cliente);
		gbd.modificarCliente(cliente);
		Visor.mostrarCliente(cliente);
		gbd.cerrar();
		break;
		case Menu.SALIR:
		
		break;
		default:
		System.out.println("Opcion incorrecta!");
				}
		
				} while (opcion != Menu.SALIR);
	}

}
