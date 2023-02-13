package clases;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class GestorBBDD extends Conector {
	
	private static boolean ALTA = false;
	PreparedStatement pst;
	ResultSet resultado; 
	
	public ArrayList<Habitacion> getHabitaciones() throws SQLException {
		
		ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();

		pst = con.prepareStatement("SELECT * FROM habitaciones");
		
		resultado = pst.executeQuery();
		
		while(resultado.next()) {
			
			Habitacion habitacion = new Habitacion();
			
			habitacion.setId(resultado.getInt(1));
			habitacion.setId_hotel(resultado.getInt(2));
			habitacion.setNumero(resultado.getString(3));
			habitacion.setDescripcion(resultado.getString(4));
			habitacion.setPrecio(resultado.getDouble(5));
		
			habitaciones.add(habitacion);
		}
		
		return habitaciones;
	}
	
	public ArrayList<Habitacion> getHabitacionesHotel(int id) throws SQLException {
		
		ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
		
		
		pst = con.prepareStatement("SELECT * FROM habitaciones WHERE id_hotel=?");
		
		pst.setInt(1, id);
		
		resultado = pst.executeQuery();
		
		while(resultado.next()) {
			Habitacion habitacion = new Habitacion();
			
			habitacion.setId(resultado.getInt(1));
			habitacion.setId_hotel(resultado.getInt(2));
			habitacion.setNumero(resultado.getString(3));
			habitacion.setDescripcion(resultado.getString(4));
			habitacion.setPrecio(resultado.getDouble(5));
		
			habitaciones.add(habitacion);
		}
		
		return habitaciones;
	}
	
	
	public Cliente getCliente(String dni) throws SQLException {
		
		Cliente cliente = new Cliente();

		pst = con.prepareStatement("SELECT * FROM clientes WHERE dni=?");
		pst.setString(1, dni);

		resultado = pst.executeQuery();
		resultado.next();

		cliente.setDni(resultado.getString(1));
		cliente.setNombre(resultado.getString(2));
		cliente.setApellidos(resultado.getString(3));
		cliente.setDireccion(resultado.getString(4));
		cliente.setLocalidad(resultado.getString(5));

		return cliente;
		
	}

	public boolean consultarAltaCliente(String dni) throws SQLException {
		
		boolean ALTA = false;

			if (getCliente(dni).getDni().equals(dni)) { //Aqui comprobamos que el dni que esta en la base de datos
														//es igual que el que nos pasa el usuario por teclado
				ALTA = true;
			}
		return ALTA;

	}

	public void realizarReserva(String dni, Scanner scan, Reserva reserva) throws SQLException{
		ALTA = consultarAltaCliente(dni);
		
		int id = 0;
		
		if(GestorBBDD.ALTA) { //Flujo de esta condicion:
								//Si el dni esta en la base datos, el programa seguira, sino saltara un error:
			id = FormularioDeDatos.pedirIdHotel(id, scan); 
			
			if(getHabitacionesHotel(id).size()== 0) { //si el arraylist de getHabitacionesHotel no tiene ningun valor
										
				System.out.println("El hotel no existe");	//se mostrara un mensaje por pantalla. 		
			}
			else {												//Si no, el programa mostrara todas las habitaciones que tiene dicho hotel.
				
				Visor.mostrarHabitaciones(getHabitacionesHotel(id)); //Arraylist que muestra todas las habitaciones de un hotel
				
				
				reserva = FormularioDeDatos.pedirDatosReserva(scan, reserva);
				
				
				pst= con.prepareStatement("INSERT INTO reservas (id_habitacion, dni, desde, hasta) VALUES(?,?,?,?)"); //si llegado a este punto, se cumple todo.
																													// El programa proseguira a insertar los datos previamente dados en la base de datos.
				
				pst.setInt(1, reserva.getId_Habitacion());
				pst.setString(2, reserva.getDni());
				pst.setDate(3, new Date(reserva.getDesde().getTime()));
				pst.setDate(4, new Date(reserva.getHasta().getTime()));
				
				pst.execute();
				System.out.println("La reserva se ha realizado con exito");
			}
	
		}
		else {
			System.out.println("El cliente no existe");
		}
	}
	

	public void anularReserva(int id) throws SQLException {

		pst = con.prepareStatement("DELETE FROM reservas WHERE id = ? ;");
		pst.setInt(1, id);
		pst.execute();
		
		System.out.println("La reserva ha sido anulada con exito!");
	}

	public Reserva getReserva(int id) throws SQLException {

		pst = con.prepareStatement("SELECT * FROM reservas WHERE id=? ");
		
		Reserva reserva = new Reserva();

		pst.setInt(1, id);
	
		resultado = null;
		
			resultado = pst.executeQuery();
	
			if (resultado.next()) {
				reserva.setId(resultado.getInt(1));
				reserva.setId_Habitacion(resultado.getInt(2));
				reserva.setDni(resultado.getString(3));
				reserva.setDesde(resultado.getDate(4));
				reserva.setHasta(resultado.getDate(5));
			}
	
		return reserva;
		
	}

	public ArrayList<Reserva> getReservas(ArrayList<Reserva> reservas) throws SQLException {

		pst = con.prepareStatement("SELECT * FROM reservas");

		Reserva reserva = new Reserva();

		resultado = null;

		resultado = pst.executeQuery();

		while (resultado.next()) {

			reserva.setId(resultado.getInt(1));
			reserva.setId_Habitacion(resultado.getInt(2));
			reserva.setDni(resultado.getString(3));
			reserva.setDesde(resultado.getDate(4));
			reserva.setHasta(resultado.getDate(5));

			reservas.add(reserva);
		}
		return reservas;
	}

}
