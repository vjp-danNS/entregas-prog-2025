/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Arrays {
    //-------------------------------CREADOR------------------------------------
    //Creador de array con tamaño determinado por variable controlando que la variable sea un int, con limites de tamaño de array
    public static int [] crearArrayComprobado(int numMin, int numMax) {
        Scanner entrada=new Scanner(System.in);
        int tamañoArray=0;
        boolean ready;
        do {
            try {
                System.out.print("Introduzca un numero entre "+numMin+" y "+numMax+" para el tamaño del array: ");
                tamañoArray=entrada.nextInt();
                if (tamañoArray<1||tamañoArray>10) {
                    ready=false;
                    System.err.println("El tamaño del array no es un numero entero valido");
                }else{
                    ready=true;
                }
                
                
            } catch (InputMismatchException e) {
                System.err.println("El tamaño del array no es un numero entero valido");
                ready=false;
                entrada.next();
            }            
            
        } while (!ready);
        int[] a= new int[tamañoArray];     
        return a;
    }
    //Creador de array con tamaño determinado por variable
    public static int [] crearArray(int tamañoArray) {
        int[] a= new int[tamañoArray];
        return a;
    }
    public static String [] crearArrayStrings(int tamañoArray) {
        String[] a= new String[tamañoArray];
        return a;
    }
    //--------------------------FILLERS---------------------------------
    //Rellenar array manualmente
    public static void fillArrayManual(int[] array){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Vamos a rellenar el array de "+array.length+" posiciones");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor de la posicion "+(i+1)+": ");
            array[i] =entrada.nextInt();
        }
    }
    //Rellena con numeros aleatorios el array
    public static void fillArrayRandomNumbers(int[] array, int numeroMaximo, int numeroMinimo) {
        
        numeroMaximo-=numeroMinimo;
        for (int i = 0; i < array.length ; i++) {
            array[i]=(int)(Math.random()*numeroMaximo+numeroMinimo+1);
            
        }
        System.out.println("Array rellenado con numeros enteros aleatorios entre "+numeroMinimo+" y "+numeroMaximo);
        
    }
    //Rellena un array con los meses del año
    public static void fillArrayMonths(String[] array){
        array[0]="Enero";
        array[1]="Febrero";
        array[2]="Marzo";
        array[3]="Abril";
        array[4]="Mayo";
        array[5]="Junio";
        array[6]="Julio";
        array[7]="Agosto";
        array[8]="Septiembre";
        array[9]="Octubre";
        array[10]="Noviembre";
        array[11]="Diciembre";
    }
    //--------------------SHOW-----------------------
    //Muestra los numeros pares que esten en el array
    public static void showArrayEvenCharacter(int[] array){
        System.out.print("Los numeros pares introducidos en este array son: ");
        for (int j = 0; j < array.length; j++) {
            if (array[j]%2==0) {
                System.out.print(array[j]+",");
            }
        }
    }
    //Muestra los caracteres del array
    public static void showArray(int[] array){
        System.out.println("Los numeros de este array son: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    
    }
    //---------------------------GETTER-----------------------------
    //Envia devuelta el indice del array con el numero mayor
    public static int getArrayHigher(int [] array){
        int mayor=array[0], a=0;
        for (int i = 0; i < array.length; i++) {
            if (a<array[i]) {
                mayor=i;
                a=array[i];
            }
        }
        return mayor;
    }
    //Envia devuelta el String almacenado en un lugar de un array
    public static String getArrayString(String[] array, int posicionArray) {
        
        return array[posicionArray];
    }
    //Envia devuelta los characteres de array
    public static int getArrayCharacter(int[] array,int i){
        int a=array[i];
        return a;
    }
    
    //Envia devuelta lo longitud de un int
    public static int getNumberLenght(int number){
        int checker, i=0;
        boolean ready=true;
        
        while (ready) {            
            checker=number/(int)Math.pow(10, i+1);
            i++;
            if (checker==0) {
                ready=false;
            }
        }
        return i;
    }
    //Entrega la suma total de todos los numeros de un array
    public static int getArrayTotal(int [] array){
        int a=0;
        int i;
        for (i = 0; i < array.length; i++) {
            a=a+getArrayCharacter(array, i);
        }
        System.out.println("Se sumaron "+i+" numeros");
        return a;
    }
    //--------------------------INVERTER-------------------------------
    //Invierte un array guardando el invertido en un array auxiliar
    public static int [] inverter(int [] array,int tamañoArray){
        int[] aux;
        aux=crearArray(tamañoArray);
        for (int i = 0; i < array.length; i++) {
            aux[array.length-1-i]=array[i];
        }
        return aux;
    }
    //Pide un numero de x cifras y despues lo invierte
    public static void numberInverterRequester(int[] array, int numeroDeCifras){
        int num,aux;
       
        Scanner entrada=new Scanner(System.in);          
        System.out.print("Introduzca un numero de "+numeroDeCifras+" cifras:" );
        num=entrada.nextInt();       
        for (int i = 0; i < array.length; i++) {
            aux=(num/(int)Math.pow(10, array.length-i-1));
            aux=aux-((aux/10)*10);            
            array[(i-numeroDeCifras+1)*-1]=aux;       
        }
    }
    //Con un numero entregado de x cifras lo invierte
    public static void numberInverter(int [] array, int num){
        int aux; 
        for (int i = 0; i < array.length; i++) {
            aux=(num/(int)Math.pow(10, array.length-i-1));
            aux=aux-((aux/10)*10);            
            array[(i-array.length+1)*-1]=aux;       
        }
    
    }
    //Muestra el array invertido
    public static void showArrayInverted(int [] array) {
        System.out.print("El numero invertido es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println(" ");
    } 
    
}
