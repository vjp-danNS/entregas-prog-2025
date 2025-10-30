/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Multiplos3 {
    public static int numero() {
        //Metodo que pide el numero
        Scanner entrada=new Scanner(System.in);
        int a;
        System.out.print("Introduzca un numero: ");
        a=entrada.nextInt();
        return a;
        
    }
    public static boolean comprobacion(int a) {
        //Metodo que comprueba si a es menor que 0 o no
        boolean comprobacion;
        if (a>0) {
            comprobacion=true;
        }else{
            comprobacion=false;
            
        }
        return comprobacion;
    }
    public static void resultado(boolean comprobacion,int numEntrada){
        /*Metodo que en caso de que comprobacion sea true, calcule los mutiplos 
        de 3 del numEntrada y los imprima, ademas los cuenta y imprime la cantidad impresa */
        int j=0;
        if (comprobacion==true) {
            for (int i = 1; i <= numEntrada; i++) {
                if (i%3==0&&i>=3) {
                    System.out.println(i);
                    j++;
                }
                
            }
            System.out.println("La cantidad de numeros impresos es: "+j);
        }else{
            System.err.println("Numero no valido");
        }
    
    }
}
