/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de una pelicula
*/
package modelo;

import java.sql.Date;

public class Pelicula extends Multimedia {

    private Date anio;
    private String director;
    private boolean pais;

    public Pelicula(Date anio, String director, boolean pais, String nombre, boolean disponibilidad, String identificador) {
        super(nombre, disponibilidad, identificador);
        this.anio = anio;
        this.director = director;
        this.pais = pais;
    }

    /**
     * @return the anio
     */
    public Date getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(Date anio) {
        this.anio = anio;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * @return the pais
     */
    public boolean getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(boolean pais) {
        this.pais = pais;
    }

    

}