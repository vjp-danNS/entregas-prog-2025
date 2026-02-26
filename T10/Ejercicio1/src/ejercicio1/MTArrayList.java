/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class MTArrayList {
    
    public static void rellenarLista(ArrayList <String> lista, Scanner esc){
        lista.add(esc.nextLine());
    }
    public static void mostrarLista(ArrayList <String> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+" "+lista.get(i));
            
        }
    }
}
