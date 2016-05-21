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
    private Prestatario m_Prestatario;
    private Prestamo m_Prestamo;
    
    

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
     * @return el m_Prestatario
     */
    public Prestatario getM_Prestatario() {
        return m_Prestatario;
    }

    /**
     * Este metodo sirve para colocar el prestatario del adeudo que es el adeudador 
     * @param m_Prestatario el m_Prestatario a guardar
     */
    public void setM_Prestatario(Prestatario m_Prestatario) {
        this.m_Prestatario = m_Prestatario;
    }

    /**
     * Este metodo retorna el prestamo ligado a esta deauda
     * @return el m_Prestamo
     */
    public Prestamo getM_Prestamo() {
        return m_Prestamo;
    }

    /**
     * Este metodo se utiliza para colocar un prestamo que se ligará a la deuda
     * @param m_Prestamo el m_Prestamo a guardar
     */
    public void setM_Prestamo(Prestamo m_Prestamo) {
        this.m_Prestamo = m_Prestamo;
    }


}