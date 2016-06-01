package accesodatos.dao.impl;

import Definiciones.TiposDeTextos;
import Excepciones.ErrorActualizarException;
import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import accesodatos.Conexion;
import accesodatos.dao.AutorDAO;
import accesodatos.dao.EditorialDAO;
import accesodatos.dao.PaisDAO;
import accesodatos.dao.TextoDAO;
import accesodatos.dao.TextoEjemplaresDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.DatosTexto;
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
            sentencia = connection.prepareStatement("select * from TBTextos where idTexto = ?");
            sentencia.setString(1, identificador);
            resultados = sentencia.executeQuery();
            if(resultados.first()){
                
                DatosTexto datos = new DatosTexto();
                datos.setDisponibilidad(getDisponibilidad(identificador));
                datos.setEditorial(getEditorialFromDB(resultados.getInt("editorial")));
                datos.setFechaPublicacion(resultados.getDate("fechaDePublicacion"));
                datos.setIdentificador(identificador);
                datos.setNombreCompletoDelAutor(getAutoresFromDB(identificador));
                datos.setNumeroDeEjemplares(getNumeroEjemplares(identificador));
                datos.setNumeroDePaginas(resultados.getInt("numeroDePaginas"));
                
                
                switch(resultados.getInt("tipo")) {
                    case TiposDeTextos.ENSAYO:
                        resultado = new Ensayo(resultados.getString("lugarDePublicacion"), resultados.getString("titulo"), datos);
                        break;
                    case TiposDeTextos.PERIODICO:
                        resultado = new Periodico(resultados.getString("titulo"), datos);
                        break;
                    case TiposDeTextos.LIBRO:
                        resultado = new Libro(getPaisesFromDB(identificador), resultados.getString("titulo"), datos);
                        break;
                    case TiposDeTextos.TESIS:
                        resultado = new Tesis(resultados.getString("titulo"), datos);
                        break;
                    case TiposDeTextos.REVISTA:
                        resultado = new Revista(resultados.getString("titulo"), resultados.getString("numeroDeRevista"), datos);
                        break;
                    default:
                        throw new ObjetoSQLMalGuardadoException(); //lanza esta excepcion si no coincide con niguno de los tipos predefinidos
                }   
            } else {
                throw new ObjetoNoEncontradoException("No entro al first", identificador);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            throw new ObjetoNoEncontradoException("Error SQL");
        } catch (NullPointerException ex){
            throw new ErrorConexionBaseDatosException(ex.getMessage());
        }
        
        
        return resultado;
    } 

    @Override
    public void actualizar(String identificador, Texto texto) throws ErrorActualizarException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String getEditorialFromDB(int identificador) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException, ObjetoSQLMalGuardadoException{
        EditorialDAO editorialDAO = new EditorialDAOImpl();
        return editorialDAO.buscarPorIdentificador(identificador);
    }
    
    private String getAutoresFromDB(String idTexto){
        AutorDAO autorDAO = new AutorDAOImpl();
        try {
            return autorDAO.buscarPorIdentificador(idTexto);
        } catch (ObjetoSQLMalGuardadoException | ErrorConexionBaseDatosException ex) {
            return "";
        }
    }
    
    private String getPaisesFromDB(String idTexto){
        PaisDAO paisDAO = new PaisDAOImpl();
        try {
            return paisDAO.buscarPorIdentificador(idTexto);
        } catch (ObjetoSQLMalGuardadoException | ErrorConexionBaseDatosException ex) {
            return "";
        }
    }
    
    private int getNumeroEjemplares(String idTexto){
        TextoEjemplaresDAO ejemplaresDAO = new TextoEjemplaresDAOImpl();
        return ejemplaresDAO.getNumeroDeEjemplares(idTexto);
    }
    
    private boolean getDisponibilidad(String idTexto){
        int resultado = 0;
        
        try {
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("SELECT count(*) FROM mydb.TBTextoEjemplares where idtexto = ? and disponible = 1");
            sentencia.setString(1, idTexto);
            resultados = sentencia.executeQuery();
            resultados.first();
            resultado = resultados.getInt(1);
        } catch (SQLException ex) { 
            System.out.println(ex.getMessage());
        }
        
        return resultado > 0;
    }

    @Override
    public String getTipoTextoPorIdentificador(String identificador) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException{
        String resultado = "";
        
        try {
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("select nombre from tbtipostextos inner join tbtextos on tbtipostextos.idtipo = tbtextos.tipo where idtexto = ?");
            sentencia.setString(1, identificador);
            resultados = sentencia.executeQuery();
            if(resultados.first()) {
                resultado = resultados.getString("nombre");
            } else {
                throw new ObjetoNoEncontradoException();
            }
            
        } catch (SQLException | NullPointerException ex) { 
            System.out.println(ex.getMessage());
            throw new ErrorConexionBaseDatosException();
        }
        
        return resultado;
    }
}
