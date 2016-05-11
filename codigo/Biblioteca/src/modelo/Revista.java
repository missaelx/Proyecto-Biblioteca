package modelo;

public class Revista extends Texto {

    private String nombreDeLaRevista;
    private String numeroDeRevista;

    public Revista(String nombreDeLaRevista, String numeroDeRevista, String editorial, String fechaPublicacion, String nombreCompletoDelAutor, int numeroDeEjemplares, int numeroDePaginas, boolean Disponibilidad, String Identificador) {
        super(editorial, fechaPublicacion, nombreCompletoDelAutor, numeroDeEjemplares, numeroDePaginas, Disponibilidad, Identificador);
        this.nombreDeLaRevista = nombreDeLaRevista;
        this.numeroDeRevista = numeroDeRevista;
    }

    public Revista(String editorial, String fechaPublicacion, String nombreCompletoDelAutor, int numeroDeEjemplares, int numeroDePaginas, boolean Disponibilidad, String Identificador) {
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

    
}