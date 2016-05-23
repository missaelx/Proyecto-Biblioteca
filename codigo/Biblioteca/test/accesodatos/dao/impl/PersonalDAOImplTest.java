package accesodatos.dao.impl;

import java.sql.Date;
import modelo.DatosPersona;
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
        int identificador = 1;
        PersonalDAOImpl instance = new PersonalDAOImpl();
        DatosPersona datos = new DatosPersona();
        datos.setCorreo("jperez@uv.mx");
        datos.setDireccion("Lejos");
        datos.setFechaDeNacimiento(new Date(230536800000L));
        datos.setNombre("Juan Carlos Perez");
        datos.setTelefono("238762386");
        
        Personal expResult = new Personal(1, "SS1", "Bibliotecario",datos);
        Personal result = instance.buscarPorIdentificador(identificador);
        assertEquals(expResult, result);
    }

    @Test
    public void testBuscarPorNumeroPersonal() throws Exception {
        System.out.println("buscarPorNumeroPersonal");
        String identificador = "SS2";
        PersonalDAOImpl instance = new PersonalDAOImpl();
        DatosPersona datos = new DatosPersona();
        datos.setCorreo("jocharan@uv.mx");
        datos.setDireccion("Lejos de Xalapa");
        datos.setFechaDeNacimiento(new Date(295077600000L));
        datos.setNombre("Xavier Ocharan");
        datos.setTelefono("23827387");
        Personal expResult = new Personal(2, identificador, "Administrador",datos);
        Personal result = instance.buscarPorNumeroPersonal(identificador);
        assertEquals(expResult, result);
    }
    
}
