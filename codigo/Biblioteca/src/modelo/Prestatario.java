package modelo;

import java.sql.Date;

public class Prestatario extends Persona {

    private String identificador;
    private boolean multas;
    private int numeroDeTextos;
    private Date vigencia;

    public Prestatario(String identificador, boolean multas, int numeroDeTextos, Date vigencia, String correo, String direccion, Date fechaDeNacimiento, String nombre, String primerApellido, String segundoApellido, String telefono) {
        super(correo, direccion, fechaDeNacimiento, nombre, primerApellido, segundoApellido, telefono);
        this.identificador = identificador;
        this.multas = multas;
        this.numeroDeTextos = numeroDeTextos;
        this.vigencia = vigencia;
    }

    /**
     * @return the identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * @return the multas
     */
    public boolean isMultas() {
        return multas;
    }

    /**
     * @param multas the multas to set
     */
    public void setMultas(boolean multas) {
        this.multas = multas;
    }

    /**
     * @return the numeroDeTextos
     */
    public int getNumeroDeTextos() {
        return numeroDeTextos;
    }

    /**
     * @param numeroDeTextos the numeroDeTextos to set
     */
    public void setNumeroDeTextos(int numeroDeTextos) {
        this.numeroDeTextos = numeroDeTextos;
    }

    /**
     * @return the vigencia
     */
    public Date getVigencia() {
        return vigencia;
    }

    /**
     * @param vigencia the vigencia to set
     */
    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }
    
    
}