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
	private Adeudo adeudo;

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
     * @return el adeudo
     */
    public Adeudo getAdeudo() {
        return adeudo;
    }

    /**
     * Este metodo sirve para colocar
     * @param adeudo el adeudo a guardar
     */
    public void setAdeudo(Adeudo adeudo) {
        this.adeudo = adeudo;
    }


}