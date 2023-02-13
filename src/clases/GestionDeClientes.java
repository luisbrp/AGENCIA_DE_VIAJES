package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;




public class GestionDeClientes {
	public void run() throws SQLException {
		Scanner scan = new Scanner(System.in);
		int opcion;
		ArrayList<Cliente> clientes = new ArrayList<>();
		Cliente cliente = new Cliente();
		GestorBBDD gbd = new GestorBBDD();
		do {
		Menu.motrarMenuClientes();
		
		opcion=Integer.parseInt(scan.nextLine());
		
		switch (opcion) {
		case Menu.INSERTAR_CLIENTE:
		cliente = FormularioDeDatos.PedirDatosCliente(scan);
		gbd.conectar();
		gbd.insertarCliente(cliente);
		gbd.cerrar();
		break;
		case Menu.ELIMINAR_CLIENTE:
		String dni = FormularioDeDatos.pedirDniCliente(scan);
		gbd.conectar();
		gbd.eliminarCliente(dni);
		gbd.cerrar();
		break;
		case 
		Menu.VER_CLIENTES:
		gbd.conectar();
		clientes = gbd.verClientes();
		visor.mostrarClientes(clientes);
		gbd.cerrar();
		break;
		case Menu.MODIFICAR_CLIENTE:
		cliente = FormularioDeDatos.ModificarDatosCliente(cliente, scan);
		gbd.conectar();
		gbd.modificarCliente(cliente);
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
