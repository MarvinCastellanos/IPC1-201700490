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
public class Solicitante {
    private String nombres;
    private String apellidos;
    private String dpi;
    private String telefono;
    private String tipoVehiculo;
    private String marcaVehiculo;
    private String lineaVehiculo;
    private String modeloVehiculo;
    private int valorVehiculo;
    private double costoPrima;
    private double deducible;
    private String tipo;
    private String status;

    public Solicitante(String nombres, String apellidos, String dpi, String telefono, String tipoVehiculo, String marcaVehiculo, String lineaVehiculo, String modeloVehiculo, int valorVehiculo, double costoPrima, double deducible) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dpi = dpi;
        this.telefono = telefono;
        this.tipoVehiculo = tipoVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.lineaVehiculo = lineaVehiculo;
        this.modeloVehiculo = modeloVehiculo;
        this.valorVehiculo = valorVehiculo;
        this.costoPrima = costoPrima;
        this.deducible = deducible;
        this.tipo="AUTOMAS";
        this.status="EN PROCESO";
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the tipoVehiculo
     */
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    /**
     * @param tipoVehiculo the tipoVehiculo to set
     */
    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    /**
     * @return the marcaVehiculo
     */
    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    /**
     * @param marcaVehiculo the marcaVehiculo to set
     */
    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    /**
     * @return the lineaVehiculo
     */
    public String getLineaVehiculo() {
        return lineaVehiculo;
    }

    /**
     * @param lineaVehiculo the lineaVehiculo to set
     */
    public void setLineaVehiculo(String lineaVehiculo) {
        this.lineaVehiculo = lineaVehiculo;
    }

    /**
     * @return the modeloVehiculo
     */
    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    /**
     * @param modeloVehiculo the modeloVehiculo to set
     */
    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    /**
     * @return the valorVehiculo
     */
    public int getValorVehiculo() {
        return valorVehiculo;
    }

    /**
     * @param valorVehiculo the valorVehiculo to set
     */
    public void setValorVehiculo(int valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    /**
     * @return the costoPrima
     */
    public double getCostoPrima() {
        return costoPrima;
    }

    /**
     * @param costoPrima the costoPrima to set
     */
    public void setCostoPrima(double costoPrima) {
        this.costoPrima = costoPrima;
    }

    /**
     * @return the deducible
     */
    public double getDeducible() {
        return deducible;
    }

    /**
     * @param deducible the deducible to set
     */
    public void setDeducible(double deducible) {
        this.deducible = deducible;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
