/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de un prestamo
*/
package modelo;

import java.sql.Date;

public class Prestamo {

	private boolean Estado;
	private Date FechaDeVencimiento;
	private Item m_Item;
	private Prestatario m_Prestatario;

	public Prestamo(){

	}

    /**
     * @return the Estado
     */
    public boolean isEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    /**
     * @return the FechaDeVencimiento
     */
    public Date getFechaDeVencimiento() {
        return FechaDeVencimiento;
    }

    /**
     * @param FechaDeVencimiento the FechaDeVencimiento to set
     */
    public void setFechaDeVencimiento(Date FechaDeVencimiento) {
        this.FechaDeVencimiento = FechaDeVencimiento;
    }

    /**
     * @return the m_Item
     */
    public Item getM_Item() {
        return m_Item;
    }

    /**
     * @param m_Item the m_Item to set
     */
    public void setM_Item(Item m_Item) {
        this.m_Item = m_Item;
    }

    /**
     * @return the m_Prestatario
     */
    public Prestatario getM_Prestatario() {
        return m_Prestatario;
    }

    /**
     * @param m_Prestatario the m_Prestatario to set
     */
    public void setM_Prestatario(Prestatario m_Prestatario) {
        this.m_Prestatario = m_Prestatario;
    }

}