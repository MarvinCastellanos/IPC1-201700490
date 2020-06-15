/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Marvin
 */
public class Modelo {
    private String anio;
    private double depreciacion;

    public Modelo(String anio, double depreciacion) {
        this.anio = anio;
        this.depreciacion = depreciacion;
    }

    /**
     * @return the anio
     */
    public String getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(String anio) {
        this.anio = anio;
    }

    /**
     * @return the depreciacion
     */
    public double getDepreciacion() {
        return depreciacion;
    }

    /**
     * @param depreciacion the depreciacion to set
     */
    public void setDepreciacion(double depreciacion) {
        this.depreciacion = depreciacion;
    }
    
    
}
