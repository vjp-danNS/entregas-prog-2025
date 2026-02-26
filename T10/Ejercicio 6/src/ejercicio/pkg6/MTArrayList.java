/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg6;

import java.util.ArrayList;
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
    public static void rellenarListaInt(ArrayList <Integer> lista, Scanner esc){
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
    
    //------------------SHOW-------------------
    //Mostrar lista String
    public static void mostrarListaStr (ArrayList <String> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+" "+lista.get(i));
            
        }
    }
    
    public static void mostrarListaInt (ArrayList <Integer> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+" "+lista.get(i));
            
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
        for (int i = 11; i > 0; i--) {
            System.out.println(listaMeses.get(i)+": "+lista.get(i));
        }
    
    }
    
    //-----------------OTROS-------------------
    //Sustituye numeros repetidos por 0 dentro de la lista
    public static void sustituirRepetidos(ArrayList<Integer> lista) {
        
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
            boolean tieneA=false;
            for (int j = 0; j < (listaMeses.get(i)).length; j++) {
                
                
            }
            if (tieneA) {
                suma+=lista.get(i);
            }
        }
        System.out.println("La suma total de la lista es: "+suma);
    }
    
}
