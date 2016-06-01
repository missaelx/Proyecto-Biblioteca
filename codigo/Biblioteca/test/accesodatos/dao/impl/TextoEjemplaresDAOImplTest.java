package accesodatos.dao.impl;

import modelo.TextoEjemplar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author missael
 */
public class TextoEjemplaresDAOImplTest {
    
    public TextoEjemplaresDAOImplTest() {
    }

    @Test
    public void testGetNumeroDeEjemplares() {
        System.out.println("getNumeroDeEjemplares");
        String idTexto = "1";
        TextoEjemplaresDAOImpl instance = new TextoEjemplaresDAOImpl();
        int expResult = 2;
        int result = instance.getNumeroDeEjemplares(idTexto);
        assertEquals(expResult, result);
    }

    //@Test
    public void testBuscarTextoEjemplarPorIdentificador() throws Exception {
        System.out.println("buscarTextoEjemplarPorIdentificador");
        String identificador = "";
        TextoEjemplaresDAOImpl instance = new TextoEjemplaresDAOImpl();
        TextoEjemplar expResult = null;
        TextoEjemplar result = instance.buscarTextoEjemplarPorIdentificador(identificador);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    //@Test
    public void testActualizarTextoEjemplar() throws Exception {
        System.out.println("actualizarTextoEjemplar");
        TextoEjemplar ejemplar = null;
        TextoEjemplaresDAOImpl instance = new TextoEjemplaresDAOImpl();
        instance.actualizarTextoEjemplar(ejemplar);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDisponiblidad() {
        System.out.println("getDisponiblidad");
        String idTexto = "EJ1-1";
        TextoEjemplaresDAOImpl instance = new TextoEjemplaresDAOImpl();
        boolean expResult = false;
        boolean result = instance.getDisponiblidad(idTexto);
        assertEquals(expResult, result);
    }

    //@Test
    public void testBuscarEjemplaresPrestados() throws Exception {
        System.out.println("buscarEjemplaresPrestados");
        int idPrestatario = 0;
        TextoEjemplaresDAOImpl instance = new TextoEjemplaresDAOImpl();
        int expResult = 0;
        int result = instance.buscarEjemplaresPrestados(idPrestatario);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTipoEjemplar() throws Exception {
        System.out.println("getTipoEjemplar");
        String idEjemplar = "EJ1-1";
        TextoEjemplaresDAOImpl instance = new TextoEjemplaresDAOImpl();
        String expResult = "Periodico";
        String result = instance.getTipoEjemplar(idEjemplar);
        assertEquals(expResult, result);
    }
    
}
