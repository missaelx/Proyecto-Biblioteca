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

import Excepciones.ErrorActualizarException;
import Excepciones.ErrorAlEliminarException;
import Excepciones.ErrorAlGuardarException;
import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import accesodatos.Conexion;
import accesodatos.dao.TextoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Ensayo;
import modelo.Libro;
import modelo.Periodico;
import modelo.Revista;
import modelo.Tesis;
import modelo.Texto;

/**
 *
 * @author missael
 */
public class TextoDAOImpl implements TextoDAO{

    private final Conexion conexion;
    private Connection connection;
    private Statement consulta;
    private ResultSet resultados;
    
    public TextoDAOImpl() {
        conexion = new Conexion();
    }
    
    
    //buscar no se va a implementar como lista sino por identificador
    @Override
    public Texto buscarPorIdentificador(String identificador) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException {
        
        Texto resultado = null;
        try {
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("select * from TBTextos where id = ?");
            sentencia.setString(1, identificador);
            resultados = sentencia.executeQuery();
            if(resultados.first()){
                switch(resultados.getString("tipo")) {
                    case "Ensayo":
                        resultado = new Ensayo(resultados.getString("lugarDePublicacion"), resultados.getString("titulo"), resultados.getString("editorial"), resultados.getDate("fechaDePublicacion"), resultados.getString("autor"), resultados.getInt("numeroEjemplares"), resultados.getInt("numeroDePaginas"), resultados.getBoolean("disponible"), resultados.getString("id"));
                        break;
                    case "Periodico":
                        resultado = new Periodico(resultados.getString("titulo"), resultados.getString("editorial"), resultados.getDate("fechaDePublicacion"), resultados.getString("autor"), resultados.getInt("numeroEjemplares"), resultados.getInt("numeroDePaginas"), resultados.getBoolean("disponible"), resultados.getString("id"));
                        break;
                    case "Libro":
                        resultado = new Libro(resultados.getString("pais"), resultados.getString("titulo"), resultados.getString("editorial"), resultados.getDate("fechaDePublicacion"), resultados.getString("autor"), resultados.getInt("numeroEjemplares"), resultados.getInt("numeroDePaginas"), resultados.getBoolean("disponible"), resultados.getString("id"));
                        break;
                    case "Tesis":
                        resultado = new Tesis(resultados.getString("titulo"), resultados.getString("editorial"), resultados.getDate("fechaDePublicacion"), resultados.getString("autor"), resultados.getInt("numeroEjemplares"), resultados.getInt("numeroDePaginas"), resultados.getBoolean("disponible"), resultados.getString("id"));
                        break;
                    case "Revista":
                        resultado = new Revista(resultados.getString("titulo"), resultados.getString("numeroDeRevista"), resultados.getString("editorial"), resultados.getDate("fechaDePublicacion"), resultados.getString("autor"), resultados.getInt("numeroEjemplares"), resultados.getInt("numeroDePaginas"), resultados.getBoolean("disponible"), resultados.getString("id"));
                        break;
                    default:
                        throw new ObjetoSQLMalGuardadoException(); //lanza esta excepcion si no coincide con niguno de los tipos predefinidos
                }   
            } else {
                throw new ObjetoNoEncontradoException("No entro al first", identificador);
            }
        } catch (SQLException ex) {
            throw new ObjetoNoEncontradoException("Error SQL");
            //System.out.println(ex.getMessage());
        } catch (NullPointerException ex){
            throw new ErrorConexionBaseDatosException(ex.getMessage());
        }
        
        
        return resultado;
    } 
    @Override
    public void eliminarPorIdenficador(String identificador) throws ObjetoNoEncontradoException, ErrorAlEliminarException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Texto item) throws ErrorAlGuardarException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(String identificador, Texto texto) throws ErrorActualizarException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
