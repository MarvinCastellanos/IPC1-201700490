/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Marvin
 */
public class Caracol extends Coordenada{
    JLabel caracol=new JLabel();
    boolean continua=false;

    public Caracol(Coordenada coordenada) {
        super.setX(coordenada.getX());
        super.setY(coordenada.getY());
        this.agrega();
        mueveCaracol();
    }
    
    public Caracol(int x, int y) {
        super.setX(x);
        super.setY(y);
        this.agrega();
        mueveCaracol();
    }
    
    public void agrega(){
        this.caracol.setIcon(new ImageIcon("src\\Imagenes\\Caracol.png"));
        this.caracol.setBounds(this.getX(), this.getY(), 50, 50);
        this.caracol.setVisible(true);
    }
    
    public void detiene(boolean continua){
        this.continua=continua;
    }
    
    public JLabel getCaracol(){
        return this.caracol;
    }
    
    public void actualizaCoordenada(Coordenada coordenadaNueva){
        super.setX(coordenadaNueva.getX());
        super.setY(coordenadaNueva.getY());
    }

    public void mueveCaracol(){
         
        new Thread(){
            public void run(){
                int x=caracol.getX();
                int y=caracol.getY();
                while(!continua){
                    y++;
                    if (y>800) {
                        caracol.setLocation(-100, -100);
                        break;
                    }                  
                    caracol.setLocation(x, y);
                    
                    try{
                        sleep(10);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
    }
}
