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
import Objetos.*;
import java.awt.geom.Area;

/**
 *
 * @author Marvin
 */
public class Juego extends javax.swing.JFrame implements KeyListener {

    static Nave naveEstatica;
    String nombre = "Prueba";
    static int vidas;
    static int poder;
    static int velocidad;
    static int punteo;
    int tiempo = 240;

    JLabel nave = new JLabel();

    /**
     * Creates new form Juego
     */
    public Juego() {
        punteo = 0;
        vidas = 3;
        poder = 0;
        velocidad = 1;

        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
        jPanel1.setBackground(Color.black);
        jPanel2.setBackground(Color.white);
        getContentPane().add(jPanel1);
        getContentPane().add(jPanel2);

        jTextField1.setText(nombre);
        jTextField2.setText("" + vidas);
        jTextField3.setText("" + poder);
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
        actualizaMarcadores();

        Coordenada coordenadaNave = new Coordenada(0, 500);
        Nave naves = new Nave(coordenadaNave);
        this.nave = naves.getNave();
        jPanel1.add(this.nave);
        Main.Main.naves.insertarPrincipio(naves);

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
            Main.Main.balas.insertarPrincipio(bala);
        }
    }

    public void actualizaMarcadores() {
        new Thread() {
            public void run() {
                while (true) {
                    tiempo--;
                    jTextField1.setText(nombre);
                    jTextField2.setText("" + vidas);
                    jTextField3.setText("" + poder);
                    jTextField4.setText("" + punteo);
                    jTextField5.setText("" + tiempo);
                    try {
                        sleep(1000);
                    } catch (Exception e) {

                    }
                }
            }
        }.start();
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
                        Main.Main.ojos.insertarPrincipio(ojo);
                    }
                    if (numero == 2 && contador != 0) {
                        Ojo ojo = new Ojo(130, -10);
                        jPanel1.add(ojo.getOjo());
                        Main.Main.ojos.insertarPrincipio(ojo);
                    }
                    if (numero == 3 && contador != 0) {
                        Ojo ojo = new Ojo(230, -10);
                        jPanel1.add(ojo.getOjo());
                        Main.Main.ojos.insertarPrincipio(ojo);
                    }
                    if (numero == 4 && contador != 0) {
                        Ojo ojo = new Ojo(330, -10);
                        jPanel1.add(ojo.getOjo());
                        Main.Main.ojos.insertarPrincipio(ojo);
                    }
                    if (numero == 5 && contador != 0) {
                        Ojo ojo = new Ojo(430, -10);
                        jPanel1.add(ojo.getOjo());
                        Main.Main.ojos.insertarPrincipio(ojo);
                    }
                    if (numero == 6 && contador != 0) {
                        Ojo ojo = new Ojo(530, -10);
                        jPanel1.add(ojo.getOjo());
                        Main.Main.ojos.insertarPrincipio(ojo);
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
                        Main.Main.corazones.insertarPrincipio(corazon);
                    }
                    if (numero == 2 && contador != 0) {
                        Corazon corazon = new Corazon(130, -10);
                        jPanel1.add(corazon.getCorazon());
                        Main.Main.corazones.insertarPrincipio(corazon);
                    }
                    if (numero == 3 && contador != 0) {
                        Corazon corazon = new Corazon(230, -10);
                        jPanel1.add(corazon.getCorazon());
                        Main.Main.corazones.insertarPrincipio(corazon);
                    }
                    if (numero == 4 && contador != 0) {
                        Corazon corazon = new Corazon(330, -10);
                        jPanel1.add(corazon.getCorazon());
                        Main.Main.corazones.insertarPrincipio(corazon);
                    }
                    if (numero == 5 && contador != 0) {
                        Corazon corazon = new Corazon(430, -10);
                        jPanel1.add(corazon.getCorazon());
                        Main.Main.corazones.insertarPrincipio(corazon);
                    }
                    if (numero == 6 && contador != 0) {
                        Corazon corazon = new Corazon(530, -10);
                        jPanel1.add(corazon.getCorazon());
                        Main.Main.corazones.insertarPrincipio(corazon);
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
                        Main.Main.caracoles.insertarPrincipio(caracol);
                    }
                    if (numero == 2 && contador != 0) {
                        Caracol caracol = new Caracol(130, -10);
                        jPanel1.add(caracol.getCaracol());
                        Main.Main.caracoles.insertarPrincipio(caracol);
                    }
                    if (numero == 3 && contador != 0) {
                        Caracol caracol = new Caracol(230, -10);
                        jPanel1.add(caracol.getCaracol());
                        Main.Main.caracoles.insertarPrincipio(caracol);
                    }
                    if (numero == 4 && contador != 0) {
                        Caracol caracol = new Caracol(330, -10);
                        jPanel1.add(caracol.getCaracol());
                        Main.Main.caracoles.insertarPrincipio(caracol);
                    }
                    if (numero == 5 && contador != 0) {
                        Caracol caracol = new Caracol(430, -10);
                        jPanel1.add(caracol.getCaracol());
                        Main.Main.caracoles.insertarPrincipio(caracol);
                    }
                    if (numero == 6 && contador != 0) {
                        Caracol caracol = new Caracol(530, -10);
                        jPanel1.add(caracol.getCaracol());
                        Main.Main.caracoles.insertarPrincipio(caracol);
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
                        Main.Main.rayos.insertarPrincipio(rayo);
                    }
                    if (numero == 2 && contador != 0) {
                        Rayo rayo = new Rayo(130, -10);
                        jPanel1.add(rayo.getRayo());
                        Main.Main.rayos.insertarPrincipio(rayo);
                    }
                    if (numero == 3 && contador != 0) {
                        Rayo rayo = new Rayo(230, -10);
                        jPanel1.add(rayo.getRayo());
                        Main.Main.rayos.insertarPrincipio(rayo);
                    }
                    if (numero == 4 && contador != 0) {
                        Rayo rayo = new Rayo(330, -10);
                        jPanel1.add(rayo.getRayo());
                        Main.Main.rayos.insertarPrincipio(rayo);
                    }
                    if (numero == 5 && contador != 0) {
                        Rayo rayo = new Rayo(430, -10);
                        jPanel1.add(rayo.getRayo());
                        Main.Main.rayos.insertarPrincipio(rayo);
                    }
                    if (numero == 6 && contador != 0) {
                        Rayo rayo = new Rayo(530, -10);
                        jPanel1.add(rayo.getRayo());
                        Main.Main.rayos.insertarPrincipio(rayo);
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
                        Main.Main.asteroides.insertarPrincipio(asteroide);
                    }
                    if (numero == 2 && contador != 0) {
                        Asteroide asteroide = new Asteroide(130, -10);
                        jPanel1.add(asteroide.getAsteroide());
                        Main.Main.asteroides.insertarPrincipio(asteroide);
                    }
                    if (numero == 3 && contador != 0) {
                        Asteroide asteroide = new Asteroide(230, -10);
                        jPanel1.add(asteroide.getAsteroide());
                        Main.Main.asteroides.insertarPrincipio(asteroide);
                    }
                    if (numero == 4 && contador != 0) {
                        Asteroide asteroide = new Asteroide(330, -10);
                        jPanel1.add(asteroide.getAsteroide());
                        Main.Main.asteroides.insertarPrincipio(asteroide);
                    }
                    if (numero == 5 && contador != 0) {
                        Asteroide asteroide = new Asteroide(430, -10);
                        jPanel1.add(asteroide.getAsteroide());
                        Main.Main.asteroides.insertarPrincipio(asteroide);
                    }
                    if (numero == 6 && contador != 0) {
                        Asteroide asteroide = new Asteroide(530, -10);
                        jPanel1.add(asteroide.getAsteroide());
                        Main.Main.asteroides.insertarPrincipio(asteroide);
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

    public static void colision() {
        //colision bala con objetos
        Nave nave = Main.Main.naves.obtener(1);
        for (int contador = 0; contador < Main.Main.balas.contar(); contador++) {
            Bala bala = Main.Main.balas.obtener(contador);

            //asteroide choca con bala
            for (int conteo = 0; conteo < Main.Main.asteroides.contar(); conteo++) {
                Asteroide asteroide = Main.Main.asteroides.obtener(conteo);
                Area area1 = new Area(bala.getBala().getBounds());
                Area area2 = new Area(asteroide.getAsteroide().getBounds());
                Area area3 = new Area(nave.getNave().getBounds());
                if (area1.intersects(area2.getBounds())) {
                    System.out.println("la bala le dio al asteroide");
                    punteo = punteo + 100;
                    bala.getBala().setLocation(-2000, -2000);
                    bala.detiene(true);
                    asteroide.getAsteroide().setLocation(2000, 2000);
                    asteroide.detiene(true);
                }
                if (area2.intersects(area3.getBounds())) {
                    System.out.println("la nave le dio al caracol");
                    asteroide.getAsteroide().setLocation(2000, 2000);
                    asteroide.detiene(true);
                }
            }

            //bala choca con ojo
            for (int conteo = 0; conteo < Main.Main.ojos.contar(); conteo++) {
                Ojo ojo = Main.Main.ojos.obtener(conteo);
                Area area1 = new Area(ojo.getOjo().getBounds());
                Area area2 = new Area(bala.getBala().getBounds());
                Area area3 = new Area(nave.getNave().getBounds());
                if (area1.intersects(area2.getBounds())) {
                    poder++;
                    System.out.println("la bala le dio al ojo");
                    bala.getBala().setLocation(-2000, -2000);
                    bala.detiene(true);
                    ojo.getOjo().setLocation(2000, 2000);
                    ojo.detiene(true);
                }
                if (area1.intersects(area3.getBounds())) {
                    System.out.println("la nave le dio al caracol");
                    ojo.getOjo().setLocation(2000, 2000);
                    ojo.detiene(true);
                }
            }

            //bala choca con rayo
            for (int conteo = 0; conteo < Main.Main.rayos.contar(); conteo++) {
                Rayo rayo = Main.Main.rayos.obtener(conteo);
                Area area1 = new Area(rayo.getRayo().getBounds());
                Area area2 = new Area(bala.getBala().getBounds());
                Area area3 = new Area(nave.getNave().getBounds());
                if (area1.intersects(area2.getBounds())) {
                    if (velocidad < 6) {
                        velocidad++;
                    }
                    System.out.println("la bala le dio al rayo");
                    bala.getBala().setLocation(-2000, -2000);
                    bala.detiene(true);
                    rayo.getRayo().setLocation(2000, 2000);
                    rayo.detiene(true);
                }
                if (area1.intersects(area3.getBounds())) {
                    System.out.println("la nave le dio al caracol");
                    rayo.getRayo().setLocation(2000, 2000);
                    rayo.detiene(true);
                }
            }

            //bala choca con corazon
            for (int conteo = 0; conteo < Main.Main.corazones.contar(); conteo++) {
                Corazon corazon = Main.Main.corazones.obtener(conteo);
                Area area1 = new Area(corazon.getCorazon().getBounds());
                Area area2 = new Area(bala.getBala().getBounds());
                Area area3 = new Area(nave.getNave().getBounds());
                if (area1.intersects(area2.getBounds())) {
                    if (vidas < 3) {
                        vidas++;
                    }
                    System.out.println("la bala le dio al corazon");
                    bala.getBala().setLocation(-2000, -2000);
                    bala.detiene(true);
                    corazon.getCorazon().setLocation(2000, 2000);
                    corazon.detiene(true);
                }
                if (area1.intersects(area3.getBounds())) {
                    System.out.println("la nave le dio al caracol");
                    corazon.getCorazon().setLocation(2000, 2000);
                    corazon.detiene(true);
                }
            }

            //bala choca con caracol
            for (int conteo = 0; conteo < Main.Main.caracoles.contar(); conteo++) {
                Caracol caracol = Main.Main.caracoles.obtener(conteo);
                Area area1 = new Area(caracol.getCaracol().getBounds());
                Area area2 = new Area(bala.getBala().getBounds());
                Area area3 = new Area(nave.getNave().getBounds());
                if (area1.intersects(area2.getBounds())) {
                    if (velocidad != 1) {
                        velocidad--;
                    }
                    System.out.println("la bala le dio al caracol");
                    bala.getBala().setLocation(-2000, -2000);
                    bala.detiene(true);
                    caracol.getCaracol().setLocation(2000, 2000);
                    caracol.detiene(true);
                }
                if (area1.intersects(area3.getBounds())) {
                    System.out.println("la nave le dio al caracol");
                    caracol.getCaracol().setLocation(2000, 2000);
                    caracol.detiene(true);
                }
            }
        }
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
