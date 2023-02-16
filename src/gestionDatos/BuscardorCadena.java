package gestionDatos;

import java.util.ArrayList;
import java.util.Iterator;

import clases.Cliente;

public class BuscardorCadena {
	public ArrayList<Cliente> clientesCadena(String cadena,ArrayList<Cliente> clientes) {

		

		Iterator<Cliente> it = clientes.iterator();
		while (it.hasNext()) {
			Cliente cliente = it.next();
			if (!cadena.contains(cliente.getNombre()) ) {
				it.remove();
				System.out.println("Usuario eliminado con exito");

			}
			
		}
		return clientes;
	}

}
