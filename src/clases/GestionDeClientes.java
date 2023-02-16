package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import interfaces.CompararApellidos;
import interfaces.CompararNombres;

public class GestionDeClientes {

	public static void run(Scanner scan) throws SQLException {

		int opcion;
		ArrayList<Cliente> clientes = new ArrayList<>();
		Cliente cliente = new Cliente();
		GestorBBDD gbd = new GestorBBDD();
		String dni = null;
		do {
			Menu.motrarMenuClientes();

			opcion = scan.nextInt();
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
				cliente = gbd.getCliente(dni);
				Visor.mostrarCliente(cliente);
				gbd.eliminarCliente(dni);
				gbd.cerrar();
				break;

			case Menu.VER_CLIENTES:
				gbd.conectar();
				clientes = gbd.getClientes();
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
				
			case Menu.CONSULTAS_CLIENTES:
				int opcioConsulta;
				do {
				Menu.mostrarMenuCosultasClientes();
				
				
				opcioConsulta= scan.nextInt();
				scan.nextLine();
				
				switch (opcioConsulta) {
				
					case Menu.ORDENAR_USUARIO_APELLIDO:
						gbd.conectar();
						clientes= gbd.getClientes();
						
						clientes.sort(new CompararApellidos());
						
						Visor.mostrarClientes(clientes);
						
						
						gbd.cerrar();
					break;
					
					case Menu.ORDENAR_USUARIO_NOMBRE:
						gbd.conectar();
						clientes= gbd.getClientes();
						
						clientes.sort(new CompararNombres());
						
						Visor.mostrarClientes(clientes);
						gbd.cerrar();
					break;
					
					
				
				}
				}while (opcioConsulta != Menu.SALIR);
				
			case Menu.SALIR:

				break;
			default:
				System.out.println("Opcion incorrecta!");
			}

		} while (opcion != Menu.SALIR);
	}

}
