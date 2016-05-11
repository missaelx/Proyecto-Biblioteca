package modelo;

public class Texto extends Item {

    //private String id;
    private String editorial;
    private String fechaPublicacion;
    private String nombreCompletoDelAutor;
    private int numeroDeEjemplares;
    private int numeroDePaginas;

    public Texto(String editorial, String fechaPublicacion, String nombreCompletoDelAutor, int numeroDeEjemplares, int numeroDePaginas, boolean Disponibilidad, String Identificador) {
        super(Disponibilidad, Identificador);
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.nombreCompletoDelAutor = nombreCompletoDelAutor;
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.numeroDePaginas = numeroDePaginas;
        //this.id = id;
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
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * @param fechaPublicacion the fechaPublicacion to set
     */
    public void setFechaPublicacion(String fechaPublicacion) {
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


   
}