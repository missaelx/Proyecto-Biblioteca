/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de un item
*/
package modelo;

import java.util.Objects;

public abstract class Item {

    protected boolean disponibilidad;
    protected String identificador;

    public Item(boolean disponibilidad, String identificador) {
        this.disponibilidad = disponibilidad;
        this.identificador = identificador;
    }
    
    public Item(){
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.disponibilidad ? 1 : 0);
        hash = 17 * hash + Objects.hashCode(this.identificador);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.disponibilidad != other.disponibilidad) {
            return false;
        }
        if (!Objects.equals(this.identificador, other.identificador)) {
            return false;
        }
        return true;
    }
    
    
}