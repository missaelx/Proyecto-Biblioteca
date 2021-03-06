/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de una persona
*/
package modelo;

import java.sql.Date;

public abstract class Persona {

    protected String correo;
    protected String direccion;
    protected Date fechaDeNacimiento;
    protected String nombre;
    protected String telefono;

    public Persona(String correo, String direccion, Date fechaDeNacimiento, String nombre, String telefono) {
        this.correo = correo;
        this.direccion = direccion;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public Persona(DatosPersona datos){
        this.correo = datos.getCorreo();
        this.direccion = datos.getDireccion();
        this.fechaDeNacimiento = datos.getFechaDeNacimiento();
        this.nombre = datos.getNombre();
        this.telefono = datos.getTelefono();
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the fechaDeNacimiento
     */
    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * @param fechaDeNacimiento the fechaDeNacimiento to set
     */
    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    


}