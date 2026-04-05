/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner
        Scanner escInt =new Scanner(System.in);
        
        //Variables
        int opcion;
        
        Autobus[] aparcamiento = new Autobus[6];
        
        
        //Menu
        do {           
            System.out.print("\n-------MENU AUTOBUSES PLASENCIA-------"
                    + "\n1.- Aparcar"
                    + "\n2.- Mostrar darsenas libres"
                    + "\n3.- Buscar autobus por matricula"
                    + "\n4.- Buscar conductor por nombre"
                    + "\n5.- Posicion del autobus con mas conductores asignados"
                    + "\n6.- Salir "
                    + "\nOpcion: ");
            
            //Lector de opciones
            opcion=escInt.nextInt();
            
            switch (opcion) {
                case 1:
                    Autobus.aparcar(aparcamiento);
                    break;
                case 2:
                    Autobus.aparcamientosVacios(aparcamiento);
                    break;
                case 3:
                    Autobus.buscarAutobus(aparcamiento);
                    break;
                case 4:
                    Autobus.buscarConductor(aparcamiento);
                    break;
                case 5:
                    Autobus.mayorNDeConductores(aparcamiento);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion!=6);
        
        
        
    }
    
}
