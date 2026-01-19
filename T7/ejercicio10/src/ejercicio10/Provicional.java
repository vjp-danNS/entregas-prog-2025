/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Dan
 */
public class Provicional {
    //-----------CREATOR-----------
    public static int [] crearArray(int tamañoArray){
        int[]array= new int[tamañoArray];
        return array;
    }
    
    //-----------FILLER------------
    public static void fillArrayRN(int[]array,int numeroMinimo, int numeroMaximo){
        numeroMaximo-=numeroMinimo;
        for (int i = 0; i < array.length; i++) {
            array[i]=((int)(Math.random()*(numeroMaximo)+numeroMinimo+1));
        }
    }
    //------------SHOW-------------
    public static void showArray(int[] array){
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" "); 
        }
        System.out.println("");
    }
    //-----------REPLACE-----------
    public static int[] replaceDuplicates(int[]array) {
        int num=array[0];
        for (int i = 0; i < array.length; i++) {
            num=array[i];
            for (int j = i+1; j < array.length; j++) {
                if (num==array[j]) {
                    array[j]=0;
                }
            }
        }
        return array;
    }
}
