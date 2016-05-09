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