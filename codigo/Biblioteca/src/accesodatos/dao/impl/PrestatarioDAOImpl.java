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

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import accesodatos.Conexion;
import accesodatos.dao.PrestatarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Prestatario;
import modelo.TipoPrestatario;

/**
 *
 * @author missael
 */
public class PrestatarioDAOImpl implements PrestatarioDAO{
    private Conexion conexion;
    private Connection connection;
    private Statement consulta;
    private ResultSet resultados;

    public PrestatarioDAOImpl() {
        conexion = new Conexion();
    }
    
    

    @Override
    public Prestatario buscarPorIdentificador(String identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException {
        Prestatario resultado = null;
        try{
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("select * from TBPrestatario where numeroPersonal = ?");
            sentencia.setString(1, identificador);
            resultados = sentencia.executeQuery();
            if(resultados.first()){
                switch (resultados.getString("tipo")) {
                    case "Alumno":
                        resultado = new Prestatario(resultados.getString("numeroPersonal"), TipoPrestatario.ALUMNO, resultados.getInt("textoPrestados"), resultados.getDate("vigencia"), resultados.getString("correo"), resultados.getString("direccion"), resultados.getDate("fechaNacimiento"), resultados.getString("nombre"), resultados.getString("telefono"));
                        break;
                    case "Maestro":
                        resultado = new Prestatario(resultados.getString("numeroPersonal"), TipoPrestatario.MAESTRO, resultados.getInt("textoPrestados"), resultados.getDate("vigencia"), resultados.getString("correo"), resultados.getString("direccion"), resultados.getDate("fechaNacimiento"), resultados.getString("nombre"), resultados.getString("telefono"));
                        break;
                    default:
                        throw new ObjetoSQLMalGuardadoException("Tipo de prestatario mal guardado");
                }
                
            } else {
                throw new ObjetoNoEncontradoException("Registros vacios", identificador);
            }
        } catch (SQLException ex) {
            throw new ObjetoSQLMalGuardadoException(ex.getMessage());
        } catch (NullPointerException ex){
            throw new ErrorConexionBaseDatosException();
        }
        
        return resultado;
    }
    
}
