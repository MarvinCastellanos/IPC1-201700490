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
public class Tipo {
    private String nombre;
    private int valorMax;

    public Tipo(String nombre, int valorMax) {
        this.nombre = nombre;
        this.valorMax = valorMax;
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
     * @return the valorMax
     */
    public int getValorMax() {
        return valorMax;
    }

    /**
     * @param valorMax the valorMax to set
     */
    public void setValorMax(int valorMax) {
        this.valorMax = valorMax;
    }
    
    
}
