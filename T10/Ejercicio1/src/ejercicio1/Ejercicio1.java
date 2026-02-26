/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
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
        
        Scanner escString =new Scanner(System.in);
        Scanner escInt =new Scanner(System.in);
        
        
        ArrayList <String> lista = new ArrayList();
        String nombre;
        int opcion;
        boolean listo=false;
        
        System.out.println("Ahora rellenaremos una lista de nombres de personas: ");
        
        do {            
            System.out.print("\nIntroduzca el nombre de la persona a introducir: ");
            MTArrayList.rellenarLista(lista, escString);
            
            System.out.print("Quieres introducir otro nombre?: \n1.- Si\n2.- No\nOpciones: ");
            opcion=escInt.nextInt();
            
            
        } while (opcion!=2);
        System.out.println("Lista: ");
        MTArrayList.mostrarLista(lista);
        
    }
    
}
