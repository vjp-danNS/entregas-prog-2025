/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static String NAME_FICHERO = "DatosBeca.txt";

    public static void main(String[] args) {

        String nombreYApellido, residenciaFamiliar; // Ej: Dan Neculman //Si o No
        String sexo; // H o M
        int edad, suspensos;
        float  ingresosAnualesFamilia;
        
        
        try {
            
            
            
            
            FileWriter fw = new FileWriter(NAME_FICHERO);
            PrintWriter pw = new PrintWriter(fw);
            
            System.out.println("\nRellenemos los datos de este becario: \n");
            System.out.print("\nNombre: ");
            nombreYApellido=escanerString();
            System.out.print("\nSexo: ");
            sexo=escanerString();
            System.out.print("\nEdad: ");
            edad=escanerInt();
            
            

            if (pw != null) {
                pw.close();
            }

            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println("Error de entrada/salida");
                    System.out.println(e.getMessage());
                }
            }

        } catch (IOException e) {
        }

    }

    //-----------SCANNER-------------
    public static int escanerInt() throws InputMismatchException {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        return n;
    }
    
    public static float escanerFloat() throws InputMismatchException {

        float f;
        Scanner sc = new Scanner(System.in);
        f = sc.nextInt();

        return f;
    }
    
    
    

    private static String escanerString() throws InputMismatchException {

        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        return s;
    }

}
