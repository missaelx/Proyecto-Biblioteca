package accesodatos.dao.impl;

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import accesodatos.Conexion;
import accesodatos.dao.PersonalDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Personal;

/**
 *
 * @author missael
 */
public class PersonalDAOImpl implements PersonalDAO{

    private Conexion conexion;
    private Connection connection;
    private ResultSet resultados;

    public PersonalDAOImpl() {
        conexion = new Conexion();
    }
    
    @Override
    public Personal buscarPorIdentificador(String identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException {
        Personal resultado = null;
        
        try {
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("select * from TBPersonal where numeroPersonal = ?");
            sentencia.setString(1, identificador);
            resultados = sentencia.executeQuery();
            
            if(resultados.first()){
                resultado = new Personal(identificador, resultados.getString("correo"), resultados.getString("direccion"), resultados.getDate("fechaNacimiento"), resultados.getString("nombre"), resultados.getString("telefono"), resultados.getString("tipo"));
            } else {
                throw new ObjetoNoEncontradoException("Registros vacios", identificador);
            }
            
            
        } catch (SQLException ex) {
            throw new ObjetoSQLMalGuardadoException(ex.getMessage());
        } catch (NullPointerException ex){
            throw new ErrorConexionBaseDatosException(ex.getMessage());
        }
        
        return resultado;
    }
    
}
