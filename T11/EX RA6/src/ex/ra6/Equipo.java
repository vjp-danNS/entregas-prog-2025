/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex.ra6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Equipo implements Comparable<Equipo> {

    private int codigo;
    private String nombre;
    private int numTrofeos;

    //Constructores
    public Equipo(int codigo, String nombre, int numTrofeos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numTrofeos = numTrofeos;
    }

    public Equipo() {
        codigo = 0;
        nombre = "";
        numTrofeos = 0;

    }

    //Getter / Setter
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumTrofeos() {
        return numTrofeos;
    }

    public void setNumTrofeos(int numTrofeos) {
        this.numTrofeos = numTrofeos;
    }

    //toString
    @Override
    public String toString() {
        return "\n\n--------"+nombre+"--------\n"
                + "\nCodigo: "+codigo
                + "\nNumero de trofeos ganados: "+numTrofeos;
        
    }
    
    @Override
    public int compareTo(Equipo e) {
        if (this.numTrofeos < e.getNumTrofeos()) {
            return -1;
        } else if (this.numTrofeos > e.getNumTrofeos()) {
            return 1;
        } else {
            return 0;
        }
    }
    
    //-------------------------------OTROS---------------------------------------------
    
    //Metodo que añade un equipo a un conjunto de equipos
    
    public static HashSet<Equipo> addEquipos(){
        //Set
        HashSet<Equipo> equipos = new HashSet<>();
        //Variables
        int codigo;
        String nombre;
        int numTrofeos;
        
        //Variables para manejar menu
        String opcion;
        boolean checkMasEquipos;
        boolean checkOpcion;
        //Metodo
        System.out.println("\nAnadamos un/os equipo/s...\n");
        do { 
            checkMasEquipos=false;
            System.out.print("\nCodigo: ");
            codigo= escanerInt();
            System.out.print("\nNombre: ");
            nombre= escanerString();
            System.out.print("\nNumero de trofeos ganados: ");
            numTrofeos= escanerInt();
            
            Equipo equipo = new Equipo(codigo, nombre, numTrofeos);
            System.out.println("\nEquipo creado de forma correcta...");
            
            equipos.add(equipo);
            System.out.println("\nEquipo agregado a la conjunto de forma correcta...");
            
            do { 
                checkOpcion=false;
                System.out.println("\nDeseas agregar mas equipos? (S/n): ");
                opcion=escanerString();
                //Si es "S" sale del bucle de preguntar y pide datos de otro equipo
                if (opcion.equalsIgnoreCase("s")) {
                    checkOpcion=true;
                }
                //Si es "N" sale del bucle de preguntar y del bucle de crear equipos
                else if(opcion.equalsIgnoreCase("n")){
                    checkMasEquipos=true;
                    checkOpcion=true;
                }
                //Si es cualquier otra cosa pide de nuevo una opcion valida
                else{
                    System.out.println("\nOpcion no valida");
                }
                
            } while (!checkOpcion);
        } while (!checkMasEquipos);
        
        System.out.println("\nBucle de creacion de equipos terminado...");
        return equipos;
    
    }
    
    //No logre ordenarlos, Este metodo deberia ordenar los equipos y ordenarlos, por ahora solos los muestra
    public static void showEquiposSorted(ArrayList<Deporte> deportes) {
        if (deportes.isEmpty()) {
            System.err.println("\nNo existen deportes ni equipos");
        } else {    

            //Lista para volcar equipos
            ArrayList<Equipo> equiposToSort= new ArrayList<>();

            //Volcamiento
            for (Deporte deporte : deportes) {
                equiposToSort.addAll(deporte.getEquipos());
            }
            
           
            
            
            System.out.println(equiposToSort.toString());
            
            
        }
       
    } 
    
    
    //----------------------------ESCANERS--------------------------------------------------
    
    private static int escanerInt(){
       int n; 
       Scanner e = new Scanner(System.in);
       n= e.nextInt();
       return n;
        
    }
    private static String escanerString(){
       String s; 
       Scanner e = new Scanner(System.in);
       s= e.nextLine();
       return s;
        
    }
}
