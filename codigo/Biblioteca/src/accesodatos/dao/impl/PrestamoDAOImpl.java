/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase implementa las funciones de su respectivo DAO, Prestamo.
*/

package accesodatos.dao.impl;

import Excepciones.EjemplarPrestadoException;
import Excepciones.ErrorConexionBaseDatosException;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoSQLMalGuardadoException;
import Excepciones.PrestatarioSinPrestamosDisponiblesException;
import Excepciones.RegistroMalFormadoException;
import accesodatos.Conexion;
import accesodatos.dao.PersonalDAO;
import accesodatos.dao.PrestamoDAO;
import accesodatos.dao.PrestatarioDAO;
import accesodatos.dao.TextoEjemplaresDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Ensayo;
import modelo.Libro;
import modelo.Periodico;
import modelo.Prestamo;
import modelo.Prestatario;
import modelo.Revista;
import modelo.Tesis;

/**
 *
 * @author missael
 */
public class PrestamoDAOImpl implements PrestamoDAO{
    
    private Conexion conexion;
    private Connection connection;
    private PreparedStatement consulta;
    private ResultSet resultados;

    public PrestamoDAOImpl() {
        conexion = new Conexion();
    }

    @Override
    public Prestamo buscarPorIdentificador(int idPrestamo) throws ObjetoNoEncontradoException, ObjetoSQLMalGuardadoException, ErrorConexionBaseDatosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumeroPrestamosDePrestatario(String numeroPersonal) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException {
        int resultado = 0;
        int idPrestatario = getIdPrestatario(numeroPersonal);
        
        try {
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("SELECT count(*) FROM mydb.TBPrestamos where idPrestatario = ? and fechaEntrega is null;");
            sentencia.setInt(1, idPrestatario);
            resultados = sentencia.executeQuery();
            resultados.first();
            resultado = resultados.getInt(1);
        } catch (SQLException ex) { 
            System.out.println(ex.getMessage());
        }
        
        return resultado;
    }

    @Override
    public boolean RegistrarNuevoPrestamo(int idPrestatario, int idPersonalBibliotecario, String idEjemplar) throws RegistroMalFormadoException, ErrorConexionBaseDatosException, PrestatarioSinPrestamosDisponiblesException {
        if(!verificarBibliotecario(idPersonalBibliotecario)) {
            throw new RegistroMalFormadoException("Bibliotecario incorrecto");
        }
        try {
            if(!verificarEjemplar(idEjemplar)){
                throw new RegistroMalFormadoException("Identificador de ejemplar incorrecto");
            }
        } catch (EjemplarPrestadoException ex) {
            throw new RegistroMalFormadoException("El ejemplar ha sido prestado previamente y no se ha registrado su devolución");
        }
        if(!verificarPrestatario(idPrestatario)){
            throw new RegistroMalFormadoException("Identificador de prestatario incorrecto");
        }
        
        boolean resultado = false;
        
        try {
            connection = conexion.obtenerConexion();
            PreparedStatement sentencia;
            sentencia = connection.prepareStatement("insert into TBPrestamos (fechaVencimiento, fechaSolicitudPrestamo, idPersonal, idPrestatario, idEjemplarTexto) values (?, ?, ?, ?, ?)");
            
            //verificamos el tipo de ejemplar para calcular la fecha de vencimiento
            String tipo = getTipoEjemplar(idEjemplar);
            Date vencimiento = null;
            switch(tipo) {
                case "Periodico":
                    vencimiento = new Periodico().getFechaVencimientoDesdeFecha(new Date(System.currentTimeMillis()));
                    break;
                case "Ensayo":
                    vencimiento = new Ensayo().getFechaVencimientoDesdeFecha(new Date(System.currentTimeMillis()));
                    break;
                case "Libro":
                    vencimiento = new Libro().getFechaVencimientoDesdeFecha(new Date(System.currentTimeMillis()));
                    break;
                case "Tesis":
                    vencimiento = new Tesis().getFechaVencimientoDesdeFecha(new Date(System.currentTimeMillis()));
                    break;
                case "Revista":
                    vencimiento = new Revista().getFechaVencimientoDesdeFecha(new Date(System.currentTimeMillis()));
                    break;
                default:
                    throw new RegistroMalFormadoException("El ejemplar tiene un tipo desconocido");
            }
            
            sentencia.setDate(1, vencimiento);
            sentencia.setDate(2, new Date(System.currentTimeMillis()));
            sentencia.setInt(3, idPersonalBibliotecario);
            sentencia.setInt(4, idPrestatario);
            sentencia.setString(5, idEjemplar);
            
            resultado = sentencia.executeUpdate() > 0; // preguntamos si las filas afectadas fueron mas de 0
            
            //modificamos la disponibilidad del ejemplar
            TextoEjemplaresDAO ejemplaresDAO = new TextoEjemplaresDAOImpl();
            ejemplaresDAO.actualizarDisponibilidadEjemplar(idEjemplar, false);
            
        } catch (SQLException | NullPointerException ex) {
            throw new ErrorConexionBaseDatosException(ex.getMessage());
        } catch (ObjetoNoEncontradoException ex) {
            throw new RegistroMalFormadoException();
        }
        
        return resultado;
    }
    
    
    
    
    private int getIdPrestatario(String numeroPersonal) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException{
        PrestatarioDAO prestatarioDAO = new PrestatarioDAOImpl();
        return prestatarioDAO.getIdentificadorPorNumeroPersonal(numeroPersonal);
    }
    
    private String getTipoEjemplar(String idEjemplar) throws ObjetoNoEncontradoException, ErrorConexionBaseDatosException{
        TextoEjemplaresDAO txtEjemplaresDAO = new TextoEjemplaresDAOImpl();
        return txtEjemplaresDAO.getTipoEjemplar(idEjemplar);
    }
    
    
    //verificaciones
    @Override
    public boolean verificarPrestatario(int idPrestatario){
        boolean prestatarioValido;
        PrestatarioDAO prestatarioDAO = new PrestatarioDAOImpl();
        try {
            Prestatario prestatario = prestatarioDAO.buscarPorIdentificador(idPrestatario);
            prestatarioValido = prestatario.tienesPrestamosDisponibles();
        } catch (ObjetoNoEncontradoException | ObjetoSQLMalGuardadoException | ErrorConexionBaseDatosException | NullPointerException ex) {
            prestatarioValido = false;
        }
        return prestatarioValido;
    }
    
    @Override
    public boolean verificarBibliotecario(int idPersonalBibliotecario){
        boolean bibliotecarioValido;
        try {
            PersonalDAO personal = new PersonalDAOImpl();
            bibliotecarioValido = personal.buscarPorIdentificador(idPersonalBibliotecario) != null;
        } catch (ObjetoNoEncontradoException | ObjetoSQLMalGuardadoException | ErrorConexionBaseDatosException ex) {
            bibliotecarioValido =  false;
        }
        return bibliotecarioValido;
    }
    
    @Override
    public boolean verificarEjemplar(String idEjemplar) throws EjemplarPrestadoException{
        boolean ejemplarValido;
        TextoEjemplaresDAO ejemplaresDAO = new TextoEjemplaresDAOImpl();
        try {
            ejemplarValido = ejemplaresDAO.getDisponiblidad(idEjemplar);
            if(!ejemplarValido){
                throw new EjemplarPrestadoException();
            }
        } catch (ObjetoNoEncontradoException ex) {
            ejemplarValido = false;
        }
        return ejemplarValido;
    }

}
