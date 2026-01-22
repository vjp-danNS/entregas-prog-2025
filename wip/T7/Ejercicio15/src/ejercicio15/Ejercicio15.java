/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opcion;
        int [] ventas,aux;
        
        ventas=Arrays.crearArray(12);
        aux=Arrays.crearArray(12);
        
        
        
        do {
            System.out.println("\n\n-------OPCIONES--------"
                    + "\n1.- Rellenar un array unidimensional de 12 posiciones con las ventas de coches mensuales. Estas ventas seran números aleatorios entre 10 y 100"
                    + "\n2.- Mostras las ventas introducidas en la opcion 1"
                    + "\n3.- Mostrar las ventas introducidas en la opcion 1, al reves"
                    + "\n4.- Muestra la suma total de ventas del año"
                    + "\n5.- Muestra las ventas de los meses pares"
                    + "\n6.- Muestra el nombre del mes con mas ventas"
                    + "\n7.- Salir");
            System.out.print("\nPor favor introduzca una opcion: ");
            opcion=entrada.nextInt();
            System.out.println("");
            switch (opcion) {
                //Rellena el array con numeros aleatorios
                case 1:
                    
                    Arrays.fillArrayRandomNumbers(ventas, 100, 10);

                    break;
                //Muestra el array    
                case 2:
                    Arrays.showArray(ventas);

                    break;
                //Muestra el array invertido
                case 3:
                    aux=Arrays.inverter(ventas, 12);
                    Arrays.showArrayInverted(aux);
                    break;
                //Suma los numeros del array
                case 4:
                    System.out.println("La suma de las ventas es: "+Arrays.getArrayTotal(ventas));
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
