package accesodatos.dao;

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import modelo.Personal;

/**
 *
 * @author missael
 */
public interface PersonalDAO {
    public Personal buscarPorIdentificador(int identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException;
    public Personal buscarPorNumeroPersonal(String identificador) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException;
}
