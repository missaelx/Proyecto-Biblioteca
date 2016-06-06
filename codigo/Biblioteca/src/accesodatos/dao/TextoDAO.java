/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta interfaz define el comportamiento de acceso a la base de datos para los textos
*/
package accesodatos.dao;

import Excepciones.ErrorActualizarException;
import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import modelo.Texto;


/**
 *
 * @author missael
 */
public interface TextoDAO {
    public Texto buscarPorIdentificador(String identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException;
    public void actualizar(String identificador, Texto texto) throws ErrorActualizarException;
    public String getTipoTextoPorIdentificador(String identificador) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException;
}
