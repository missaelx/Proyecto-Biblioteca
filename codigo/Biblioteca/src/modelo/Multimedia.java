/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de la Multimedia
en la biblioteca
*/
package modelo;

public class Multimedia extends Item {

    private String nombre;

    public Multimedia(String nombre, boolean disponibilidad, String identificador) {
        super(disponibilidad, identificador);
        this.nombre = nombre;
    }

    /**
     * Este método retorna una cadena que indica  el nombre del objeto multimedia.
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este método sirve para colocar una cadena que indica el nombre del objeto multimedia.
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}