/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg5;

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
    //Metodo que rellena una lista con los dias de la semana. STRING
    public static void rellenarListaDiasSemana (ArrayList<String> listaSemana){
        listaSemana.add("Lunes");
        listaSemana.add("Martes");
        listaSemana.add("Miercoles");
        listaSemana.add("Jueves");
        listaSemana.add("Viernes");
        listaSemana.add("Sabado");
        listaSemana.add("Domingo");
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
                   + "si es negativo, el ingreso terminara: ");
           num=esc.nextInt();
           
            if (num<0) {
                salir=true;
            }
            else{
                lista.add(num);
            }
            
        } while (!salir);
        
    }
    
    //Rellena una lista de listas . Lista de Lista de  Interger
    public static void rellenarListaDeListas(ArrayList<ArrayList<Integer>> listaDeLista, int cantidadListas, int largoLista){
        
        Scanner esc = new Scanner(System.in);
        
        for (int i = 0; i < cantidadListas ; i++) {
            ArrayList<Integer> lista = new ArrayList<>();
            System.out.println("Lista de listas posicion"+i+": ");
            for (int j = 0; j < largoLista; j++) {
                System.out.print("\nLista posicion "+j+": ");
                rellenarListaInt(lista, esc);
 
            }
            listaDeLista.add(lista);
        }
        
    
    
    }
    //Rellena un Mes (Lista de listas) con la temperatura de cada dia de la Semana (Lista). Lista de Lista de  Interger
    public static void rellenarMes(ArrayList<ArrayList<Integer>> listaMes,ArrayList<String> listaDias ){
        
        int semana=4, dias =7; //4 Semanas de 7 dias cada una
        
        Scanner esc = new Scanner(System.in);
        
        for (int i = 0; i < semana  ; i++) {
            
            ArrayList<Integer> listaSemana = new ArrayList<>();
            System.out.println("Semana "+(i+1)+": ");
            
            for (int j = 0; j < dias; j++) {
                System.out.print("Temperatura del "+listaDias.get(j)+": ");
                
                rellenarListaInt(listaSemana, esc);
 
            }
            
            listaMes.add(listaSemana);
        }
    }
    
    public static void rellenarMesRandom(ArrayList<ArrayList<Integer>> listaMes,ArrayList<String> listaDias ){
        
        int semana=4, dias =7; //4 Semanas de 7 dias cada una
        
        Scanner esc = new Scanner(System.in);
        
        for (int i = 0; i < semana  ; i++) {
            ArrayList<Integer> listaSemana = new ArrayList<>();
            System.out.println("\nSemana "+(i+1)+": ");
            for (int j = 0; j < dias; j++) {
                System.out.print("\nTemperatura del "+listaDias.get(j)+": ");
                listaSemana.add((int)(Math.random()*26+1));
 
            }
            listaMes.add(listaSemana);
        }
    }
        
    
    //------------------SHOW-------------------
    //Mostrar lista String
    public static void mostrarListaStr (ArrayList <String> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+" "+lista.get(i));
            
        }
    }
    //Mostrar lista. Integer
    public static void mostrarListaInt (ArrayList <Integer> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+" "+lista.get(i));
            
        }
    }
    //Mostrar lista de ventas. 
    public static void mostrarVentas (ArrayList<Integer> lista, ArrayList<String> listaMeses){
        System.out.println("Lista de ventas: ");
        for (int i = 0; i < 12; i++) {
            System.out.println(listaMeses.get(i)+": "+lista.get(i));
        }
    
    }
    //Mostrar lista de ventas al reves. 
    public static void mostrarVentasReves (ArrayList<Integer> lista, ArrayList<String> listaMeses){
        System.out.println("Lista de ventas al reves: ");
        for (int i = lista.size()-1; i >= 0; i--) {
            System.out.println(listaMeses.get(i)+": "+lista.get(i));
        }
    
    }
    //Mostrar lista de temperaturas de un mes.
    public static void mostrarMesTemp(ArrayList<ArrayList<Integer>> listaMes, ArrayList<String> listaDias){
        System.out.println("Lista de temperaturas del mes: ");
        
        //Recorre el mes (4 semanas)
        for (int i = 0; i < listaMes.size(); i++) {
            System.out.println("\nSemana "+(i+1)+": ");
            //Recorre cada semana(7 dias)
            for (int j = 0; j < listaMes.get(i).size(); j++) {
                System.out.println("El "+listaDias.get(j)+" de la semana "+(i+1)+" hubieron "+listaMes.get(i).get(j)+" grados ");
                
            }
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
    //Devuelve la media de la lista de Listas. Lista de lista de Integer
    public static int mediaListaDeLista(ArrayList<ArrayList<Integer>> listaDeListas){
        
        int media=0;
        int espacios=0;
        
        //Calcula la suma total de la lista y la cantidad de espacios
        for (int i = 0; i < listaDeListas.size(); i++) {
            espacios+=listaDeListas.get(i).size();
            for (int j = 0; j < listaDeListas.get(i).size(); j++) {
                media+=listaDeListas.get(i).get(j);
                
            }
            
        }
        
        
        
        //Calcula la media
        media/=espacios;
        
        
        return media;
    }
    
    //Muestra la mayor temperatura de un mes
    public static void mayorTempMes(ArrayList<ArrayList<Integer>> listaMes,ArrayList<String> listaDias){
        
        int mayorTemp=listaMes.get(0).get(0);
        
        //Recorre el mes (4 semanas) buscando la mayor temperatura
        for (int i = 0; i < listaMes.size(); i++) {
            //Recorre cada semana(7 dias)
            for (int j = 0; j < listaMes.get(i).size(); j++) {
                
                //Compara las temperaturas y se queda con el mayor
                if (mayorTemp<listaMes.get(i).get(j)) {
                    mayorTemp=listaMes.get(i).get(j);
                }
                
            }
        }
        
        //Recorre el mes (4 semanas) mostrando el/los dia/s con mayor temperatura
        for (int i = 0; i < listaMes.size(); i++) {
            //Recorre cada semana(7 dias)
            for (int j = 0; j < listaMes.get(i).size(); j++) {
               
                if (mayorTemp==listaMes.get(i).get(j)) {
                    System.out.println("El "+listaDias.get(i)+" de la semana "+(i+1)+" hubieron "+listaMes.get(i).get(j)+" grados ");
                }
                
                
            }
        }
    }
    
    //Devuelve el numero par mayor de la lista. INTEGER
    public static int parMayor(ArrayList<Integer> lista){
        //No lo inicio en la posicion 0 porque no se si es par
        int num=0;
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)%2==0 && num < lista.get(i)) {
                num=lista.get(i);
            }
            
        }
        
        
        return num;
    }
    
    //Devuelve el numero impar menor de la lista. INTEGER
    public static int imparMenor(ArrayList<Integer> lista){
        //No lo inicio en la posicion 0 porque no se si es impar
        int num=0;
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)%2!=0 && num > lista.get(i)) {
                num=lista.get(i);
            }
            
        }
        
        return num;
    }
    
    
    public static void switchPositionInt(ArrayList<Integer> lista, int a, int b ){
        
        //Index de posicion de a y b
        int idxA=0, idxB=0;
        
        int i=0;
        
        boolean encontrado=false;
        
        while(!encontrado && i<lista.size()){
            
        }
        
    
    }
}
