/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase implementa las funciones de su respectivo DAO, Personal.
*/

package accesodatos.dao.impl;

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import accesodatos.Conexion;
import accesodatos.dao.PersonalDAO;
import accesodatos.dao.TBTiposPersonalDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.DatosPersona;
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
    public Personal buscarPorIdentificador(int identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException {
        Personal resultado = null;
        
        try {
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("select * from TBPersonal where idPersonal = ?");
            sentencia.setInt(1, identificador);
            resultados = sentencia.executeQuery();
            
            if(resultados.first()){
                DatosPersona datos = new DatosPersona();
                datos.setCorreo(resultados.getString("correo"));
                datos.setDireccion(resultados.getString("direccion"));
                datos.setFechaDeNacimiento(resultados.getDate("fechaNacimiento"));
                datos.setNombre(resultados.getString("nombre"));
                datos.setTelefono(resultados.getString("telefono"));
                
                resultado = new Personal(identificador, resultados.getString("numeroPersonal"), getTipoPersonalFromDB(resultados.getInt("tipo")), datos);
            } else {
                throw new ObjetoNoEncontradoException("Registros vacios", identificador + "");
            }
            
            
        } catch (SQLException ex) {
            throw new ObjetoSQLMalGuardadoException(ex.getMessage());
        } catch (NullPointerException ex){
            throw new ErrorConexionBaseDatosException(ex.getMessage());
        }
        
        return resultado;
    }
    
    
    private String getTipoPersonalFromDB(int idTipoPersonal) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException{
        TBTiposPersonalDAO tiposPersonal = new TBTiposPersonalDAOImpl();
        return tiposPersonal.buscarPorIdentificador(idTipoPersonal);
    }

    @Override
    public Personal buscarPorNumeroPersonal(String identificador) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException {
        Personal resultado = null;
        
        try {
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("select * from TBPersonal where numeroPersonal = ?");
            sentencia.setString(1, identificador);
            resultados = sentencia.executeQuery();
            
            if(resultados.first()){
                DatosPersona datos = new DatosPersona();
                datos.setCorreo(resultados.getString("correo"));
                datos.setDireccion(resultados.getString("direccion"));
                datos.setFechaDeNacimiento(resultados.getDate("fechaNacimiento"));
                datos.setNombre(resultados.getString("nombre"));
                datos.setTelefono(resultados.getString("telefono"));
                
                resultado = new Personal(resultados.getInt("idPersonal"), identificador,getTipoPersonalFromDB(resultados.getInt("tipo")), datos);
            } else {
                throw new ObjetoNoEncontradoException("Registros vacios", identificador + "");
            }
            
            
        } catch (SQLException | NullPointerException ex) {
            throw new ErrorConexionBaseDatosException(ex.getMessage());
        }
        
        return resultado;
    }
}
