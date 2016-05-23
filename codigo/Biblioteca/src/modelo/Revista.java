/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de una revista
*/

package modelo;
import java.util.Objects;

public class Revista extends Texto {

    private String nombreDeLaRevista;
    private String numeroDeRevista;

    public Revista(String nombreDeLaRevista, String numeroDeRevista, DatosTexto datos) {
        super(datos);
        this.nombreDeLaRevista = nombreDeLaRevista;
        this.numeroDeRevista = numeroDeRevista;
    }

    public Revista(DatosTexto datos) {
        super(datos);
    }
    
    public Revista(){
        
    }
    
    /**
     * @return the nombreDeLaRevista
     */
    public String getNombreDeLaRevista() {
        return nombreDeLaRevista;
    }

    /**
     * @param nombreDeLaRevista the nombreDeLaRevista to set
     */
    public void setNombreDeLaRevista(String nombreDeLaRevista) {
        this.nombreDeLaRevista = nombreDeLaRevista;
    }

    

    /**
     * @return the numeroDeRevista
     */
    public String getNumeroDeRevista() {
        return numeroDeRevista;
    }

    /**
     * @param numeroDeRevista the numeroDeRevista to set
     */
    public void setNumeroDeRevista(String numeroDeRevista) {
        this.numeroDeRevista = numeroDeRevista;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombreDeLaRevista);
        hash = 97 * hash + Objects.hashCode(this.numeroDeRevista);
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
        final Revista other = (Revista) obj;
        
        if (!Objects.equals(this.disponibilidad, other.disponibilidad)) {
            return false;
        }
        if (!Objects.equals(this.identificador, other.identificador)) {
            return false;
        }
        if (!Objects.equals(this.editorial, other.editorial)) {
            return false;
        }
        if (!Objects.equals(this.fechaPublicacion, other.fechaPublicacion)) {
            return false;
        }
        if (!Objects.equals(this.nombreCompletoDelAutor, other.nombreCompletoDelAutor)) {
            return false;
        }
        if (!Objects.equals(this.numeroDeEjemplares, other.numeroDeEjemplares)) {
            return false;
        }
        if (!Objects.equals(this.numeroDePaginas, other.numeroDePaginas)) {
            return false;
        }
        
        if (!Objects.equals(this.nombreDeLaRevista, other.nombreDeLaRevista)) {
            return false;
        }
        if (!Objects.equals(this.numeroDeRevista, other.numeroDeRevista)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Revista{" + "nombreDeLaRevista=" + nombreDeLaRevista + ", numeroDeRevista=" + numeroDeRevista + '}';
    }
    
    
    

    
}