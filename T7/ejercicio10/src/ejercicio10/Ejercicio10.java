/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Dan
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector;
        vector=Provicional.crearArray(10);
        Provicional.fillArrayRN(vector, 1, 8);
        System.out.println("--------------Array base------------ \n");     
        Provicional.showArray(vector);
        System.out.println("");
        Provicional.replaceDuplicates(vector);
         System.out.println("-----------Array Remplazado--------- \n");  
        Provicional.showArray(vector);
    }
    
}
