package interfaces;

import java.util.Comparator;

import clases.Cliente;

public class CompararApellidos implements Comparator {

	
	public int compare(Object obj1, Object obj2) {
		Cliente client1 = (Cliente) obj1;
		Cliente client2 = (Cliente) obj2;
		
		return(client1.getApellidos().compareTo(client2.getApellidos()));
	}
	
	

}
