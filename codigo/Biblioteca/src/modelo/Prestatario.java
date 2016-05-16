package modelo;

import java.sql.Date;
import java.util.Objects;

public class Prestatario extends Persona {
    
    
    private String identificador;
    private TipoPrestatario tipo;
    //private boolean multas; su control es dificil
    private int numeroDeTextos; //numero de textos permitidos
    private int numeroDeTextoPrestados;
    private Date vigencia; //vigencia de la cuenta
    

    public Prestatario(String identificador, TipoPrestatario tipo, int numeroDeTextoPrestados, Date vigencia, String correo, String direccion, Date fechaDeNacimiento, String nombre, String telefono) {
        super(correo, direccion, fechaDeNacimiento, nombre, telefono);
        this.identificador = identificador;
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
        hash = 47 * hash + this.numeroDeTextoPrestados;
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
        
        if (this.numeroDeTextoPrestados != other.numeroDeTextoPrestados) {
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
    
    
}