/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de un prestamo
*/
package modelo;

import java.sql.Date;

public class Prestamo {

    private boolean estado;
    private Date fechaDeVencimiento;
    private Item item;
    private Prestatario prestatario;

    public Prestamo() {

    }

    /**
     * @return the estado
     */
    public boolean getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return the fechaDeVencimiento
     */
    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    /**
     * @param fechaDeVencimiento the fechaDeVencimiento to set
     */
    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    /**
     * @return the item
     */
    public Item getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * @return the prestatario
     */
    public Prestatario getPrestatario() {
        return prestatario;
    }

    /**
     * @param prestatario the prestatario to set
     */
    public void setPrestatario(Prestatario prestatario) {
        this.prestatario = prestatario;
    }

}