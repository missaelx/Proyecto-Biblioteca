/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase implementa las funciones de su respectivo DAO, Autor.
*/

package accesodatos.dao.impl;

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import accesodatos.Conexion;
import accesodatos.dao.AutorDAO;
import accesodatos.dao.TBAutorDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author missael
 */
public class AutorDAOImpl implements AutorDAO{
    
    private final Conexion conexion;
    private Connection connection;
    private Statement consulta;
    private ResultSet resultados;
    
    public AutorDAOImpl() {
        conexion = new Conexion();
    }

    @Override
    public String buscarPorIdentificador(String identificadorTexto) throws ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException {
        String resultado = "";
        
        try {
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("select * from `textos-autores-aux` where idTexto = ?");
            sentencia.setString(1, identificadorTexto);
            resultados = sentencia.executeQuery();
            while(resultados.next()){
                if(resultados.isLast())
                    resultado += getNombreAutorFromDB(resultados.getInt("idAutor"));
                else
                    resultado += getNombreAutorFromDB(resultados.getInt("idAutor")) + ", ";
            }
            
        } catch (SQLException ex) {
            throw new ErrorConexionBaseDatosException(ex.getMessage());
        } catch (NullPointerException ex){
            throw new ErrorConexionBaseDatosException(ex.getMessage());
        } catch (ObjetoNoEncontradoException ex) {
            Logger.getLogger(AutorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado;
    }
    
    private String getNombreAutorFromDB(int idAutor) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException{
        TBAutorDAO tbautorDAO = new TBAutorDAOImpl();
        return tbautorDAO.buscarPorIdentificador(idAutor);
    }
    
    
}
