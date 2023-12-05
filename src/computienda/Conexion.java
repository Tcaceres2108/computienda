
package computienda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    String bd = "computienda";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;

    public Conexion(String bd) {
        this.bd=bd;
    }

    private Conexion() {
       
    }

    public Connection conectar() throws SQLException {
        try {
            Class.forName(driver);
            // cadena de Conexion
            cx = DriverManager.getConnection(url + bd, user, password);
            System.out.println("Se conecto a BD " + bd);
        } catch (ClassNotFoundException ex) {
            System.out.println("No se conecto a BD: " + bd);
            //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return cx;
    }

    public void desconectar() throws SQLException {
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        try {
            Conexion conexion = new Conexion ();
            conexion.conectar();
            // Realiza operaciones con la conexión
            conexion.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
           
            
        }
    }
}
 
    
    

