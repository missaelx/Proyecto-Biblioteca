/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de una tesis
*/
package modelo;

import java.sql.Date;
import java.util.Objects;

public class Tesis extends Texto {

    private String titulo;

    public Tesis(String titulo, DatosTexto datos) {
        super(datos);
        this.titulo = titulo;
    }
    
    public Tesis(DatosTexto datos){
        super(datos);
    }
    
    public Tesis(){
        
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.titulo);
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
    public Date getFechaVencimientoDesdeFecha(Date fechaPrestamo) {
        return new Date(604800000L + fechaPrestamo.getTime()); // se suman 7 dias a la fecha que se le pasa
    }
        
}