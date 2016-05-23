/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de un donador
*/
package modelo;

public class Donador {

	private String correo;
	private String direccion;
	private String nombre;
	private String telefono;
	private String tipoDeDonador;

	public Donador(){

	}

    /**
     * Este método retorna una cadena que contiene el correo del donador.
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Este método sirve para colocar el correo del donador.
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Este método retorna una cadena con la dirección física del donador.
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Este método sirve para colocar la dirección del donador.
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Este método retorna una cadena con el nombre del donador.
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este método sirve para colocar el nombre del donador.
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este método retorna una cadena con el número de teléfono del donador.
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Este método sirve para colocar una cadena que indica el número de teléfono del donador.
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Este método retorna un String que indica el tipo de donador de la donación, moral, físico.
     * @return the tipoDeDonador
     */
    public String isTipoDeDonador() {
        return tipoDeDonador;
    }

    /**
     * Este método sirve para colocar una cadena con la palabra clave para describir un donador.
     * @param tipoDeDonador the tipoDeDonador to set
     */
    public void setTipoDeDonador(String tipoDeDonador) {
        this.tipoDeDonador = tipoDeDonador;
    }


}