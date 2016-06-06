/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de una adquisicion
*/
package modelo;

public class Adquisicion {

    private String fechadeAdquisicion;
    private boolean metodoDeAdquisicion; //Seran diferentes tipos de adquisiciones predefinidas, ej: donacion, compra
    private Item item;
    private Donacion donacion;

    public Adquisicion(String fechadeAdquisicion, boolean metodoDeAdquisicion, Item item, Donacion donacion) {
        this.fechadeAdquisicion = fechadeAdquisicion;
        this.metodoDeAdquisicion = metodoDeAdquisicion;
        this.item = item;
        this.donacion = donacion;
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
     * @return el item
     */
    public Item getItem() {
        return item;
    }

    /**
     * Este metodo sirve para colocar el item de la adquisicion
     * @param item para colocar item 
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * Este metodo retorna el objeto donacion si es que tiene. 
     * @return the donacion
     */
    public Donacion getDonacion() {
        return donacion;
    }

    /**
     * Este metodo sirve para colocar la donacion
     * @param donacion para colocar donacion 
     */
    public void setDonacion(Donacion donacion) {
        this.donacion = donacion;
    }

    
}