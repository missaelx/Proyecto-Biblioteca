/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase implementa las funciones de su respectivo DAO, TBAutor (tabla auxiliar).
*/

package accesodatos.dao.impl;

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoSQLMalGuardadoException;
import accesodatos.Conexion;
import accesodatos.dao.TBAutorDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author missael
 */
public class TBAutorDAOImpl implements TBAutorDAO{
    
    private final Conexion conexion;
    private Connection connection;
    private Statement consulta;
    private ResultSet resultados;
    
    public TBAutorDAOImpl() {
        conexion = new Conexion();
    }

    @Override
    public String buscarPorIdentificador(int identificador) throws ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException {
        String resultado = "";
        
        try {
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("select * from TBAutores where idAutor = ?");
            sentencia.setInt(1, identificador);
            resultados = sentencia.executeQuery();
            if(resultados.first()){
                resultado = resultados.getString("nombre");
            }
            
        } catch (SQLException ex) {
            throw new ObjetoSQLMalGuardadoException("Error SQL");
        } catch (NullPointerException ex){
            throw new ErrorConexionBaseDatosException(ex.getMessage());
        }
        
        return resultado;
    }
    
}
