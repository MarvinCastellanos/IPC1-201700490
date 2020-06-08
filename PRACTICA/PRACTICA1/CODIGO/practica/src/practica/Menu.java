/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;
import practica.*;

/**
 *
 * @author Marvin
 */
public class Menu {
    
    private int op;
    boolean statusPrincipalMenu;
    boolean statusTableroMenu;
    boolean statusBarcoMenu;
    private Scanner leer;
    String coordenada;

    Juego juego;

    public Menu() {
        
        leer = new Scanner(System.in);
        statusPrincipalMenu = true;
        statusTableroMenu = true;
        statusBarcoMenu = true;
        juego = new Juego();
    }

    //menu principal
    public void principalMenu() {
        statusPrincipalMenu = true;
        do {
            System.out.println("Practica1\n------------------------------------------");
            System.out.println("Menu principal\n");
            System.out.println("Elija una opcion");
            System.out.println("1)Crea tablero\n2)Reporte completo\n3)Reporte de victorias\n4)Salir");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    tableroMenu();
                    statusPrincipalMenu = true;
                    break;
                case 2:juego.imprimeInforme(1);
                    statusPrincipalMenu = true;
                    break;
                case 3: juego.imprimeInforme(2);
                    statusPrincipalMenu = true;
                    break;
                case 4:
                    System.exit(0);
                    statusPrincipalMenu = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (statusPrincipalMenu);
    }

    //menu de table1ro
    public void tableroMenu() {
        statusTableroMenu = true;
        do {

            System.out.println("Menu tablero\n---------------------------------------------");
            System.out.println("1)Ingresar barcos\n2)Cambiar cantidad de intentos\n3)Iniciar juego");
            System.out.println("4)Visualizar tablero\n5)Reiniciar tablero\n6)Regresar");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    barcoMenu();
                    statusTableroMenu = true;
                    break;
                case 2:
                    juego.cambiarIntentos();
                    statusTableroMenu = true;
                    break;
                case 3:
                    juego.iniciarJuego();
                    statusTableroMenu = true;
                    break;
                case 4:
                    juego.verTablero(1);
                    statusTableroMenu = true;
                    break;
                case 5:
                    juego.reiniciaTablero();
                    statusTableroMenu = true;
                    break;
                case 6:
                    statusTableroMenu = false;
                    principalMenu();

                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (statusPrincipalMenu);

    }

    //menu de barco
    public void barcoMenu() {
        statusBarcoMenu = true;

        do {
            System.out.println("Menu barcos\n-----------------------------------------");
            System.out.println("1)Insertar porta aviones\n2)Insertar submarinos\n3)Insertar destructores");
            System.out.println("4)Insertar fragatas\n5)Insertar easter egg\n6)Regresar");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Insertar porta aviones");
                    System.out.println("Ingrese la coordenada");
                    coordenada = leer.nextLine();
                    coordenada = leer.nextLine();

                    juego.insertarBarco(coordenada, 1);
                    statusBarcoMenu = false;
                    break;
                case 2:
                    System.out.println("Insertar submarino");
                    System.out.println("Ingrese la coordenada");
                    coordenada = leer.nextLine();
                    coordenada = leer.nextLine();

                    juego.insertarBarco(coordenada, 2);
                    statusBarcoMenu = false;
                    break;
                case 3:
                    System.out.println("Insertar destructor");
                    System.out.println("Ingrese la coordenada");
                    coordenada = leer.nextLine();
                                        coordenada = leer.nextLine();

                    juego.insertarBarco(coordenada, 3);
                    statusBarcoMenu = false;
                    break;
                case 4:
                    System.out.println("Insertar fragata");
                    System.out.println("Ingrese la coordenada");
                    coordenada = leer.nextLine();
                                        coordenada = leer.nextLine();

                    
                    juego.insertarBarco(coordenada, 4);
                    statusBarcoMenu = false;
                    break;
                case 5:
                    System.out.println("Insertar easteregg");
                    System.out.println("Ingrese la coordenada");
                    coordenada = leer.nextLine();
                                        coordenada = leer.nextLine();

                    
                    juego.insertarBarco(coordenada, 5);
                    statusBarcoMenu = false;
                    break;
                case 6:
                    tableroMenu();
                    statusBarcoMenu = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (statusPrincipalMenu);

    }
}
