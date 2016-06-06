/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase define una excepción que se lanza cuando existe un error en la conexion a la base de datos
*/

package Excepciones;

/**
 *
 * @author missael
 */
public class ErrorConexionBaseDatosException extends Exception{

    public ErrorConexionBaseDatosException() {
    }

    public ErrorConexionBaseDatosException(String message) {
        super(message);
    }
    
    
}
