/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Marvin
 */
public class Pago {
    private String dpi;
    private String poliza;
    private double total;
    private String fechaInicio;
    private String fechaFin;
    private int codigo;

    public Pago(String dpi,String poliza, double total, String fechaInicio, String fechaFin,int codigo) {
        this.poliza = poliza;
        this.total = total;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.dpi=dpi;
        this.codigo=codigo;
    }

    /**
     * @return the poliza
     */
    public String getPoliza() {
        return poliza;
    }

    /**
     * @param poliza the poliza to set
     */
    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the fechaInicio
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * @return the dpi
     */
    public String getDpi() {
        return dpi;
    }

    /**
     * @param dpi the dpi to set
     */
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
