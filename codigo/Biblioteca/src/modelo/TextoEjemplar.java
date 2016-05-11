/*
 * Copyright (C) 2016 missael
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
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
