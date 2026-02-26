/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner esc =new Scanner(System.in);
        
        ArrayList<Integer> listaCoches =new ArrayList<>();
        //Creo una lista con los meses del año
        ArrayList<String> listaMeses =new ArrayList<>();
        MTArrayList.rellenarListaMeses(listaMeses);
        
        int opcion;
        
        System.out.println("Bienvenido al menu coches\n");
        do {            
            System.out.print("\n1.- Introducir las ventas de coches de cada uno de los 12 meses del año"
                    + "\n2.- Mostrar las ventas"
                    + "\n3.- Mostrar las ventas al reves"
                    + "\n4.- Muestra la suma total de ventas del año"
                    + "\n5.- Muestra la suma total de ventas de los meses con la letra a"
                    + "\n6.- Mes con mas ventas."
                    + "\n7.- Salir del programa"
                    + "\n\nOpcion: ");
            
            opcion=esc.nextInt();
            
            switch (opcion) {
                case 1:
                    MTArrayList.rellenarVentas(listaCoches, listaMeses);
                    
                    break;
                case 2:
                    MTArrayList.mostrarVentas(listaCoches, listaMeses);
                    break;
                case 3:
                    MTArrayList.mostrarVentasReves(listaCoches, listaMeses);
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion!=7);
    }
    
}
