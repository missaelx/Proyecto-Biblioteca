/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase define una excepción que se lanza cuando un prestatario quiere solicitar un prestamos cuando ya cubrio todas sus peticiones
*/

package Excepciones;

/**
 * Se lanza cuando un prestatario quiere solicitar un prestamos cuando ya cubrio todas sus peticiones
 * @author missael
 */
public class PrestatarioSinPrestamosDisponiblesException extends Exception{

    public PrestatarioSinPrestamosDisponiblesException() {
    }

    public PrestatarioSinPrestamosDisponiblesException(String message) {
        super(message);
    }
    
}
