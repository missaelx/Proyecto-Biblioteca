package modelo;

public class Periodicos extends Texto {

    private int nombrePeriodico;

    public Periodicos(int nombrePeriodico, String editorial, String fechaPublicacion, String nombreCompletoDelAutor, int numeroDeEjemplares, int numeroDePaginas, Autor m_Autor, boolean Disponibilidad, String Identificador) {
        super(editorial, fechaPublicacion, nombreCompletoDelAutor, numeroDeEjemplares, numeroDePaginas, m_Autor, Disponibilidad, Identificador);
        this.nombrePeriodico = nombrePeriodico;
    }

    /**
     * @return the nombrePeriodico
     */
    public int getNombrePeriodico() {
        return nombrePeriodico;
    }

    /**
     * @param nombrePeriodico the nombrePeriodico to set
     */
    public void setNombrePeriodico(int nombrePeriodico) {
        this.nombrePeriodico = nombrePeriodico;
    }
    
    
    
}