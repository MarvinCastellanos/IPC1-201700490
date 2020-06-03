/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojastrabajo;
import java.util.Scanner;
/**
 *
 * @author Marvin
 */
public class HT1 {
    Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        HT1 ejecuta = new HT1();
        ejecuta.asigna();
    }
    public void asigna(){
        int CA=2,CB=5;
        System.out.println("En seccion A hay "+CA+" estudiantes y en seccion B hay "+CB+"estudiantes");
        System.out.println("ingrese el numero de seccion que desea seleccionar.\n1)A\n2)B");
        int opcion = leer.nextInt();
        if (CA<5 || CB<5) {
            if (opcion==1) {
                if (CA<5) {
                    System.out.println("Se ha asignado satisfactoriamente.");
                }else{
                    System.out.println("La seccion A esta llena, escoja otra.");
                }
            }else{
                if (CB<5) {
                    System.out.println("Se ha asignado satisfactoriamente.");
                }else{
                    System.out.println("La seccion A esta llena, escoja otra.");
                }
            }
        }else{
            System.out.println("Ambas seciones estan llenas, debe aperturar una nueva.");
        }
    }
}
