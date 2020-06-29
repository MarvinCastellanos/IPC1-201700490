/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
import Objeto.Bloque;
import Nodos.NodoDoble;
/**
 *
 * @author Marvin
 */
public class ListaCircularDoble {
    NodoDoble cabeza;
    int longitud;
    
    public boolean estaVacia(){
        return cabeza==null;
    }
    
    public int longitud(){
        return this.longitud;
    }
    
    public void insertar(Bloque bloque){
        NodoDoble nuevo= new NodoDoble(bloque);
        if (cabeza==null) {
            cabeza= nuevo;
            cabeza.setAnterior(cabeza);
            cabeza.setSiguiente(cabeza);
        }else{
            NodoDoble auxiliar=cabeza;
            while(auxiliar.getSiguiente()!=cabeza){
                auxiliar=auxiliar.getSiguiente();
            }
            nuevo.setAnterior(auxiliar);
            nuevo.setSiguiente(cabeza);
            auxiliar.setSiguiente(nuevo);
            cabeza.setAnterior(nuevo);
        }
        longitud++;
    }
}
