/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author Marvin
 */
public class Coche extends Transporte {

    private String marca;
    private String modelo;
    private String tipoVehiculo;

    public Coche(String marca, String modelo, String tipoVehiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public void avanzar() {
        System.out.println("Avance de auto " + this.getMarca() + ", modelo " + this.getModelo() + " "
                + "tipo " + this.getTipoVehiculo());
    }

    @Override
    public void frenar() {
        System.out.println("Frene de auto " + this.getMarca() + ", modelo " + this.getModelo() + " "
                + "tipo " + this.getTipoVehiculo());
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
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

}
