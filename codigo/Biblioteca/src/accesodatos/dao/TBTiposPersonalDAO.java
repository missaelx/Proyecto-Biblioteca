/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta interfaz define el comportamiento de acceso a la base de datos para los tipos de personal
*/

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
