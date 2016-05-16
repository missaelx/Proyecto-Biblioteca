package modelo;

import java.sql.Date;

public class Personal extends Persona {

    private String numeroDePersonal;

    public Personal(String numeroDePersonal, String correo, String direccion, Date fechaDeNacimiento, String nombre, String telefono) {
        super(correo, direccion, fechaDeNacimiento, nombre, telefono);
        this.numeroDePersonal = numeroDePersonal;
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
    
    
     

}