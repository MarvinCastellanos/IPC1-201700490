/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import javax.swing.JOptionPane;

/**
 *
 * @author Marvin
 */
public class Lista {

    private Nodo cabeza;
    private int longitud = 0;
    int contador;

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int longitud() {
        return this.longitud;
    }

    public void push(Objeto bloque) {
        Nodo nuevo = new Nodo(bloque);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.setPosicion(contador + 1);
        } else {
            Nodo auxiliar = cabeza;
            nuevo.setSiguiente(auxiliar);
            cabeza = nuevo;
            nuevo.setPosicion(contador + 1);
        }
        longitud++;
        contador++;
    }

    public Nodo pop() {
        Nodo auxiliar = cabeza;
        
        if (cabeza==null) {
            JOptionPane.showMessageDialog(null, "La Pila esta vacia");
        }else{
            cabeza = cabeza.getSiguiente();
        longitud--;
        }
        return auxiliar;
    }

    public String getCodigoGraphviz() {
        String codigo = "";
        int contador = 0;
        Nodo auxiliar = cabeza;

        codigo += "digraph G {\n";
        codigo += "0[label=\"TOPE\"]\n";
        if (auxiliar == null) {
            codigo += "";
        } else {
            while (auxiliar.getSiguiente() != null) {

                if (contador == 0) {
                    codigo += "0->" + auxiliar.getPosicion() + ";\n";
                }
                codigo += "" + auxiliar.getPosicion() + "[label=\"" + auxiliar.getBloque().getValor()
                        + "\"]\n";
                codigo += "" + auxiliar.getPosicion() + "->" + auxiliar.getSiguiente().getPosicion() + ";\n";
                auxiliar = auxiliar.getSiguiente();
                contador++;
            }
            if (contador==0&&auxiliar.getSiguiente()==null) {
                    codigo+="0->"+auxiliar.getPosicion()+";\n";
                }
            codigo += "" + auxiliar.getPosicion() + "[label=\"" + auxiliar.getBloque().getValor()
                    + "\"]\n";
        }

        codigo += "}";
        return codigo;
    }

    public void resetear() {
        cabeza = null;
        longitud = 0;
    }
}
