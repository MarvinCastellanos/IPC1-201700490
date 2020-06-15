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
public class Uso {
    private String nombre;
    private double aumentoPoliza;

    public Uso(String nombre, double aumentoPoliza) {
        this.nombre = nombre;
        this.aumentoPoliza = aumentoPoliza;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the aumentoPoliza
     */
    public double getAumentoPoliza() {
        return aumentoPoliza;
    }

    /**
     * @param aumentoPoliza the aumentoPoliza to set
     */
    public void setAumentoPoliza(double aumentoPoliza) {
        this.aumentoPoliza = aumentoPoliza;
    }
    
    
}
