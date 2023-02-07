package clases;

public class Menu {
		public static final int REGISTRAR_ALTA_CLIENTES=1;
		public static final int REALIZAR_RESERVA=2;
		public static final int ANULAR_RESERVA=3;
		public static final int ALTA_DE_HOTEL=4;
		public static final int SALIR=0;

		public static final int DATOS_CLIENTE=1;
		public static final int VISUALIZAR_CLIENTES=2 ;
		
		public static final int DATOS_RESERVA=1;
		public static final int CLIENTE_REGISTRADO=2;
		public static final int BUSCAR_HOTEL=3;
		public static final int VISUALIZAR_HABITACIONES_HOTEL=4;
		public static final int ID_HABITACION_RESERVA=5;
		public static final int FECHA_RESERVA_INICIO_FIN=6;
		
		 
		public static final int ID_ANULAR_RESERVA=1;
		
		
		public static final int DATOS_HOTEL=1;
		public static final int CREAR_HABITACION_SALIR=3;
		
		//si crea habitación
		public static final int DATOS_HABITACION=1;
		public static final int 
		
		
		System.out.println("------MENU-------");
		System.out.println(OPCION_UNO + ". opcion uno");
		System.out.println(OPCION_DOS + ". opcion dos");
		System.out.println(OPCION_TRES + ". opcion tres");
		System.out.println(OPCION_CUATRO + ". opcion cuatro");
		System.out.println(SALIR + ". Salir");
		System.out.println("*******************");
		System.out.println("Elije una de las opciones");
		opcion_menu = teclado.nextInt();

		switch (opcion_menu) {
		case OPCION_UNO:
			System.out.println("Primera opcion selecionada");

			break;
		case OPCION_DOS:
			System.out.println("Segunda opcion selecionada");
			break;
		case OPCION_TRES:
			System.out.println("Tercera opcion selecinada ");
			break;
		case OPCION_CUATRO:

			System.out.println("Cuarta opcion selecionada");
			break;
		case SALIR:

		}
		System.out.println("");
	} while (opcion_menu != SALIR);
	teclado.close();

}
