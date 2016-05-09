package modelo;

public class Audiolibros extends Multimedia {

    private String Narrador;
    private String NombreDelLibro;

    public Audiolibros(String Narrador, String NombreDelLibro, String Nombre, boolean Disponibilidad, String Identificador) {
        super(Nombre, Disponibilidad, Identificador);
        this.Narrador = Narrador;
        this.NombreDelLibro = NombreDelLibro;
    }

    /**
     * @return the Narrador
     */
    public String getNarrador() {
        return Narrador;
    }

    /**
     * @param Narrador the Narrador to set
     */
    public void setNarrador(String Narrador) {
        this.Narrador = Narrador;
    }

    /**
     * @return the NombreDelLibro
     */
    public String getNombreDelLibro() {
        return NombreDelLibro;
    }

    /**
     * @param NombreDelLibro the NombreDelLibro to set
     */
    public void setNombreDelLibro(String NombreDelLibro) {
        this.NombreDelLibro = NombreDelLibro;
    }

    
}