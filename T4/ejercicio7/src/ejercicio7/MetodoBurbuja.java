/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author alumno
 */
public class MetodoBurbuja {
    //Aplico el metodo burbuja y lo imprimo fuera del for
    public static void metodoBurbuja(int a,int b,int c,int d){
        int aux,i;
        for (i = 0; i != 3; i++) {
            if (a>b) {
                aux=a;
                a=b;
                b=aux; 
            }
            if (b>c) {
                aux=b;
                b=c;
                c=aux;
            }
            if (c>d) {
                aux=c;
                c=d;
                d=aux;
            }
            
        }
        System.out.println("El orden de los numeros introducidos es el "+a+"-"+b+"-"+c+"-"+d);    
    }
    
}
