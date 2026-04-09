/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg08;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dan
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner
        Scanner escInt = new Scanner(System.in);
        
        //Variable
         ArrayList<Ciudad> ciudades = new ArrayList<>();
         int opcion;
         
         
        //Menu
        
        do {            
            System.out.print("\n-------MENU EMPRESA------"
                    + "\n1.- Anadir ciudad"
                    + "\n2.- Mostrar todas las ciudades y sus sedes"
                    + "\n3.- Sedes con ingresos superiores a la media"
                    + "\n4.- Buscar por nombre de sede"
                    + "\n5.- Añadir sede"
                    + "\n6.- Sedes ordenadas de mayor a menor segun ingreso anual"
                    + "\n7.- Salir"
                    + "\nOpcion: ");
            opcion=escInt.nextInt();
            
            switch (opcion) {
                case 1:
                    Ciudad.addCiudad(ciudades);
                    break;
                case 2:
                    Ciudad.showCiudades(ciudades);
                    break;
                case 3:
                    Ciudad.showSedesGreaterThanMedia(ciudades);
                    break;
                case 4:
                    Ciudad.searchSedeName(ciudades);
                    break;
                case 5:
                    Ciudad.addSede(ciudades);
                    break;
                case 6:
                    Ciudad.showSortedSedes(ciudades);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion!=7);
    }
    
}
