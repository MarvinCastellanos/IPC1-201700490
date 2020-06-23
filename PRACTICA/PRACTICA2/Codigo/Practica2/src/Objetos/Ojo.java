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
public class Ojo extends Coordenada{
    JLabel ojo=new JLabel();

    public Ojo(Coordenada coordenada) {
        super.setX(coordenada.getX());
        super.setY(coordenada.getY());
        this.agrega();
        mueveOjo();
    }
    
    public Ojo(int x, int y) {
        super.setX(x);
        super.setY(y);
        this.agrega();
        mueveOjo();
    }
    
    public void agrega(){
        this.ojo.setIcon(new ImageIcon("src\\Imagenes\\Ojo.png"));
        this.ojo.setBounds(this.getX(), this.getY(), 50, 50);
        this.ojo.setVisible(true);
    }
    
    public JLabel getOjo(){
        return this.ojo;
    }
    
    public void actualizaCoordenada(Coordenada coordenadaNueva){
        super.setX(coordenadaNueva.getX());
        super.setY(coordenadaNueva.getY());
    }
    
    public void mueveOjo(){         
        new Thread(){
            public void run(){
                int x=ojo.getX();
                int y=ojo.getY();
                while(true){
                    y++;
                    if (y>800) {
                        ojo.setLocation(-100, -100);
                        break;
                    }                  
                    ojo.setLocation(x, y);                    
                    try{
                        sleep(10);
                    }catch(Exception e){    
                    }
                }
            }
        }.start();
    }
}
