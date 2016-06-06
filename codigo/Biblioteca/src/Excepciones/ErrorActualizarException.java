/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase define una excepción que se lanza cuando se realiza alguna actualización a los registros de una base de datos de forma fallida.
*/

package Excepciones;

/**
 *
 * @author missael
 */
public class ErrorActualizarException extends Exception{

    public ErrorActualizarException(String message) {
        super(message);
    }
    
}
