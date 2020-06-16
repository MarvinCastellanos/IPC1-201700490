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
public class Incidente {

    private int codigo;
    private String dpiAsegurado;
    private String dpiTercero;
    private String rolAsegurado;
    private String rolTercero;
    private double costoReal;
    private double pagoRequeridoAsegurado;
    private double pagoRequeridoTercero;
    private String estado;
    private String pago;
    private boolean aseguradoCulpable;
    private boolean terceroSeguro;
    private String detalle[][];

    public Incidente(int codigo, String dpiAsegurado, String dpiTercero, String rolAsegurado, String rolTercero, double costoReal, double pagoRequeridoAsegurado, double pagoRequeridoTercero, String estado, String pago, boolean aseguradoCulpable, boolean terceroSeguro, String[][] detalle) {
        this.codigo = codigo;
        this.dpiAsegurado = dpiAsegurado;
        this.dpiTercero = dpiTercero;
        this.rolAsegurado = rolAsegurado;
        this.rolTercero = rolTercero;
        this.costoReal = costoReal;
        this.pagoRequeridoAsegurado = pagoRequeridoAsegurado;
        this.pagoRequeridoTercero = pagoRequeridoTercero;
        this.estado = estado;
        this.pago = pago;
        this.aseguradoCulpable = aseguradoCulpable;
        this.terceroSeguro = terceroSeguro;
        this.detalle = detalle;
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

    /**
     * @return the dpiAsegurado
     */
    public String getDpiAsegurado() {
        return dpiAsegurado;
    }

    /**
     * @param dpiAsegurado the dpiAsegurado to set
     */
    public void setDpiAsegurado(String dpiAsegurado) {
        this.dpiAsegurado = dpiAsegurado;
    }

    /**
     * @return the dpiTercero
     */
    public String getDpiTercero() {
        return dpiTercero;
    }

    /**
     * @param dpiTercero the dpiTercero to set
     */
    public void setDpiTercero(String dpiTercero) {
        this.dpiTercero = dpiTercero;
    }

    /**
     * @return the rolAsegurado
     */
    public String getRolAsegurado() {
        return rolAsegurado;
    }

    /**
     * @param rolAsegurado the rolAsegurado to set
     */
    public void setRolAsegurado(String rolAsegurado) {
        this.rolAsegurado = rolAsegurado;
    }

    /**
     * @return the rolTercero
     */
    public String getRolTercero() {
        return rolTercero;
    }

    /**
     * @param rolTercero the rolTercero to set
     */
    public void setRolTercero(String rolTercero) {
        this.rolTercero = rolTercero;
    }

    /**
     * @return the costoReal
     */
    public double getCostoReal() {
        return costoReal;
    }

    /**
     * @param costoReal the costoReal to set
     */
    public void setCostoReal(double costoReal) {
        this.costoReal = costoReal;
    }

    /**
     * @return the pagoRequeridoAsegurado
     */
    public double getPagoRequeridoAsegurado() {
        return pagoRequeridoAsegurado;
    }

    /**
     * @param pagoRequeridoAsegurado the pagoRequeridoAsegurado to set
     */
    public void setPagoRequeridoAsegurado(double pagoRequeridoAsegurado) {
        this.pagoRequeridoAsegurado = pagoRequeridoAsegurado;
    }

    /**
     * @return the pagoRequeridoTercero
     */
    public double getPagoRequeridoTercero() {
        return pagoRequeridoTercero;
    }

    /**
     * @param pagoRequeridoTercero the pagoRequeridoTercero to set
     */
    public void setPagoRequeridoTercero(double pagoRequeridoTercero) {
        this.pagoRequeridoTercero = pagoRequeridoTercero;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the pago
     */
    public String getPago() {
        return pago;
    }

    /**
     * @param pago the pago to set
     */
    public void setPago(String pago) {
        this.pago = pago;
    }

    /**
     * @return the aseguradoCulpable
     */
    public boolean isAseguradoCulpable() {
        return aseguradoCulpable;
    }

    /**
     * @param aseguradoCulpable the aseguradoCulpable to set
     */
    public void setAseguradoCulpable(boolean aseguradoCulpable) {
        this.aseguradoCulpable = aseguradoCulpable;
    }

    /**
     * @return the terceroSeguro
     */
    public boolean isTerceroSeguro() {
        return terceroSeguro;
    }

    /**
     * @param terceroSeguro the terceroSeguro to set
     */
    public void setTerceroSeguro(boolean terceroSeguro) {
        this.terceroSeguro = terceroSeguro;
    }

    /**
     * @return the detalle
     */
    public Object[] getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(String[][] detalle) {
        this.detalle = detalle;
    }
    
    
}
