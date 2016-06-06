/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase define una excepción que se lanza cuando se intenta eliminar un registro de la base de datos de forma erronea
*/
package Excepciones;

/**
 *
 * @author missael
 */
public class ErrorAlEliminarException extends Exception{

    public ErrorAlEliminarException(String message) {
        super(message);
    }
    
}
