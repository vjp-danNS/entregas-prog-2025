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
        String[] ventasMeses;
        
        ventasMeses=Arrays.crearArrayStrings(12);
        Arrays.fillArrayMonths(ventasMeses);
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
                //Muestra las ventas los meses pares
                    System.out.print("Las ventas de los meses pares son: ");
                    for (int i = 0; i < 12; i++) {
                        if ((i+1)%2==0) {
                            System.out.print(ventas[i]+" ");
                        }
                    }
                    break;
                case 6:
                //Muestra el nombre del mes con mas ventas
                    System.out.println("El mes con mas ventas es: "
                            +Arrays.getArrayString(ventasMeses, Arrays.getArrayHigher(ventas)));

                    break;
                case 7:
                //Opcion de salida
                    System.out.println("Adios!");
                    break;
                
                
            default:
                throw new AssertionError();
            }

        } while (opcion!=7);
    }
    
}
