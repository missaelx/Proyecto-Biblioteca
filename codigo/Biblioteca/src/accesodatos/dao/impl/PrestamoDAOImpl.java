package accesodatos.dao.impl;

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import Excepciones.PrestatarioSinPrestamosDisponiblesException;
import accesodatos.Conexion;
import accesodatos.dao.PrestamoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Prestamo;
import modelo.Prestatario;

/**
 *
 * @author missael
 */
public class PrestamoDAOImpl implements PrestamoDAO{
    
    private Conexion conexion;
    private Connection connection;
    private PreparedStatement consulta;
    private ResultSet resultados;

    public PrestamoDAOImpl() {
        conexion = new Conexion();
    }

    @Override
    public Prestamo buscarPorIdentificador(int idPrestamo) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumeroPrestamosDePrestatario(String numeroPersonal) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException {
        
    }

    @Override
    public boolean RegistrarNuevoPrestamo(String idPrestatario, String idPersonalBibliotecario, Prestamo prestamo) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException, ObjetoSQLMalGuardadoException, PrestatarioSinPrestamosDisponiblesException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
