/*
 * Copyright (C) 2016 missael
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package accesodatos.dao.impl;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
        String identificador = "1";
        TextoDAOImpl instance = new TextoDAOImpl();
        Revista expResult;
        expResult = new Revista("Playboy", "5", "Jeft", new Date(2016,5,3), "Missael", 10, 54, true , "1");
        Revista resultado;
        Texto result = instance.buscarPorIdentificador(identificador);
        resultado = (Revista) result;
        assertEquals(expResult, resultado);
    }
    
    @Test
    public void testBuscarPorIdentificador_Libro() throws Exception {
        System.out.println("Buscar Libro");
        String identificador = "2";
        TextoDAOImpl instance = new TextoDAOImpl();
        Libro expResult;
        
        expResult = new Libro("Estados Unidos", "UML in color", "Trillas", new Date(1463547600000L), "Color", 2, 390, true , "2");
        Libro resultado;
        Texto result = instance.buscarPorIdentificador(identificador);
        resultado = (Libro) result;
        
        assertEquals(expResult, resultado);
    }
    
    @Test
    public void testBuscarPorIdentificador_Tesis() throws Exception {
        System.out.println("Buscar Tesis");
        String identificador = "3";
        TextoDAOImpl instance = new TextoDAOImpl();
        
        Tesis expResult;
        
        expResult = new Tesis("Missaelitos en el ambiente", "Missael", new Date(1462251600000L), "Missael Hernandez Rosado", 5, 132, true , "3");
        Tesis resultado;
        Texto result = instance.buscarPorIdentificador(identificador);
        resultado = (Tesis) result;
        
        assertEquals(expResult, resultado);
    }
    
    @Test
    public void testBuscarPorIdentificador_Periodico() throws Exception {
        System.out.println("Buscar periodico");
        String identificador = "4";
        TextoDAOImpl instance = new TextoDAOImpl();
        
        Periodico expResult;
        
        expResult = new Periodico("AZ", "Salamanca", new Date(1462078800000L), "Missael", 1, 42, true , "4");
        Periodico resultado;
        Texto result = instance.buscarPorIdentificador(identificador);
        resultado = (Periodico) result;
        
        assertEquals(expResult, resultado);
    }

    @Test
    public void testBuscarPorIdentificador_Ensayo() throws Exception {
        System.out.println("Buscar Ensayo");
        String identificador = "5";
        TextoDAOImpl instance = new TextoDAOImpl();
        
        Ensayo expResult;
        
        expResult = new Ensayo("Xalapa", "El poder", "UV" ,new Date(1462165200000L), "Missael", 2, 20, true , "5");
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
        instance.eliminarPorIdenficador(identificador);
        fail("The test case is a prototype.");
    }

    //@Test
    public void testGuardar() throws Exception {
        System.out.println("guardar");
        Texto item = null;
        TextoDAOImpl instance = new TextoDAOImpl();
        instance.guardar(item);
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
