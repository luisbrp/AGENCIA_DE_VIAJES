package main;

import java.sql.SQLException;
import java.text.ParseException;
import clases.GestionDeClientes;
import clases.GestorAgenciaViajes;


public class main {

		public static void main(String[] args) throws SQLException, ParseException {
		GestorAgenciaViajes ga = null;
		try {
			ga = new GestorAgenciaViajes();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ga.run();
		}
	}

