/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoSimple;
import Objeto.Bloque;

/**
 *
 * @author Marvin
 */
public class Pila {

    private NodoSimple cabeza;
    private int longitud = 0;

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int longitud() {
        return this.longitud;
    }

    public void push(Bloque bloque) {
        NodoSimple nuevo = new NodoSimple(bloque);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoSimple auxiliar = cabeza;
            nuevo.setSiguiente(auxiliar);
            cabeza = nuevo;
        }
        longitud++;
    }

    public NodoSimple pop() {
        NodoSimple auxiliar = cabeza;
        cabeza = cabeza.getSiguiente();

        longitud--;
        return auxiliar;
    }
}
