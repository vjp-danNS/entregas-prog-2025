/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class MTArrayList {
    
    //------------------FILL-------------------
    //Metodo que rellena listas. STRING
    public static void rellenarLista(ArrayList <String> lista, Scanner esc){
        lista.add(esc.nextLine());
    }
    
    //Rellena lista hasta que se ingrese un negativo. INTEGER
    public static void rellenarListaUntNeg(ArrayList <Integer> lista){
        Scanner esc = new Scanner(System.in);
        int num;
        boolean salir=false;
        do {            
           System.out.print("Ingresa un valor para ingresar a la lista "
                   + "si es negativo el ingreso terminara: ");
           num=esc.nextInt();
           
            if (num<0) {
                salir=true;
            }
            else{
                lista.add(num);
            }
            
        } while (!salir);
        
    }
    
    //------------------SHOW-------------------
    //Mostrar lista String
    public static void mostrarListaStr (ArrayList <String> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+" "+lista.get(i));
            
        }
    }
    
    public static void mostrarListaInt (ArrayList <Integer> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+" "+lista.get(i));
            
        }
    }
    
    //-----------------OTROS-------------------
    //Sustituye numeros repetidos por 0 dentro de la lista
    public static void sustituirRepetidos(ArrayList<Integer> lista) {
        
    }
}
