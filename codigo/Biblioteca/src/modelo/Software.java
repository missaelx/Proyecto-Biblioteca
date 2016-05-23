/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de un programa de sftware disponible en la biblioteca
*/
package modelo;

import java.util.ArrayList;

public class Software extends Multimedia {

    private ArrayList<String> plataformas;
    private String version;

    public Software(ArrayList<String> plataformas, String version, String nombre, boolean disponibilidad, String identificador) {
        super(nombre, disponibilidad, identificador);
        this.plataformas = plataformas;
        this.version = version;
    }

    /**
     * @return the Plataformas
     */
    public ArrayList<String> getPlataformas() {
        return plataformas;
    }

    /**
     * @param Plataformas the Plataformas to set
     */
    public void setPlataformas(ArrayList<String> plataformas) {
        this.plataformas = plataformas;
    }

    /**
     * @return the Version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param Version the Version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    

}