/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio20 {
    public static String CORRECTA1= "Madrid",CORRECTA2="Cristobal Colon"; //Constantes de las respuestas
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);//Creo objeto Scanner
        //Declaro variables
        String respuestaUsuario;
        int nota=0;
        boolean iguales;//variable de comparacion de Strings
        
        System.out.println("EXAMEN DE CULTURA GENERAL");
        //Pido respuesta 1
        System.out.print("1era PREGUNTA: ¿Cual es la capital de España?: ");
        respuestaUsuario=entrada.nextLine();
        
        iguales= respuestaUsuario.equals(CORRECTA1);//Compruebo que la respuesta sea correcta
        if (iguales) {
            System.out.println("Muy bien respuesta correcta");
            nota=nota+5;
        }else{
            System.out.println("Respuesta incorrecta, la respuesta correcta seria "+CORRECTA1);
        }
        //Pido respuesta 2
        System.out.print("2da PREGUNTA: ¿Quien descubrio America? ");
        respuestaUsuario=entrada.nextLine();
        
        iguales= respuestaUsuario.equals(CORRECTA2);//Compruebo que la respuesta sea correcta
        if (iguales){
            System.out.println("Muy bien respuesta correcta");
            nota=nota+5;
            
        }else {
             System.out.println("Respuesta incorrecta, la respuesta correcta seria "+CORRECTA2);
             
        }
        //Entrego nota
        System.out.println ("La nota del examen es: "+nota);
    }
    
}
