package accesodatos.dao;

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import Excepciones.PrestatarioSinPrestamosDisponiblesException;
import Excepciones.RegistroMalFormadoException;
import modelo.Prestamo;
import modelo.Prestatario;

/**
 *
 * @author missael
 */
public interface PrestamoDAO {
    public Prestamo buscarPorIdentificador(int idPrestamo) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException;
    public int getNumeroPrestamosDePrestatario(String numeroPersonal) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException;
    public boolean RegistrarNuevoPrestamo(int idPrestatario, int idPersonalBibliotecario, String idEjemplar) throws RegistroMalFormadoException, ErrorConexionBaseDatosException, PrestatarioSinPrestamosDisponiblesException;
}
