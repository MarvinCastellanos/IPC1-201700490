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
public class NodoDoble {
    private Bloque bloque;
    private NodoDoble siguiente=null;
    private NodoDoble anterior=null;

    public NodoDoble(Bloque bloque) {
        this.bloque=bloque;
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
    public NodoDoble getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoDoble getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
}
