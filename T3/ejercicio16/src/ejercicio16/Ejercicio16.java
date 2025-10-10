/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=20;
        int cantIt=0;
        
        i=i+1;
        
        System.out.print("Los numeros impares existentes entre 20 y 160 son: ");
        
        while (i<160) {            
            System.out.print(i+"-");
            i=i+2;
            cantIt++;
        }
        System.out.println("\nLa cantidad de numeros impares impresos han sido: "+cantIt);
    }
    
}
