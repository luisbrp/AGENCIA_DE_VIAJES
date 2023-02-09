package clases;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class GestorBBDD extends Conector{
	PreparedStatement pst;
	
	public void insertarCliente(Cliente cliente) throws SQLException {
		
		PreparedStatement preparedSt = con.prepareStatement("INSERT INTO clientes ( dni, nombre, apellidos, direccion, localidad) VALUES (?,?,?,?,?);");
		
		preparedSt.setString(1, cliente.getDni());
		preparedSt.setString(2, cliente.getNombre());
		preparedSt.setString(3, cliente.getApellidos());
		preparedSt.setString(4, cliente.getDireccion());
		preparedSt.setString(5, cliente.getLocalidad());
		
		preparedSt.execute();
	}
	
	public void modificarCliente(Cliente cliente) throws SQLException {

		PreparedStatement preparedSt = con.prepareStatement("UPDATE clientes SET  nombre= (?),apellidos= (?),direccion= (?),"
		+ "localidad = (?) WHERE dni = (?);");
		
		preparedSt.setString(5, cliente.getDni());
		preparedSt.setString(1, cliente.getNombre());
		preparedSt.setString(2, cliente.getApellidos());
		preparedSt.setString(3, cliente.getDireccion());
		preparedSt.setString(4, cliente.getLocalidad());
		
		preparedSt.execute();
	}
	public void eliminarCliente (String dni) throws SQLException {

		Cliente cliente = new Cliente();
		
		PreparedStatement preparedStel = con.prepareStatement("DELETE FROM clientes WHERE dni = ? ;");
		
		preparedStel.setString(1, dni);
		preparedStel.execute();
	}
	
	public ArrayList<Cliente> verClientes () throws SQLException {
		   
		ArrayList<Cliente> clientes = new ArrayList<>();
		
		PreparedStatement preparedSt = con.prepareStatement("SELECT * FROM clientes");
		ResultSet resultado = preparedSt.executeQuery();
		
		while (resultado.next()) {
		Cliente cliente = new Cliente();
		cliente.setDni(resultado.getString("dni"));
		cliente.setNombre(resultado.getString("nombre"));
		cliente.setApellidos(resultado.getString("apellidos"));
		cliente.setDireccion(resultado.getString("direccion"));
		cliente.setLocalidad(resultado.getString("localidad"));
		clientes.add(cliente);
		}
		return clientes;
	}
	public Cliente getCliente(String dni) throws SQLException {
		String sentencia="SELECT * FROM clientes WHERE dni=?";
		Cliente cliente = new Cliente();
		
		pst=getCon().prepareStatement(sentencia);
		pst.setString(1, dni);
		
		ResultSet result=pst.executeQuery();
		result.next();
		
		cliente.setDni(result.getString("dni"));
		cliente.setNombre(result.getString("nombre"));
		cliente.setApellidos(result.getString("apellidos"));
		cliente.setDireccion(result.getString("direccion"));
		cliente.setLocalidad(result.getString("localidad"));
		
		return cliente;
	}
	
	
	public boolean ConsultarAltaCliente (String dni) throws SQLException {
		boolean ALTA =false;
		try {		
			if(getCliente(dni).getDni().equals(dni)) {
				ALTA=true;
			}
		}catch(Exception e){
			
		}
		return ALTA;
		
	}	
	public void realizarReservas (String dni, Scanner scan)   {
		
		boolean ALTA = false;
		try {
			ALTA = ConsultarAltaCliente(dni);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
	
		Reserva reserva=new Reserva();
		Integer id_hotel;
		
		if (ALTA){
			//id_hotel = FormularioDeDatos.pedirDatosHotel(scan);
			//id_hotel=FormularioDeDatos.pedirIdHotel(scan);
			//Visor.mostrarHabitaciones(getHabitacionesPorHotel(id_hotel));
			//reserva=FormularioDeDatos.pedirDatosReserva(scan);
			
			//System.out.println("No hay habitaciones para este hotel.");
			
			
		} else {
			
			try {
				pst = con.prepareStatement("INSERT INTO reservas (id_habitacion, dni, desde, hasta) VALUES(?,?,?,?)");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				pst.setInt(1, reserva.getId_Habitacion());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				pst.setString(2, reserva.getDni());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				pst.setDate(3, new Date(reserva.getDesde().getTime()));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				pst.setDate(4, new Date(reserva.getHasta().getTime()));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				pst.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	
	}
	public void anularReserva(int id)  {
		
		try {
			pst = con.prepareStatement("DELETE FROM reservas WHERE id=? ;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pst.setInt(1, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("La reserva ha sido anulada con exito!");
	}
	
	public Reserva getReserva(int id) {
		
		try {
			pst = con.prepareStatement("SELECT * FROM reservas WHERE id=? ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reserva reserva = new Reserva();
		
		try {
			pst.setInt(1, id);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ResultSet resultado = null;
		try {
			resultado = pst.executeQuery();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			if (resultado.next()) {
				reserva.setId(resultado.getInt(1));
				reserva.setId_Habitacion(resultado.getInt(2));
				reserva.setDni(resultado.getString(3));
				reserva.setDesde(resultado.getDate(4));
				reserva.setHasta(resultado.getDate(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return reserva;
		
	}
	
	
	
	public ArrayList<Reserva> getReservas() {
		
		ArrayList<Reserva> reservas = new ArrayList<Reserva>();
		
		try {
			pst = con.prepareStatement("SELECT * FROM reservas");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reserva reserva = new Reserva();
		
		ResultSet resultado = null;
		try {
			resultado = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while(resultado.next()) {
				
				
				
				reserva.setId(resultado.getInt(1));
				reserva.setId_Habitacion(resultado.getInt(2));
				reserva.setDni(resultado.getString(3));
				reserva.setDesde(resultado.getDate(4));
				reserva.setHasta(resultado.getDate(5));
				
				reservas.add(reserva);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	
}
