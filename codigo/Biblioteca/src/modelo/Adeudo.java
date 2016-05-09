package modelo;

import java.sql.Date;
public class Adeudo {

    private Date fechaInicial;
    private double Monto;
    private boolean Tipo;
    private Prestatario m_Prestatario;
    private Prestamo m_Prestamo;

    /**
     * @return the fechaInicial
     */
    public Date getFechaInicial() {
        return fechaInicial;
    }

    /**
     * @param fechaInicial the fechaInicial to set
     */
    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    /**
     * @return the Monto
     */
    public double getMonto() {
        return Monto;
    }

    /**
     * @param Monto the Monto to set
     */
    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    /**
     * @return the Tipo
     */
    public boolean isTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(boolean Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the m_Prestatario
     */
    public Prestatario getM_Prestatario() {
        return m_Prestatario;
    }

    /**
     * @param m_Prestatario the m_Prestatario to set
     */
    public void setM_Prestatario(Prestatario m_Prestatario) {
        this.m_Prestatario = m_Prestatario;
    }

    /**
     * @return the m_Prestamo
     */
    public Prestamo getM_Prestamo() {
        return m_Prestamo;
    }

    /**
     * @param m_Prestamo the m_Prestamo to set
     */
    public void setM_Prestamo(Prestamo m_Prestamo) {
        this.m_Prestamo = m_Prestamo;
    }


}