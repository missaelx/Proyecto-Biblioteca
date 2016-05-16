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
package accesodatos.dao;

import Excepciones.ErrorActualizarException;
import Excepciones.ErrorAlEliminarException;
import Excepciones.ErrorAlGuardarException;
import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import java.util.List;
import modelo.Texto;


/**
 *
 * @author missael
 */
public interface TextoDAO {
    public Texto buscarPorIdentificador(String identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException;
    public void eliminarPorIdenficador(String identificador) throws ObjetoNoEncontradoException, ErrorAlEliminarException;
    public void guardar(Texto item) throws ErrorAlGuardarException;
    public void actualizar(String identificador, Texto texto) throws ErrorActualizarException;
}