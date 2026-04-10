/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

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
        return "Contacto{" + "nombre=" + nombre + ", edad=" + edad + ", numeroMovil=" + numeroMovil + '}';
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
    public static void addContacto(ArrayList<Contacto> agenda) {
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
