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
public class Asteroide extends Coordenada{
    
    JLabel asteroide= new JLabel();

    public Asteroide(Coordenada coordenada) {
        super.setX(coordenada.getX());
        super.setY(coordenada.getY());
        this.agrega();
        mueveAsteroide();
    }
    
    public Asteroide(int x, int y) {
        super.setX(x);
        super.setY(y);
        this.agrega();
        mueveAsteroide();
    }

    public void agrega(){
        this.asteroide.setIcon(new ImageIcon("src\\Imagenes\\Asteroide.png"));
        this.asteroide.setForeground(Color.white);
        this.asteroide.setBounds(this.getX(), this.getY(), 50, 50);
        this.asteroide.setVisible(true);
    }
    public JLabel getAsteroide(){
        return this.asteroide;
    }
    
    public void actualizaCoordenada(Coordenada coordenadaNueva){
        super.setX(coordenadaNueva.getX());
        super.setY(coordenadaNueva.getY());
    }
    
    public void actualizaCoordenada(int x, int y){
        super.setX(x);
        super.setY(y);
    }
    
    public void mueveAsteroide(){
         
        new Thread(){
            public void run(){
                int x=asteroide.getX();
                int y=asteroide.getY();
                while(true){
                    y++;
                    if (y>800) {
                        asteroide.setLocation(-100, -100);
                        break;
                    } 
                    //jLabel1.setLocation(x,y);
                    asteroide.setLocation(x, y);
                    
                    try{
                        sleep(10);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
    }
}
