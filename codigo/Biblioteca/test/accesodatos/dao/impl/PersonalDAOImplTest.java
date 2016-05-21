package accesodatos.dao.impl;

import java.sql.Date;
import modelo.Personal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author missael
 */
public class PersonalDAOImplTest {
    
    public PersonalDAOImplTest() {
    }

    @Test
    public void testBuscarPorIdentificador() throws Exception {
        System.out.println("buscarPorIdentificador_prestatario");
        String identificador = "10";
        PersonalDAOImpl instance = new PersonalDAOImpl();
        Personal expResult = new Personal("10", "elrevo@gmail.com", "Coder Dojo FEI", new Date(1462165200000L), "Juan Carlos Perez", "2281818181", "BIBLIOTECARIO");
        Personal result = instance.buscarPorIdentificador(identificador);
        assertEquals(expResult, result);
    }
    
}
