
package accesodatos.dao;

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;

/**
 *
 * @author missael
 */
public interface AutorDAO {
    public String buscarPorIdentificador(String identificadorTexto) throws ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException;
}
