/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de un devolucion
*/
package modelo;

import java.sql.Date;

public class Devolucion {

    private Date fecha;
    private Prestamo prestamo;

    public Devolucion(){

    }

    /**
     * Este método retorna la fecha en la que se creó la devolución de un ítem.
     * @return la fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Este método sirve para colocar la fecha en la que se creó la devolución.
     * @param fecha la fecha a guardar
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Este método retorna el préstamo asociado a la devolución.
     * @return el prestamo
     */
    public Prestamo getPrestamo() {
        return prestamo;
    }

    /**
     * Este método sirve para colocar el préstamo asociado a la devolución.
     * @param prestamo el prestamo a guardar
     */
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

}