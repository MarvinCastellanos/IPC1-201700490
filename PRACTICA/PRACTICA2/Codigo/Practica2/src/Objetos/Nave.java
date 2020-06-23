/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Marvin
 */
public class Nave extends Coordenada implements KeyListener{
    JLabel nave=new JLabel();

    public Nave(Coordenada coordenada) {
        super.setX(coordenada.getX());
        super.setY(coordenada.getY());
        this.agrega();
    }
    
    public void agrega(){
        this.nave.setIcon(new ImageIcon("src\\Imagenes\\Nave.png"));
        this.nave.setText("nave");
        this.nave.setForeground(Color.white);
        this.nave.setBounds(this.getX(), this.getY(), 100, 100);
        this.nave.setVisible(true);
    }
    
    public JLabel getNave(){
        return this.nave;
    }
    
    public void actualizaCoordenada(Coordenada coordenadaNueva){
        super.setX(coordenadaNueva.getX());
        super.setY(coordenadaNueva.getY());
    }
    
    public void actualizaCoordenada(int x,int y){
        super.setX(x);
        super.setY(y);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int tecla = e.getKeyCode();
        if (tecla == KeyEvent.VK_LEFT) {
            this.actualizaCoordenada(super.getX()-20,super.getY());
        }
        if (tecla == KeyEvent.VK_RIGHT) {
            this.actualizaCoordenada(super.getX()+20,super.getY());
        }
    }   

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
