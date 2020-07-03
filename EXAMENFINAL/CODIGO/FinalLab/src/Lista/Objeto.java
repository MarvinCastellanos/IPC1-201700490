/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Marvin
 */
public class Objeto extends JFrame {

    private String valor;
    private JButton boton = new JButton();
    boolean pulsado=false;

    public Objeto() {
        boton.setBounds(50, -100, 100, 100);
        mueveBoton();
    }

    public Objeto(String valor) {
        this.valor = valor;
        boton.setText(valor);
        boton.setBounds(50, -100, 100, 100);
        mueveBoton();
        insertar();
       
    }

    public void insertar(){
        this.boton.addActionListener(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {
                Objeto nuevo= new Objeto(valor);
                Main.Main.pila.push(nuevo);
                pulsado=true;
            }
        });
    }
    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    public void mueveBoton() {

        new Thread() {
            public void run() {
                int x = 50;
                int y = -100;
                boolean activo = true;
                while (activo) {
                    if (Ventana.Principal.tiempo == 0) {
                        activo = false;
                    }

                    y++;
                    if (pulsado) {
                        y=3000;
                        activo=false;
                    }
                    if (y > 800) {
                        getBoton().setLocation(-200, -200);
                        break;
                    }
                    //jLabel1.setLocation(x,y);
                    getBoton().setLocation(x, y);

                    try {
                        sleep(10);
                    } catch (Exception e) {

                    }
                }
            }
        }.start();
    }

    /**
     * @return the boton
     */
    public JButton getBoton() {
        return boton;
    }

    /**
     * @param boton the boton to set
     */
    public void setBoton(JButton boton) {
        this.boton = boton;
    }
}
