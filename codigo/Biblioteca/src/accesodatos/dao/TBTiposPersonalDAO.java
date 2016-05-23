package accesodatos.dao;

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;

/**
 *
 * @author missael
 */
public interface TBTiposPersonalDAO {
    public String buscarPorIdentificador(int idTipoPersonal) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException;
}
