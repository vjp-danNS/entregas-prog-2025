/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in); //Creo objeto entrada
        //Creo Variables para almacenar numeros introducidos
        int num1,num2,num3,num4;
        
        //Creo Variables para almacenar con auxiliares y ayudar operacion
        int aux;
        
        System.out.print("Por favor, introduzca el primer numero: ");num1= entrada.nextInt();
        System.out.print("Ahora, introduzca un segundo numero: ");num2= entrada.nextInt();
        System.out.print("Introduzca el tercer numero: ");num3= entrada.nextInt();
        System.out.print("Por ultimo, introduzca un cuarto numero: ");num4= entrada.nextInt();
        
        //Primera Iteracion
        if (num1>num2) {
            aux=num1;
            num1=num2;
            num2=aux;
        }
        if (num2>num3) {
            aux=num2;
            num2=num3;
            num3=aux;
        }
        if (num3>num4) {
            aux=num3;
            num3=num4;
            num4=aux;
        }
        //Segunda Iteracion
        if (num1>num2) {
            aux=num1;
            num1=num2;
            num2=aux;
        }
        if (num2>num3) {
            aux=num2;
            num2=num3;
            num3=aux;
        }
        if (num3>num4) {
            aux=num3;
            num3=num4;
            num4=aux;
        }
        //Tercera Iteracion
        if (num1>num2) {
            aux=num1;
            num1=num2;
            num2=aux;
        }
        if (num2>num3) {
            aux=num2;
            num2=num3;
            num3=aux;
        }
        if (num3>num4) {
            aux=num3;
            num3=num4;
            num4=aux;
        }        
        //print final
        System.out.println("El orden de los numeros introducidos es el "+num1+"-"+num2+"-"+num3+"-"+num4);
    }
    
}
