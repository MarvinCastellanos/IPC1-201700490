/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Ventanas.*;
import Listas.*;
/**
 *
 * @author Marvin
 */
public class Main {
        public static ListaCola cola = new ListaCola();
        public static ListaCircularDoble circular = new ListaCircularDoble();
        public static ListaDoble listaDoble = new ListaDoble();
        public static ListaPila pila = new ListaPila();
        public static ListaSimple listaSimple = new ListaSimple();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Principal mostrar = new Principal();
        mostrar.setVisible(true);
    }
    
}
