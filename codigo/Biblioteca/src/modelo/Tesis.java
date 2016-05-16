package modelo;

import java.sql.Date;
import java.util.Objects;

public class Tesis extends Texto {

    private String Titulo;

    public Tesis(String Titulo, String editorial, Date fechaPublicacion, String nombreCompletoDelAutor, int numeroDeEjemplares, int numeroDePaginas, boolean Disponibilidad, String Identificador) {
        super(editorial, fechaPublicacion, nombreCompletoDelAutor, numeroDeEjemplares, numeroDePaginas, Disponibilidad, Identificador);
        this.Titulo = Titulo;
    }
    
    public Tesis(String editorial, Date fechaPublicacion, String nombreCompletoDelAutor, int numeroDeEjemplares, int numeroDePaginas, boolean Disponibilidad, String Identificador){
        super(editorial, fechaPublicacion, nombreCompletoDelAutor, numeroDeEjemplares, numeroDePaginas, Disponibilidad, Identificador);
    }
    
    public Tesis(){
        
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.Titulo);
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
        final Tesis other = (Tesis) obj;
        if (!Objects.equals(this.Titulo, other.Titulo)) {
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
    
    
        
}