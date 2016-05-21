/*

*/
package accesodatos.dao.impl;

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import accesodatos.Conexion;
import accesodatos.dao.PrestatarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Prestatario;
import modelo.TipoPrestatario;

/**
 *
 * @author missael
 */
public class PrestatarioDAOImpl implements PrestatarioDAO{
    private Conexion conexion;
    private Connection connection;
    private Statement consulta;
    private ResultSet resultados;

    public PrestatarioDAOImpl() {
        conexion = new Conexion();
    }
    
    

    @Override
    public Prestatario buscarPorIdentificador(String identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException {
        Prestatario resultado = null;
        try{
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("select * from TBPrestatario where numeroPersonal = ?");
            sentencia.setString(1, identificador);
            resultados = sentencia.executeQuery();
            if(resultados.first()){
                switch (resultados.getString("tipo")) {
                    case "Alumno":
                        resultado = new Prestatario(resultados.getString("numeroPersonal"), TipoPrestatario.ALUMNO, resultados.getInt("textoPrestados"), resultados.getDate("vigencia"), resultados.getString("correo"), resultados.getString("direccion"), resultados.getDate("fechaNacimiento"), resultados.getString("nombre"), resultados.getString("telefono"));
                        break;
                    case "Maestro":
                        resultado = new Prestatario(resultados.getString("numeroPersonal"), TipoPrestatario.MAESTRO, resultados.getInt("textoPrestados"), resultados.getDate("vigencia"), resultados.getString("correo"), resultados.getString("direccion"), resultados.getDate("fechaNacimiento"), resultados.getString("nombre"), resultados.getString("telefono"));
                        break;
                    default:
                        throw new ObjetoSQLMalGuardadoException("Tipo de prestatario mal guardado");
                }
                
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
