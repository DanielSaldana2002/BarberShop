package SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionSQL {
    public Connection conectar() {
        Connection connection = null;
        String url = "jdbc:sqlserver://localhost:1433;databaseName=ControlGastos;encrypt=true;trustServerCertificate=true";
        String user = "ControlGastosAdmin";
        String password = "Control123.";

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a la base de datos SQL Server!");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }

        return connection;
    }
    public void desconectar(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada correctamente.");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        } else {
            System.out.println("No hay ninguna conexión abierta para cerrar.");
        }
    }
}


