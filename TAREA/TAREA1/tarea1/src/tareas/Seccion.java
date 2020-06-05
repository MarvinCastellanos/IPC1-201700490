/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.util.Scanner;

/**
 *
 * @author Marvin
 */
public class Seccion {
    
    Scanner lector;
    Estudiante clase1[];
    Estudiante clase2[];
    Estudiante E1;
    Estudiante E2;
    Estudiante E3;
    Estudiante E4;
    Estudiante E5;
    Estudiante E6;
    Estudiante E7;
    Estudiante vacio;
    Estudiante nuevo;

    
    public Seccion() {
        clase1=new Estudiante[5];
        clase2=new Estudiante[5];
        
        lector= new Scanner(System.in);
        
        vacio=new Estudiante("0","0");
        nuevo=new Estudiante("0","0");
        E1=new Estudiante("2001040568","Julio Salazar");
        E2=new Estudiante("2003215678","Roberto Perez");
        E3=new Estudiante("2007954218","Daniel Blanco");
        E4=new Estudiante("2006798524","Hector Castillo");
        E5=new Estudiante("2020315654","Leonel Jimenez");
        E6=new Estudiante("2015485623","Ramiro Jacinto");
        E7=new Estudiante("2014789613","Luis Lopez");
    }
    
    public void inicia(){
        int op;
        String nombre;
        String carnet;
        llenaSeccion();
        
        System.out.println("Ingrese su nombre");
        nombre=lector.nextLine();
        System.out.println("ingrese su carnet");
        carnet=lector.nextLine();
        
        nuevo.setCarnet(carnet);
        nuevo.setNombre(nombre);
        
        System.out.println("Ingrese el numero de seccion que desea ingresar, 1 o 2\n ");
        op=lector.nextInt();
        
        if (verificaCupo(this.clase1,this.clase2)==true) {
            revisaSeccion(op);
        }else{
            System.out.println("Ambas secciones estan llenas, debe aperturar una nueva.");
        }
        
        imprimeSeccion(clase1,clase2);
    }
    
    public void imprimeSeccion(Estudiante clase1[],Estudiante clase2[]){
        this.clase1=clase1;
        this.clase2=clase2;
        System.out.println("Clase 1");
        for (int contador = 0; contador < clase1.length; contador++) {
            System.out.println(contador+". "+clase1[contador].getNombre()+" "+clase1[contador].getCarnet());
        }
        
        System.out.println("--------------------------");
        System.out.println("Clase 2");
        for (int contador = 0; contador < clase2.length; contador++) {
            System.out.println(contador+". "+clase2[contador].getNombre()+" "+clase2[contador].getCarnet());
        }
    }
    
    public void llenaSeccion(){
        for (int contador = 0; contador < 5; contador++) {
            clase1[contador]=vacio;
            clase2[contador]=vacio;
        }
        
        clase1[0]=E1;
        clase1[1]=E2;
        clase1[2]=E3;
        clase1[3]=E4;
        clase1[4]=E5;
        
        clase2[0]=E6;
        clase2[1]=E7;        
    }
    
    public boolean verificaCupo(Estudiante clase1[],Estudiante clase2[]){
        boolean c1=false,c2=false;
        boolean retorna=false;
        this.clase1=clase1;
        this.clase2=clase2;
        
        for (int contador = 0; contador < clase1.length; contador++) {
            if (clase1[contador].getNombre()=="0") {
                c1=true;
            }
        }
        for (int contador = 0; contador < clase2.length; contador++) {
            if (clase2[contador].getNombre()=="0") {
                c2=true;
            }
        }
        if (c1==true || c2==true) {
            retorna=true;
            return retorna;
        }else{
            return retorna;
        }
    }
    
    public void revisaSeccion(int _op){
        boolean asignado=false;
        
        if (_op==1) {
           for (int contador = 0; contador < clase1.length; contador++) {
            if (clase1[contador].getNombre()=="0") {
                System.out.println("Usted puede asignarse a la calse 1");
                clase1[contador]=nuevo;
                asignado=true;
                break;
            }else{
                continue;
            }
        }
            if (asignado==false) {
                System.out.println("La clase 1 esta llena, intente con otra.");
            }
        }else if (_op==2) {
            for (int contador = 0; contador < clase2.length; contador++) {
            if (clase2[contador].getNombre()=="0") {
                System.out.println("Usted puede asignarse a la calse 2");
                clase2[contador]=nuevo;
                asignado=true;
                break;
            }else{
                continue;
            }
        }
            if (asignado==false) {
                System.out.println("La clase 2 esta llena, intente con otra.");
            }
        }
        
    }
}
