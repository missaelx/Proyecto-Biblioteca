/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de un libro
*/
package modelo;
import java.sql.Date;
import java.util.Objects;

public class Libro extends Texto {

    private String pais;
    private String titulo;

    public Libro(String pais, String titulo, DatosTexto datos) {
        super(datos);
        this.pais = pais;
        this.titulo = titulo;
    }
    
    public Libro(DatosTexto datos) {
        super(datos);
        
    }
    
    public Libro(){
        
    }

    /**
     * Este método retorna una cadena que indica el país de origen del libro.
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * Este método sirve para colocar una cadena que indica el país de origen del libro.
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Este método retorna una cadena que indica el título del libro.
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Este método sirve para colocar una cadena que indica el título del libro.
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.pais);
        hash = 97 * hash + Objects.hashCode(this.titulo);
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
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        
        if (!Objects.equals(this.numeroDePaginas, other.numeroDePaginas)) {
            return false;
        }
        if (!Objects.equals(this.numeroDeEjemplares, other.numeroDeEjemplares)) {
            return false;
        }
        if (!Objects.equals(this.nombreCompletoDelAutor, other.nombreCompletoDelAutor)) {
            return false;
        }
        if (!this.fechaPublicacion.equals(other.fechaPublicacion)) {
            return false;
        }
        if (!Objects.equals(this.editorial, other.editorial)) {
            return false;
        }
        if (!Objects.equals(this.identificador, other.identificador)) {
            return false;
        }
        if (!Objects.equals(this.disponibilidad, other.disponibilidad)) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "Libro{" + "pais=" + pais + ", titulo=" + titulo + '}';
    }
    
    @Override
    public Date getFechaVencimientoDesdeFecha(Date fechaPrestamo) {
        return new Date(604800000L + fechaPrestamo.getTime()); // se suman 7 dias a la fecha que se le pasa
    }

    
}