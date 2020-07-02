/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Marvin
 */
public class Bloque {

    private int columna=100;
    private int fila=100;
    private String color;
    private String valor;
    public int filaFinal;
    public int columnaFinal;
    JLabel nuevo = new JLabel();

    public Bloque(int fila, int columna, String valor, String color) {
        this.columna = columna;
        this.fila = fila;
        this.color = color;
        this.valor = valor;
        creaBloque();
    }

    public Bloque(String color, String valor) {
        this.color = color;
        this.valor = valor;
        creaBloque();
    }

    private void creaBloque() {
        
//        int filaFinal;
//        int columnaFinal;
        nuevo.setHorizontalAlignment(SwingConstants.CENTER);
        
        nuevo.setText(this.valor);
        nuevo.setOpaque(true);
        switch (this.color) {
            case "AZUL":
                this.nuevo.setBackground(Color.blue);
                break;
            case "ROJO":
                this.nuevo.setBackground(Color.red);
                break;
            case "AMARILLO":
                this.nuevo.setBackground(Color.yellow);
                break;
            case "VERDE":
                this.nuevo.setBackground(Color.green);
                break;
        }
        switch (this.fila) {
            case 0: filaFinal=0;
                break;
            case 1: filaFinal=100;
                break;
            case 2: filaFinal=200;
                break;
            case 3: filaFinal=300;
                break;
            case 4: filaFinal=400;
                break;
            default:filaFinal=800;
                break;
        }
        switch (this.columna) {
            case 0: columnaFinal=0;
                break;
            case 1: columnaFinal=100;
                break;
            case 2: columnaFinal=200;
                break;
            case 3: columnaFinal=300;
                break;
            case 4:columnaFinal=400;
                break;
            case 5:columnaFinal=500;
                break;
            case 6:columnaFinal=600;
                break;
            default: columnaFinal=800;
                break;
        }
        
        this.nuevo.setBounds(columnaFinal, filaFinal, 100, 100);
        this.nuevo.setVisible(true);
    }
    
    public JLabel getBloque(){
        return this.nuevo;
    }

    /**
     * @return the columna
     */
    public int getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

    /**
     * @return the fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
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

}
