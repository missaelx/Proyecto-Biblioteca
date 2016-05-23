/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos del personal
*/
package modelo;

import java.sql.Date;
import java.util.Objects;

public class Personal extends Persona {

    private String numeroDePersonal;
    private String tipo; //administrador o bibliotecario
    private int identificador;
    
    public Personal(int identificador,String numeroDePersonal, String tipo, DatosPersona datos) {
        super(datos);
        this.numeroDePersonal = numeroDePersonal;
        this.identificador = identificador;
        this.tipo = tipo;
    }

    /**
     * @return the numeroDePersonal
     */
    public String getNumeroDePersonal() {
        return numeroDePersonal;
    }

    /**
     * @param numeroDePersonal the numeroDePersonal to set
     */
    public void setNumeroDePersonal(String numeroDePersonal) {
        this.numeroDePersonal = numeroDePersonal;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.getNumeroDePersonal());
        hash = 53 * hash + Objects.hashCode(this.getTipo());
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
        final Personal other = (Personal) obj;
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.fechaDeNacimiento, other.fechaDeNacimiento)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        
        if (!Objects.equals(this.numeroDePersonal, other.numeroDePersonal)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }

    /**
     * @return the idenntificador
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * @param idenntificador the idenntificador to set
     */
    public void setIdentificador(int idenntificador) {
        this.identificador = idenntificador;
    }
    
    
     

}