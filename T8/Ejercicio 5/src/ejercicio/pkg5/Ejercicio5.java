/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Dan
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables para almacenar par mayor y impar menor
        int parMayor, imparMenor;
        //Lista de ints
        ArrayList<Integer> lista= new ArrayList<>();
        //Rellenar lista hasta que el usuario decida
        System.out.println("Rellenemos una lista");
        MTArrayList.rellenarListaUntSioNo(lista);
        //Muestro la lista
        System.out.println("Muestro la lista por primera vez");
        MTArrayList.mostrarListaInt(lista);
        //Calculo par mayor y impar menor
        parMayor=MTArrayList.parMayor(lista);
        imparMenor=MTArrayList.imparMenor(lista);
        //Compruebo la existencia de par e impares y muestro una lista si existen, en caso de su inexistencia muestro un mensaje de error. Comprueba existencia con Integer.MAX_VALUE
        MTArrayList.mostrarIfParAndImpar(lista, parMayor, imparMenor);
    }
    
}
