/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CODIGO NO PROBADO-----------------------------------ªªªªª!!
        //Variables
        int opcion;
        ArrayList<Contacto> agenda =new ArrayList<>();
        
        //Menu
        do {            
            try {
                System.out.print("\n-----------MENU CONTACTOS----------"
                    + "\n1.- Añadir contactos"
                    + "\n2.- Visualizar agenda"
                    + "\n3.- Eliminar contacto de la agenda "
                    + "\n4.- Mostrar todos los contactos ordenados por su edad"
                    + "\n5.- Salir"
                    + "\nOpcion: ");
            
                opcion=escanerInt();
            
            
            switch (opcion) {
                case 1:
                    Contacto.addContacto(agenda);
                    break;
                case 2:
                    Contacto.showAgenda(agenda);
                    break;
                case 3:
                    Contacto.removeContacto(agenda);
                    break;
                case 4:
                    Contacto.showSortedContacto(agenda);
                    break;
                case 5:
                    System.out.println("\n\nSaliendo...");
                    break;
                default:
                    System.out.println("\nOpcion no valida\n");
            }
            } catch (InputMismatchException e) {
                System.out.println("Caracter no valido");
                e.getMessage();
                opcion=6;
            }catch (NullPointerException e){
                System.out.println("Se intento buscar un objeto en una lista y no se encontro");
                e.getMessage();
                opcion=6;
            
            }
            
            
        } while (opcion!=5);
    }
    
    //-----------SCANNER-------------
    public static int escanerInt() throws InputMismatchException{
        
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        return n;
    }
    
}
