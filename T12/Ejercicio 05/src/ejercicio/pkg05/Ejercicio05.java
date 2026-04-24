package ejercicio.pkg05;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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

    public static String NAME_FICHERO = "Agenda.txt";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Contacto> agenda = new ArrayList<>();

        FileReader fr = null;
        BufferedReader br = null;
        int opcion = 0;
        try {
            

            

            do {
                System.out.print("\nMENU ESCRITURA DE ARCHIVOS"
                        + "\n1.- Añadir un contacto a la agenda"
                        + "\n2.- Mostrar agenda"
                        + "\n3.- Salir"
                        + "\nOpcion: ");
                opcion = escanerInt();
                switch (opcion) {
                    case 1:
                        writeFile(agenda);
                        break;
                    case 2:
                        readFile();
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            } while (opcion != 3);

        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
            System.out.println(e.getMessage());
        } catch(InputMismatchException e){
            System.out.println("Caracter no valido");
            System.out.println(e.getMessage());
        
        }

    }

    //Escribir
    public static void writeFile(ArrayList<Contacto> agenda) throws InputMismatchException,IOException {

        int i = 0;
        int numero;
        int edad;
        String nombre;
        String desicion;
        boolean check = false, check2 = false;
        
        FileWriter fw = new FileWriter(NAME_FICHERO);
        PrintWriter pw = new PrintWriter(fw);

        System.out.println("\nEscribiendo fichero...\n");
        do {
            System.out.print("\nNumero movil: ");
            numero = escanerInt();
            System.out.print("\nNombre: ");
            nombre = escanerString();
            System.out.print("\nEdad: ");
            edad = escanerInt();
            Contacto contactoAux = new Contacto(nombre, edad, numero);

            do {
                System.out.print("\nQuieres escribir mas contactos?(Y/n): ");
                desicion = escanerString();

                if (desicion.equalsIgnoreCase("y")) {
                    check2 = true;
                } else if (desicion.equalsIgnoreCase("n")) {
                    check = true;
                    check2 = true;
                } else {
                    System.out.println("\nOpcion no valida");
                }
            } while (!check2);

            agenda.add(contactoAux);

        } while (!check);

        

        for (Contacto contacto : agenda) {
            pw.println( contacto.toString());
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
        FileReader fr = new FileReader(NAME_FICHERO);
        BufferedReader br = new BufferedReader(fr);
        
        int i=0, j=0;
        
        String linea = br.readLine();

        System.out.println("----------------AGENDA---------------");
        while (linea != null) {
            if (j%3==0) {
                System.out.println("\nContacto "+i+": ");
                i++;
            }
            System.out.println(linea);
            linea = br.readLine();
            j++;
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
