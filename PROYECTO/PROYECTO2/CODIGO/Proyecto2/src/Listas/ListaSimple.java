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
public class ListaSimple {
    private NodoSimple cabeza;
    private int longitud=0;
    
    public boolean estaVacia(){
        return cabeza==null;
    }
    
    public int longitud(){
        return this.longitud;
    }
    
    public void insertar(Bloque bloque){
        NodoSimple nuevo= new NodoSimple(bloque);
        if (cabeza==null) {
            cabeza=nuevo;
        }else{
            NodoSimple auxiliar = cabeza;
            while(auxiliar.getSiguiente()!=null){
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }   
        longitud++;
    }
    
}
