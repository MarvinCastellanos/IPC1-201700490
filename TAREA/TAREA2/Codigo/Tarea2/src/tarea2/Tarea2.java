/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author Marvin
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caballo caballo1=new Caballo("Tormenta china", "Pura Sangre", 5);
        Caballo caballo2=new Caballo("Tiro al blanco", "Mustang", 3);
        
        Coche auto1= new Coche("Toyota", "2012", "Sedan");
        Coche auto2= new Coche("DeLorean", "1967", "Sedan");
        
        Avion avion1=new Avion(300, "Boeing", "747");
        Avion avion2=new Avion(150, "Airbus", "A330");
        
        caballo1.avanzar();
        caballo1.frenar();
        caballo2.avanzar();
        caballo2.frenar();
        
        auto1.avanzar();
        auto1.frenar();
        auto2.avanzar();
        auto2.frenar();
        
        avion1.avanzar();
        avion1.frenar();
        avion2.avanzar();
        avion2.frenar();
    }
    
}
