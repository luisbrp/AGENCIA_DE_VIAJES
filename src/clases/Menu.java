package clases;

public class Menu {
	
			//menu principal
			public static final int GESTIONAR_CLIENTES=1;
			public static final int GESTIONAR_RESERVAS=2;
			public static final int GESTIONAR_HOTELES=3;
			public static final int SALIR=0;

			// menu cliente
			final static int INSERTAR_CLIENTE=1;
			final static int ELIMINAR_CLIENTE=2;
			final static int MODIFICAR_CLIENTE = 3;
			public static final int VER_CLIENTES = 4;
			
			// menu consultas clientes
			private static int ORDENAR_APELLIDO = 1;
			private static int ORDENAR_NOMBRE=2;
			

			
			// menu reserva
			public static final int DATOS_RESERVA=1;
			public static final int CLIENTE_REGISTRADO=2;
			public static final int BUSCAR_HOTEL=3;
			public static final int VISUALIZAR_HABITACIONES_1=4;
			public static final int ID_HABITACION_RESERVA=5;
			public static final int FECHA_RESERVA_INICIO_FIN=6;
			
			static final int ANULAR_RESERVA = 2;
			static final int REALIZAR_RESERVA = 1;
			public static final int MOSTRAR_UNA_RESERVA = 3;
			public static final int MOSTRAR_RESERVAS = 4;
			

			
			
			
			
			//menu hotel
			public static final int CREAR_HOTEL = 1;
			public static final int VISUALIZAR_HOTELES=2;
			public static final int GESTOR_HABITACIONES = 3;
			private static final int CONSULTAS_CLIENTES = 4;
			
			
			//menu habitaciones
			public static final int CREAR_HABITACION = 1;
			public static final int VISUALIZAR_HABITACIONES_2 = 2;
			public static final int VISUALIZAR_HABITACIONES_HOTEL = 3;
			private static final int COMPROBAR_CADENA = 4;
			
			
			
			
			
		

		
			
			

			
			
			
			public static void mostrarMenuPrincipal() {
				System.out.println("");
				System.out.println("------MENU PRINCIPAL-------");
				System.out.println( GESTIONAR_CLIENTES + ". Gestionar clientes");
				System.out.println(GESTIONAR_RESERVAS + ". Gestionar reservas");
				System.out.println(GESTIONAR_HOTELES+ ". Gestionar hoteles");
				System.out.println(SALIR + ". Salir");
				System.out.println("");
				
			}
			
		  public static void motrarMenuClientes() {
			  System.out.println("");
				System.out.println("------MENU CLIENTES-------");
				System.out.println( INSERTAR_CLIENTE + ". Insertar cliente");
				System.out.println( ELIMINAR_CLIENTE + ". Eliminar cliente");
				System.out.println( MODIFICAR_CLIENTE + ". Modificar cliente");
				System.out.println( VER_CLIENTES + ". Ver clientes");
				System.out.println(CONSULTAS_CLIENTES+". Consultas clientes");
				System.out.println(SALIR + ". Salir");
				System.out.println("");
		  }
		 
		public static void mostrarMenuCosultasClientes() {
			System.out.println("--MENU CONSULTAS CLIENTES---");
			System.out.println(ORDENAR_APELLIDO+". Ordenar clientes por apellido");
			System.out.println(ORDENAR_NOMBRE+". Ordenar clientes por nombre");
			System.out.println(COMPROBAR_CADENA+"Introduce un nombre o apellido y te buscaré los usuarios");
			
		}
		  
		public static void mostrarMenuHacerReserva() {
			System.out.println("-----MENU RESERVAS-----");
			System.out.println(REALIZAR_RESERVA+". Realizar reserva");
			System.out.println(ANULAR_RESERVA+". Anular reserva");
			System.out.println(MOSTRAR_UNA_RESERVA+". Mostrar reserva");
			System.out.println(MOSTRAR_RESERVAS+". Mostrar reservas");
			System.out.println(SALIR+". Salir");
			System.out.println("Escoja una opcion:");
		}
		
		public static void mostrarMenuHotel() {
			System.out.println("");
			System.out.println("------MENU HOTEL-------");
			System.out.println(CREAR_HOTEL+". Crear hotel:");
			System.out.println(VISUALIZAR_HOTELES+". Visualizar Hoteles:");
			System.out.println(GESTOR_HABITACIONES+". Gestor Habitaciones");
			System.out.println(SALIR+". SALIR");
			System.out.println("----------------------------");
			
			
		}
		
		public static void mostrarMenuHabitacion() {
			System.out.println("");
			System.out.println("------MENU HABITACION-------");
			System.out.println(CREAR_HABITACION + ". Crear habitacion");
			System.out.println(VISUALIZAR_HABITACIONES_2+".Visualizar habitaciones");
			System.out.println(VISUALIZAR_HABITACIONES_HOTEL +" .Visualizar habitaciones de un hotel");
			System.out.println( SALIR+ ". SALIR");
			System.out.println("");
		}
		

		

				
	
}
