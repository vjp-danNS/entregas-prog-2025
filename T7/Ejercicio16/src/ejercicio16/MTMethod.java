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
        matriz =new int[columnas][filas];
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
        if (numeroMinimo!=0) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j]=((int)(Math.random()*(numeroMaximo+1)+numeroMinimo));
                }
            
            }
        }
        if (numeroMinimo==0) {
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=((int)(Math.random()*(numeroMaximo+1)));
            }
            
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
    public static int getMediaMejorFila(int [][]matriz){
        int mejor=0,mejorFila=0,fila=0, media=0;
        while (fila<matriz[matriz.length-1].length){            
            for (int column = 0; column < matriz.length; column++) {
                media+=matriz[column][fila];                        
            }
            media/=matriz.length;
            if (mejor<media) {
                mejor=media;
                mejorFila=fila;
            }
            media=0;
            
            fila++;
        }  
        return mejorFila;
        
    }
    //Devuelve la fila con mas casos bajo la mitad
    public static int getBellowHalfFila(int[][] matriz, int numMaximo){
        int bellowHalf=0, filaDevuelta=0, fila=0;
        int higherBellowHalf=0;//Uso esta variable para almacenar entre bucles cual es el mayor contador
        while (fila<matriz[matriz.length-1].length) { 
            //Reviso todas las posiciones de la fila
            for (int columna = 0; columna < matriz.length; columna++) {
                //Si es menor que la mitad de el numero maximo sumo al contador
                if (matriz[columna][fila]<numMaximo/2) {
                    bellowHalf++;
                }
            }
            //Si el contador de la mayor cantidad de suspensos es menor que el contador de suspensos de esta fila se cambia la fila devuelta y el contador mas alto
            if (higherBellowHalf<bellowHalf) {
                filaDevuelta=fila;
                higherBellowHalf=bellowHalf;
            }
            bellowHalf=0;
            fila++;
        }
    
        return filaDevuelta;
    }
    //Devuelve la columna con la media mas baja
    public static int getMediaWorstColumn(int [][] matriz, int mediaMasAltaPosible){
        int worstColumn=0,worstYet=mediaMasAltaPosible,media=0;
        for (int column = 0; column < matriz.length; column++) {
            for (int fila = 0; fila < matriz[matriz.length-1].length; fila++) {
                media+=matriz[column][fila];
            }
            media/=matriz[matriz.length-1].length;
            if (media<worstYet) {
                worstYet=media;
                worstColumn=column;
            }
            media=0;
        }
        
        return worstColumn;
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
    //Muestra en cuadricula con los nombres de las filas y columnas
    public static void showMatrizCuadriculaNames (int [][] matriz,String[] columnName, String[] filaName){
        System.out.println("-------------------------------");
        System.out.println("Matriz: \n");
        System.out.print("  | ");
        for (int i = 0; i < matriz[matriz.length-1].length; i++) {
            System.out.print(i+" ");
        }
        System.out.print("\n--+");
        for (int i = 0; i < matriz[matriz.length-1].length; i++) {
            System.out.print("--");
        }
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(i+" | ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("-------------------------------");
    }
}
