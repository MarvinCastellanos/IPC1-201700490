/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
import Objeto.Bloque;
import Nodos.NodoSimple;
/**
 *
 * @author Marvin
 */
public class Cola {
    private NodoSimple cabeza;
    private int longitud=0;
    
    public boolean estaVacia(){
        return cabeza==null;
    }
    
    public int longitud(){
        return this.longitud;
    }
    
    public void encolar(Bloque bloque){
        NodoSimple nuevo = new NodoSimple(bloque);
        if (cabeza==null) {
            cabeza=nuevo;
        }else{
            NodoSimple auxiliar=cabeza;
            while(auxiliar.getSiguiente()!=null){
                auxiliar= auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
        longitud++;
    }
    
    public NodoSimple desencolar(){
        NodoSimple auxiliar = cabeza;
        cabeza = cabeza.getSiguiente();
        
        longitud--;
        return auxiliar;
    }
}
