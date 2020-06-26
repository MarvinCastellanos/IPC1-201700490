/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Marvin
 */
public class CambiaColor extends Thread {
    JButton boton1;
    JButton boton2;
    boolean esAzul;


    public void cambiaColor() {
        new Thread() {
            boolean estado=esAzul;
            public void run() {
                while (true) {
                    if (!esAzul) {
                        boton1.setBackground(Color.blue);
                        boton2.setBackground(Color.red);
                        estado=true;
                    } else {
                        boton1.setBackground(Color.blue);
                        boton2.setBackground(Color.red);
                        estado=false;
                    }
                    try {
                        sleep(2000);
                    } catch (Exception e) {

                    }
                }
            }
        }.start();
    }

}
