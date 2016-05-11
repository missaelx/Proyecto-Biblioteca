package modelo;

public abstract class Item {

    private boolean Disponibilidad;
    private String Identificador;

    public Item(boolean Disponibilidad, String Identificador) {
        this.Disponibilidad = Disponibilidad;
        this.Identificador = Identificador;
    }
    
    public Item(){
        
    }
}