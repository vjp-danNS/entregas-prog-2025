/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex.ra6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Deporte {

    private String nombre;
    private HashSet<Equipo> equipos;

    //Constructores
    public Deporte(String nombre, HashSet<Equipo> equipos) {
        this.nombre = nombre;
        this.equipos = equipos;
    }

    public Deporte() {
        nombre = "";
        equipos = new HashSet<>();
    }

    //Getter/Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(HashSet<Equipo> equipos) {
        this.equipos = equipos;
    }

    //toString
    @Override
    public String toString() {
        return "\n------------" + nombre + "------------\n"
                + "\nEquipos: \n" + equipos;
    }
    
    
    //--------------------------------------OTROS--------------------------------------------
    //Metodo que permite añadir deportes junto con todos sus datos y los de sus equipos. Devuelve un Deporte
    public static Deporte addDeporte() {
        //Variables
        String nombre;
        HashSet<Equipo> equipos;
        Deporte deporte;

        boolean check = false;
        //Metodo
        System.out.println("\nAnadamos un deporte...\n");

        System.out.print("\nNombre: ");
        nombre = escanerString();

        System.out.println("\nEquipos: ");
        equipos = Equipo.addEquipos();

        deporte = new Deporte(nombre, equipos);

        return deporte;

    }

    //Metodo que muestra los deportes junto con sus Equipos
    public static void showDeportes(ArrayList<Deporte> deportes) {
        if (deportes.isEmpty()) {
            System.err.println("\nNo existen deportes ni equipos");
        } else {
            System.out.println(deportes.toString());

        }

    }

    //Metodo que busca un equipo en un deporte. Muestra a que deporte pertenece ese equipo
    public static void searchEquipo(ArrayList<Deporte> deportes) {
        if (deportes.isEmpty()) {
            System.err.println("\nNo existen deportes ni equipos");
        } else {
            //Varible
            String nombreBuscado;

            boolean check = false;

            //Metodo
            //Pido el nombre del equipo a buscar
            System.out.println("\nBusquemos un equipo...\n");
            System.out.print("\nNombre del equipo a buscar: ");
            nombreBuscado = escanerString();

            //Busco en cada deporte
            Iterator<Deporte> itDeporte = deportes.iterator();
            while (itDeporte.hasNext() && !check) {
                Deporte deporte = itDeporte.next();
                //Busco en cada equipo
                Iterator<Equipo> itEquipo = deporte.getEquipos().iterator();
                while (itEquipo.hasNext() && !check) {
                    Equipo equipo = itEquipo.next();
                    String nombreEquipo = equipo.getNombre();
                    //Si encuentra el nombre
                    if (nombreEquipo.equalsIgnoreCase(nombreBuscado)) {
                        System.out.println(nombreBuscado + " pertenece al deporte: " + deporte.getNombre());
                        check = true;
                    }

                }

            }
            //Si no encuentra el nombre
            if (!check) {
                System.out.println("\nNO SE ENCONTRO NINGUN EQUIPO CON ESE NOMBRE\n");
            }

        }

    }

    //Muestra un mapa de los equipos con 3 o mas trofeos
    public static void showMapEquipos(ArrayList<Deporte> deportes) {
        if (deportes.isEmpty()) {
            System.err.println("\nNo existen deportes ni equipos");
        } else {
            //Variable
            boolean check = false;
            //Mapa de equipos
            HashMap<Integer, Integer> mapaEquipos = new HashMap<>(); //Key codigo, Value numTrofeos

            //Metodo
            //Recorro todos los deportes y todos sus equipos, buscando equipos con mas de 3 trofeos
            for (Deporte deporte : deportes) {
                HashSet<Equipo> equipos = deporte.getEquipos();
                for (Equipo equipo : equipos) {
                    int numTrofeos = equipo.getNumTrofeos();
                    int codigo = equipo.getCodigo();
                    //Si encuentra un equipo con mas de 3 trofeos, los agrego al mapa
                    if (numTrofeos > 3) {
                        mapaEquipos.put(codigo, numTrofeos);
                    }

                }
            }

            //Si no existen equipos con mas de 3 trofeos
            if (mapaEquipos.isEmpty()) {
                System.err.println("\n NO EXISTEN EQUIPOS CON MAS DE 3 TROFEOS");
            } else {
                System.out.println("\n---Mapa equipos con 3 o mas trofeos---");
                Iterator<Integer> it = mapaEquipos.keySet().iterator();
                while (it.hasNext()) {
                    Integer codigo = it.next();
                    System.out.println("Codigo: " + codigo + " | " + "Numero de trofeos: " + mapaEquipos.get(codigo));

                }

            }
        }

    }

    
     //----------------------------ESCANERS--------------------------------------------------
    private static int escanerInt() {
        int n;
        Scanner e = new Scanner(System.in);
        n = e.nextInt();
        return n;

    }

    private static String escanerString() {
        String s;
        Scanner e = new Scanner(System.in);
        s = e.nextLine();
        return s;

    }

}
