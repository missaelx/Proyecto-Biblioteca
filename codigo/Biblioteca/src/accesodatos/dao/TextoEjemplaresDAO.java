/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta interfaz define el comportamiento de acceso a la base de datos para los ejemplares de texto
*/

package accesodatos.dao;

import Excepciones.ErrorActualizarException;
import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import modelo.TextoEjemplar;

/**
 *
 * @author missael
 */
public interface TextoEjemplaresDAO {
    public int getNumeroDeEjemplares(String idTexto);
    public boolean getDisponiblidad(String idTexto) throws ObjetoNoEncontradoException;
    public int buscarEjemplaresPrestados(int idPrestatario) throws ErrorConexionBaseDatosException;
    public TextoEjemplar buscarTextoEjemplarPorIdentificador(String identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException;
    public void actualizarTextoEjemplar(TextoEjemplar ejemplar) throws ObjetoNoEncontradoException, ErrorActualizarException, ErrorConexionBaseDatosException;
    public String getTipoEjemplar(String idEjemplar) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException;
    public boolean actualizarDisponibilidadEjemplar(String idEjemplar, boolean nuevoEstado) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException;
    
    //diseño
    public void calificarItem(String idTexto, int calificacion);
}
