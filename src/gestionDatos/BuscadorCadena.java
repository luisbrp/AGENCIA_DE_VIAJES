package gestionDatos;

import java.util.ArrayList;
import java.util.Iterator;

import clases.Cliente;

public class BuscadorCadena {
	public static ArrayList<Cliente> clientesCadena(String cadena,ArrayList<Cliente> clientes) {

		

		Iterator<Cliente> it = clientes.iterator();
		while (it.hasNext()) {
			Cliente cliente = it.next();
			if (!cliente.getNombre().toLowerCase().contains(cadena) 
					&& 
			   (!cliente.getApellidos().toLowerCase().contains(cadena))) {
				it.remove();

			}
			
		}
		return clientes;
	}

}
