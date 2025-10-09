/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);//Creo objeto entrada        
        int numEntrada;
       //Creo variable para guardar el input de entrada
        System.out.print("Por favor, introduzca un numero:"); numEntrada=entrada.nextInt();
        //Introduccion de numEntrada
        if(numEntrada>0){
            System.out.println("Su numero es positivo");
        }else if(numEntrada<0){
            System.out.println("Su numero es negativo");
        }
        //Verificacion de positivo o negativo
        
    };
          
                        
                        
                
   
       
    }
    

