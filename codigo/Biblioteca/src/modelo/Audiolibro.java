/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de un audiolibro
*/
package modelo;

public class Audiolibro extends Multimedia {

    private String narrador;
    private String nombreDelLibro;

    public Audiolibro(String narrador, String nombreDelLibro, String nombre, boolean disponibilidad, String identificador) {
        super(nombre, disponibilidad, identificador);
        this.narrador = narrador;
        this.nombreDelLibro = nombreDelLibro;
    }

    /**
     * Este metodo retorna una cadena con elnombre del narrador.
     * @return el narrador
     */
    public String getNarrador() {
        return narrador;
    }

    /**
     * Este metodo sirve para colocar el nombre del narrador 
     * @param narrador el narrador a guardar
     */
    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    /**
     * Este metodo retorna el nombre del libro narrado
     * @return el nombreDelLibro
     */
    public String getNombreDelLibro() {
        return nombreDelLibro;
    }

    /**
     * Este metodo sirve para colocar el nombre del libro narrado
     * @param nombreDelLibro el nombreDelLibro a guardar
     */
    public void setNombreDelLibro(String nombreDelLibro) {
        this.nombreDelLibro = nombreDelLibro;
    }

    
}