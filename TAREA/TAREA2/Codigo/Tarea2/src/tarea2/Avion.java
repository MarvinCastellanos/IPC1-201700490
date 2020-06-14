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
public class Avion extends Transporte{

    private int cantidadPasajeros;
    private String marca;
    private String modelo;

    public Avion(int cantidadPasajeros, String marca, String modelo) {
        this.cantidadPasajeros = cantidadPasajeros;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    
    @Override
    public void avanzar() {
        System.out.println("Avance de avion con cantidad de pasajeros " + this.getCantidadPasajeros()
        + ", marca " + this.getMarca() + " "+ "modelo " + this.getModelo());
    }

    @Override
    public void frenar() {
        System.out.println("Frene de avion con cantidad de pasajeros " + this.getCantidadPasajeros()
        + ", marca " + this.getMarca() + " "+ "modelo " + this.getModelo());
    }

    /**
     * @return the cantidadPasajeros
     */
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    /**
     * @param cantidadPasajeros the cantidadPasajeros to set
     */
    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
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
    
}
