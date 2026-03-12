/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class MTArrayList {
    
    //------------------FILL-------------------
    //Metodo que rellena listas. STRING
    public static void rellenarListaStr(ArrayList <String> lista, Scanner esc){
        lista.add(esc.nextLine());
    }
    //Metodo que rellena listas. INTEGER
    public static void rellenarListaInt(ArrayList <Integer> lista ){
        Scanner esc= new Scanner(System.in);
        lista.add(esc.nextInt());
    }
    
    //Metodo que rellena una listaMeses con los meses del año. STRING
    public static void rellenarListaMeses(ArrayList<String> listaMeses){
        listaMeses.add("Enero");
        listaMeses.add("Febrero");
        listaMeses.add("Marzo");
        listaMeses.add("Abril");
        listaMeses.add("Mayo");
        listaMeses.add("Junio");
        listaMeses.add("Julio");
        listaMeses.add("Agosto");
        listaMeses.add("Septiembre");
        listaMeses.add("Octubre");
        listaMeses.add("Noviembre");
        listaMeses.add("Diciembre");
    }
    
    //Rellena una lista mostrando los meses del año
    public static void rellenarVentas(ArrayList<Integer> lista, ArrayList<String> listaMeses){
        Scanner esc=new Scanner(System.in);
        System.out.println("Rellenemos las ventas de los 12 meses del año");
        
        for (int i = 0; i < 12; i++) {
            System.out.print("Ventas de "+listaMeses.get(i)+": ");
            lista.add(esc.nextInt());
        }
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
    
    //Rellena lista hasta un si o no. INTEGER
    public static void rellenarListaUntSioNo(ArrayList <Integer> lista){
        boolean salir;
        
        do {            
            System.out.print("\nNumero: ");
            rellenarListaInt(lista);
            salir=siONo("Desea agregar mas numeros?: ");
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
            System.out.println("Posicion "+i+".- "+lista.get(i));
            
        }
    }
    public static void mostrarVentas (ArrayList<Integer> lista, ArrayList<String> listaMeses){
        System.out.println("Lista de ventas: ");
        for (int i = 0; i < 12; i++) {
            System.out.println(listaMeses.get(i)+": "+lista.get(i));
        }
    
    }
    public static void mostrarVentasReves (ArrayList<Integer> lista, ArrayList<String> listaMeses){
        System.out.println("Lista de ventas al reves: ");
        for (int i = lista.size()-1; i >= 0; i--) {
            System.out.println(listaMeses.get(i)+": "+lista.get(i));
        }
    
    }
    //Mostrar lista si existen pares e impares
    public static void mostrarIfParAndImpar(ArrayList<Integer> lista, int parMayor, int imparMenor){
        if (parMayor==Integer.MAX_VALUE) {
            System.err.println("No existe un numero par");
        } else if(imparMenor==Integer.MAX_VALUE){
            System.err.println("No existe un numero impar");
        }else{
            //Muestro par mayor y impar menor
            System.out.println("\nMuestro par mayor e impar menor\n");
            System.out.println("Par mayor: "+parMayor+"\nImpar menor: "+imparMenor+"\n");
            //Los intercambio
            Collections.swap(lista, lista.indexOf(parMayor), lista.indexOf(imparMenor));
            //Muestro la lista de nuevo
            System.out.println("Muestro la lista con las posiciones intercambiadas de los numeros mostrados anteriormente");
            MTArrayList.mostrarListaInt(lista);
        }
    
    }
    //-----------------OTROS-------------------
    //Sustituye numeros repetidos por 0 dentro de la lista
    public static void sustituirRepetidos(ArrayList<Integer> lista) {
        
    }
    //Calcula el int par mayor de una lista de Integer. Devuelve Integer.MAX_VALUE como error de inexistencia de pares.
    public static int parMayor(ArrayList<Integer> lista) {
        
        int numMayor=lista.get(0);
        
        for (int i = 1; i < lista.size(); i++) {
            int num = lista.get(i);
            
            //Comprueba que un numero sea par y que el numero sea mayor que el numero mayor anteriormente guardado
            if (num%2==0 && numMayor<num) {
                numMayor=num;
            }
            
        }
        
        if (numMayor%2==0) {
            return numMayor;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    //Calcula el int impar menor de una lista de Integer. Devuelve Integer.MAX_VALUE como error de inexistencia de pares.
    public static int imparMenor(ArrayList<Integer> lista) {
        
        int numMayor=lista.get(0);
        
        for (int i = 1; i < lista.size(); i++) {
            int num = lista.get(i);
            
            //Comprueba que un numero sea par y que el numero sea mayor que el numero mayor anteriormente guardado
            if (num%2!=0 && numMayor<num) {
                numMayor=num;
            }
            
        }
        
        if (numMayor%2!=0) {
            return numMayor;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    
    
    
    //Suma una lista y muestra el total
    public static void sumaTotal(ArrayList<Integer> lista){
        int suma=0;
        for (int i = 0; i < lista.size(); i++) {
            suma+=lista.get(i);
            
        }
        System.out.println("La suma total de la lista es: "+suma);
    }
    //Suma una lista en que los meses tengan la letra a
    public static void sumaTotalMesesConA(ArrayList<Integer> lista, ArrayList<String> listaMeses){
        int suma=0;
        
        for (int i = 0; i < lista.size(); i++) {
            if (listaMeses.get(i).contains("a")||listaMeses.get(i).contains("A")) {
                suma+=lista.get(i);
            }
        }
        System.out.println("La suma total de la lista es: "+suma);
    }
    
    //Muestra el mes con mas ventas
    public static void mesMasVentas(ArrayList<Integer> lista, ArrayList<String> listaMeses){
        int mejorVenta=lista.get(0);
        String mesMasVentas=listaMeses.get(0);
        
        for (int i = 0; i < listaMeses.size(); i++) {
            
            if (mejorVenta<lista.get(i)) {
                mejorVenta=lista.get(i);
                mesMasVentas=listaMeses.get(i);
            }
            
        }
        System.out.println("El mes con mas ventas fue "+mesMasVentas+" con "+mejorVenta+" ventas");
    }
    
    //Metodo para preguntar si se desea añadir algo mas, respuesta "Si" o "No"
    public static boolean siONo(String mensaje){
        //Scanner
        Scanner escString=new Scanner(System.in);
        //Variables
        boolean check=false;
        boolean salir=false;
        do {
            System.out.print("\n"+mensaje);
            String opcion=escString.nextLine().toUpperCase();


            if (Objects.equals(opcion, "SI")){
                
                check=true;
            }
            else if (Objects.equals(opcion, "NO")) {
                check=true;
                salir=true;
            }
            else{
                System.out.println("Opcion no valida");
            }

        } while (!check);
        
        return salir;
    
        
    }
}
