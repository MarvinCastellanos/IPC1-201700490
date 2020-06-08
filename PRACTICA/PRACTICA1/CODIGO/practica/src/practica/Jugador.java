/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Marvin
 */
public class Jugador {

    private String nombre;
    private String estado;
    private int disparos;
    private int barcosHundidos;

    public Jugador() {

    }

    public Jugador(String nombre, String estado, int disparos, int barcosHundidos) {
        this.nombre = nombre;
        this.estado = estado;
        this.disparos = disparos;
        this.barcosHundidos = barcosHundidos;
    }
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the disparos
     */
    public int getDisparos() {
        return disparos;
    }

    /**
     * @param disparos the disparos to set
     */
    public void setDisparos(int disparos) {
        this.disparos = disparos;
    }

    /**
     * @return the barcosHundidos
     */
    public int getBarcosHundidos() {
        return barcosHundidos;
    }

    /**
     * @param barcosHundidos the barcosHundidos to set
     */
    public void setBarcosHundidos(int barcosHundidos) {
        this.barcosHundidos = barcosHundidos;
    }

}
