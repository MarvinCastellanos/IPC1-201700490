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
public class Tablero {

    String tableroLogico[][];
    String tableroJuego[][];

    int disparoColumna;
    int disparoFila;
    boolean status;

    public Tablero() {
        tableroJuego = new String[10][10];
        tableroLogico = new String[10][10];
        status = false;
    }

    //verifica que las coordenadas de disparo esten dentro de las normas logicas
    public boolean verificaDisparo(String coordenada) {
        boolean status=false;
        obtenerCoordenadas(coordenada);
        if ((this.disparoColumna >= 0 && this.disparoFila >= 0) || (this.disparoColumna < 10 && this.disparoFila < 10)) {
            status = true;
        }
        return status;
    }

    //Quita inicio y fin de cadena de texto
    private static String quitarInicioFin(String cadena) {
        String aux = "";
        for (int i = 1; i < cadena.length() - 1; i++) {
            aux = aux + cadena.charAt(i);
        }
        return aux;
    }

    //obtiene coordenadas enteras de cadena de texto dependiendo del tipo de barco
    private void obtenerCoordenadas(String cadena) {

        String[] auxCadena;
        cadena=quitarInicioFin(cadena);
        auxCadena = cadena.split(",", 0);

        disparoFila = Integer.parseInt(auxCadena[0]);
        disparoColumna = Integer.parseInt(auxCadena[1]);

    }

    //llena tablero logico y de juego con " "
    public void llenaTablero(boolean vacio) {
        if (vacio == true) {
            for (int columna = 0; columna < 10; columna++) {
                for (int fila = 0; fila < 10; fila++) {
                    tableroJuego[columna][fila] = " ";
                    tableroLogico[columna][fila] = " ";
                }
            }
        }

    }

    //Ingresa barco a al tablero logico
    public void ingresaBarco(int columnaInicio, int filaInicio, int columnaFinal, int filaFinal, boolean status, int tipoBarco) {

        if (status == true) {
            if (tipoBarco == 5) {
                for (int fila = filaInicio; fila <= filaFinal; fila++) {
                    for (int columna = columnaInicio; columna <= columnaFinal; columna++) {
                        this.tableroLogico[fila][columna] = "$";
                    }
                }
            } else {
                for (int fila = filaInicio; fila <= filaFinal; fila++) {
                    for (int columna = columnaInicio; columna <= columnaFinal; columna++) {
                        this.tableroLogico[fila][columna] = "0";
                    }
                }
            }

        } else {
            System.out.println("Coordenadas incorrectas");
        }
    }

    //vacia el tablero logico
    public void reiniciarTablero() {
        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                this.tableroLogico[columna][fila] = " ";
            }
        }
    }

    //imprime tablero logico=1 y de juego=2
    public void visualizaTablero(int op) {
        if (op == 1) {
            System.out.print(" ");
            for (int contador = 0; contador < 10; contador++) {
                System.out.print(" " + contador + " ");
            }
            System.out.println();
            for (int fila = 0; fila < 10; fila++) {
                System.out.print(fila + "|");
                for (int columna = 0; columna < 10; columna++) {
                    System.out.print(this.tableroLogico[fila][columna] + " |");
                }
                System.out.println();
            }
        } else if (op == 2) {
            System.out.print(" ");
            for (int contador = 0; contador < 10; contador++) {
                System.out.print(" " + contador + " ");
            }
            System.out.println();
            for (int fila = 0; fila < 10; fila++) {
                System.out.print(fila + "|");
                for (int columna = 0; columna < 10; columna++) {
                    System.out.print(this.tableroJuego[fila][columna] + " |");
                }
                System.out.println();
            }
        }

    }
}
