/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de un audiolibro
*/
package modelo;

public class Audiolibro extends Multimedia {

    private String Narrador;
    private String NombreDelLibro;

    public Audiolibro(String Narrador, String NombreDelLibro, String Nombre, boolean Disponibilidad, String Identificador) {
        super(Nombre, Disponibilidad, Identificador);
        this.Narrador = Narrador;
        this.NombreDelLibro = NombreDelLibro;
    }

    /**
     * Este metodo retorna una cadena con elnombre del narrador.
     * @return el Narrador
     */
    public String getNarrador() {
        return Narrador;
    }

    /**
     * Este metodo sirve para colocar el nombre del narrador 
     * @param Narrador el Narrador a guardar
     */
    public void setNarrador(String Narrador) {
        this.Narrador = Narrador;
    }

    /**
     * Este metodo retorna el nombre del libro narrado
     * @return el NombreDelLibro
     */
    public String getNombreDelLibro() {
        return NombreDelLibro;
    }

    /**
     * Este metodo sirve para colocar el nombre del libro narrado
     * @param NombreDelLibro el NombreDelLibro a guardar
     */
    public void setNombreDelLibro(String NombreDelLibro) {
        this.NombreDelLibro = NombreDelLibro;
    }

    
}