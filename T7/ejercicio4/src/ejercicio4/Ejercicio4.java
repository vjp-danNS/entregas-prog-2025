/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Dan
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz;
        matriz=MTMethod.crearMatriz( 4, 10);
        MTMethod.fillMatrizRandom(matriz, 100, 200);
        MTMethod.showMatriz(matriz);
        
    }
    
}
