/*

*/
package accesodatos.dao.impl;

import Definiciones.TiposDePrestatarios;
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
import modelo.DatosPersona;
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
    public Prestatario buscarPorIdentificador(int identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException {
        Prestatario resultado = null;
        try{
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("select * from TBPrestatario where idPersonal = ?");
            sentencia.setInt(1, identificador);
            resultados = sentencia.executeQuery();
            if(resultados.first()){
                DatosPersona datos = new DatosPersona();
                datos.setCorreo(resultados.getString("correo"));
                datos.setDireccion(resultados.getString("direccion"));
                datos.setFechaDeNacimiento(resultados.getDate("fechaNacimiento"));
                datos.setNombre(resultados.getString("nombre"));
                datos.setTelefono(resultados.getString("telefono"));
                
                switch (resultados.getInt("tipo")) {
                    case 1:
                        resultado = new Prestatario(identificador, resultados.getString("numeroPersonal"), TipoPrestatario.ALUMNO, getNumeroPrestamos(identificador),resultados.getDate("vigencia"),  datos);
                        break;
                    case 2:
                        resultado = new Prestatario(identificador, resultados.getString("numeroPersonal"), TipoPrestatario.MAESTRO, getNumeroPrestamos(identificador),resultados.getDate("vigencia"),  datos);
                        break;
                    default:
                        throw new ObjetoSQLMalGuardadoException("Tipo de prestatario mal guardado");
                }
                
            } else {
                throw new ObjetoNoEncontradoException("Registros vacios", "" + identificador);
            }
        } catch (SQLException ex) {
            throw new ObjetoSQLMalGuardadoException(ex.getMessage());
        } catch (NullPointerException ex){
            throw new ErrorConexionBaseDatosException(ex.getMessage());
        }
        
        return resultado;
    }
    
    private int getNumeroPrestamos(int idPrestatario){
        int resultado = 0;
        
        return resultado;
    }

    @Override
    public Prestatario buscarPorNumeroPersonal(String identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNumeroPersonalPorIdentificador(int identificador) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
