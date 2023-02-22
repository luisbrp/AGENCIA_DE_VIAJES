package gestionDatos;

import java.util.Comparator;


import clases.Cliente;


public class CompararApellidos implements Comparator<Cliente> {

	
	
	public int compare(Cliente obj1, Cliente obj2) {
		Cliente client1 = (Cliente) obj1;
		Cliente client2 = (Cliente) obj2;
		
		return(client1.getApellidos().toLowerCase().compareTo(client2.getApellidos().toLowerCase()));
	}
	
	//void//
	
	//clientes.sort(new CompararApellidos());
	
	
	

}

