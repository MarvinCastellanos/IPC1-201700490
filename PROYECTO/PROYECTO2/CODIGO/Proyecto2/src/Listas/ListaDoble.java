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
    int contador;

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
            cabeza.setPosicion(contador+1);
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
            nuevo.setPosicion(contador+1);
        }
        longitud++;
        contador++;
    }

    public void eliminar(String valor) {
        NodoDoble auxiliar = cabeza;
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        } else {
            while (auxiliar.getSiguiente() != null) {
                //si el valor a eliminar es la cabeza
                if (auxiliar.getBloque().getValor().equals(valor)) {
                    cabeza = auxiliar.getSiguiente();
                    cabeza.setAnterior(null);
                    longitud--;
                    break;
                }
                //si se recorre la lista y no se encuentra el valor
                if (auxiliar.getSiguiente() == null) {
                    JOptionPane.showMessageDialog(null, "No fue posible eliminarlo");
                    //si el valor a eliminar esta en el cuerpo de la lista
                } else if(auxiliar.getSiguiente().getBloque().getValor().equals(valor)&&auxiliar.getSiguiente().getSiguiente()==null){
                    auxiliar.setSiguiente(null);
                    break;
                }
                else if (auxiliar.getSiguiente().getBloque().getValor().equals(valor)) {
                    auxiliar.getSiguiente().setAnterior(null);
                    auxiliar.setSiguiente(auxiliar.getSiguiente().getSiguiente());
                    auxiliar.getSiguiente().getAnterior().setSiguiente(null);
                    auxiliar.getSiguiente().setAnterior(auxiliar);
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
            if (auxiliar.getAnterior()!=null) {
                codigo+=""+auxiliar.getPosicion()+"->"+auxiliar.getAnterior().getPosicion()+";\n";
            }          
        }

        codigo += "}";
        return codigo;
    }
}
