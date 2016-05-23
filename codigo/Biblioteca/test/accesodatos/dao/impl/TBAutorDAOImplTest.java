package accesodatos.dao.impl;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author missael
 */
public class TBAutorDAOImplTest {
    
    public TBAutorDAOImplTest() {
    }

    @Test
    public void testBuscarAutorPorIdentificador() throws Exception {
        System.out.println("buscarAutorPorIdentificador");
        int identificador = 1;
        TBAutorDAOImpl instance = new TBAutorDAOImpl();
        String expResult = "Xavier Limon";
        String result = instance.buscarPorIdentificador(identificador);
        assertEquals(expResult, result);
    }
    
}
