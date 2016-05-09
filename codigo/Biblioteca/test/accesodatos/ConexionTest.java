package accesodatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author missael
 */
public class ConexionTest {
    
    public ConexionTest() {
    }

    @Test
    public void testObtenerConexion() throws SQLException {
        System.out.println("obtenerConexion");
        Conexion instance = new Conexion();
        Connection result = null;
        result = instance.obtenerConexion();
        assertNotNull(result);
    }

   @Test
    public void testDesconecta() {
        System.out.println("desconecta");
        Conexion instance = new Conexion();
        instance.desconecta();
        assertNull(instance.getConexion());
    }
    
}
