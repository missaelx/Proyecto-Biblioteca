/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:18/05/2016
Descripción: Esta clase solo modela los atributos de una pelicula
*/
package modelo;
import java.sql.Date;

public class Reporte {

	private Date fechaDeFinalizacion;
	private Date fechaDeInicio;
	private String tipo;
	private Biblioteca biblioteca;

	public Reporte(){

	}

	public void generarReporte(){

	}

    /**
     * Este método retorna un Date que indica el ultimo día que tomo registros el reporte.
     * @return the fechaDeFinalizacion
     */
    public Date getFechaDeFinalizacion() {
        return fechaDeFinalizacion;
    }

    /**
     * Este método sirve para colocar un Date que indica el ultimo día que tomo registros el reporte.
     * @param fechaDeFinalizacion the fechaDeFinalizacion to set
     */
    public void setFechaDeFinalizacion(Date fechaDeFinalizacion) {
        this.fechaDeFinalizacion = fechaDeFinalizacion;
    }

    /**
     * Este método retorna un Date que indica el primer día que tomo registros el reporte.
     * @return the fechaDeInicio
     */
    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    /**
     * Este método sirve para colocar un Date que indica el primer día que tomo registros el reporte.
     * @param fechaDeInicio the fechaDeInicio to set
     */
    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    /**
     * Este método retorna una cadena que indica el tipo de reporte que es.
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Este método sirve para colocar una cadena que indica el tipo de reporte que es.
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Este método retorna una Biblioteca que indica la biblioteca asociada al reporte.
     * @return the biblioteca
     */
    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    /**
     * Este método sirve para colocar una Biblioteca que indica la biblioteca asociada al reporte.
     * @param m_Biblioteca the biblioteca to set
     */
    public void setBiblioteca(Biblioteca m_Biblioteca) {
        this.biblioteca = m_Biblioteca;
    }

}