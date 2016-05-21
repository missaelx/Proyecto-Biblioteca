package accesodatos.dao;

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import Excepciones.PrestatarioSinPrestamosDisponiblesException;
import modelo.Prestamo;
import modelo.Prestatario;

/**
 *
 * @author missael
 */
public interface PrestamoDAO {
    public Prestamo buscarPorIdentificador(String identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException;
    public boolean RegistrarNuevoPrestamo(String idPrestatario, String idPersonalBibliotecario, Prestamo prestamo) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException, ObjetoSQLMalGuardadoException, PrestatarioSinPrestamosDisponiblesException;
}
