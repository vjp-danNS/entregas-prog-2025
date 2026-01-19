/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Dan
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz=MTMethod.crearMatriz(4, 2);
        MTMethod.fillMatrizAsk(matriz);       
        MTMethod.showMatrizCuadricula(matriz);
        System.out.println("El mayor es: "+MTMethod.getMayor(matriz));
        System.out.println("El menor es: "+MTMethod.getMenor(matriz));
        System.out.println("La suma total de los numeros en la matriz: "+MTMethod.getSuma(matriz));
    }
    
}
