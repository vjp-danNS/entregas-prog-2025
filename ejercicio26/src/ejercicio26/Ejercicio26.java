/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author Dan
 */
public class Ejercicio26 {

    
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in); //Creo objeto entrada 
       long numEntero;
       long millar;
       long centena;
       long decena;
       long unidad;
       
       System.out.print("Por favor, introduzca un numero de 4 cifras: "); numEntero= entrada.nextLong();
       
       millar=numEntero/1000;
       System.out.println("La primera cifra es: "+millar);
       centena=(numEntero%1000)/100;
       System.out.println("La segunda cifra es: "+centena);
       decena=(numEntero%1000)%100/10;
       System.out.println("La tercera cifra es: "+decena);
       unidad=(numEntero%1000)%100%10;
       System.out.println("La cuarta cifra es: "+unidad);
       
     
    }
    
}
