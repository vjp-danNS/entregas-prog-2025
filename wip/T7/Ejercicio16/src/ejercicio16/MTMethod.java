/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

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
    //Pide al usuario que rellena la matriz con numeros 
    public static void fillMatrizAsk(int [][] matriz){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor rellene este array de "+matriz.length+" x "+matriz[matriz.length-1].length+":");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduce el valor para la posicion ["+i+j+"] : ");
                matriz[i][j]=entrada.nextInt();
            }
        }
    }
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
    //---------------------GETTERS---------------------------
    //Devuelve la suma de toda la matriz
    public static int getSuma(int [][] matriz) {
        int suma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma+=matriz[i][j];
            }
            
        }
        return suma;
    }
    //Devuelve el numero mayor que se encuentra en la matriz
    public static int getMayor(int [][] matriz) {
        int mayor=matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]>mayor) {
                    mayor=matriz[i][j];
                }
            }
            
        }
        return mayor;
    }
    //Devuelve el numero menor que se encuentra en la matriz
    public static int getMenor(int [][] matriz) {
        int menor=matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]<menor) {
                    menor=matriz[i][j];
                }
            }
            
        }
        return menor;
    }
    //Devuelve la media de los numeros dentro de la matriz
    public static int getMedia(int [][] matriz){
        int media=0,i=0,j=0;
        for (i=0 ; i < matriz.length; i++) {
            for ( j=0 ; j < matriz[i].length; j++) {
                media+=matriz[i][j];
                
            }
            
        }
        media/=(i*10+j);
        return media;
    }
    //Devuelve la media de los numeros de una fila de la matriz
    public static int getMediaFila(int [][] matriz, int fila){
        int media=0,i=0,j=0;
        for (i=0 ; i < matriz.length; i++) {
            for ( j=0 ; j < matriz[i].length; j++) {
                if (i==fila) {
                    media+=matriz[i][j];
                }
                
                
            }
            
        }
        media/=matriz[matriz.length-1].length;
        
        return media;
    }
    //Devuelve cual es la fila con la mayor media
    public static int getMediaMejor(int [][]matriz){
        int mejor=0,mejorFila=0;
        
        int media=0,i=0,j=0;
        
        for (i=0 ; i < matriz.length; i++) {
            //Calcula la media de una fila
            for ( j=0 ; j < matriz[i].length; j++) {
                media+=matriz[i][j];
                
            }
            media/=matriz[matriz.length-1].length;
            //Comprueba si la media de x fila es mejor que el anterior mejor, alamacena el nuevo mejor y la fila
            if (media>mejor) {
                mejor=media;
                mejorFila=j;
                
            }
        }
        
        
        return mejorFila;
        
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
    //Muestra en cuadricula
    public static void showMatrizCuadricula (int [][] matriz){
        System.out.println("-------------------------------");
        System.out.println("Matriz: \n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("-------------------------------");
    }
}
