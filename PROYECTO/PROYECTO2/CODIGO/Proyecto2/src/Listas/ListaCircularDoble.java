/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
import Objeto.Bloque;
import Nodos.NodoDoble;
import javax.swing.JOptionPane;
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
        nuevo.setPosicion(longitud+1);
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
    
    public void eliminar(String valor){
        NodoDoble auxiliar =cabeza;
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La Lista esta vacia");
        }else{
            while(auxiliar.getSiguiente()!=cabeza){
                //si el valor a eliminar es la cabeza
                if (auxiliar.getBloque().getValor().equals(valor)) {
                    auxiliar.getAnterior().setSiguiente(auxiliar.getSiguiente());
                    auxiliar.getSiguiente().setAnterior(auxiliar.getAnterior());
                    auxiliar.setAnterior(null);
                    auxiliar.setSiguiente(null);
                    cabeza = auxiliar.getSiguiente();
                    longitud--;
                    return;
                }
                //si se ha recorrido la lista y no se ha encontrado igualdad
                if (auxiliar.getSiguiente() == cabeza) {
                    JOptionPane.showMessageDialog(null, "No fue posible eliminarlo");
                    //si el valor se encuentra en el cuerpo de la lista
                } else if (auxiliar.getSiguiente().getBloque().getValor().equals(valor)) {
                    auxiliar.setSiguiente(auxiliar.getSiguiente().getSiguiente());
                    auxiliar.getSiguiente().setAnterior(auxiliar);
                    longitud--;
                    break;
                }
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }
    
    public void resetear(){
        cabeza=null;
    }
    
    public String getCodigoGraphviz() {
        String codigo = "";
        NodoDoble auxiliar = cabeza;
        codigo += "digraph G {\n";
        if (cabeza == null) {
            codigo += "";
        } else {
            while (auxiliar.getSiguiente() != cabeza) {
                codigo += "" + auxiliar.getPosicion() + "[label=\""
                        + auxiliar.getBloque().getValor()+","+
                        auxiliar.getBloque().getColor()+ "\"]\n";
                codigo += "" + auxiliar.getPosicion()+ "->"
                        + auxiliar.getSiguiente().getPosicion()+ ";\n";
                codigo+=""+auxiliar.getPosicion()+"->"+
                        auxiliar.getAnterior().getPosicion()+";\n";
                auxiliar = auxiliar.getSiguiente();
            }
            codigo += "" + auxiliar.getPosicion() + "[label=\""
                        + auxiliar.getBloque().getValor()+","+
                        auxiliar.getBloque().getColor()+ "\"]\n";
                codigo += "" + auxiliar.getPosicion()+ "->"
                        + auxiliar.getSiguiente().getPosicion()+ ";\n";
                codigo+=""+auxiliar.getPosicion()+"->"+
                        auxiliar.getAnterior().getPosicion()+";\n";
        }
        codigo += "}";
        return codigo;
    }
}
