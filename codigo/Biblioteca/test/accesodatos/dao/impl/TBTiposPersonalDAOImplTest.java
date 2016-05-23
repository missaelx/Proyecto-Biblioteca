package accesodatos.dao.impl;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author missael
 */
public class TBTiposPersonalDAOImplTest {
    
    public TBTiposPersonalDAOImplTest() {
    }

    @Test
    public void testBuscarPorIdentificador() throws Exception {
        System.out.println("buscarPorIdentificador");
        int idTipoPersonal = 1;
        TBTiposPersonalDAOImpl instance = new TBTiposPersonalDAOImpl();
        String expResult = "Bibliotecario";
        String result = instance.buscarPorIdentificador(idTipoPersonal);
        assertEquals(expResult, result);
    }
    
}
