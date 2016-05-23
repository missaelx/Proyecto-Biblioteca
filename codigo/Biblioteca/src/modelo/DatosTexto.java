/*
Autor:Missael Hernandez Rosado
Fecha de creación: 22/05/2016
Fecha de Modificación: 22/05/2016
Descripción: Esta clase encapsula todos los campos de informacion para ser pasado a un objeto de tipo texto
*/
package modelo;

import java.sql.Date;

/**
 *
 * @author missael
 */
public class DatosTexto {
    private boolean disponibilidad;
    private String identificador;
    private String editorial;
    private Date fechaPublicacion;
    private String nombreCompletoDelAutor;
    private int numeroDeEjemplares;
    private int numeroDePaginas;

    /**
     * @return La disponibilidad del texto, responde a: esta prestado?
     */
    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    /**
     * @param disponibilidad la disponibilidad a guardar
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * @return el identificador unico del texto
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador el identificador a guardar
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * @return La casa editorial del texto
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial La editorial a guardar
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return La fechaPublicacion del texto
     */
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * @param fechaPublicacion the fechaPublicacion a guardar
     */
    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    /**
     * @return El nombreCompletoDelAutor
     */
    public String getNombreCompletoDelAutor() {
        return nombreCompletoDelAutor;
    }

    /**
     * @param nombreCompletoDelAutor el nombre completo del autor a guardar
     */
    public void setNombreCompletoDelAutor(String nombreCompletoDelAutor) {
        this.nombreCompletoDelAutor = nombreCompletoDelAutor;
    }

    /**
     * @return El numero de ejemplares
     */
    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    /**
     * @param numeroDeEjemplares el numero de ejemplares a guardar
     */
    public void setNumeroDeEjemplares(int numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    /**
     * @return El numero de paginas
     */
    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    /**
     * @param numeroDePaginas el numero de paginas a guardar
     */
    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
    
    
}
