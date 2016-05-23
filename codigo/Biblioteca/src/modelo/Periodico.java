/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de un periodico
*/

package modelo;

import java.sql.Date;

public class Periodico extends Texto {
    
    private String nombrePeriodico;

    public Periodico(String nombrePeriodico,DatosTexto datos) {
        super(datos);
        this.nombrePeriodico = nombrePeriodico;
    }
    
    public Periodico(DatosTexto datos) {
        super(datos);
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