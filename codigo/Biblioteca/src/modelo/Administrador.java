package modelo;

import java.sql.Date;

public class Administrador extends Personal {

    private char Privilegio;

    public Administrador(char Privilegio, String numeroDePersonal, String correo, String direccion, Date fechaDeNacimiento, String nombre, String telefono) {
        super(numeroDePersonal, correo, direccion, fechaDeNacimiento, nombre, telefono);
        this.Privilegio = Privilegio;
    }
    
    

    /**
     * @return the Privilegio
     */
    public char getPrivilegio() {
        return Privilegio;
    }

    /**
     * @param Privilegio the Privilegio to set
     */
    public void setPrivilegio(char Privilegio) {
        this.Privilegio = Privilegio;
    }
	

}