package modelo;

import java.sql.Date;

public class Profesor extends Prestatario {

    private String numeroDePersonal;

    public Profesor(String numeroDePersonal, String identificador, boolean multas, int numeroDeTextos, Date vigencia, String correo, String direccion, Date fechaDeNacimiento, String nombre, String primerApellido, String segundoApellido, String telefono) {
        super(identificador, multas, numeroDeTextos, vigencia, correo, direccion, fechaDeNacimiento, nombre, primerApellido, segundoApellido, telefono);
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