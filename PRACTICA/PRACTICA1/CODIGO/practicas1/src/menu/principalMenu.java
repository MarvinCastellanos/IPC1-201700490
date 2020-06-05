/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;
import menu.*;
/**
 *
 * @author Marvin
 */
public class principalMenu {
    private int op;
    private Scanner lector;
    private boolean status;
    private tableroMenu tablero;
   
    public principalMenu() {
        lector = new Scanner(System.in);
        status = true;
        tablero = new tableroMenu();
    }
    
    public void muestraMenu(){
        op=0;
        System.out.println("Menu Principal\n");
        System.out.println("1)Crear tablero");
        System.out.println("2)Reporte completo");
        System.out.println("3)Reporte de victorias");
        System.out.println("4)Salir");
        op = lector.nextInt();
        opcionesMenuP(op);
    }
    
    //realiza accion de menu principal menu principal
    private void opcionesMenuP(int _op){
        do{
            switch(_op){
                case 0: muestraMenu();
                    break;
            case 1:System.out.println("Crear tablero");
                    tablero.muestraMenu();
                    _op=0;
                break;
            case 2:System.out.println("Reporte completo");
            _op=0;
                break;
            case 3:System.out.println("Reporte victorias");
            _op=0;
                break;
            case 4:System.out.println("salir");
            System.exit(0);
            _op=0;
                break;
            default:System.out.println("Opcion invalida");
            _op=0;
                break;
        }
        }while(status);    
    }
}
