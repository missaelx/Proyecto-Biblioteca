package modelo;

import java.sql.Date;
public class Alumno extends Prestatario {

    private String Matricula;

    public Alumno(String Matricula, String identificador, boolean multas, int numeroDeTextos, Date vigencia, String correo, String direccion, Date fechaDeNacimiento, String nombre, String primerApellido, String segundoApellido, String telefono) {
        super(identificador, multas, numeroDeTextos, vigencia, correo, direccion, fechaDeNacimiento, nombre, primerApellido, segundoApellido, telefono);
        this.Matricula = Matricula;
    }
    
    

    /**
     * @return the Matricula
     */
    public String getMatricula() {
        return Matricula;
    }

    /**
     * @param Matricula the Matricula to set
     */
    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    
}