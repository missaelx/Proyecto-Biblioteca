package accesodatos.dao.impl;

import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import accesodatos.Conexion;
import accesodatos.dao.PaisDAO;
import accesodatos.dao.TBAutorDAO;
import accesodatos.dao.TBPaisDAO;
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
public class PaisDAOImpl implements PaisDAO{
    
    private final Conexion conexion;
    private Connection connection;
    private Statement consulta;
    private ResultSet resultados;
    
    public PaisDAOImpl() {
        conexion = new Conexion();
    }

    @Override
    public String buscarPorIdentificador(String identificadorTexto) throws ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException {
        String resultado = "";
        
        try {
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("select * from `textos-paises-aux` where idTexto = ?");
            sentencia.setString(1, identificadorTexto);
            resultados = sentencia.executeQuery();
            while(resultados.next()){
                if(resultados.isLast())
                    resultado += getNombrePaisFromDB(resultados.getInt("idPais"));
                else
                    resultado += getNombrePaisFromDB(resultados.getInt("idPais")) + ", ";
            }
            
        } catch (SQLException | NullPointerException | ObjetoNoEncontradoException ex) {
            throw new ErrorConexionBaseDatosException(ex.getMessage());
        }
        
        return resultado;
    }
    
    private String getNombrePaisFromDB(int idPais) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException{
        TBPaisDAO tbPaisDAO = new TBPaisDAOImpl();
        return tbPaisDAO.buscarPorIdentificador(idPais);
    }
    
}
