package accesodatos.dao.impl;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author missael
 */
public class TBPaisDAOImplTest {
    
    public TBPaisDAOImplTest() {
    }

    @Test
    public void testBuscarPorIdentificador() throws Exception {
        System.out.println("buscar pais Por Identificador");
        int identificador = 1;
        TBPaisDAOImpl instance = new TBPaisDAOImpl();
        String expResult = "Afganistán";
        String result = instance.buscarPorIdentificador(identificador);
        assertEquals(expResult, result);
    }
    
}
