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
        FileWriter fw = null;
        PrintWriter pw = null;

        FileReader fr = null;
        BufferedReader br = null;
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
                        writeFile(fw, pw);
                        break;
                    case 2:
                        readFile(fr, br);
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        throw new AssertionError();
                }

            } while (opcion != 3);
            
        //Capturo errores y cierro metodos de escritura y lectura
        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Caracter no valido");
            System.out.println(e.getMessage());

        } finally {
            //Cierro metodos de lectura
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

            //Cierro metodos de escritura
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
    }

    //Write File, escribo un archivo de con el nombre que se le otorgue llenandolo de los 100 primeros numeros pares
    public static void writeFile(FileWriter fw, PrintWriter pw) throws InputMismatchException, IOException {

        int[] vector = new int[100];
        int n = 2, i = 0;

        //Pido nombre del fichero
        System.out.println("\nEscribe el nombre del fichero donde quieres volcar los 100 primeros numeros pares: ");
        NAME_FICHERO = escanerString();

        //Abro metodo de escritura
        fw = new FileWriter(NAME_FICHERO, true);
        pw = new PrintWriter(fw);

        System.out.println("\nEscribiendo fichero...\n");

        //Escribo numeros partiendo desde el dos en un array, comprobando que sean pares y voy aumentando el numero a comprobar en 1 por bucle
        while (i < 100) {
            if (n % 2 == 0) {
                vector[i] = n;
                i++;
            }
            n++;
        }

        //Vuelco el array en el archivo de texto con nombre entregado por el usuario
        for (int j = 0; j < vector.length; j++) {
            int k = vector[j];
            pw.println(k);
        }

        System.out.println("Fichero escrito de forma correcta");

    }

    //Read File, metodo que lee un archivo
    public static void readFile(FileReader fr, BufferedReader br) throws IOException {
        //Compruebo que se le haya dado un nombre al archivo
        if (NAME_FICHERO == null) {
            System.out.println("No se ha escrito el nombre del fichero");
            //Si tiene nombre
        } else {
            //Abro metodo de lectura
            fr = new FileReader(NAME_FICHERO);
            br = new BufferedReader(fr);

            //Leo la primera linea y si no es null la muestro por terminal
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
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
