package clases;

import java.sql.PreparedStatement;
import java.sql.SQLException;


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

		PreparedStatement preparedSt = con.prepareStatement("UPDATE clientes SET dni = (?), nombre= (?),apellidos= (?),direccion= (?),"
		+ "localidad = (?) WHERE dni = (?);");
		
		preparedSt.setString(1, cliente.getDni());
		preparedSt.setString(2, cliente.getNombre());
		preparedSt.setString(3, cliente.getApellidos());
		preparedSt.setString(4, cliente.getDireccion());
		preparedSt.setString(5, cliente.getLocalidad());
		
		preparedSt.execute();
	}
	public void eliminarCliente (String dni) throws SQLException {

		Cliente cliente = new Cliente();
		
		PreparedStatement preparedStel = con.prepareStatement("DELETE FROM clientes WHERE dni = ? ;");
		
		preparedStel.setString(1, dni);
		preparedStel.execute();
	}

}
