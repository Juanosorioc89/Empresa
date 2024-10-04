package baseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
	
	private static final String url = "jdbc:mysql://localhost:3306/empresa_db";
	private static final String usuario = "root";
	private static final String clave = "";
	
	public static Connection conectar() {
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			System.out.println("Conexión exitosa");
		}catch(SQLException e ) {
			System.out.println("Error al conectarse" + e.getMessage());
		}
		
		return conexion;
	}

}
