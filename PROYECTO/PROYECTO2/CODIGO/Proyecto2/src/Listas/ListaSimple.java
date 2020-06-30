/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoSimple;
import Objeto.Bloque;
import javax.swing.JOptionPane;

/**
 *
 * @author Marvin
 */
public class ListaSimple {

    private NodoSimple cabeza;
    private int longitud = 0;

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int longitud() {
        return this.longitud;
    }

    public void insertar(Bloque bloque) {
        NodoSimple nuevo = new NodoSimple(bloque);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoSimple auxiliar = cabeza;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
        longitud++;
    }

    public void eliminar(String valor) {
        NodoSimple auxiliar = cabeza;
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        } else {
            while (auxiliar.getSiguiente() != null) {
                //si el valor a eliminar es la cabeza 
                if (auxiliar.getBloque().getValor().equals(valor)) {
                    cabeza = auxiliar.getSiguiente();
                    longitud--;
                    return;
                }
                //si se recorre la lista y no se encuentra el valor
                if (auxiliar.getSiguiente() == null) {
                    JOptionPane.showMessageDialog(null, "No fue posible eliminarlo");
                    //si el valor esta en el cuerpo de la lista
                } else if (auxiliar.getSiguiente().getBloque().getValor().equals(valor)) {
                    auxiliar.setSiguiente(auxiliar.getSiguiente().getSiguiente());
                    auxiliar.getSiguiente().setSiguiente(null);
                    longitud--;
                    break;
                }
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }

    public void resetear() {
        cabeza = null;
    }
}
