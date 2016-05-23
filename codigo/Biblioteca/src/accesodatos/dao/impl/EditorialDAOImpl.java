package accesodatos.dao.impl;

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import accesodatos.Conexion;
import accesodatos.dao.EditorialDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author missael
 */
public class EditorialDAOImpl implements EditorialDAO{
    
    private final Conexion conexion;
    private Connection connection;
    private Statement consulta;
    private ResultSet resultados;
    
    public EditorialDAOImpl() {
        conexion = new Conexion();
    }

    @Override
    public String buscarPorIdentificador(int identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException {
        String resultado = "";
        
        try {
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("select * from TBEditoriales where idEditorial = ?");
            sentencia.setInt(1, identificador);
            resultados = sentencia.executeQuery();
            if(resultados.first()){
                resultado = resultados.getString("nombre");
            } else {
                throw new ObjetoNoEncontradoException("No entro al first", identificador + "");
            }
            
        } catch (SQLException ex) {
            throw new ObjetoNoEncontradoException("Error SQL");
        } catch (NullPointerException ex){
            throw new ErrorConexionBaseDatosException(ex.getMessage());
        }
        
        return resultado;

    }

}
