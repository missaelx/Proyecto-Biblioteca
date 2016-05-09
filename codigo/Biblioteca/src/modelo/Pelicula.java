package modelo;

import java.sql.Date;

public class Pelicula extends Multimedia {

    private Date anio;
    private String director;
    private boolean pais;

    public Pelicula(Date anio, String director, boolean pais, String Nombre, boolean Disponibilidad, String Identificador) {
        super(Nombre, Disponibilidad, Identificador);
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
    public boolean isPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(boolean pais) {
        this.pais = pais;
    }

    

}