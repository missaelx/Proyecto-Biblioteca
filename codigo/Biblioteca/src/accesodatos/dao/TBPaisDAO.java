/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta interfaz define el comportamiento de acceso a la base de datos para los tabla auxiliar de paises
*/
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
