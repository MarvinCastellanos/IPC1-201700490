/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Objeto.Bloque;
import Nodos.NodoDoble;
import Nodos.NodoSimple;
import javax.swing.JOptionPane;

/**
 *
 * @author Marvin
 */
public class ListaDoble {

    NodoDoble cabeza;
    int longitud;

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int longitud() {
        return this.longitud;
    }

    public void insertar(Bloque bloque) {
        NodoDoble nuevo = new NodoDoble(bloque);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.setPosicion(longitud+1);
            cabeza.setAnterior(null);
            cabeza.setSiguiente(null);
        } else {
            NodoDoble auxiliar = cabeza;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
            nuevo.setAnterior(auxiliar);
            nuevo.setSiguiente(null);
            nuevo.setPosicion(longitud+1);
        }
        longitud++;
    }

    public void eliminar(String valor) {
        NodoDoble auxiliar = cabeza;
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        } else {
            while (auxiliar.getSiguiente() != null) {
                //si el valor a eliminar es la cabeza
                if (auxiliar.getBloque().getValor().equals(valor)) {
                    auxiliar.getSiguiente().setAnterior(null);
                    cabeza = auxiliar.getSiguiente();
                    auxiliar.setSiguiente(null);
                    longitud--;
                    return;
                }
                //si se recorre la lista y no se encuentra el valor
                if (auxiliar.getSiguiente() == null) {
                    JOptionPane.showMessageDialog(null, "No fue posible eliminarlo");
                    //si el valor a eliminar esta en el cuerpo de la lista
                } else if (auxiliar.getSiguiente().getBloque().getValor().equals(valor)) {
                    auxiliar.getSiguiente().setAnterior(null);
                    auxiliar.setSiguiente(auxiliar.getSiguiente().getSiguiente());
                    auxiliar.getSiguiente().getAnterior().setSiguiente(null);
                    auxiliar.getSiguiente().setAnterior(auxiliar);
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

    public String getCodigoGraphviz() {
        String codigo = "";
        NodoDoble auxiliar = cabeza;
        codigo += "digraph G {\n";
        if (auxiliar == null) {
            codigo += "";
        } else {
            while (auxiliar.getSiguiente() != null) {
                codigo += "" + auxiliar.getPosicion() + "[label=\"" + auxiliar.getBloque().getValor()
                        + "," + auxiliar.getBloque().getColor() + "\"]\n";
                if (auxiliar.getSiguiente() != null) {
                    codigo += "" + auxiliar.getPosicion() + "->" + auxiliar.getSiguiente().getPosicion() + ";\n";
                }
                if (auxiliar.getAnterior()!=null) {
                    codigo+=""+auxiliar.getPosicion()+"->"+auxiliar.getAnterior().getPosicion()+";\n";
                }

                auxiliar = auxiliar.getSiguiente();
            }
            codigo += "" + auxiliar.getPosicion() + "[label=\"" + auxiliar.getBloque().getValor()
                    + "," + auxiliar.getBloque().getColor() + "\"]\n";
            codigo+=""+auxiliar.getPosicion()+"->"+auxiliar.getAnterior().getPosicion()+";\n";
        }

        codigo += "}";
        return codigo;
    }
}
