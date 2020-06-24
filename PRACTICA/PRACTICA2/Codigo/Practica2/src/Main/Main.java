/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Listas.*;
import Ventanas.*;
import Objetos.*;

/**
 *
 * @author Marvin
 */
public class Main {

    public static ListaAsteroides asteroides = new ListaAsteroides();
    public static ListaBalas balas = new ListaBalas();
    public static ListaCaracoles caracoles = new ListaCaracoles();
    public static ListaCorazones corazones = new ListaCorazones();
    public static ListaOjos ojos = new ListaOjos();
    public static ListaRayos rayos = new ListaRayos();
    public static ListaNave naves= new ListaNave();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu mostrar=new Menu();
        //Juego mostrar = new Juego();
        //Prueba mostrar = new Prueba();
        mostrar.setVisible(true);
    }

}
