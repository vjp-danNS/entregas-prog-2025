/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo el array list
        ArrayList<Integer> lista = new ArrayList<>();
        int imparMenor, parMayor;
        
        //Loop de ingreso
        MTArrayList.rellenarListaUntNeg(lista);
        
        //Mostramos lista
        MTArrayList.mostrarListaInt(lista);
        
        //Calculo de par mayor
        parMayor=MTArrayList.parMayor(lista);
        
        //Calculo de impar menor
        imparMenor=MTArrayList.imparMenor(lista);
        
        System.out.println("\nPar Mayor: "+parMayor+"\nImpar menor: "+imparMenor);
        
        
    }
    
}
