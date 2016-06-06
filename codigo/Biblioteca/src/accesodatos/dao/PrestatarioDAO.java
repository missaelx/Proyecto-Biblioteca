/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta interfaz define el comportamiento de acceso a la base de datos para los prestatarios
*/
package accesodatos.dao;

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import java.util.List;
import modelo.Adeudo;
import modelo.Prestatario;

/**
 *
 * @author missael
 */
public interface PrestatarioDAO {
    public Prestatario buscarPorIdentificador(int identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException;
    public Prestatario buscarPorNumeroPersonal(String identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException;
    public int getIdentificadorPorNumeroPersonal(String numeroPersonal) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException;
    //diseño
    public boolean guardarPrestatario(Prestatario usuario);
    public boolean actualizarPrestatario(int identificador, Prestatario nuevosDatos);
    public void renovarPrestatario(int identificador);
    public List<Adeudo> getAdeudosPrestatarioPorIdentificador(int identificador);
}
