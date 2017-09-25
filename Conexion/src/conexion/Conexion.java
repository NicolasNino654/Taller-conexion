
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
               
               int keep;
               keep=ex.getErrorCode();
               System.out.println(keep);
               System.out.println(ex);
               switch(keep){
                   case 1062:
                   {
                       System.out.println("se ha duplicado los valores de la llave primaria");
                       break;
                               
                   }
               case 1049:
               System.out.println("base de datos incorrecta");
               break;
               default:
               System.out.println("error desconocido");
               
               }
            }
        }
    }
    
        
    
    

