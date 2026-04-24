/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg05;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author alumno
 */
public class Contacto implements Comparable<Contacto>{
    //Atributos
    private String nombre;
    private int edad;
    private int numeroMovil;
    
    //Constructores

    public Contacto(String nombre, int edad, int numeroMovil) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroMovil = numeroMovil;
    }
    
    public Contacto(){
        nombre="";
        edad=0;
        numeroMovil=0;
    }
    
    //Getter/Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroMovil() {
        return numeroMovil;
    }

    public void setNumeroMovil(int numeroMovil) {
        this.numeroMovil = numeroMovil;
    }
    
    //toString

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: "+edad+ "\nTelefono Movil: " + numeroMovil ;
    }
    @Override
    public int compareTo(Contacto a) {
        if(this.numeroMovil < a.getNumeroMovil()) {
            return -1;
        } else if (this.numeroMovil > a.getNumeroMovil()) {
            return 1;
        } else {
            return 0;
        }  
    }
    
    //OTROS----------------------------------------------------------------------------------------------------------------------
    
    //Añadir contactos a la agenda
    public static void addContacto(ArrayList<Contacto> agenda) throws InputMismatchException{
        //Variables
        Contacto contacto;
        String nombre;
        int edad;
        int numeroMovil;
        
        //Pedimos al usuario los datos de un contacto
        System.out.println("\nAgregemos un contacto a la agenda\n");
        System.out.print("\nNombre: ");
        nombre = escanerString();
        System.out.print("\nEdad: ");
        edad= escanerInt();
        System.out.println("\nNumero Movil: ");
        numeroMovil=escanerInt();
        
        //Guardamos los datos en un contacto y los agregamos a la agenda
        contacto= new Contacto(nombre, edad, numeroMovil);
        agenda.add(contacto);
        System.out.println("\nContacto agregado a la agenda correctamente\n");
        
    }
    
    //Muestra una lista de contactos
    public static void showAgenda(ArrayList<Contacto> agenda) throws NullPointerException{
        System.out.println("\n----------AGENDA------\n");
        for (Contacto contacto : agenda) {
            
            System.out.println("\n"+contacto.toString());
        }
    
    }
    
    //Elimina un contacto de la lista
    public static void removeContacto(ArrayList<Contacto> agenda) throws NullPointerException, InputMismatchException{
        int numero;
        boolean encontrado=false;
        Iterator<Contacto> it = agenda.iterator();
        
        System.out.print("Que numero quieres eliminar de la lista de contactos?: ");
        numero=escanerInt();
        
        while (!encontrado && it.hasNext() ) {
            Contacto contacto=it.next();
            if (Objects.equals(numero, contacto.getNumeroMovil())) {
                agenda.remove(contacto);
            }
        }
    
    
    }
    
    //Muestra los contactos ordenados por edad
    public static void showSortedContacto(ArrayList<Contacto> agenda) throws NullPointerException{
        TreeSet<Contacto> agendaAux=new TreeSet<>(agenda);
        
        System.out.println("----------Agenda ordenada--------");
        for (Contacto contacto : agendaAux) {
            System.out.println("\n"+contacto.toString());
        }
        
        
    
    
    }
    
    //SCANNER-----------------------------------------------------------------------------------------------------------------------
    private static int escanerInt()throws InputMismatchException{
        
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        return n;
    }
    
    private static String escanerString()throws InputMismatchException{
        
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        
        return s;
    }
}
