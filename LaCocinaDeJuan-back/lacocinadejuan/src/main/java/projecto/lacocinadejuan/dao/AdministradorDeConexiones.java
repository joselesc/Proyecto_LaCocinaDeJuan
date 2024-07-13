package projecto.lacocinadejuan.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {
    
   
    public static Connection conectar() {
      
        String url = "jdbc:mysql://127.0.0.1:3306/lacocinadejuan?serverTimeZone=UTC&userSSL=false";
        String user = "root";
        String password = "root";
        String driver = "com.mysql.cj.jdbc.Driver";
        Connection connection = null;

        try{
                     
            Class.forName(driver);

                    connection = DriverManager.getConnection(url, user, password);

        }catch(Exception e) {
           
            System.err.println("No se ha podido conectar al la db:" + e.getMessage());
        }

        return connection;
    }
    
    public static void desconectar(Connection connection) {
        
        try{
            connection.close();
        }catch(Exception e) {
            System.err.println(e);
        }
    }

}



