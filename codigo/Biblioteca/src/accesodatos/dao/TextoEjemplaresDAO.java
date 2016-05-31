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
    public boolean getDisponiblidad(String idTexto);
    public int buscarEjemplaresPrestados(int idPrestatario) throws ErrorConexionBaseDatosException;
    public TextoEjemplar buscarTextoEjemplarPorIdentificador(String identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException;
    public void actualizarTextoEjemplar(TextoEjemplar ejemplar) throws ObjetoNoEncontradoException, ErrorActualizarException, ErrorConexionBaseDatosException;
    public String getTipoEjemplar(String idEjemplar) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException;
}
