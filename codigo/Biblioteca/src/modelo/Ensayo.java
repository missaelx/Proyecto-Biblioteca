/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de un ensayo
*/
package modelo;

import java.sql.Date;

public class Ensayo extends Texto {

    private String lugarDePublicacion;
    private String titulo;
//modelo info
    public Ensayo(String lugarDePublicacion, String titulo, String editorial, Date fechaPublicacion, String nombreCompletoDelAutor, int numeroDeEjemplares, int numeroDePaginas, boolean Disponibilidad, String Identificador) {
        super(editorial, fechaPublicacion, nombreCompletoDelAutor, numeroDeEjemplares, numeroDePaginas, Disponibilidad, Identificador);
        this.lugarDePublicacion = lugarDePublicacion;
        this.titulo = titulo;
    }

    public Ensayo(String editorial, Date fechaPublicacion, String nombreCompletoDelAutor, int numeroDeEjemplares, int numeroDePaginas, boolean Disponibilidad, String Identificador) {
        super(editorial, fechaPublicacion, nombreCompletoDelAutor, numeroDeEjemplares, numeroDePaginas, Disponibilidad, Identificador);
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