/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta interfaz define el comportamiento de acceso a la base de datos para los autores
*/

package accesodatos.dao;

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoSQLMalGuardadoException;

/**
 *
 * @author missael
 */
public interface AutorDAO {
    public String buscarPorIdentificador(String identificadorTexto) throws ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException;
}
