package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionDeHoteles {

	public static void run(Scanner scan) throws SQLException {
		
		int opcion;
		Hotel hotel = new Hotel();
		ArrayList <Hotel> hoteles = new ArrayList<>();
		GestorBBDD gestorBBDD = new GestorBBDD();
		
		
		
		
		do {
			
			Menu.mostrarMenuHotel();
			opcion = scan.nextInt();
			

			switch (opcion) {
				case Menu.CREAR_HOTEL:
					
					hotel = FormularioDeDatos.pedirDatosHotel(scan);
					gestorBBDD.conectar();
					gestorBBDD.insertarHotel(hotel);
					gestorBBDD.cerrar();
					Visor.mostrarHotel(hotel);
					
					break;
					
				case Menu.VISUALIZAR_HOTELES:
					
					gestorBBDD.conectar();
					hoteles=gestorBBDD.getHoteles();
					Visor.mostrarHoteles(hoteles);
					gestorBBDD.cerrar();
					
					break;
					
			
				case Menu.GESTOR_HABITACIONES:
					Habitacion habitacion = new Habitacion();
					ArrayList <Habitacion> habitaciones= new ArrayList<>();
					
					int opcion_habitacion;
					
					do {
						Menu.mostrarMenuHabitacion();
						opcion_habitacion = scan.nextInt();
						
						switch(opcion_habitacion) {
						
							case Menu.CREAR_HABITACION:
								gestorBBDD.conectar();
								
								hoteles= gestorBBDD.getHoteles();
								Visor.mostrarHoteles(hoteles);
								habitacion = FormularioDeDatos.pedirDatosHabitacion(scan);
								gestorBBDD.insertarHabitacion(habitacion);
								gestorBBDD.cerrar();
							break;
							
							case Menu.VISUALIZAR_HABITACIONES_2:
								gestorBBDD.conectar();
								habitaciones=gestorBBDD.getHabitaciones();
								Visor.mostrarHabitaciones(habitaciones);
								gestorBBDD.cerrar();
								
							break;
							case Menu.VISUALIZAR_HABITACIONES_HOTEL:
								int id;
								gestorBBDD.conectar();
								id= FormularioDeDatos.pedirIdHotel(scan);
								hotel= gestorBBDD.getHotel(id);
								habitaciones=gestorBBDD.getHabitacionesHotel(id);
								
								Visor.mostrarHotel(hotel);
								Visor.mostrarHabitaciones(habitaciones);
								gestorBBDD.cerrar();
							
							case Menu.SALIR:
						   
								
						}
					}while (opcion_habitacion != Menu.SALIR);
					
					
					
					break;
					
				case Menu.SALIR:
					
					
					
					
			}
			System.out.println("");
			} while (opcion != Menu.SALIR);
		
}
}


