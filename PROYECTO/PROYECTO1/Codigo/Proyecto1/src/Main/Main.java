/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Objetos .*;
/**
 *
 * @author Marvin
 */
public class Main {
    public static Tipo tipos[];
    public static Modelo modelos[];
    public static Marca marcas [];
    public static Linea lineas [];
    public static Uso usos [];
    public static Mecanica mecanicas[];
    public static Repuesto repuestos[];
    public static Solicitante solicitantes[];
    public static Asegurado asegurados[];
    public static NoAsegurado noAsegurados[];
    public static Seguro seguros[];
    public static Incidente incidentes[];

    /*public Main() {
        tipos = new Tipo[50];
        modelos = new Modelo[50];
        marcas = new Marca[50];
        lineas = new Linea [50];
        usos = new Uso [50];
        mecanicas = new Mecanica [50];
        repuestos = new Repuesto [50];
        solicitantes = new Solicitante [50];
        asegurados = new Asegurado [50];
        noAsegurados= new NoAsegurado [50];
        seguros = new Seguro [50];
        incidentes = new Incidente [50];
    }*/
    
    
    
    public static void main(String[] args){
        tipos = new Tipo[50];
        modelos = new Modelo[50];
        marcas = new Marca[50];
        lineas = new Linea [50];
        usos = new Uso [50];
        mecanicas = new Mecanica [50];
        repuestos = new Repuesto [50];
        solicitantes = new Solicitante [50];
        asegurados = new Asegurado [50];
        noAsegurados= new NoAsegurado [50];
        seguros = new Seguro [50];
        incidentes = new Incidente [50];
        
        VentanasPrincipal.Principal iniciar=new VentanasPrincipal.Principal();
        iniciar.mostrar();
        //SolicitudSeguro iniciar=new SolicitudSeguro();
        //iniciar.mostrar();
        //VentanasAdmin.ListaNoAsegurados mostrar = new VentanasAdmin.ListaNoAsegurados();
        //mostrar.mostrar();
    }
}
