/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase define una excepción que se lanza cuando se intenta guardar un registro de forma erronea
*/

package Excepciones;

/**
 *
 * @author missael
 */
public class ErrorAlGuardarException extends Exception{

    public ErrorAlGuardarException(String message) {
        super(message);
    }
    
}
