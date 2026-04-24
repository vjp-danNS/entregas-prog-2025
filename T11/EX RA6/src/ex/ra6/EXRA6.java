/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.ra6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EXRA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Lista deportes
        ArrayList<Deporte> deportes = new ArrayList<>();
        
        
        //Equipos para probar
        HashSet<Equipo> equiposFutbol = new HashSet<>();
        Equipo rm = new Equipo(0, "RM", 5);
        Equipo br = new Equipo(1, "Barcelona", 8);
        equiposFutbol.add(rm);
        equiposFutbol.add(br);
        
        HashSet<Equipo> equiposVolley = new HashSet<>();
        Equipo pl = new Equipo(2, "Plasencia", 2);
        Equipo mp= new Equipo(3, "Malpartida", 4);
        equiposVolley.add(pl);
        equiposVolley.add(mp);
        
        
        Deporte futbol= new Deporte("Futbol",equiposFutbol);
        Deporte volley = new Deporte("Volley", equiposVolley);
        
        deportes.add(futbol);
        deportes.add(volley);
        
        
        
        //Variables menu
        int opcion;
        
        
        //Metodo
        do {            
            System.out.print("\n---------MENU DEPORTES---------------"
                + "\n1.- Anadir un deporte"
                + "\n2.- Mostrar deportes y equipos"
                + "\n3.- Buscar equipo en deporte"
                + "\n4.- Mostrar mapa de equipos"
                + "\n5.- Mostrar equipos ordenados por numero de trofeos"
                + "\n6.- Salir"
                + "\nOpcion: ");
            opcion=escanerInt();
            
            switch (opcion) {
                case 1:
                    deportes.add(Deporte.addDeporte());
                    break;
                case 2:
                    Deporte.showDeportes(deportes);
                    break;
                case 3:
                    Deporte.searchEquipo(deportes);
                    break;
                case 4:
                    Deporte.showMapEquipos(deportes);
                    break;
                case 5:
                    Equipo.showEquiposSorted(deportes);
                    break;
                case 6:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.err.println("Opcion no valida");
            }
            
        } while (opcion!=6);
        
        
        
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
