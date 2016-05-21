/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de la Multimedia
en la biblioteca
*/
package modelo;

public class Multimedia extends Item {

    private String Nombre;

    public Multimedia(String Nombre, boolean Disponibilidad, String Identificador) {
        super(Disponibilidad, Identificador);
        this.Nombre = Nombre;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }



}