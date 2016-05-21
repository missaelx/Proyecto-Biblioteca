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
	private List<Personal> m_Personal;
	private Item m_Item;

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
     * @return el m_Personal
     */
    public List<Personal> getM_Personal() {
        return m_Personal;
    }

    /**
     * Este metodo sirve para colocar una lista del personal en la biblioteca
     * @param m_Personal el m_Personal a guardar
     */
    public void setM_Personal(Personal m_Personal) {
        this.m_Personal = (List<Personal>) m_Personal;
    }

    /**
     * Este metodo retorna una lista de items en la biblioteca
     * @return el m_Item
     */
    public List<Item> getM_Item() {
        return (List<Item>) m_Item;
    }

    /**
     * Este metodo sirve para colocar una lista de items en la biblioteca
     * @param m_Item el m_Item a guardar
     */
    public void setM_Item(Item m_Item) {
        this.m_Item = m_Item;
    }

}