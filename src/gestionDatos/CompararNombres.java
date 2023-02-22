package gestionDatos;

import java.util.Comparator;

import clases.Cliente;

public class CompararNombres implements Comparator<Cliente> {

	
	
	public int compare(Cliente obj1, Cliente obj2) {
		Cliente client1 = (Cliente) obj1;
		Cliente client2 = (Cliente) obj2;
		return (client1.getNombre().toLowerCase().compareTo(client2.getNombre().toLowerCase()));
	}

}
