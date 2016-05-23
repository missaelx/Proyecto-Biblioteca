package accesodatos.dao;

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoSQLMalGuardadoException;

/**
 *
 * @author missael
 */
public interface TBPaisDAO {
    public String buscarPorIdentificador(int identificador)throws ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException;
}