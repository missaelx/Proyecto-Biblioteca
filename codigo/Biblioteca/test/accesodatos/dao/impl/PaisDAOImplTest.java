package accesodatos.dao.impl;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author missael
 */
public class PaisDAOImplTest {
    
    public PaisDAOImplTest() {
    }

    @Test
    public void testBuscarPorIdentificador() throws Exception {
        System.out.println("buscarnombre de paises Por Identificador del texto");
        String identificadorTexto = "1";
        PaisDAOImpl instance = new PaisDAOImpl();
        String expResult = "Angola";
        String result = instance.buscarPorIdentificador(identificadorTexto);
        assertEquals(expResult, result);
    }
    
}
