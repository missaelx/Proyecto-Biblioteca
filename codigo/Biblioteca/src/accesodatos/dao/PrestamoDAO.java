/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta interfaz define el comportamiento de acceso a la base de datos para los prestamos
*/

package accesodatos.dao;

import Excepciones.EjemplarPrestadoException;
import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import Excepciones.PrestatarioSinPrestamosDisponiblesException;
import Excepciones.RegistroMalFormadoException;
import modelo.Prestamo;

/**
 *
 * @author missael
 */
public interface PrestamoDAO {
    public Prestamo buscarPorIdentificador(int idPrestamo) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException;
    public int getNumeroPrestamosDePrestatario(String numeroPersonal) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException;
    public boolean RegistrarNuevoPrestamo(int idPrestatario, int idPersonalBibliotecario, String idEjemplar) throws RegistroMalFormadoException, ErrorConexionBaseDatosException, PrestatarioSinPrestamosDisponiblesException;
    public boolean verificarPrestatario(int idPrestatario);
    public boolean verificarBibliotecario(int idPersonalBibliotecario);
    public boolean verificarEjemplar(String idEjemplar) throws EjemplarPrestadoException;
}
