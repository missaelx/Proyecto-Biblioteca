/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase define una excepción que se lanza cuando se intenta prestar un ejemplar que ya esta prestado
*/

package Excepciones;

/**
 *
 * @author missael
 */
public class EjemplarPrestadoException extends Exception{

    public EjemplarPrestadoException() {
    }

    public EjemplarPrestadoException(String message) {
        super(message);
    }
    
}
