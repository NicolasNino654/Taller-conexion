
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Conexion {

   
    
    
    public static void main(String[] args) {
        
        Connection Conexion;
        String url="jdbcmysql://localhost:3306/javadb";
        String usuario="root";
        String clave="nysql2017";
            try {
                Conexion=DriverManager.getConnection(url,usuario,clave);
               System.out.println("por fin");
               String Cadena="INSERT INTO ejemplo(idejemplo,dato) VALUES(7,7)";
               Statement sentencia;
               sentencia=Conexion.createStatement();
               sentencia.execute(Cadena);
               
            } catch (SQLException ex) {
                System.out.println("no me conecte");
               
            }
        }
    }
    
        
    
    

