package clases;

import java.util.ArrayList;



public class visor {

	public static void mostrarClientes(ArrayList<Cliente> clientes) {
		  
		System.out.println("Lista de Clientes:");
			   
		for (int i = 0; i < clientes.size(); i++) {
		  Cliente cliente = clientes.get(i);
		  System.out.println("----------------------------------------------------");
		  System.out.println("Dni: " + cliente.getDni());
		  System.out.println("Nombre: " + cliente.getNombre());
		  System.out.println("Apellidos: " + cliente.getApellidos());
		  System.out.println("Direccion: " + cliente.getDireccion());
		  System.out.println("Localidad: " + cliente.getLocalidad());
		  System.out.println("----------------------------------------------------");
		   }
	 }

}
