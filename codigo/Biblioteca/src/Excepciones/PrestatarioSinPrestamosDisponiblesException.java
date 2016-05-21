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
