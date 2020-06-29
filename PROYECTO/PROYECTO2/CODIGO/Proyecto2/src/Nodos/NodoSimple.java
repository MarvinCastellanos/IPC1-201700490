/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;
import Objeto.*;
/**
 *
 * @author Marvin
 */
public class NodoSimple {
    private Bloque bloque;
    private NodoSimple siguiente=null;

    public NodoSimple(Bloque bloque) {
        this.bloque = bloque;
    }

    /**
     * @return the bloque
     */
    public Bloque getBloque() {
        return bloque;
    }

    /**
     * @param bloque the bloque to set
     */
    public void setBloque(Bloque bloque) {
        this.bloque = bloque;
    }

    /**
     * @return the siguiente
     */
    public NodoSimple getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
