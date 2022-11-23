
package testDB;

import connection.DBConnection;
import java.sql.Statement;

public class OpereacionesDB {
    
    public static void main(String[] args) {
        actualzarPelicula(13, "Terror");
    }
    
    public static void actualzarPelicula(int id, String genero) {
        
        DBConnection con = new DBConnection();
        
        String sql = "UPDATE peliculas SET genero = '" + genero + "' WHERE id = " + id;
        
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
            System.out.println("UPDATA exitoso");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }finally{
            con.desconectar();
        }
    }
}

