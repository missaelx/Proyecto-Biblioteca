/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:09/05/2016
Descripción: Esta clase solo modela los atributos de un ejemplar de texto
*/
package modelo;

/**
 *
 * @author missael
 */
public class TextoEjemplar {
    private String identificador;
    private String idDescripcion;
    private String idAdquisicion;
    private boolean disponible;

    public TextoEjemplar(String identificador, String idDescripcion, String idAdquisicion, boolean disponible) {
        this.identificador = identificador;
        this.idDescripcion = idDescripcion;
        this.idAdquisicion = idAdquisicion;
        this.disponible = disponible;
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
     * @return the idDescripcion
     */
    public String getIdDescripcion() {
        return idDescripcion;
    }

    /**
     * @param idDescripcion the idDescripcion to set
     */
    public void setIdDescripcion(String idDescripcion) {
        this.idDescripcion = idDescripcion;
    }

    /**
     * @return the idAdquisicion
     */
    public String getIdAdquisicion() {
        return idAdquisicion;
    }

    /**
     * @param idAdquisicion the idAdquisicion to set
     */
    public void setIdAdquisicion(String idAdquisicion) {
        this.idAdquisicion = idAdquisicion;
    }

    /**
     * @return the disponible
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * @param disponible the disponible to set
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
}
