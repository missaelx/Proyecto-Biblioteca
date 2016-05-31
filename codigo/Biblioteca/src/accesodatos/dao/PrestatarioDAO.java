package accesodatos.dao;

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import modelo.Prestatario;

/**
 *
 * @author missael
 */
public interface PrestatarioDAO {
    public Prestatario buscarPorIdentificador(int identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException;
    public Prestatario buscarPorNumeroPersonal(String identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException;
    public int getIdentificadorPorNumeroPersonal(String numeroPersonal) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException;
}
