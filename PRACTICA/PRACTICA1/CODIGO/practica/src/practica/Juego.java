/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import practica.*;

/**
 *
 * @author Marvin
 */
public class Juego {

    boolean jugando;//booleana jugando, es verdadera si el juego se esta ejecutando y falsa si se pierde o se detiene

    //variables de conteo de juego
    int hundidos;
    int enAccion;
    int realizados;
    int intentos;//intentos del jugador
    String resultado;
    String nombre;
    Jugador[] informeVictorias;
    Jugador[] informeGeneral;

    //variables para verificar cantidad de barcos por categoria
    int submarino;
    int destructor;
    int fragata;

    boolean status = false;        //estatus de vector lleno, verdadero esta lleno, falso esta vacio;

    Scanner leer;
    Jugador jugador;

    Tablero tablero;
    boolean statusTableroVacio = true;//status del tablero vacio, vacio=true lleno=false

    Barco barco;
    Barco barcoVacio;
    Barco[] vectorBarcos;

    public Juego() {
        //variables de conteo de juego
        intentos = 10;
        hundidos = 0;
        enAccion = 9;
        realizados = 0;
        resultado = "";
        nombre = "";
        informeVictorias = new Jugador[20];
        informeGeneral = new Jugador[20];

        //booleana jugando=true 
        jugando = true;

        //variables para verificar cantidad de barcos por categoria
        submarino = 3;
        destructor = 3;
        fragata = 2;

        //declaraciones del objeto tablero
        tablero = new Tablero();
        tablero.llenaTablero(statusTableroVacio);
        statusTableroVacio = false;

        //declaraciones de objetos tipo barco
        barcoVacio = new Barco(-1, -1, -1, -1, true, true);
        vectorBarcos = new Barco[10];
        iniciarVectorBarco(barcoVacio);
        iniciarInformes();

        leer = new Scanner(System.in);
    }

    //inicializa los informes de resultados
    public void iniciarInformes() {
        for (int contador = 0; contador < informeVictorias.length; contador++) {
            informeVictorias[contador] = new Jugador("-1", "-1", -1, -1);
            informeGeneral[contador] = new Jugador("-1", "-1", -1, -1);
        }
    }

    //inicia el vector de tipo barco que almacena los barcos guardados
    public void iniciarVectorBarco(Barco barco) {

        for (int contador = 0; contador < vectorBarcos.length; contador++) {
            vectorBarcos[contador] = barcoVacio;
        }
    }

    //inicio de juego
    public void iniciarJuego() {
        intentos = 10;
        hundidos = 0;
        enAccion = 9;
        realizados = 0;
        
        jugando = true;
        System.out.println("Ingrese su nombre: ");
        this.nombre = leer.next();
        int op;

        String coordenada = "";
        do {
            

            Date horaYFecha = new Date();
            System.out.println("<<<<<<<<<<<<<<<<0>>>>>>>>>>>>>>>>>");
            DateFormat formatoDeFecha = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            System.out.println("Hora y fecha: " + formatoDeFecha.format(horaYFecha));
            System.out.println("<<<<<<<<<<<<<<<<0>>>>>>>>>>>>>>>>>");
            System.out.println("Barcos: ");
            System.out.println("          Hundidos: " + hundidos + "/9");
            System.out.println("          En accion: " + enAccion + "/9\n");
            System.out.println("Intentos: ");
            System.out.println("          Realizados: " + realizados + "/10");
            System.out.println("          Restantes: " + intentos + "/10\n");
            System.out.println("<<<<<<<<<<<<<<<<0>>>>>>>>>>>>>>>>>");
            verTablero(1);
            System.out.println("<<<<<<<<<<<<<<<<0>>>>>>>>>>>>>>>>>");
            System.out.println("1)lanzar misil");
            System.out.println("2)Abandonar partida");

            System.out.println("<<<<<<<|Escoge una opcion|>>>>>>>>");
            op = leer.nextInt();
            if (op == 2) {
                System.out.println("Adios "+nombre);
                this.resultado = "Abandono";
                informe(1);
                jugando = false;
            } else if (op == 1) {
                System.out.println("<<<<<|Ingrese las coordenadas|>>>>>");
                coordenada = leer.next();

                disparo(coordenada);
            } else {
                System.out.println("opcion invalida");
            }
            if (intentos == 0) {
                jugando = false;
                System.out.println("perdio "+nombre);
               resultado = "Perdio";
               informe(1);

            } else if (hundidos == 9) {
                jugando = false;
                System.out.println("gano "+nombre);
                resultado = "Gano";
                informe(2);
            }
        } while (jugando);
        
        
    }

    //cambia los intentos de la partida
    public void cambiarIntentos() {

        System.out.println("Ingrese el nuevo numero de intentos: ");
        this.intentos = leer.nextInt();

    }

    public boolean verificaCantidadBarcos(int tipoBarco) {
        boolean status = true;
        if (tipoBarco == 5 || tipoBarco == 1) {
            status = true;
        } else {
            switch (tipoBarco) {
                case 2:
                    if (this.submarino > 0) {
                        this.submarino--;
                        status = true;
                    } else {
                        status = false;
                    }
                    break;
                case 3:
                    if (this.destructor > 0) {
                        destructor--;
                        status = true;
                    } else {
                        status = false;
                    }
                    break;
                case 4:
                    if (this.fragata > 0) {
                        fragata--;
                        status = true;
                    } else {
                        status = false;
                    }
                    break;
            }
        }
        return status;
    }

    //inserta barcos en vector y tablero
    public void insertarBarco(String cadena, int tipoBarco) {
        if (verificaCantidadBarcos(tipoBarco) == true) {

            boolean status = false;
            if (tipoBarco == 5 || tipoBarco == 1) {
                for (int contador = 0; contador < vectorBarcos.length; contador++) {
                    if (vectorBarcos[contador].getTipo() == tipoBarco) {
                        for (int fila = vectorBarcos[contador].getPosInicialFila(); fila <= vectorBarcos[contador].getPosFinalFila(); fila++) {
                            for (int columna = vectorBarcos[contador].getPosInicialColumna(); columna <= vectorBarcos[contador].getPosFinalColumna(); columna++) {
                                tablero.tableroLogico[fila][columna] = " ";
                            }
                        }
                        vectorBarcos[contador] = barcoVacio;
                    }
                }

            }
            barco = new Barco(-1, -1, -1, -1, true, true);

            if (barco.getPosInicialColumna() == -1) {
                if (barco.verificaCoordenadas(cadena, tipoBarco) == true) {
                    for (int fila = barco.getPosInicialFila(); fila <= barco.getPosFinalFila(); fila++) {
                        for (int columna = barco.getPosInicialColumna(); columna <= barco.getPosInicialColumna(); columna++) {
                            if (tablero.tableroLogico[fila][columna] == "0" || tablero.tableroLogico[fila][columna] == "$") {
                                status = true;
                                break;
                            }
                        }
                    }
                    if (status == false) {
                        tablero.ingresaBarco(barco.getPosInicialColumna(), barco.getPosInicialFila(), barco.getPosFinalColumna(), barco.getPosFinalFila(), true, tipoBarco);
                        llenaVectorBarcos(barco);
                    } else {
                        System.out.println("En esa posicion ya hay otro baarco posicionado, escoja otra.");
                    }

                }
            } else {
                System.out.println("Error al ingresar el barco");
            }
        } else {
            System.out.println("Este tipo de barco ya esta lleno.");
        }

    }

    //llena el vector de tipo barco con los barcos que se ingresan
    public void llenaVectorBarcos(Barco barco) {
        for (int contador = 0; contador < vectorBarcos.length; contador++) {
            if (status = false) {
                vectorBarcos[contador] = barcoVacio;
                status = true;
            } else if (vectorBarcos[contador].getPosFinalColumna() == -1) {
                vectorBarcos[contador] = barco;
                break;
            }
        }
    }

    //visualiza el tablero logico y de juego
    public void verTablero(int op) {
        tablero.visualizaTablero(op);//visualiza tablero logico=1 y de juego=2
    }

    //reinicia el tablero y vector de barcos
    public void reiniciaTablero() {

        tablero.reiniciarTablero();
        statusTableroVacio = true;
        for (int contador = 0; contador < vectorBarcos.length; contador++) {
            vectorBarcos[contador] = barcoVacio;
        }
    }

    //crea informe de juego, recive int 1=general y 2=victorias
    public void informe(int tipoInforme) {

        jugador = new Jugador(nombre, resultado, intentos, hundidos);

        if (tipoInforme == 1) {
            for (int contador = 0; contador < informeGeneral.length; contador++) {
                if (informeGeneral[contador].getDisparos() == -1) {
                    informeGeneral[contador] = jugador;
                    break;
                }
            }
        } else if (tipoInforme == 2) {
            for (int contador = 0; contador < informeGeneral.length; contador++) {
                if (informeGeneral[contador].getDisparos() == -1) {
                    informeGeneral[contador] = new Jugador(nombre, resultado, intentos, hundidos);
                    break;
                }
            }
            for (int contador = 0; contador < informeVictorias.length; contador++) {
                if (informeVictorias[contador].getDisparos() == -1) {
                    informeVictorias[contador] = new Jugador(nombre, resultado, intentos, hundidos);
                }
            }
        }
        {

        }
    }

    //imprime informe de juego, recive int 1=generl y 2=victorias
    public void imprimeInforme(int op) {
        if (op == 1) {

            System.out.println("|Nombre||Estado||intentos||Barcos hundisos|");
            for (int contador = 0; contador < informeGeneral.length; contador++) {
                if (informeGeneral[contador].getDisparos() != -1) {
                    System.out.println("  " + informeGeneral[contador].getNombre() + "     " + informeGeneral[contador].getEstado() + "          " + informeGeneral[contador].getDisparos() + "            " + informeGeneral[contador].getBarcosHundidos());

                }
            }
        } else {
            System.out.println("|Nombre ||Estado ||Intentos|");
            for (int contador = 0; contador < informeVictorias.length; contador++) {
                if (informeVictorias[contador].getDisparos() != -1) {
                    System.out.println("  " + informeGeneral[contador].getNombre() + "     " + informeGeneral[contador].getEstado() + "          " + informeGeneral[contador].getDisparos());

                }

            }
        }
    }

    //corrobora e imrprime en tablero los disparos
    public void disparo(String coordenada) {
        int barcoHundido = 0;
        if (tablero.verificaDisparo(coordenada)) {
            if (tablero.tableroLogico[tablero.disparoFila][tablero.disparoColumna] == "$") {
                System.out.println("Marvin Daniel Castellanos Castillo 201700490\nIPC1-2020");
                this.realizados++;
                this.intentos--;
            }

            if (tablero.tableroLogico[tablero.disparoFila][tablero.disparoColumna] == "0") {
                System.out.println("Le diste a un Barco");
                realizados++;
                intentos--;
                hundidos++;
                enAccion--;
                for (int contador = 0; contador < vectorBarcos.length; contador++) {
                    for (int fila = vectorBarcos[contador].getPosInicialFila(); fila <= vectorBarcos[contador].getPosFinalFila(); fila++) {
                        for (int columna = vectorBarcos[contador].getPosInicialColumna(); columna <= vectorBarcos[contador].getPosFinalColumna(); columna++) {
                            if (tablero.disparoColumna == columna && tablero.disparoFila == fila) {
                                barcoHundido = contador;
                            }
                        }
                    }
                }
                for (int fila = vectorBarcos[barcoHundido].getPosInicialFila(); fila <= vectorBarcos[barcoHundido].getPosFinalFila(); fila++) {
                    for (int columna = vectorBarcos[barcoHundido].getPosInicialColumna(); columna <= vectorBarcos[barcoHundido].getPosFinalColumna(); columna++) {
                        tablero.tableroLogico[fila][columna] = "X";
                    }
                }
            } else {
                realizados++;
                intentos--;
                tablero.tableroLogico[tablero.disparoFila][tablero.disparoColumna] = "#";
                System.out.println("No le ido a ningun barco");
            }
        } else {
            System.out.println("Las coordenadas son erroneas, intente de nuevo.");
        }
    }
}
