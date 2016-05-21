/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de una adquisicion
*/
package modelo;

public class Adquisicion {

    private String fechadeAdquisicion;
    private boolean metodoDeAdquisicion; //Seran diferentes tipos de adquisiciones predefinidas, ej: donacion, comprar
    private Item m_item;
    private Donacion m_Donacion;

    public Adquisicion(String fechadeAdquisicion, boolean metodoDeAdquisicion, Item m_item, Donacion m_Donacion) {
        this.fechadeAdquisicion = fechadeAdquisicion;
        this.metodoDeAdquisicion = metodoDeAdquisicion;
        this.m_item = m_item;
        this.m_Donacion = m_Donacion;
    }
    
    

    /**
     * Este metodo retorna la fecha de adquisicio que representa el dia que llego el item a la biblioteca
     * @return la fechadeAdquisicion
     */
    public String getFechadeAdquisicion() {
        return fechadeAdquisicion;
    }

    /**
     * Este metodo sirve para colocar la fecha de adquisicion del item.
     * @param fechadeAdquisicion para colocar fechadeAdquisicion 
     */
    public void setFechadeAdquisicion(String fechadeAdquisicion) {
        this.fechadeAdquisicion = fechadeAdquisicion;
    }

    /**
     * Este metodo retorna el metodo de adquisicion, falso si fue donado y true si fue comprado.
     * @return el metodoDeAdquisicion
     */
    public boolean isMetodoDeAdquisicion() {
        return metodoDeAdquisicion;
    }

    /**
     * Este metodo sirve para colocar el metodo de adquisicion,falso si fue donado y true si fue comprado.
     * @param metodoDeAdquisicion para colocar metodoDeAdquisicion 
     */
    public void setMetodoDeAdquisicion(boolean metodoDeAdquisicion) {
        this.metodoDeAdquisicion = metodoDeAdquisicion;
    }

    /**
     * Este metodo retorna el objeto item de la adquisicion
     * @return el m_item
     */
    public Item getM_item() {
        return m_item;
    }

    /**
     * Este metodo sirve para colocar el item de la adquisicion
     * @param m_item para colocar m_item 
     */
    public void setM_item(Item m_item) {
        this.m_item = m_item;
    }

    /**
     * Este metodo retorna el objeto donacion si es que tiene. 
     * @return the m_Donacion
     */
    public Donacion getM_Donacion() {
        return m_Donacion;
    }

    /**
     * Este metodo sirve para colocar la donacion
     * @param m_Donacion para colocar m_Donacion 
     */
    public void setM_Donacion(Donacion m_Donacion) {
        this.m_Donacion = m_Donacion;
    }

    
}