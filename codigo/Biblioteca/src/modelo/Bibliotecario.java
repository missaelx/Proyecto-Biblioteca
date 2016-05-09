package modelo;

import java.sql.Date;
public class Bibliotecario extends Personal {

    private char privilegio;

    public Bibliotecario(char privilegio, String numeroDePersonal, String correo, String direccion, Date fechaDeNacimiento, String nombre, String primerApellido, String segundoApellido, String telefono) {
        super(numeroDePersonal, correo, direccion, fechaDeNacimiento, nombre, primerApellido, segundoApellido, telefono);
        this.privilegio = privilegio;
    }

    /**
     * @return the privilegio
     */
    public char getPrivilegio() {
        return privilegio;
    }

    /**
     * @param privilegio the privilegio to set
     */
    public void setPrivilegio(char privilegio) {
        this.privilegio = privilegio;
    }

    
}