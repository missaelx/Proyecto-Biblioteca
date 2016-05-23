/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de un adeudo
*/
package modelo;

import java.sql.Date;
public class Adeudo {

    private Date fechaInicial;
    private double monto;
    private boolean tipo;
    private Prestatario prestatario;
    private Prestamo prestamo;
    
    

    /**
     * Este metodo retorna la fecha inicial del adeudo la cual
     * indica cuando se genero el adeudo
     * @return la fechaInicial
     */
    public Date getFechaInicial() {
        return fechaInicial;
    }

    /**
     * Este metodo sirve para colocar una fechaInicial al adeudo
     * @param fechaInicial la fechaInicial a guardar
     */
    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    /**
     * Este metodo retorna el monto que representa el dinero que se debe
     * en la deuda
     * @return el monto
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Este metodo sirve para colocar un numero double al monto
     * @param Monto el monto a guardar
     */
    public void setMonto(double Monto) {
        this.monto = Monto;
    }

    /**
     * Este metodo retorna el tipo de la deuda que representa si esta pagado
     * o no pagado     * 
     * @return el tipo
     */
    public boolean isTipo() {
        return tipo;
    }

    /**
     * Este metodo sirve para colocar el tipo del adeudo que es pagado o no pagado
     * @param Tipo el tipo a guardar
     */
    public void setTipo(boolean Tipo) {
        this.tipo = Tipo;
    }

    /**
     * Este metodo retorna al prestatario de la deuda, sirve para identificar
     * al adeudador
     * @return el prestatario
     */
    public Prestatario getPrestatario() {
        return prestatario;
    }

    /**
     * Este metodo sirve para colocar el prestatario del adeudo que es el adeudador 
     * @param prestatario el prestatario a guardar
     */
    public void setPrestatario(Prestatario prestatario) {
        this.prestatario = prestatario;
    }

    /**
     * Este metodo retorna el prestamo ligado a esta deauda
     * @return el prestamo
     */
    public Prestamo getPrestamo() {
        return prestamo;
    }

    /**
     * Este metodo se utiliza para colocar un prestamo que se ligará a la deuda
     * @param prestamo el prestamo a guardar
     */
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }


}