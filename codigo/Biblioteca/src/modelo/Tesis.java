package modelo;

public class Tesis extends Texto {

    private String Titulo;

    public Tesis(String Titulo, String editorial, String fechaPublicacion, String nombreCompletoDelAutor, int numeroDeEjemplares, int numeroDePaginas, Autor m_Autor, boolean Disponibilidad, String Identificador) {
        super(editorial, fechaPublicacion, nombreCompletoDelAutor, numeroDeEjemplares, numeroDePaginas, m_Autor, Disponibilidad, Identificador);
        this.Titulo = Titulo;
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
    
    
        
}