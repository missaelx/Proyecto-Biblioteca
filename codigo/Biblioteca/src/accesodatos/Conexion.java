/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase define la conexion con la base de datos
*/


package accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author missael
 */
public class Conexion {
    private Connection conexion;
    private final String DB = "jdbc:mysql://localhost:3306/mydb";
    private final String USUARIO = "biblioteca";
    private final String CONSTRASENA = "biblioteca";
    
    public Connection obtenerConexion() throws SQLException{
        conecta();
        return conexion;
    }
    
    private void conecta() throws SQLException{
        conexion = DriverManager.getConnection(DB, USUARIO, CONSTRASENA);
    }
    
    public void desconecta(){
        if (conexion != null){
            try {
                if (!conexion.isClosed()) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /*
        funciones para pruebas, remover en despliegue
    */
    public Connection getConexion(){
        return conexion;
    }
}
