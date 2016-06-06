/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta interfaz define el comportamiento de acceso a la base de datos para el personal
*/
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
    //para diseño
    public boolean guardarPersonal(Personal usuario);
    public boolean actualizarPersonal(int identificador, Personal nuevosDatos);
}
