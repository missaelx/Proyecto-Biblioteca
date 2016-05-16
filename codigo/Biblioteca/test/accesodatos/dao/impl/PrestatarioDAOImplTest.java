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
    public void testBuscarPorIdentificador_alumno() throws Exception {
        System.out.println("buscarPrestatarioPorIdentificador - Alumno");
        String identificador = "1"; //missael
        PrestatarioDAOImpl instance = new PrestatarioDAOImpl();
        Prestatario expResult = new Prestatario("1", TipoPrestatario.ALUMNO, 0, new Date(1462856400000L), "missaelxp@gmail.com", "Lejos de Xalapa", new Date(826351200000L), "Missael Hernandez", "2218717935");
        Prestatario result = instance.buscarPorIdentificador(identificador);
        assertEquals(expResult, result);
    }
    @Test
    public void testBuscarPorIdentificador_maestro() throws Exception {
        System.out.println("buscarPrestatarioPorIdentificador - Maestro");
        String identificador = "2"; //andres
        PrestatarioDAOImpl instance = new PrestatarioDAOImpl();
        Prestatario expResult = new Prestatario("2", TipoPrestatario.MAESTRO, 5, new Date(1462856400000L), "techmeza@gmail.com", "Cerca de Xalapa", new Date(766994400000L), "Andres Meza", "2128172187");
        Prestatario result = instance.buscarPorIdentificador(identificador);
        assertEquals(expResult, result);
    }
    
}
