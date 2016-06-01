/*
Autor:Missael Hernandez Rosado
Fecha de creación: 07/05/2016
Fecha de Modificación:13/05/2016
Descripción: Esta clase modela los atributos de un prestatario
*/
package modelo;

import java.sql.Date;
import java.util.Objects;

public class Prestatario extends Persona {
    
    
    private int identificador;
    private String numeroPersonal;
    private TipoPrestatario tipo;
    private int numeroDeTextos; //numero de textos permitidos
    private int numeroDeTextoPrestados;
    private Date vigencia; //vigencia de la cuenta
    

    public Prestatario(int identificador, String numeroPersonal, TipoPrestatario tipo, int numeroDeTextoPrestados, Date vigencia, DatosPersona datos) {
        super(datos);
        this.identificador = identificador;
        this.numeroPersonal = numeroPersonal;
        this.tipo = tipo;
        this.numeroDeTextoPrestados = numeroDeTextoPrestados;
        this.vigencia = vigencia;
        if(tipo == TipoPrestatario.ALUMNO){
            this.numeroDeTextos = 3;
        } else {
            this.numeroDeTextos = 5;
        }
    }

    /**
     * @return the identificador
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.identificador);
        hash = 47 * hash + Objects.hashCode(this.tipo);
        hash = 47 * hash + this.numeroDeTextos;
        hash = 47 * hash + this.getNumeroDeTextoPrestados();
        hash = 47 * hash + Objects.hashCode(this.vigencia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prestatario other = (Prestatario) obj;
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.fechaDeNacimiento, other.fechaDeNacimiento)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        
        if (this.getNumeroDeTextoPrestados() != other.getNumeroDeTextoPrestados()) {
            return false;
        }
        if (!Objects.equals(this.identificador, other.identificador)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        if (!Objects.equals(this.vigencia, other.vigencia)) {
            return false;
        }
        return true;
    }

    /**
     * @return the numeroDeTextoPrestados
     */
    public int getNumeroDeTextoPrestados() {
        return numeroDeTextoPrestados;
    }

    /**
     * @param numeroDeTextoPrestados the numeroDeTextoPrestados to set
     */
    public void setNumeroDeTextoPrestados(int numeroDeTextoPrestados) {
        this.numeroDeTextoPrestados = numeroDeTextoPrestados;
    }

    /**
     * @return the numeroPersonal
     */
    public String getNumeroPersonal() {
        return numeroPersonal;
    }

    /**
     * @param numeroPersonal the numeroPersonal to set
     */
    public void setNumeroPersonal(String numeroPersonal) {
        this.numeroPersonal = numeroPersonal;
    }
    
    public boolean tienesPrestamosDisponibles(){
        return numeroDeTextoPrestados < numeroDeTextos;
    }
}