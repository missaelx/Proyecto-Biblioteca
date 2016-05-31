package accesodatos.dao.impl;

import Excepciones.ErrorActualizarException;
import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import accesodatos.Conexion;
import accesodatos.dao.TextoDAO;
import accesodatos.dao.TextoEjemplaresDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.TextoEjemplar;

/**
 *
 * @author missael
 */
public class TextoEjemplaresDAOImpl implements TextoEjemplaresDAO {

    private final Conexion conexion;
    private Connection connection;
    private Statement consulta;
    private ResultSet resultados;
    
    public TextoEjemplaresDAOImpl() {
        conexion = new Conexion();
    }
    
    @Override
    public int getNumeroDeEjemplares(String idTexto) {
        int resultado = 0;
        
        try {
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("SELECT count(*) FROM mydb.TBTextoEjemplares where idtexto = ?");
            sentencia.setString(1, idTexto);
            resultados = sentencia.executeQuery();
            resultados.first();
            resultado = resultados.getInt(1);
        } catch (SQLException ex) { 
            System.out.println(ex.getMessage());
        }
        
        return resultado;
    }

    @Override
    public TextoEjemplar buscarTextoEjemplarPorIdentificador(String identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarTextoEjemplar(TextoEjemplar ejemplar) throws ObjetoNoEncontradoException, ErrorActualizarException, ErrorConexionBaseDatosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getDisponiblidad(String idTexto) {
        int resultado = 0;
        
        try {
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("SELECT count(*) FROM mydb.TBTextoEjemplares where idtexto = ? and disponible = 1");
            sentencia.setString(1, idTexto);
            resultados = sentencia.executeQuery();
            resultados.first();
            resultado = resultados.getInt(1);
        } catch (SQLException ex) { 
            System.out.println(ex.getMessage());
        }
        
        return resultado > 0;
    }

    @Override
    public int buscarEjemplaresPrestados(int idPrestatario) throws ErrorConexionBaseDatosException {
        int resultado = 0;
        
        try {
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("SELECT count(*) FROM mydb.TBTextoEjemplares where idtexto = ? and disponible = 1");
            sentencia.setInt(1, idPrestatario);
            resultados = sentencia.executeQuery();
            resultados.first();
            resultado = resultados.getInt(1);
        } catch (SQLException ex) { 
            System.out.println(ex.getMessage());
            throw new ErrorConexionBaseDatosException();
        }
        
        return resultado;
    }

    @Override
    public String getTipoEjemplar(String idEjemplar) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException{
        String resultado = "";
        
        TextoDAO textoDAO = new TextoDAOImpl();
        
        try {
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("SELECT idTexto FROM mydb.TBTextoEjemplares where idEjemplar = ?");
            sentencia.setString(1, idEjemplar);
            resultados = sentencia.executeQuery();
            if(resultados.first()) {
                resultado = resultados.getString("idTexto");
                resultado = textoDAO.getTipoTextoPorIdentificador(resultado);
            } else {
                throw new ObjetoNoEncontradoException();
            }
            
        } catch (SQLException | NullPointerException ex) { 
            System.out.println(ex.getMessage());
            throw new ErrorConexionBaseDatosException();
        }
        
        return resultado;
    }
    
}
