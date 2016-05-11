package modelo;

public class Ensayo extends Texto {

    private String lugarDePublicacion;
    private String titulo;

    public Ensayo(String lugarDePublicacion, String titulo, String editorial, String fechaPublicacion, String nombreCompletoDelAutor, int numeroDeEjemplares, int numeroDePaginas, boolean Disponibilidad, String Identificador) {
        super(editorial, fechaPublicacion, nombreCompletoDelAutor, numeroDeEjemplares, numeroDePaginas, Disponibilidad, Identificador);
        this.lugarDePublicacion = lugarDePublicacion;
        this.titulo = titulo;
    }
    
    public Ensayo(String editorial, String fechaPublicacion, String nombreCompletoDelAutor, int numeroDeEjemplares, int numeroDePaginas, boolean Disponibilidad, String Identificador) {
        super(editorial, fechaPublicacion, nombreCompletoDelAutor, numeroDeEjemplares, numeroDePaginas, Disponibilidad, Identificador);
    }
    
    public Ensayo(){
        
    }

    /**
     * @return the lugarDePublicacion
     */
    public String getLugarDePublicacion() {
        return lugarDePublicacion;
    }

    /**
     * @param lugarDePublicacion the lugarDePublicacion to set
     */
    public void setLugarDePublicacion(String lugarDePublicacion) {
        this.lugarDePublicacion = lugarDePublicacion;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    

}