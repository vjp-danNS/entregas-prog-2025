/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo variables y objeto scanner
        Scanner entrada=new Scanner(System.in);
        
        int num1,num2,num3,num4,aux=0,i=0;
        //Pido numero a los usuarios
        System.out.print("Por favor, introduzca el primer numero: ");
        num1= entrada.nextInt();
        System.out.print("Ahora, introduzca un segundo numero: ");
        num2= entrada.nextInt();
        System.out.print("Introduzca el tercer numero: ");
        num3= entrada.nextInt();
        System.out.print("Por ultimo, introduzca un cuarto numero: ");
        num4= entrada.nextInt();
        
        //Invoco el metodo burbuja
        MetodoBurbuja.metodoBurbuja(num1, num2, num3, num4);
    }
    
}
