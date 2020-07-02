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
    int contador;

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
            cabeza.setPosicion(contador+1);
        } else {
            NodoSimple auxiliar = cabeza;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
            nuevo.setPosicion(contador+1);
        }
        longitud++;
        contador++;
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
                    auxiliar.setSiguiente(null);
                    longitud--;
                    return;
                }
                //si se recorre la lista y no se encuentra el valor
                if (auxiliar.getSiguiente() == null) {
                    JOptionPane.showMessageDialog(null, "No fue posible eliminarlo");
                    //si el valor esta en el cuerpo de la lista
                }else if(auxiliar.getSiguiente().getBloque().getValor().equals(valor)&&auxiliar.getSiguiente().getSiguiente()==null){
                    auxiliar.setSiguiente(null);
                    break;
                } 
                else if (auxiliar.getSiguiente().getBloque().getValor().equals(valor)) {
                    auxiliar.setSiguiente(auxiliar.getSiguiente().getSiguiente());
                    longitud--;
                    break;
                }
                auxiliar = auxiliar.getSiguiente();
            }
            if (auxiliar.getBloque().getValor().equals(valor)&&auxiliar.getSiguiente()==null) {
                    cabeza = null;
                    longitud--;
                }
        }
    }

    public void resetear() {
        cabeza = null;
        longitud=0;
    }

    public String getCodigoGraphviz() {
        String codigo = "";
        NodoSimple auxiliar = cabeza;
        codigo += "digraph G {\n";
        if (auxiliar == null) {
            codigo += "";
        } else {
            while (auxiliar.getSiguiente() != null) {
                codigo += "" + auxiliar.getPosicion() + "[label=\"" + auxiliar.getBloque().getValor()
                        + "," + auxiliar.getBloque().getColor() + "\"]\n";
                if (auxiliar.getSiguiente() != null) {
                    codigo += "" + auxiliar.getPosicion() + "->" + auxiliar.getSiguiente().getPosicion() + ";\n";
                    auxiliar = auxiliar.getSiguiente();
                }
            }
            codigo += "" + auxiliar.getPosicion() + "[label=\"" + auxiliar.getBloque().getValor()
                    + "," + auxiliar.getBloque().getColor() + "\"]\n";
        }

        codigo += "}";
        return codigo;
    }
    
    public Bloque obtener(int n) {
        if (cabeza == null) {
            return null;
        } else {
            NodoSimple auxiliar = cabeza;
            int contador = 0;
            while (contador < n && auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
                contador++;
            }
            if (contador != n) {
                return null;
            } else {
                return auxiliar.getBloque();
            }
        }
    }
}
