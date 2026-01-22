/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Dan
 */
public class MTMethod {
    //Le da el tamaño a una matriz x
    public static int [][] crearMatriz(int filas, int columnas){
        int[][]matriz;
        matriz =new int[filas][columnas];
        return matriz;
    }
    //---------------------FILLER----------------------------
    //Rellena una matriz con numeros desde el 00
    public static void fillMatriz(int[][] matriz){
        System.out.println("Se rellenara el array de "+matriz.length+" x "+matriz[matriz.length-1].length+":");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=(i*10+j);
            }
            
        }
    }
    //Rellena una matriz con numeros aleatorios
    public static void fillMatrizRandom(int[][] matriz, int numeroMinimo, int numeroMaximo){
        System.out.println("Se rellenara el array de "+matriz.length+" x "+matriz[matriz.length-1].length+ " con numeros aleatorios: ");
        numeroMaximo-=numeroMinimo;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=((int)(Math.random()*(numeroMaximo)+numeroMinimo+1));
            }
            
        }
    }
    //---------------------SHOW------------------------------
    //SHOWER
    public static void showMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(" ["+i+j+"]------->"+ matriz[i][j]);
            }
        }
    }
}
