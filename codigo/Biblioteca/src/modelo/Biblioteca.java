/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de una biblioteca
*/
package modelo;

import java.util.List;


public class Biblioteca {

	private String direccion;
	private String nombre;
	private List<Personal> personal;
	private Item item;

	public Biblioteca(){

	}

    /**
     * Este metodo retorna una cadena que indica la direccion fisica de la biblioteca
     * @return la direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Este metodo sirve para colocar la direccion fisica de la biblioteca
     * @param direccion la direccion a guardar
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Este metodo retorna el nombre de la biblioteca
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este metodo sirve para colocar el nombre de la biblioteca
     * @param nombre el nombre a guardar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este metodo retorna una lista del personal en la biblioteca
     * @return el personal
     */
    public List<Personal> getpersonal() {
        return personal;
    }

    /**
     * Este metodo sirve para colocar una lista del personal en la biblioteca
     * @param personal el personal a guardar
     */
    public void setpersonal(Personal personal) {
        this.personal = (List<Personal>) personal;
    }

    /**
     * Este metodo retorna una lista de items en la biblioteca
     * @return el item
     */
    public List<Item> getItem() {
        return (List<Item>) item;
    }

    /**
     * Este metodo sirve para colocar una lista de items en la biblioteca
     * @param item el item a guardar
     */
    public void setItem(Item item) {
        this.item = item;
    }

}