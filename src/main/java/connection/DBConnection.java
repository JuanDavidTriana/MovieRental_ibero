
package connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    
    Connection connection;
    static String bd = "railway";
    static String port = "5711";
    static String login = "root";
    static String password = "DwwFdR8sRbQnnVg2kDyH";
    static String ip = "containers-us-west-16.railway.app";

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
