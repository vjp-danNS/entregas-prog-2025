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
        
        boolean check=false;
        
        try {
            
            
            
            
            FileWriter fw = new FileWriter(NAME_FICHERO, true);
            PrintWriter pw = new PrintWriter(fw);
            
            
            //----------------PEDIR DATOS---------------
            System.out.println("\nRellenemos los datos de este becario: \n");
            
            //Pido nombre
            System.out.print("\nNombre completo: ");
            nombreYApellido=escanerString();
            
            //Pido sexo, compruebo que la respuesta sea H o M
            do {                
                System.out.print("\nSexo (H/M): ");
                sexo=escanerString();
                
                if (sexo.equalsIgnoreCase("h")||sexo.equalsIgnoreCase("M")) {
                    check=true;
                }else{
                    System.err.println("\nSexo no valido, elija entre H o M");
                }
                
            } while (!check);
            check=false;
            
            //Pido edad, compruebo que este dentro del rango especificado
            
            do {                
                System.out.print("\nEdad: ");
                edad=escanerInt();
                
                if (edad <= 60 && edad>=20) {
                    check=true;
                }else{
                    System.err.println("\nEdad fuera del rango valido");
                }
                
            } while (!check);
            check=false;
            
            
            //Pido numero de suspensos del curso anterior, compruebo que este dentro del rango
            do {                
                System.out.print("\nNumero de suspensos del curso anterior (0-4): ");
                suspensos=escanerInt();
                
                if (suspensos <= 4 && suspensos>=0) {
                    check=true;
                }else{
                    System.err.println("\nNumero de suspensos fuera del rango valido");
                }
                
            } while (!check);
            check=false;
            
            //Pido resisdencia familiar, compruebo si la respeusta es si o no
            do {                
                System.out.print("\nResidencia familiar (Si / No): ");
                residenciaFamiliar=escanerString();
                
                if (residenciaFamiliar.equalsIgnoreCase("si")||residenciaFamiliar.equalsIgnoreCase("no")) {
                    check=true;
                }else{
                    System.err.print("\nRespuesta diferente de la esperada, elija entre Si o No");
                }
            } while (!check);
            check=false;
            
            //Pido ingresos anuales
            System.out.print("\nIngresos anuales de la familia: ");
            ingresosAnualesFamilia=escanerInt();
            
            //------------Escritura de datos en fichero-------------------
            pw.println("----------------------------------------------------------------------------");
            pw.println("Nombre completo: "+nombreYApellido);
            pw.println("Sexo: "+sexo);
            pw.println("Edad: "+edad);
            pw.println("Numero de suspensos del curso anterior: "+suspensos);
            pw.println("Residencia familiar: "+residenciaFamiliar);
            pw.println("Ingresos anuales de la familia: "+ingresosAnualesFamilia);
            
            
            
            
            
            
            
            
            
            //Cierro metodos de manipulacion de archivos
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
            System.out.println("Error de entrada/salida");
            System.out.println(e.getMessage());
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
