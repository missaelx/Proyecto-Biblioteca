/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de un texto, especificamente su descripcion, mas no representa un ejemplar
*/
package modelo;

import java.sql.Date;
import java.util.Objects;


public class Texto extends Item {

    
    protected String editorial;
    protected Date fechaPublicacion;
    protected String nombreCompletoDelAutor;
    protected int numeroDeEjemplares;
    protected int numeroDePaginas;

    public Texto(DatosTexto datos) {
        super(datos.getDisponibilidad(), datos.getIdentificador());
        this.editorial = datos.getEditorial();
        this.fechaPublicacion = datos.getFechaPublicacion();
        this.nombreCompletoDelAutor = datos.getNombreCompletoDelAutor();
        this.numeroDeEjemplares = datos.getNumeroDeEjemplares();
        this.numeroDePaginas = datos.getNumeroDePaginas();
    }
    
    public Texto(boolean disponibilidad, String identificador){
        super(disponibilidad, identificador);
    }
    
    public Texto(){
        
    }
    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the fechaPublicacion
     */
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * @param fechaPublicacion the fechaPublicacion to set
     */
    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    /**
     * @return the nombreCompletoDelAutor
     */
    public String getNombreCompletoDelAutor() {
        return nombreCompletoDelAutor;
    }

    /**
     * @param nombreCompletoDelAutor the nombreCompletoDelAutor to set
     */
    public void setNombreCompletoDelAutor(String nombreCompletoDelAutor) {
        this.nombreCompletoDelAutor = nombreCompletoDelAutor;
    }

    /**
     * @return the numeroDeEjemplares
     */
    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    /**
     * @param numeroDeEjemplares the numeroDeEjemplares to set
     */
    public void setNumeroDeEjemplares(int numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    /**
     * @return the numeroDePaginas
     */
    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    /**
     * @param numeroDePaginas the numeroDePaginas to set
     */
    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.editorial);
        hash = 71 * hash + Objects.hashCode(this.fechaPublicacion);
        hash = 71 * hash + Objects.hashCode(this.nombreCompletoDelAutor);
        hash = 71 * hash + this.numeroDeEjemplares;
        hash = 71 * hash + this.numeroDePaginas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Texto other = (Texto) obj;
        if (this.numeroDeEjemplares != other.numeroDeEjemplares) {
            return false;
        }
        if (this.numeroDePaginas != other.numeroDePaginas) {
            return false;
        }
        if (!Objects.equals(this.editorial, other.editorial)) {
            return false;
        }
        if (!Objects.equals(this.nombreCompletoDelAutor, other.nombreCompletoDelAutor)) {
            return false;
        }
        if (!Objects.equals(this.fechaPublicacion, other.fechaPublicacion)) {
            return false;
        }
        return true;
    }

    
   
}