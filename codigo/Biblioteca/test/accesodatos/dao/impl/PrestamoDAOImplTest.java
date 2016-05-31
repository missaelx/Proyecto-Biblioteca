package accesodatos.dao.impl;

import modelo.Prestamo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author missael
 */
public class PrestamoDAOImplTest {
    
    public PrestamoDAOImplTest() {
    }

    //@Test
    public void testBuscarPorIdentificador() throws Exception {
        System.out.println("buscarPorIdentificador");
        int idPrestamo = 0;
        PrestamoDAOImpl instance = new PrestamoDAOImpl();
        Prestamo expResult = null;
        Prestamo result = instance.buscarPorIdentificador(idPrestamo);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    //@Test
    public void testGetNumeroPrestamosDePrestatario() throws Exception {
        System.out.println("getNumeroPrestamosDePrestatario");
        String numeroPersonal = "";
        PrestamoDAOImpl instance = new PrestamoDAOImpl();
        int expResult = 0;
        int result = instance.getNumeroPrestamosDePrestatario(numeroPersonal);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRegistrarNuevoPrestamo() throws Exception {
        System.out.println("RegistrarNuevoPrestamo");
        int idPrestatario = 2;
        int idPersonalBibliotecario = 1;
        String idEjemplar = "EJ1-1";
        PrestamoDAOImpl instance = new PrestamoDAOImpl();
        boolean expResult = true;
        boolean result = instance.RegistrarNuevoPrestamo(idPrestatario, idPersonalBibliotecario, idEjemplar);
        assertEquals(expResult, result);
    }
    
}
