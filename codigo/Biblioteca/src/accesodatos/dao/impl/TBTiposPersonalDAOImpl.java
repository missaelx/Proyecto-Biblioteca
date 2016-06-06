/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase implementa las funciones de su respectivo DAO, TBTiposPersonal.
*/

package accesodatos.dao.impl;

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import accesodatos.Conexion;
import accesodatos.dao.TBTiposPersonalDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author missael
 */
public class TBTiposPersonalDAOImpl implements TBTiposPersonalDAO{

    private final Conexion conexion;
    private Connection connection;
    private Statement consulta;
    private ResultSet resultados;
    
    public TBTiposPersonalDAOImpl() {
        conexion = new Conexion();
    }

    
    @Override
    public String buscarPorIdentificador(int idTipoPersonal) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException {
        String resultado = "";
        
        try {
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("select * from TBTiposPersonal where idTipo = ?");
            sentencia.setInt(1, idTipoPersonal);
            resultados = sentencia.executeQuery();
            if(resultados.first()){
                resultado = resultados.getString("nombre");
            } else {
                throw new ObjetoNoEncontradoException();
            }
            
        } catch (SQLException | NullPointerException ex) {
            throw new ErrorConexionBaseDatosException(ex.getMessage());
        }
        
        return resultado;
    }
    
}
