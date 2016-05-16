package modelo;
import java.sql.Date;
import java.util.Objects;

public class Revista extends Texto {

    private String nombreDeLaRevista;
    private String numeroDeRevista;

    public Revista(String nombreDeLaRevista, String numeroDeRevista, String editorial, Date fechaPublicacion, String nombreCompletoDelAutor, int numeroDeEjemplares, int numeroDePaginas, boolean Disponibilidad, String Identificador) {
        super(editorial, fechaPublicacion, nombreCompletoDelAutor, numeroDeEjemplares, numeroDePaginas, Disponibilidad, Identificador);
        this.nombreDeLaRevista = nombreDeLaRevista;
        this.numeroDeRevista = numeroDeRevista;
    }

    public Revista(String editorial, Date fechaPublicacion, String nombreCompletoDelAutor, int numeroDeEjemplares, int numeroDePaginas, boolean Disponibilidad, String Identificador) {
        super(editorial, fechaPublicacion, nombreCompletoDelAutor, numeroDeEjemplares, numeroDePaginas, Disponibilidad, Identificador);
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
        if (!Objects.equals(this.nombreDeLaRevista, other.nombreDeLaRevista)) {
            return false;
        }
        if (!Objects.equals(this.numeroDeRevista, other.numeroDeRevista)) {
            return false;
        }
        return true;
    }
    
    

    
}