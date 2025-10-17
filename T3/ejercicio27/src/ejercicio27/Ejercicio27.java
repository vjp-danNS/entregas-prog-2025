/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double num1,num2;
        byte opcion=0;
        
        // Introduccion de numeros por parte del usuario. Fuera de do while pues el ejercicio no pide que se pida mas de una vez
        System.out.print("Introduzca el primer numero: ");
        num1=entrada.nextDouble();
        System.out.print("Introduzca el segundo numero: ");
        num2=entrada.nextDouble();
        
        //Impresion del menu y solicitud de seleccionar opcion
        do {            
            System.out.println("1.- Sumar los numeros.\n2.- Restar los numeros.\n3.- Multiplicar los numeros.\n4.- Dividir los numeros.\n5.- Salir del programa.\nElija una opcion introduciendo un numero: ");
            opcion=entrada.nextByte();
            
            //Lector de opcion seleccionada
            switch (opcion) {
                //Opcion de suma
                case 1:
                    System.out.println("El resultado de la suma es: "+(num1+num2));
                    break;
                //Opcion de resta
                case 2:
                    System.out.println("El resultado de la resta es"+(num1-num2));
                    break;
                //Opcion de multiplicacion
                case 3:
                    System.out.println("El resultado de la multiplicacion es:"+(num1*num2));
                    break;
                //Opcion de division
                case 4:
                    //Revision del numero dividendo (num2) para evitar errores por division en 0
                    if (num2==0) {
                        System.err.println("Opcion no valida dividendo igual a 0");
                    
                    //Division en caso de que no sea 0 el dividendo    
                    }else 
                        System.out.println("El resultado de la division es: "+(num1/num2));
                    break;
                //Opcion de salida
                case 5:
                    break;
                //Control de opciones no validas
                default:
                    System.out.println("ERROR OPCION NO VALIDA");
            }
        } while (opcion!=5);
    }
    
}
