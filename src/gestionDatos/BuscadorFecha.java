package gestionDatos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import clases.Reserva;

public class BuscadorFecha {
	public static ArrayList<Reserva> buscarReserva(Date fecha,ArrayList<Reserva> reservas) {

		

		Iterator<Reserva> it = reservas.iterator();
		while (it.hasNext()) {
			Reserva reserva = it.next();
			if (!reserva.getDesde().equals(fecha) && !reserva.getHasta().equals(fecha)){
			  
				it.remove();

			}
			
		}
		return reservas;
	}
}
