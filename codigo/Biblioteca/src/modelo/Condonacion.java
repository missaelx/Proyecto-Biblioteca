/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de una condonacion
*/
package modelo;
import modelo.Adeudo;
public class Condonacion {

	private String autoridad;
	private String justificacion;
	private Adeudo m_Adeudo;

	public Condonacion(){

	}

    /**
     * Este metodo retorna una cadena con el nombre de la autoridad responsable de la condonacion 
     * @return la autoridad
     */
    public String getAutoridad() {
        return autoridad;
    }

    /**
     * Este metodo sirve para colocar una cadena con el nombre de la autoridad responsable de la condonacion 
     * @param autoridad la autoridad a guardar
     */
    public void setAutoridad(String autoridad) {
        this.autoridad = autoridad;
    }

    /**
     * Este metodo retorna
     * @return la justificacion
     */
    public String getJustificacion() {
        return justificacion;
    }

    /**
     * Este metodo sirve para colocar
     * @param justificacion la justificacion a guardar
     */
    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    /**
     * Este metodo retorna
     * @return el m_Adeudo
     */
    public Adeudo getM_Adeudo() {
        return m_Adeudo;
    }

    /**
     * Este metodo sirve para colocar
     * @param m_Adeudo el m_Adeudo a guardar
     */
    public void setM_Adeudo(Adeudo m_Adeudo) {
        this.m_Adeudo = m_Adeudo;
    }


}