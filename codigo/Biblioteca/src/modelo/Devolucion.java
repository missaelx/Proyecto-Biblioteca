/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de un devolucion
*/
package modelo;

import java.sql.Date;

public class Devolucion {

	private Date Fecha;
	private Prestamo m_Prestamo;

	public Devolucion(){

	}

    /**
     * @return la Fecha
     */
    public Date getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha la Fecha a guardar
     */
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return el m_Prestamo
     */
    public Prestamo getM_Prestamo() {
        return m_Prestamo;
    }

    /**
     * @param m_Prestamo el m_Prestamo a guardar
     */
    public void setM_Prestamo(Prestamo m_Prestamo) {
        this.m_Prestamo = m_Prestamo;
    }

}