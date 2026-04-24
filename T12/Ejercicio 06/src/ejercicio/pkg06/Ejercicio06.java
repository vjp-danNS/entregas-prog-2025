/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06 {

    public static String NAME_FICHERO;

    public static void main(String[] args) {

        int opcion;

        try {
            do {
                System.out.print("\n-----MENU NUMEROS PARES------"
                        + "\n1.-Volcar los primeros 100 numeros pares en un fichero a elegir"
                        + "\n2.-Mostrar por pantalla el fichero."
                        + "\n3.-Salir"
                        + "\nOpcion: ");
                opcion = escanerInt();

                switch (opcion) {
                    case 1:
                        writeFile();
                        break;
                    case 2:
                        readFile();
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        throw new AssertionError();
                }

            } while (opcion != 3);
        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
            System.out.println(e.getMessage());
        }
    }

    //Write File
    public static void writeFile() throws InputMismatchException, IOException {

        int[] vector = new int[100];
        int n = 2, i = 0;
        ;

        System.out.println("\nEscribiendo fichero...\n");
        System.out.println("\nEscribe el nombre del fichero donde quieres volcar los 100 primeros numeros pares: ");
        NAME_FICHERO = escanerString();

        FileWriter fw = new FileWriter(NAME_FICHERO);
        PrintWriter pw = new PrintWriter(fw);

        while (i < 100) {
            if (n % 2 == 0) {
                vector[i] = n;
                i++;
            }
            n++;
        }

        for (int j = 0; j < vector.length; j++) {
            int k = vector[j];
            pw.println(k);
        }

        System.out.println("Fichero escrito de forma correcta");

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
        
        

    }

    //Read File
    public static void readFile() throws IOException {
        if (NAME_FICHERO == null) {
            System.out.println("No se ha escrito el fichero");
        } else {
            FileReader fr = new FileReader(NAME_FICHERO);
            BufferedReader br = new BufferedReader(fr);
            
            String linea = br.readLine();
            while (linea!=null) {                
                System.out.println(linea);
                linea=br.readLine();
            }
            
            
            
            
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error de entrada/salida");
                    System.out.println(e.getMessage());
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("Error de entrada/salida");
                    System.out.println(e.getMessage());
                }
            }
            
        }

    }

    //ESCANERS
    private static String escanerString() throws InputMismatchException {

        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        return s;
    }

    public static int escanerInt() throws InputMismatchException {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        return n;
    }

}
