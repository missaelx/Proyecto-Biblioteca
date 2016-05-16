package modelo;

import java.sql.Date;

public class Periodico extends Texto {

    private String nombrePeriodico;

    public Periodico(String nombrePeriodico, String editorial, Date fechaPublicacion, String nombreCompletoDelAutor, int numeroDeEjemplares, int numeroDePaginas, boolean Disponibilidad, String Identificador) {
        super(editorial, fechaPublicacion, nombreCompletoDelAutor, numeroDeEjemplares, numeroDePaginas, Disponibilidad, Identificador);
        this.nombrePeriodico = nombrePeriodico;
    }
    
    public Periodico(String editorial, Date fechaPublicacion, String nombreCompletoDelAutor, int numeroDeEjemplares, int numeroDePaginas, boolean Disponibilidad, String Identificador) {
        super(editorial, fechaPublicacion, nombreCompletoDelAutor, numeroDeEjemplares, numeroDePaginas, Disponibilidad, Identificador);
    }

    public Periodico(){
        
    }
    /**
     * @return the nombrePeriodico
     */
    public String getNombrePeriodico() {
        return nombrePeriodico;
    }

    /**
     * @param nombrePeriodico the nombrePeriodico to set
     */
    public void setNombrePeriodico(String nombrePeriodico) {
        this.nombrePeriodico = nombrePeriodico;
    }
    
    
    
}