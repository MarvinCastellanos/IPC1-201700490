/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author Marvin
 */
public class PrincipalMenu {

    boolean status;
    Scanner lector;
    int opcion;

    public PrincipalMenu() {
        status = true;
        lector = new Scanner(System.in);

    }

    public void menu() {
        do {
            System.out.println("Menu de juego\nIngrese una opcion");
            System.out.println("1)Crear tablero\n2)Reporte completo\n3)Reporte de victorias\n4)salir");
            this.opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    this.creaTablero();
                    break;
                case 2:
                    this.reporteCompleto();
                    break;
                case 3:
                    this.reporteVictorias();
                    break;
                case 4:
                    this.salir();
                    break;
            }
            break;
        } while (status);
    }

    public void creaTablero() {
        System.out.println("aqui va el crear tablero");
        lector.nextLine();
        lector.nextLine();

    }

    public void reporteCompleto() {
        System.out.println("aqui va reporte completo");
        lector.nextLine();
        lector.nextLine();

    }

    public void reporteVictorias() {
        System.out.println("aqui va reporte victorias");
        lector.next();
        lector.nextLine();

    }

    public void salir() {
        System.exit(0);
    }
}
