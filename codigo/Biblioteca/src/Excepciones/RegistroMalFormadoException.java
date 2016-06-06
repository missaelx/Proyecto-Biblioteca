/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase define una excepción que se lanza cuando se intenta insertar un registro pero los datos son inconsistentes.
*/


package Excepciones;

/**
 *
 * @author missael
 */
public class RegistroMalFormadoException extends Exception{

    public RegistroMalFormadoException() {
    }

    public RegistroMalFormadoException(String message) {
        super(message);
    }
    
}
