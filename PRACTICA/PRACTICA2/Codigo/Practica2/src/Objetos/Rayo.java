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
public class Rayo extends Coordenada{
    JLabel rayo=new JLabel();

    public Rayo(Coordenada coordenada) {
        super.setX(coordenada.getX());
        super.setY(coordenada.getY());
        this.agrega();
        mueveRayo();
    }
    
    public Rayo(int x, int y) {
        super.setX(x);
        super.setY(y);
        this.agrega();
        mueveRayo();
    }
    
    public void agrega(){
        this.rayo.setIcon(new ImageIcon("src\\Imagenes\\Rayo.png"));
        this.rayo.setBounds(this.getX(), this.getY(), 50, 50);
        this.rayo.setVisible(true);
    }
    
    public JLabel getRayo(){
        return this.rayo;
    }
    
    public void actualizaCoordenada(Coordenada coordenadaNueva){
        super.setX(coordenadaNueva.getX());
        super.setY(coordenadaNueva.getY());
    }
    
     public void mueveRayo(){         
        new Thread(){
            public void run(){
                int x=rayo.getX();
                int y=rayo.getY();
                while(true){
                    y++;
                    if (y>800) {
                        rayo.setLocation(-100, -100);
                        break;
                    }                  
                    rayo.setLocation(x, y);                    
                    try{
                        sleep(10);
                    }catch(Exception e){    
                    }
                }
            }
        }.start();
    }
    
}
