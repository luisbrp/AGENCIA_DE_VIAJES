package clases;

public class Menu {
	
			//menu principal
			public static final int REGISTRAR_ALTA_CLIENTES=1;
			public static final int REALIZAR_RESERVA=1;
			public static final int ANULAR_RESERVA=2;
			public static final int ALTA_DE_HOTEL=4;
			public static final int SALIR=0;

			// menu cliente
			public static final int DATOS_CLIENTE=1;
			public static final int VISUALIZAR_CLIENTES=2 ;
			
			// menu reserva
			public static final int DATOS_RESERVA=1;
			public static final int CLIENTE_REGISTRADO=2;
			public static final int BUSCAR_HOTEL=3;
			public static final int VISUALIZAR_HABITACIONES_HOTEL=4;
			public static final int ID_HABITACION_RESERVA=5;
			public static final int FECHA_RESERVA_INICIO_FIN=6;
			
			
			public static final int MOSTRAR_UNA_RESERVA = 3;
			public static final int MOSTRAR_RESERVAS = 4;
			
			//menu hotel
			public static final int DATOS_HOTEL=1;
			public static final int CREAR_HABITACION_SALIR=3;
			public static final int INSERTAR_CLIENTE = 1;
			public static final int ELIMINAR_CLIENTE = 2;
			public static final int VER_CLIENTES = 4;
			public static final int MODIFICAR_CLIENTE = 3;
			
			
			
			
			
			public static void mostrarMenuPrincipal() {
				System.out.println("");
				System.out.println("------MENU PRINCIPAL-------");
				System.out.println( REGISTRAR_ALTA_CLIENTES + ". Registrar alta clientes");
				System.out.println(REALIZAR_RESERVA + ". Realizar reserva");
				System.out.println(ANULAR_RESERVA + ". Anular reservar");
				System.out.println(ALTA_DE_HOTEL + ". Alta de hotel");
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
				System.out.println(SALIR + ". Salir");
				System.out.println("");
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
			System.out.println( DATOS_HOTEL + ". Introducir datos del hotel");
			System.out.println( CREAR_HABITACION_SALIR+ ". Introducir datos de la reserva");
			System.out.println(SALIR + ". Salir");
			System.out.println("");
		}
		
		
			
			
			

		
	
}
