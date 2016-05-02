package pruebas;

import java.io.Serializable;

/**
 *
 * @author missael
 */
public interface GenericDAO <T, K extends Serializable> {
    public T buscaPorId(int id);
    public boolean guarda(T instancia);
    public K eliminaPorId(int id);
    
}
