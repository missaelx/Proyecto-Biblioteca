/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de una donacion
*/
package modelo;

import java.sql.Date;

public class Donacion {

    private String descripcion;
    private boolean esMonetario;
    private Date fecha;
    private Donador donador;

    public Donacion(){

    }

    /**
     * Este método retorna una cadena que es una descripción de lo que contuvo la donación.
     * @return la descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Este método sirve para colocar una cadena que es una descripción de lo que contuvo la donación.
     * @param descripcion la descripcion a guardar
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Este método retorna un boolean para saber si la donación es monetaria, true es monetaria, false no lo es.
     * @return the esMonetario
     */
    public boolean isEsMonetario() {
        return esMonetario;
    }

    /**
     * Este método sirve para colocar un boolean que indica si la donación es monetaria o no.
     * @param esMonetario the esMonetario a guardar
     */
    public void setEsMonetario(boolean esMonetario) {
        this.esMonetario = esMonetario;
    }

    /**
     * Este método retorna un Date que indica la fecha en la que se generó la donación. 
     * @return la fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Este método sirve para colocar un Date que indica la fecha de la donación.
     * @param fecha la fecha a guardar
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Este método retorna un Donador el cual es el donador asociado a la donación.
     * @return el donador
     */
    public Donador getDonador() {
        return donador;
    }

    /**
     * Este método sirve para colocar un Donador que es el donador asociado.
     * @param donador el donador a guardar
     */
    public void setDonador(Donador donador) {
        this.donador = donador;
    }


}