/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import Objetos.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.Thread.sleep;
import javax.swing.JLabel;

/**
 *
 * @author Marvin
 */
public class Juego extends javax.swing.JFrame implements KeyListener {

    String nombre = "Prueba";
    public static int vidas;
    String poder = "ninguno";
    public static int punteo = 0;
    int tiempo = 240;
    JLabel nave = new JLabel();

    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
        jPanel1.setBackground(Color.black);
        jPanel2.setBackground(Color.white);
        getContentPane().add(jPanel1);
        getContentPane().add(jPanel2);

        jTextField1.setText(nombre);
        jTextField2.setText("" + vidas);
        jTextField3.setText(poder);
        jTextField4.setText("" + punteo);
        jTextField5.setText("" + tiempo);

        addKeyListener(this);
        setFocusable(true);
        add(nave);

        creaOjo();
        creaCorazon();
        creaRayo();
        creaCaracol();
        creaAsteroide();
        
//        Coordenada coordenadaBala = new Coordenada(30, 500);
//        Bala bala = new Bala(coordenadaBala);
//        jPanel1.add(bala.getBala());
//
//        Coordenada coordenadaAsteroide = new Coordenada(100, 100);
//        Asteroide asteroide = new Asteroide(coordenadaAsteroide);
//        jPanel1.add(asteroide.getAsteroide());
//
//        Coordenada coordenadaCaracol = new Coordenada(100, 200);
//        Caracol caracol = new Caracol(coordenadaCaracol);
//        jPanel1.add(caracol.getCaracol());
//
//        Coordenada coordenadaCorazon = new Coordenada(50, 450);
//        Corazon corazon = new Corazon(coordenadaCorazon);
//        jPanel1.add(corazon.getCorazon());
//
//        Coordenada coordenadaRayo = new Coordenada(50, 500);
//        Rayo rayo = new Rayo(coordenadaRayo);
//        jPanel1.add(rayo.getRayo());
//
//        Coordenada coordenadaOjo = new Coordenada(100, 300);
//        Ojo ojo = new Ojo(coordenadaOjo);
//        jPanel1.add(ojo.getOjo());
        Coordenada coordenadaNave = new Coordenada(0, 500);
        Nave naves = new Nave(coordenadaNave);
        this.nave = naves.getNave();
        jPanel1.add(this.nave);
    }

    public void mostrar() {
        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int tecla = e.getKeyCode();
        if (tecla == KeyEvent.VK_LEFT && this.nave.getLocation().x != 0) {
            System.out.println("Se presiono la izquierda");
            this.nave.setLocation(this.nave.getX() - 100, this.nave.getY());
            System.out.println("izquierda");
        }
        if (tecla == KeyEvent.VK_RIGHT && this.nave.getLocation().x != 500) {
            this.nave.setLocation(this.nave.getX() + 100, this.nave.getY());
            System.out.println("derecha");
        }
        
    }
    
     @Override
    public void keyReleased(KeyEvent e) {
        int tecla = e.getKeyCode();
        if (tecla == KeyEvent.VK_SPACE) {
            Bala bala = new Bala(this.nave.getLocation().x + 30, 500);
            jPanel1.add(bala.getBala());
        }
    }


    public void creaOjo() {
        new Thread() {
            int contador = 0;

            public void run() {
                while (true) {
                    int numero = (int) (Math.random() * 6) + 1;
                    if (numero == 1 && contador != 0) {
                        Ojo ojo = new Ojo(30, -10);
                        jPanel1.add(ojo.getOjo());
                    }
                    if (numero == 2 && contador != 0) {
                        Ojo ojo = new Ojo(130, -10);
                        jPanel1.add(ojo.getOjo());
                    }
                    if (numero == 3 && contador != 0) {
                        Ojo ojo = new Ojo(230, -10);
                        jPanel1.add(ojo.getOjo());
                    }
                    if (numero == 4 && contador != 0) {
                        Ojo ojo = new Ojo(330, -10);
                        jPanel1.add(ojo.getOjo());
                    }
                    if (numero == 5 && contador != 0) {
                        Ojo ojo = new Ojo(430, -10);
                        jPanel1.add(ojo.getOjo());
                    }
                    if (numero == 6 && contador != 0) {
                        Ojo ojo = new Ojo(530, -10);
                        jPanel1.add(ojo.getOjo());
                        contador++;
                    }
                    contador++;
                    try {
                        sleep(10000);
                    } catch (Exception e) {

                    }
                }
            }
        }.start();
    }

    public void creaCorazon() {
        new Thread() {
            int contador = 0;

            public void run() {
                while (true) {
                    int numero = (int) (Math.random() * 6) + 1;
                    if (numero == 1 && contador != 0) {
                        Corazon corazon = new Corazon(30, -10);
                        jPanel1.add(corazon.getCorazon());
                    }
                    if (numero == 2 && contador != 0) {
                        Corazon corazon = new Corazon(130, -10);
                        jPanel1.add(corazon.getCorazon());
                    }
                    if (numero == 3 && contador != 0) {
                        Corazon corazon = new Corazon(230, -10);
                        jPanel1.add(corazon.getCorazon());
                    }
                    if (numero == 4 && contador != 0) {
                        Corazon corazon = new Corazon(330, -10);
                        jPanel1.add(corazon.getCorazon());
                    }
                    if (numero == 5 && contador != 0) {
                        Corazon corazon = new Corazon(430, -10);
                        jPanel1.add(corazon.getCorazon());
                    }
                    if (numero == 6 && contador != 0) {
                        Corazon corazon = new Corazon(530, -10);
                        jPanel1.add(corazon.getCorazon());
                    }
                    contador++;
                    try {
                        sleep(14000);
                    } catch (Exception e) {

                    }
                }
            }
        }.start();
    }

    public void creaCaracol() {
        new Thread() {
            int contador = 0;

            public void run() {
                while (true) {
                    int numero = (int) (Math.random() * 6) + 1;
                    if (numero == 1 && contador != 0) {
                        Caracol caracol = new Caracol(30, -10);
                        jPanel1.add(caracol.getCaracol());
                    }
                    if (numero == 2 && contador != 0) {
                        Caracol caracol = new Caracol(130, -10);
                        jPanel1.add(caracol.getCaracol());
                    }
                    if (numero == 3 && contador != 0) {
                        Caracol caracol = new Caracol(230, -10);
                        jPanel1.add(caracol.getCaracol());
                    }
                    if (numero == 4 && contador != 0) {
                        Caracol caracol = new Caracol(330, -10);
                        jPanel1.add(caracol.getCaracol());
                    }
                    if (numero == 5 && contador != 0) {
                        Caracol caracol = new Caracol(430, -10);
                        jPanel1.add(caracol.getCaracol());
                    }
                    if (numero == 6 && contador != 0) {
                        Caracol caracol = new Caracol(530, -10);
                        jPanel1.add(caracol.getCaracol());
                    }
                    contador++;
                    try {
                        sleep(15000);
                    } catch (Exception e) {

                    }
                }
            }
        }.start();
    }

    public void creaRayo() {
        new Thread() {
            int contador = 0;

            public void run() {
                while (true) {
                    int numero = (int) (Math.random() * 6) + 1;
                    if (numero == 1 && contador != 0) {
                        Rayo rayo = new Rayo(30, -10);
                        jPanel1.add(rayo.getRayo());
                    }
                    if (numero == 2 && contador != 0) {
                        Rayo rayo = new Rayo(130, -10);
                        jPanel1.add(rayo.getRayo());
                    }
                    if (numero == 3 && contador != 0) {
                        Rayo rayo = new Rayo(230, -10);
                        jPanel1.add(rayo.getRayo());
                    }
                    if (numero == 4 && contador != 0) {
                        Rayo rayo = new Rayo(330, -10);
                        jPanel1.add(rayo.getRayo());
                    }
                    if (numero == 5 && contador != 0) {
                        Rayo rayo = new Rayo(430, -10);
                        jPanel1.add(rayo.getRayo());
                    }
                    if (numero == 6 && contador != 0) {
                        Rayo rayo = new Rayo(530, -10);
                        jPanel1.add(rayo.getRayo());
                    }
                    contador++;
                    try {
                        sleep(10000);
                    } catch (Exception e) {

                    }
                }
            }
        }.start();
    }

    public void creaAsteroide() {
        new Thread() {
            int contador = 0;

            public void run() {
                while (true) {
                    int numero = (int) (Math.random() * 6) + 1;
                    if (numero == 1 && contador != 0) {
                        Asteroide asteroide = new Asteroide(30, -10);
                        jPanel1.add(asteroide.getAsteroide());
                    }
                    if (numero == 2 && contador != 0) {
                        Asteroide asteroide = new Asteroide(130, -10);
                        jPanel1.add(asteroide.getAsteroide());
                    }
                    if (numero == 3 && contador != 0) {
                        Asteroide asteroide = new Asteroide(230, -10);
                        jPanel1.add(asteroide.getAsteroide());
                    }
                    if (numero == 4 && contador != 0) {
                        Asteroide asteroide = new Asteroide(330, -10);
                        jPanel1.add(asteroide.getAsteroide());
                    }
                    if (numero == 5 && contador != 0) {
                        Asteroide asteroide = new Asteroide(430, -10);
                        jPanel1.add(asteroide.getAsteroide());
                    }
                    if (numero == 6 && contador != 0) {
                        Asteroide asteroide = new Asteroide(530, -10);
                        jPanel1.add(asteroide.getAsteroide());
                    }
                    contador++;
                    try {
                        sleep(2000);
                    } catch (Exception e) {

                    }
                }
            }
        }.start();
    }

    public void colision() {
        //colision asteroide con nave

    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego de naves");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTextField1.setEditable(false);

        jLabel8.setText("Vidas");

        jTextField2.setEditable(false);

        jLabel9.setText("Poder");

        jTextField3.setEditable(false);

        jLabel10.setText("Punteo");

        jTextField4.setEditable(false);

        jLabel11.setText("Tiempo");

        jTextField5.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

}
