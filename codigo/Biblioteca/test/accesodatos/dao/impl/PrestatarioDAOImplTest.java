package accesodatos.dao.impl;

import java.sql.Date;
import modelo.DatosPersona;
import modelo.Prestatario;
import modelo.TipoPrestatario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author missael
 */
public class PrestatarioDAOImplTest {
    
    public PrestatarioDAOImplTest() {
    }

    
    @Test
    public void testBuscarPorIdentificador() throws Exception {
        System.out.println("buscarPorIdentificador");
        int identificador = 2;
        PrestatarioDAOImpl instance = new PrestatarioDAOImpl();
        DatosPersona datos = new DatosPersona();
        datos.setCorreo("missaelxp@gmail.com");
        datos.setDireccion("Xalapa");
        datos.setFechaDeNacimiento(new Date(826351200000L));
        datos.setNombre("Missael Hernandez Rosado");
        datos.setTelefono("2281717935");
        
        Prestatario expResult = new Prestatario(2, "S1", TipoPrestatario.ALUMNO, 0, new Date(1472533200000L), datos);
        Prestatario result = instance.buscarPorIdentificador(identificador);
        //System.out.println(result.getFechaDeNacimiento().getTime());
        //System.out.println(result.getVigencia().getTime());
        assertEquals(expResult, result);
    }

    @Test
    public void testBuscarPorNumeroPersonal() throws Exception {
        System.out.println("BuscarPorNumeroPersonal");
        String identificador = "S1";
        PrestatarioDAOImpl instance = new PrestatarioDAOImpl();
        DatosPersona datos = new DatosPersona();
        datos.setCorreo("missaelxp@gmail.com");
        datos.setDireccion("Xalapa");
        datos.setFechaDeNacimiento(new Date(826351200000L));
        datos.setNombre("Missael Hernandez Rosado");
        datos.setTelefono("2281717935");
        
        Prestatario expResult = new Prestatario(2, "S1", TipoPrestatario.ALUMNO, 0, new Date(1472533200000L), datos);
        Prestatario result = instance.buscarPorNumeroPersonal(identificador);
        //System.out.println(result.getFechaDeNacimiento().getTime());
        //System.out.println(result.getVigencia().getTime());
        assertEquals(expResult, result);
    }

    @Test
    public void testGetIdentificadorPorNumeroPersonal() throws Exception {
        System.out.println("getIdentificadorPorNumeroPersonal");
        String numeroPersonal = "S1";
        PrestatarioDAOImpl instance = new PrestatarioDAOImpl();
        int expResult = 2;
        int result = instance.getIdentificadorPorNumeroPersonal(numeroPersonal);
        assertEquals(expResult, result);
    }
    
}
