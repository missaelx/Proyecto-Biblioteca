package accesodatos.dao.impl;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author missael
 */
public class AutorDAOImplTest {
    
    public AutorDAOImplTest() {
    }

    @Test
    public void testBuscarPorIdentificador() throws Exception {
        System.out.println("buscar autores Por Identificador de texto");
        String identificadorTexto = "1";
        AutorDAOImpl instance = new AutorDAOImpl();
        String expResult = "Xavier Limon";
        String result = instance.buscarPorIdentificador(identificadorTexto);
        assertEquals(expResult, result);
    }
    
}
