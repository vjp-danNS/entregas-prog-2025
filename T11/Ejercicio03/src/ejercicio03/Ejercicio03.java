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
            System.out.println("");
            
            
            opcion=escInt.nextInt();
            
            switch (opcion) {
                case 1:
                    Autobus.aparcar(aparcamiento);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
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
