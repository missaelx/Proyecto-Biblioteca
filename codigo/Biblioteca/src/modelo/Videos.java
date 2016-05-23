/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de un video
*/
package modelo;

public class Videos extends Multimedia {

    private String areaEducativa;
    private String titulo;

    public Videos(String areaEducativa, String titulo, String nombre, boolean disponibilidad, String identificador) {
        super(nombre, disponibilidad, identificador);
        this.areaEducativa = areaEducativa;
        this.titulo = titulo;
    }

    /**
     * @return the areaEducativa
     */
    public String getAreaEducativa() {
        return areaEducativa;
    }

    /**
     * @param areaEducativa the areaEducativa to set
     */
    public void setAreaEducativa(String areaEducativa) {
        this.areaEducativa = areaEducativa;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    


}