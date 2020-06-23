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
public class Corazon extends Coordenada{
    JLabel corazon=new JLabel();

    public Corazon(Coordenada coordenada) {
        super.setX(coordenada.getX());
        super.setY(coordenada.getY());
        this.agrega();
        mueveCorazon();
    }
    
    public Corazon(int x, int y) {
        super.setX(x);
        super.setY(y);
        this.agrega();
        mueveCorazon();
    }
    
    public void agrega(){
        this.corazon.setIcon(new ImageIcon("src\\Imagenes\\Corazon.png"));
        this.corazon.setBounds(this.getX(), this.getY(), 50, 50);
        this.corazon.setVisible(true);
    }
    
    public JLabel getCorazon(){
        return this.corazon;
    }
    
    public void actualizaCoordenada(Coordenada coordenadaNueva){
        super.setX(coordenadaNueva.getX());
        super.setY(coordenadaNueva.getY());
    }
    public void mueveCorazon(){         
        new Thread(){
            public void run(){
                int x=corazon.getX();
                int y=corazon.getY();
                while(true){
                    y++;
                    if (y>800) {
                        corazon.setLocation(-100, -100);
                        break;
                    }                  
                    corazon.setLocation(x, y);                    
                    try{
                        sleep(10);
                    }catch(Exception e){    
                    }
                }
            }
        }.start();
    }
}
