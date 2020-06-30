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
public class ListaPila {

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
            cabeza.setPosicion(longitud+1);
        } else {
            NodoSimple auxiliar = cabeza;
            nuevo.setSiguiente(auxiliar);
            cabeza = nuevo;
            nuevo.setPosicion(longitud+1);
        }
        longitud++;
    }

    public NodoSimple pop() {
        NodoSimple auxiliar = cabeza;
        cabeza = cabeza.getSiguiente();

        longitud--;
        return auxiliar;
    }
    
    public String getCodigoGraphviz(){
        String codigo="";
        int contador=0;
        NodoSimple auxiliar=cabeza;
        codigo+="digraph G {\n";
        codigo+="0[label=\"TOPE\"]\n";
        if (auxiliar==null) {
            codigo+="";
        }else{
            while(auxiliar.getSiguiente()!=null){
            if (contador==0) {
                codigo+="0->"+auxiliar.getPosicion()+";\n";
            }
            codigo+=""+auxiliar.getPosicion()+"[label=\""+auxiliar.getBloque().getValor()+
                    ","+auxiliar.getBloque().getColor()+"\"]\n";
            codigo+=""+auxiliar.getPosicion()+"->"+auxiliar.getSiguiente().getPosicion()+";\n";
            auxiliar=auxiliar.getSiguiente();
            contador++;
        }
        codigo+=""+auxiliar.getPosicion()+"[label=\""+auxiliar.getBloque().getValor()+
                ","+auxiliar.getBloque().getColor()+"\"]\n";
        }
        
        codigo+="}";
        return codigo;
    }
}
