/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de un audio
*/
package modelo;

public class Audio extends Multimedia {

    private String areaEducativa;

    public Audio(String areaEducativa, String Nombre, boolean Disponibilidad, String Identificador) {
        super(Nombre, Disponibilidad, Identificador);
        this.areaEducativa = areaEducativa;
    }
    
    

    /**
     * Este metodo retorna un area educativa que indica hacia que publico esta dirigido
     * @return el areaEducativa
     */
    public String getAreaEducativa() {
        return areaEducativa;
    }

    /**
     * Este metodo sirve para colocar un área educativa que indica el publico dirigido
     * @param areaEducativa el areaEducativa a guardar
     */
    public void setAreaEducativa(String areaEducativa) {
        this.areaEducativa = areaEducativa;
    }

    

}