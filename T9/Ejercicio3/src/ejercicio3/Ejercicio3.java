/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objeto Scanner para pedir la frase
        Scanner esc =new Scanner(System.in);
        
        //Variables
        String frase;
        char[] array;
        
        
        //Codigo
        
        //Pido la frase
        System.out.print("Hola! Escriba una frase: ");
        frase=esc.nextLine();
        array=frase.toCharArray();
        
        //Ocupo un bucle for para mostrar los char en el String
        
        System.out.println("Frase en horizontal: ");
        for (int i = 0; i < frase.length(); i++) {
            System.out.println(array[i]);
            
        }
    }
    
}
