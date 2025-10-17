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
        //Creo las variables
        int i=20;
        int cantIt=0;
        /*Le sumo 1 para entrar en los impares, podria crear la variable 
        desde base siendo 21, pero la he creado en 20 para seguir los pasos*/
        i=i+1;
        //Inicio lo mostrado en pantalla
        System.out.print("Los numeros impares existentes entre 20 y 160 son: -");
        //Calculo Impares sumando 2 a un numero de base impar.
        while (i<160) {            
            System.out.print(i+"-");
            i=i+2;
            cantIt++;
        }
        //Termino impresion con el numero de iteraciones
        System.out.println("\nLa cantidad de numeros impares impresos han sido: "+cantIt);
    }
    
}
