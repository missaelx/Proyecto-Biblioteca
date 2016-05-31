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
    public Ensayo(String lugarDePublicacion, String titulo, DatosTexto datos) {
        super(datos);
        this.lugarDePublicacion = lugarDePublicacion;
        this.titulo = titulo;
    }

    public Ensayo(DatosTexto datos) {
        super(datos);
    }
    public Ensayo(){
        
    }
     /**
     * Este método retorna una cadena con la dirección del lugar físico donde se publicó.
     * @return the lugarDePublicacion
     */
    public String getLugarDePublicacion() {
        return lugarDePublicacion;
    }

    /**
     * Este método sirve para colocar una cadena con la dirección del lugar físico donde se publicó.
     * @param lugarDePublicacion the lugarDePublicacion to set
     */
    public void setLugarDePublicacion(String lugarDePublicacion) {
        this.lugarDePublicacion = lugarDePublicacion;
    }

    /**
     * Este método retorna una cadena con el título del ensayo.
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Este método sirve para colocar una cadena con el título del sensayo.
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public Date getFechaVencimientoDesdeFecha(Date fechaPrestamo) {
        return new Date(604800000L + fechaPrestamo.getTime()); // se suman 7 dias a la fecha que se le pasa
    }
    
    

}