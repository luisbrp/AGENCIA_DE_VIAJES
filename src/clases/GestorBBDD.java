package clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


public class GestorBBDD extends Conector {
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
	public boolean ConsultarAltaCliente (String dni) throws SQLException {

		PreparedStatement preparedSt = con.prepareStatement("SELECT * FROM clientes WHERE dni = ? ");
		preparedSt.setString(1, dni);
		preparedSt.execute();
		Cliente cliente = new Cliente();
		
		ResultSet resultado = preparedSt.executeQuery();
		boolean ALTA = false;
		if (resultado.next()) {
			System.out.println("El cliente esta dado de alta");
			ALTA = true;
		} else {
			System.out.println("El cliente no esta dado de alta");
		}
		return ALTA;
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


}
