package accesodatos.dao.impl;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author missael
 */
public class EditorialDAOImplTest {
    
    public EditorialDAOImplTest() {
    }

    @Test
    public void testBuscarPorIdentificador() throws Exception {
        System.out.println("buscarPorIdentificador-editorial");
        int identificador = 1;
        EditorialDAOImpl instance = new EditorialDAOImpl();
        String expResult = "E. El Rey";
        String result = instance.buscarPorIdentificador(identificador);
        assertEquals(expResult, result);
    }
    
}
