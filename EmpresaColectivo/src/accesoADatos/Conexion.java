
package accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "empresacolectivos";
    private static String USUARIO = "root";
    private static String PASSWORD = "";

    private static Connection connection;

    private Conexion() {}

    public static Connection getConexion() {
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL + DB
                        + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                        + "&user=" + USUARIO + "&password=" + PASSWORD);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la BD " + ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Drivers " + ex.getMessage());
            }

        }
        return connection;
    }

}
