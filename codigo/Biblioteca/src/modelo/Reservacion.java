/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:18/05/2016
Descripción: Esta clase solo modela los atributos de una pelicula
*/
package modelo;

import java.sql.Date;

public class Reservacion {

	private Date fechaDeVencimiento;
	private Item item;
	private Prestatario prestatario;

	public Reservacion(){

	}

    /**
     * Este método retorna un Date que indica la fecha de vencimiento.
     * @return the FechaDeVencimiento
     */
    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    /**
     * Este método sirve para colocar un Date que indica la fecha de vencimiento.
     * @param fechaDeVencimiento the FechaDeVencimiento to set
     */
    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    /**
     * Este método retorna un Item que indica el ítem asociado.
     * @return the item
     */
    public Item getItem() {
        return item;
    }

    /**
     * Este método sirve para colocar un Item que indica el ítem asociado.
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * Este método retorna un Prestatario que indica el prestatario asociado.
     * @return the prestatario
     */
    public Prestatario getPrestatario() {
        return prestatario;
    }

    /**
     * Este método sirve para colocar un Prestatario que indica el prestatario asociado.
     * @param prestatario the prestatario to set
     */
    public void setPrestatario(Prestatario prestatario) {
        this.prestatario = prestatario;
    }

}