/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author Dan
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector;
        vector=ArMethod.crearArray(10);
        
        ArMethod.fillArrayRandomNumbers(vector, 9, 0);
        
        ArMethod.showArray(vector);
        
        System.out.println("");
        ArMethod.burbujaSorter(vector);
        
        ArMethod.showArray(vector);
    }
    
}
