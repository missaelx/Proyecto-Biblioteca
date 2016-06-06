/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase define una excepción que se lanza cuando se intenta recuperar un registro de la base de datos pero es inconsistente
*/

package Excepciones;

/**
 *
 * @author missael
 */
public class ObjetoSQLMalGuardadoException extends Exception{

    public ObjetoSQLMalGuardadoException() {
    }

    public ObjetoSQLMalGuardadoException(String message) {
        super(message);
    }
    
}
