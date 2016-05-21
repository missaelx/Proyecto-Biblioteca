/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de una donacion
*/
package modelo;

import java.sql.Date;

public class Donacion {

	private String descripcion;
	private boolean esMonetario;
	private Date fecha;
	private Donador m_Donador;

	public Donacion(){

	}

    /**
     * Este metodo retorna una cadena que es una descripcion de lo  
     * que contuvo la donacion
     * @return la descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion la descripcion a guardar
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the esMonetario
     */
    public boolean isEsMonetario() {
        return esMonetario;
    }

    /**
     * @param esMonetario the esMonetario a guardar
     */
    public void setEsMonetario(boolean esMonetario) {
        this.esMonetario = esMonetario;
    }

    /**
     * @return la fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha la fecha a guardar
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return el m_Donador
     */
    public Donador getM_Donador() {
        return m_Donador;
    }

    /**
     * @param m_Donador el m_Donador a guardar
     */
    public void setM_Donador(Donador m_Donador) {
        this.m_Donador = m_Donador;
    }


}