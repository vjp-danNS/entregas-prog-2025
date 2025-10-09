/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);  //Creo objeto entrada
        
         float nota;
        //Creo variable para alamacenar nota introducida
        
        System.out.print("Introduzca su calificacion: ");nota=entrada.nextFloat();
        
        if ((nota<0)|(nota>10)) {
            System.out.println("El numero introducido no esta entre 0 y 10!");
        }else if ((nota>=0)&&(nota<=4.99)) {
            System.out.println("Suspenso");
            
        }else if ((nota>=5)&&(nota<=6.99)) {
                System.out.println("Bien");
            
        }else if ((nota>=7)&&(nota<=8.99)) {
                System.out.println("Notable");
            
        }else if ((nota>=9)&&(nota<=10)) {
                System.out.println("Sobresaliente");
        }
    }
            
}          
    
    
    

