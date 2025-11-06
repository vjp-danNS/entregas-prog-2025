/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class LetraAleatoria {
    
    //Genero un numero aleatorio que equivale a una letra entre a y z en ASCII
    public static double genRandomLetterNumberId() {
        double aleatorio= (Math.floor(Math.random()*(122-97+1)+97));
        return aleatorio;
    }
    
    //Convierto el numero generado en una letra entre a y z
    public static char genRandomLetter(double a) {
        
        char letra= (char)a;
        
        return letra;
    }
    //Subprograma que permite al usuario adivinar la letra aleatoria
    public static void userAdivina( int correctaId) {
        Scanner entrada=new Scanner(System.in);//Creo objeto entrada
        //Creo variables para a
        char userChar;
        int tries=0;
        int userCharIdNum;
        
        //Bucle que pregunta al usuario por la letra y comprueba si es correcta o no
        do {            
            //Pido al usuario una letra
            System.out.print("ADIVINA LA LETRA! \nQue letra crees que es?: ");
            userChar=entrada.nextLine().charAt(0);//Almaceno la letra pedida
            userCharIdNum=(int)userChar;//Almaceno en otra variable el numero equivalente a la letra del usuario
            tries++;//Aumento el contador de intentos
            //Calculo si la letra esta antes o despues en el alfabeto
            if (userCharIdNum>correctaId) {
                System.out.println("La letra objetivo esta ANTES en el alfabeto ");
            } else if(userCharIdNum<correctaId) {
                System.out.println("La letra objetivo esta DESPUES en el alfabeto ");
            }else{
                System.out.println("HAS ACERTADO!!! \nTe ha costado: "+tries+" intentos");
            }
        } while (userCharIdNum!=correctaId);
        
    }
}
