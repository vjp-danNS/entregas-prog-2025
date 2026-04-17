package ejercicio.pkg05;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio05 {

    
    public static String NAME_FICHERO="Agenda.txt";
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        ArrayList<Contacto> agenda = new ArrayList<>();
        FileWriter fw;
        PrintWriter pw;
        int opcion=0;
        try {
            fw =new FileWriter(NAME_FICHERO);
            pw = new PrintWriter(fw);
            
            System.out.print("\nMENU ESCRITURA DE ARCHIVOS"
                    + "\n1.- Añadir un contacto a la agenda"
                    + "\n2.- Mostrar agenda"
                    + "\n3.- Salir"
                    + "\nOpcion: ");
            opcion=escanerInt();
            switch (opcion) {
                case 1:
                    writeFile(agenda, pw);
                    break;
                case 2:
                   
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            
        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
            System.out.println(e.getMessage());
        }
        
        
    }
    
    //Escribir

    public static void writeFile (ArrayList<Contacto> agenda, PrintWriter pw ) throws InputMismatchException{
        
        int i=0;
        int numero;
        int edad;
        String nombre;
        String desicion;
        boolean check,check2=false;
        
        System.out.println("\nEscribiendo fichero...\n");
        do {            
            System.out.print("\nNumero movil: ");
            numero=escanerInt();
            System.out.print("\nNombre: ");
            nombre=escanerString();
            System.out.print("\nEdad: ");
            edad=escanerInt();
            Contacto contactoAux = new Contacto(nombre, edad, numero);
            
            System.out.print("\nQuieres escribir mas contactos?(Y/n): ");
            desicion=escanerString();
            
            do {                
                if (desicion.equalsIgnoreCase("y")) {
                
                }else if (desicion.equalsIgnoreCase("n")) {

                }else{
                    System.out.println("\nOpcion no valida");
                }
            } while (!check2);
            
        } while (!check);
        
        i=0;
        
        for (Contacto contacto : agenda) {
                pw.println("Contacto "+i+": \n"+contacto.toString());
        }
        
        System.out.println("Fichero escrito de forma correcta");
        

    }
    
    
    //-----------SCANNER-------------
    public static int escanerInt() throws InputMismatchException{
        
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



