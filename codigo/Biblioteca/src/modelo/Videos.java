package modelo;

public class Videos extends Multimedia {

    private String areaEducativa;
    private String titulo;

    public Videos(String areaEducativa, String titulo, String Nombre, boolean Disponibilidad, String Identificador) {
        super(Nombre, Disponibilidad, Identificador);
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