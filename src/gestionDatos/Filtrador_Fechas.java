package gestionDatos;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import clases.Reserva;

public class Filtrador_Fechas {
	
		public static ArrayList<Reserva> buscarReserva(Date fechaInicio,Date fechaFin,ArrayList<Reserva> reservas) {

			

			Iterator<Reserva> it = reservas.iterator();
			while (it.hasNext()) {
				Reserva reserva = it.next();
				if (reserva.getDesde().after(fechaInicio) || reserva.getHasta().before(fechaFin)){
				  
					it.remove();

				}
			
				
			}
			return reservas;
			
		}
		
		
		
		

	}
	


