
package connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    
    Connection connection;
    static String bd = "ibero_peliculas";
    static String port = "3308";
    static String login = "root";
    static String password = "";
    static String ip = "localhost";

    public DBConnection() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://"+ DBConnection.ip + ":" + DBConnection.port + "/" + DBConnection.bd;
                System.out.println(url);
                connection = DriverManager.getConnection(url, DBConnection.login,DBConnection.password );
                System.out.println("Conexion exitosa");
            } catch (Exception e) {
                System.out.println("Error de Conexion");
                System.out.println(e.getMessage());
            }
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void desconectar(){
        connection = null;
    }
}
