package ejercicio.pkg05;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
public class Ejercicio05 {

    public static String NAME_FICHERO = "Agenda.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable opcion para manejar el menu
        int opcion;
        
        //Apertura de metodos de escritura y lectura
        FileWriter fw = null;
        PrintWriter pw = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {

            //Menu
            do {
                //Muestro menu y pido opcion
                System.out.print("\nMENU ESCRITURA DE ARCHIVOS"
                        + "\n1.- Añadir un contacto a la agenda"
                        + "\n2.- Mostrar agenda"
                        + "\n3.- Salir"
                        + "\nOpcion: ");
                opcion = escanerInt();
                switch (opcion) {
                    case 1:
                        writeFile(fw, pw); //Invoca metodo writeFile que pide datos de un contacto y lo agrega al txt
                        break;
                    case 2:
                        readFile(fr, br); //Invoca metodo readFile que lee el txt
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            } while (opcion != 3);
        
        //Comprobacion de errores y cierre de metodos de escritura y lectura
        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Caracter no valido");
            System.out.println(e.getMessage());

        } finally {
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

    //Metodo que escribe los datos de un contacto en un archivo
    public static void writeFile(FileWriter fw, PrintWriter pw) throws InputMismatchException, IOException {
        fw = new FileWriter(NAME_FICHERO, true);
        pw = new PrintWriter(fw);
        //Variables de datos de contacto
        int numero;
        int edad;
        String nombre;
        //String que maneja el la salida de escribir mas contactos
        String desicion;
        //boolean para manejar desiciones
        boolean check = false, check2 = false;
        
        //Incio del metodo de escritura
        System.out.println("\nEscribiendo fichero...\n");
        do {
            //Pido datos del contacto
            System.out.print("\nNumero movil: ");
            numero = escanerInt();
            System.out.print("\nNombre: ");
            nombre = escanerString();
            System.out.print("\nEdad: ");
            edad = escanerInt();
            //Creo el contacto con los datos
            Contacto contacto = new Contacto(nombre, edad, numero);
            //Imprimo los datos en el txt
            pw.println(contacto.toString());
            //Pregunto si quiere escribir mas contactos
            do {
                System.out.print("\nQuieres escribir mas contactos?(Y/n): ");
                desicion = escanerString();
                //Si la respuesta es y se sale del loop de pregunta por mas 
                if (desicion.equalsIgnoreCase("y")) {
                    check2 = true;
                //Si la respuesta es n se sale del loop de pregunta por mas y del metodo de escritura
                } else if (desicion.equalsIgnoreCase("n")) {
                    check = true;
                    check2 = true;
                //Si la respuesta no es n o y se mantiene en el loop de pregunta
                } else {
                    System.out.println("\nOpcion no valida");
                }
            } while (!check2);

        } while (!check);
        //Mensaje de salida
        System.out.println("Fichero escrito de forma correcta");

    }

    //Read File, lee el archivo de agenda
    public static void readFile(FileReader fr, BufferedReader br) throws IOException {
        fr = new FileReader(NAME_FICHERO);
        br = new BufferedReader(fr);

        int i = 1; //Contador de contactos
        int j = 0; //Contador de lineas
        
        //Comienzo a leer las lineas del documento
        String linea = br.readLine();

        System.out.println("----------------AGENDA---------------");
        //Muestro por terminal todas las lineas, al comienzo de cada contacto le pongo su numero
        while (linea != null) {
            //Si el contador de lineas deja un resto = 0 hago un salto de linea y muestro el numero de contacto, aumento la cantidad de contactos
            if (j % 3 == 0) {
                System.out.println("\nContacto " + i + ": ");
                i++;
            }
            System.out.println(linea);
            linea = br.readLine();
            j++;
        }

    }

    //-----------SCANNER-------------
    public static int escanerInt() throws InputMismatchException {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        return n;
    }

    private static String escanerString() throws InputMismatchException {

        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        return s;
    }
}
