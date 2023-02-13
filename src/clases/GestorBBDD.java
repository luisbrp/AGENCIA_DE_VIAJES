package clases;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class GestorBBDD extends Conector {
	PreparedStatement pst;

	public void insertarCliente(Cliente cliente) throws SQLException {

		PreparedStatement preparedSt = con.prepareStatement(
				"INSERT INTO clientes ( dni, nombre, apellidos, direccion, localidad) VALUES (?,?,?,?,?);");

		preparedSt.setString(1, cliente.getDni());
		preparedSt.setString(2, cliente.getNombre());
		preparedSt.setString(3, cliente.getApellidos());
		preparedSt.setString(4, cliente.getDireccion());
		preparedSt.setString(5, cliente.getLocalidad());

		preparedSt.execute();
	}

	public void modificarCliente(Cliente cliente) throws SQLException {

		PreparedStatement preparedSt = con.prepareStatement(
				"UPDATE clientes SET  nombre= (?),apellidos= (?),direccion= (?)," + "localidad = (?) WHERE dni = (?);");

		preparedSt.setString(5, cliente.getDni());
		preparedSt.setString(1, cliente.getNombre());
		preparedSt.setString(2, cliente.getApellidos());
		preparedSt.setString(3, cliente.getDireccion());
		preparedSt.setString(4, cliente.getLocalidad());

		preparedSt.execute();
	}

	public void eliminarCliente(String dni) throws SQLException {

		Cliente cliente = new Cliente();

		PreparedStatement preparedStel = null;
		
			preparedStel = con.prepareStatement("DELETE FROM clientes WHERE dni = ? ;");
			preparedStel.setString(1, dni);
			preparedStel.execute();
		
	}

	public ArrayList<Cliente> verClientes() throws SQLException {

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
		Cliente cliente = new Cliente();

		pst = con.prepareStatement("SELECT * FROM clientes WHERE dni=?");
		pst.setString(1, dni);

		ResultSet result = pst.executeQuery();
		result.next();

		cliente.setDni(result.getString("dni"));
		cliente.setNombre(result.getString("nombre"));
		cliente.setApellidos(result.getString("apellidos"));
		cliente.setDireccion(result.getString("direccion"));
		cliente.setLocalidad(result.getString("localidad"));

		return cliente;
		
		
	}

	public boolean ConsultarAltaCliente(String dni) throws SQLException {
		boolean ALTA = false;

			if (getCliente(dni).getDni().equals(dni)) {
				ALTA = true;
			}
		return ALTA;

	}

	public void realizarReservas(Reserva reserva) throws SQLException {

			pst = con.prepareStatement("INSERT INTO reservas (id_habitacion, dni, desde, hasta) VALUES(?,?,?,?)");
			pst.setInt(1, reserva.getId_Habitacion());
			pst.setString(2, reserva.getDni());
			pst.setDate(3, new Date(reserva.getDesde().getTime()));
			pst.setDate(4, new Date(reserva.getHasta().getTime()));
			pst.execute();

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
	

		ResultSet resultado = null;
		
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

		ResultSet resultado = null;

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
