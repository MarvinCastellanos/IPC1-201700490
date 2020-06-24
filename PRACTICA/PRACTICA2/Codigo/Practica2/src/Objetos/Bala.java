/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Marvin
 */
public class Bala extends Coordenada {

    JLabel bala = new JLabel();
    boolean continua=false;

    public Bala(Coordenada coordenada) {
        super.setX(coordenada.getX());
        super.setY(coordenada.getY());
        this.agrega();
        mueveBala();
    }

    public Bala(int x, int y) {
        super.setX(x);
        super.setY(y);
        this.agrega();
        mueveBala();
    }

    public void detiene(boolean continua){
        this.continua=continua;
    }
    private void agrega() {
        this.bala.setIcon(new ImageIcon("src\\Imagenes\\Misil.png"));
        this.bala.setBounds(this.getX(), this.getY(), 100, 100);
        this.bala.setVisible(true);
    }

    public JLabel getBala() {
        return this.bala;
    }

    public void actualizaCoordenada(Coordenada coordenadaNueva) {
        super.setX(coordenadaNueva.getX());
        super.setY(coordenadaNueva.getY());
    }

    public void actualizaCoordenada(int x, int y) {
        super.setX(x);
        super.setY(y);
    }

    public void mueveBala() {

        new Thread() {
            public void run() {
                int x = bala.getX();
                int y = bala.getY();
                while (!continua) {
                    y--;
                    if (y < -30) {
                        //y=500;
                        bala.setLocation(-2000, -2000);
                        break;
                    }
                    bala.setLocation(x, y);

                    try {
                        Ventanas.Juego.colision();
                        sleep(10);
                    } catch (Exception e) {

                    }
                }
            }
        }.start();
    }
}
