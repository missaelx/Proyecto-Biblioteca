package modelo;

public class Audios extends Multimedia {

    private String areaEducativa;

    public Audios(String areaEducativa, String Nombre, boolean Disponibilidad, String Identificador) {
        super(Nombre, Disponibilidad, Identificador);
        this.areaEducativa = areaEducativa;
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

    

}