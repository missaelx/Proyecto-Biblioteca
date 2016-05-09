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
     * @return the fechadeAdquisicion
     */
    public String getFechadeAdquisicion() {
        return fechadeAdquisicion;
    }

    /**
     * @param fechadeAdquisicion the fechadeAdquisicion to set
     */
    public void setFechadeAdquisicion(String fechadeAdquisicion) {
        this.fechadeAdquisicion = fechadeAdquisicion;
    }

    /**
     * @return the metodoDeAdquisicion
     */
    public boolean isMetodoDeAdquisicion() {
        return metodoDeAdquisicion;
    }

    /**
     * @param metodoDeAdquisicion the metodoDeAdquisicion to set
     */
    public void setMetodoDeAdquisicion(boolean metodoDeAdquisicion) {
        this.metodoDeAdquisicion = metodoDeAdquisicion;
    }

    /**
     * @return the m_item
     */
    public Item getM_item() {
        return m_item;
    }

    /**
     * @param m_item the m_item to set
     */
    public void setM_item(Item m_item) {
        this.m_item = m_item;
    }

    /**
     * @return the m_Donacion
     */
    public Donacion getM_Donacion() {
        return m_Donacion;
    }

    /**
     * @param m_Donacion the m_Donacion to set
     */
    public void setM_Donacion(Donacion m_Donacion) {
        this.m_Donacion = m_Donacion;
    }

    
}