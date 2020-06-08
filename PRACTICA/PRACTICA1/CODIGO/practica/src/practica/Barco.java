/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import practica.*;

/**
 *
 * @author Marvin
 */
public class Barco {

    private int posInicialFila = -1;
    private int posInicialColumna = -1;
    private int posFinalFila = -1;
    private int posFinalColumna = -1;
    private int tipo;
    private boolean status;
    private boolean vivo;

    public Barco(int posInicialFila, int posInicialColumna, int posFinalFila, int posFinalColumna, boolean status, boolean vivo) {
        this.posInicialFila = posInicialFila;
        this.posInicialColumna = posInicialColumna;
        this.posFinalFila = posFinalFila;
        this.posFinalColumna = posFinalColumna;
        this.status = status;
        this.vivo = vivo;
    }

    public Barco() {
        status = false;
        vivo = true;
    }

    
   
    //obtiene coordenadas enteras de cadena de texto dependiendo del tipo de barco
    private void obtenerCoordenadas(String cadena, int tipoBarco) {
        String[] auxCadena;
        String[] auxCoordenadaInicio;
        String[] auxCoordenadaFinal;

        this.setTipo(tipoBarco);

        if (tipoBarco == 4 || tipoBarco == 5) {

            cadena = quitarInicioFin(cadena);
            auxCadena = cadena.split(",", 0);

            this.setPosInicialFila(Integer.parseInt(auxCadena[0]));
            this.setPosInicialColumna(Integer.parseInt(auxCadena[1]));
            this.setPosFinalFila(Integer.parseInt(auxCadena[0]));
            this.setPosFinalColumna(Integer.parseInt(auxCadena[1]));

        } else {
            auxCadena = cadena.split("-", 0);
            for (int contador = 0; contador < auxCadena.length; contador++) {
                auxCadena[contador] = quitarInicioFin(auxCadena[contador]);
            }

            auxCoordenadaInicio = auxCadena[0].split(",", 0);
            auxCoordenadaFinal = auxCadena[1].split(",", 0);

            this.setPosInicialFila(Integer.parseInt(auxCoordenadaInicio[0]));
            this.setPosInicialColumna(Integer.parseInt(auxCoordenadaInicio[1]));
            this.setPosFinalFila(Integer.parseInt(auxCoordenadaFinal[0]));
            this.setPosFinalColumna(Integer.parseInt(auxCoordenadaFinal[1]));
        }

    }

    //verifica que las coordenadas esten dentro de los parametros logicos y reglamentados
    public boolean verificaCoordenadas(String cadena, int tipoBarco) {
        obtenerCoordenadas(cadena, tipoBarco);
        if (this.getPosInicialColumna() <= this.getPosFinalColumna() && this.getPosInicialFila() <= this.getPosFinalFila()) {//verifica que las coordenadas iniciales sean menores a las finales
            if (this.getPosInicialFila() == this.getPosFinalFila() || this.getPosInicialColumna() == this.getPosFinalColumna()) {//verifia que las coordenadas sean horizontales o verticales
                verificaDimensionesTablero(tipoBarco);
            } else {
                System.out.println("Las coordenadas deben ser lineales, horizontales o verticales.\nIngrese una nueva coordenada.");
                status = false;
            }

        } else {
            System.out.println("Las coordenadas deben ser ingresadas de menor a mayor, intente de nuevo.");
            status = false;
        }
        return status;
    }

    //verifica que las coordenadas del barco sean acorde al tipo de barco
    private void verificaDimensionesTablero(int tipoBarco) {

        if (this.getPosInicialColumna() >= 0 && this.getPosInicialFila() >= 0 && this.getPosFinalColumna() < 10 && this.getPosFinalFila() < 10) {
            switch (tipoBarco) {
                case 1:
                    if (this.getPosInicialFila() == this.getPosFinalFila()) {
                        if (this.getPosFinalColumna() - this.getPosInicialColumna() == 3) {
                            status = true;
                        } else {
                            System.out.println("Las dimensiones deben ser de 4 espacios, intente de nuevo.");
                            status = false;
                        }
                    }
                    break;
                case 2:
                    if (this.getPosInicialFila() == this.getPosFinalFila()) {
                        if (this.getPosFinalColumna() - this.getPosInicialColumna() == 2) {
                            status = true;
                        } else {
                            System.out.println("Las dimensiones deben ser de 3 espacios, intente de nuevo.");
                            status = false;
                        }
                    }
                    break;
                case 3:
                    if (this.getPosInicialFila() == this.getPosFinalFila()) {
                        if (this.getPosFinalColumna() - this.getPosInicialColumna() == 1) {
                            status = true;
                        } else {
                            System.out.println("Las dimensiones deben ser de 2 espacios, intente de nuevo.");
                            status = false;
                        }
                    }
                    break;
                case 4:
                    if (this.getPosInicialFila() == this.getPosFinalFila() && this.getPosInicialColumna() == this.getPosFinalColumna()) {
                        status = true;
                    } else {
                        System.out.println("La dimension debe ser de 1 espacio, intente de nuevo.");
                        status = false;
                    }
                    break;
                case 5:
                    break;
            }
        } else {
            System.out.println("Las coordenadas deben estar dentro del tablero, intente de nuevo.");
            status = false;
        }
    }

    //Quita inicio y fin de cadena de texto
    private static String quitarInicioFin(String cadena) {
        String aux = "";
        for (int i = 1; i < cadena.length() - 1; i++) {
            aux = aux + cadena.charAt(i);
        }
        return aux;
    }

    /**
     * @return the posInicialFila
     */
    public int getPosInicialFila() {
        return posInicialFila;
    }

    /**
     * @param posInicialFila the posInicialFila to set
     */
    public void setPosInicialFila(int posInicialFila) {
        this.posInicialFila = posInicialFila;
    }

    /**
     * @return the posInicialColumna
     */
    public int getPosInicialColumna() {
        return posInicialColumna;
    }

    /**
     * @param posInicialColumna the posInicialColumna to set
     */
    public void setPosInicialColumna(int posInicialColumna) {
        this.posInicialColumna = posInicialColumna;
    }

    /**
     * @return the posFinalFila
     */
    public int getPosFinalFila() {
        return posFinalFila;
    }

    /**
     * @param posFinalFila the posFinalFila to set
     */
    public void setPosFinalFila(int posFinalFila) {
        this.posFinalFila = posFinalFila;
    }

    /**
     * @return the posFinalColumna
     */
    public int getPosFinalColumna() {
        return posFinalColumna;
    }

    /**
     * @param posFinalColumna the posFinalColumna to set
     */
    public void setPosFinalColumna(int posFinalColumna) {
        this.posFinalColumna = posFinalColumna;
    }

    /**
     * @return the vivo
     */
    public boolean isVivo() {
        return vivo;
    }

    /**
     * @param vivo the vivo to set
     */
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
