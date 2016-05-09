package modelo;

import java.util.ArrayList;

public class Software extends Multimedia {

    private ArrayList<String> Plataformas;
    private String Version;

    public Software(ArrayList<String> Plataformas, String Version, String Nombre, boolean Disponibilidad, String Identificador) {
        super(Nombre, Disponibilidad, Identificador);
        this.Plataformas = Plataformas;
        this.Version = Version;
    }

    /**
     * @return the Plataformas
     */
    public ArrayList<String> getPlataformas() {
        return Plataformas;
    }

    /**
     * @param Plataformas the Plataformas to set
     */
    public void setPlataformas(ArrayList<String> Plataformas) {
        this.Plataformas = Plataformas;
    }

    /**
     * @return the Version
     */
    public String getVersion() {
        return Version;
    }

    /**
     * @param Version the Version to set
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    

}