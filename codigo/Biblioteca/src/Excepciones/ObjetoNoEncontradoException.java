/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase define una excepción que se lanza cuando se busca un registro y no se encuentra
*/

package Excepciones;

/**
 *
 * @author missael
 */
public class ObjetoNoEncontradoException extends Exception{
    
    private String criterioBusqueda;

    public ObjetoNoEncontradoException(String message, String criterioBusqueda) {
        super(message);
        this.criterioBusqueda = criterioBusqueda;
    }

    public ObjetoNoEncontradoException() {
        
    }

    public ObjetoNoEncontradoException(String message) {
        super(message);
    }
    
    

    /**
     * @return El criterioBusqueda
     */
    public String getCriterioBusqueda() {
        return criterioBusqueda;
    }
    
    
    
}
