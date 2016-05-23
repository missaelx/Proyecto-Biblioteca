package accesodatos.dao.impl;

import java.sql.Date;
import modelo.DatosTexto;
import modelo.Ensayo;
import modelo.Libro;
import modelo.Periodico;
import modelo.Revista;
import modelo.Tesis;
import modelo.Texto;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author missael
 */
public class TextoDAOImplTest {
    
    public TextoDAOImplTest() {
    }

    @Test
    public void testBuscarPorIdentificador_Revista() throws Exception {
        System.out.println("Buscar Revista");
        String identificador = "5";
        TextoDAOImpl instance = new TextoDAOImpl();
        Revista expResult;
        
        DatosTexto datos = new DatosTexto();
        datos.setDisponibilidad(false);
        datos.setEditorial("E. UV");
        datos.setFechaPublicacion(new Date(1462165200000L));
        datos.setIdentificador(identificador);
        datos.setNombreCompletoDelAutor("Juan Carlos Perez Arriaga, Xavier Limon");
        datos.setNumeroDeEjemplares(0);
        datos.setNumeroDePaginas(43);
        
        expResult = new Revista("Revista El interesante", "12", datos);
        Revista resultado;
        Texto result = instance.buscarPorIdentificador(identificador);
        resultado = (Revista) result;
        assertEquals(expResult, resultado);
    }
    
    @Test
    public void testBuscarPorIdentificador_Libro() throws Exception {
        System.out.println("Buscar Libro");
        String identificador = "3";
        TextoDAOImpl instance = new TextoDAOImpl();
        Libro expResult;
        DatosTexto datos = new DatosTexto();
        datos.setDisponibilidad(true);
        datos.setEditorial("E. El Rey");
        datos.setFechaPublicacion(new Date(1462942800000L));
        datos.setIdentificador(identificador);
        datos.setNombreCompletoDelAutor("Xavier Limon");
        datos.setNumeroDeEjemplares(1);
        datos.setNumeroDePaginas(21);
        
        expResult = new Libro("República Dominicana", "Libro Bases de datos",datos);
        Libro resultado;
        Texto result = instance.buscarPorIdentificador(identificador);
        resultado = (Libro) result;
        assertEquals(expResult, resultado);
    }
    
    @Test
    public void testBuscarPorIdentificador_Tesis() throws Exception {
        System.out.println("Buscar Tesis");
        String identificador = "4";
        TextoDAOImpl instance = new TextoDAOImpl();
        
        Tesis expResult;
        DatosTexto datos = new DatosTexto();
        datos.setDisponibilidad(false);
        datos.setEditorial("E. El Rey");
        datos.setFechaPublicacion(new Date(1462338000000L));
        datos.setIdentificador(identificador);
        datos.setNombreCompletoDelAutor("Xavier Limon");
        datos.setNumeroDeEjemplares(0);
        datos.setNumeroDePaginas(34);
        
        expResult = new Tesis("Tesis del planeta", datos);
        Tesis resultado;
        Texto result = instance.buscarPorIdentificador(identificador);
        resultado = (Tesis) result;
        
        assertEquals(expResult, resultado);
    }
    
    @Test
    public void testBuscarPorIdentificador_Periodico() throws Exception {
        System.out.println("Buscar periodico");
        String identificador = "1";
        TextoDAOImpl instance = new TextoDAOImpl();
        
        Periodico expResult;
        DatosTexto datos = new DatosTexto();
        datos.setDisponibilidad(true);
        datos.setEditorial("E. El Rey");
        datos.setFechaPublicacion(new Date(1462770000000L));
        datos.setIdentificador("1");
        datos.setNombreCompletoDelAutor("Xavier Limon");
        datos.setNumeroDeEjemplares(2);
        datos.setNumeroDePaginas(43);
           
        expResult = new Periodico("Periodico El Rey", datos);
        Periodico resultado;
        Texto result = instance.buscarPorIdentificador(identificador);
        resultado = (Periodico) result;
        
        assertEquals(expResult, resultado);
    }

    @Test
    public void testBuscarPorIdentificador_Ensayo() throws Exception {
        System.out.println("Buscar Ensayo");
        String identificador = "2";
        TextoDAOImpl instance = new TextoDAOImpl();
        
        Ensayo expResult;
        DatosTexto datos = new DatosTexto();
        datos.setDisponibilidad(true);
        datos.setEditorial("E. UV");
        datos.setFechaPublicacion(new Date(1462165200000L));
        datos.setIdentificador(identificador);
        datos.setNombreCompletoDelAutor("Juan Carlos Perez Arriaga");
        datos.setNumeroDeEjemplares(2);
        datos.setNumeroDePaginas(50);
        
        expResult = new Ensayo("Ensayo de Felix", "Xalapa", datos);
        Ensayo resultado;
        Texto result = instance.buscarPorIdentificador(identificador);
        resultado = (Ensayo) result;
        assertEquals(expResult, resultado);
    }
    
    //@Test
    public void testEliminarPorIdenficador() throws Exception {
        System.out.println("eliminarPorIdenficador");
        String identificador = "";
        TextoDAOImpl instance = new TextoDAOImpl();
        //instance.eliminarPorIdenficador(identificador);
        fail("The test case is a prototype.");
    }

    //@Test
    public void testGuardar() throws Exception {
        System.out.println("guardar");
        Texto item = null;
        TextoDAOImpl instance = new TextoDAOImpl();
        //instance.guardar(item);
        fail("The test case is a prototype.");
    }

    //@Test
    public void testActualizar() throws Exception {
        System.out.println("actualizar");
        String identificador = "";
        Texto texto = null;
        TextoDAOImpl instance = new TextoDAOImpl();
        instance.actualizar(identificador, texto);
        fail("The test case is a prototype.");
    }

    //@Test 
    public void testBuscarPorIdentificador() throws Exception {
        System.out.println("buscarPorIdentificador");
        String identificador = "";
        TextoDAOImpl instance = new TextoDAOImpl();
        Texto expResult = null;
        Texto result = instance.buscarPorIdentificador(identificador);
        assertEquals(expResult, result);
    }
    
}
