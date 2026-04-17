/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectcorelink;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author alumno
 */
public class ProjectCoreLink {

    /**
     * @param args the command lineToWrite arguments
     */
    public static void main(String[] args) {

        try {

            writeZoneZeroEmpFile();
            writeFile8digits();

        } catch (IOException e) {
            System.out.println("bleh");

        }
    }

    public static void readFile(BufferedReader br) throws IOException {
        FileReader fr = new FileReader("datos_empleados.txt");
        br = new BufferedReader(fr);

        String linea;
        linea = br.readLine();
        while (linea != null) {
            System.out.println(linea);
            linea = br.readLine();
        }

    }

    public static void writeZoneZeroEmpFile() throws IOException {

        FileReader fr = new FileReader("datos_empleados.txt");
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter("sospechosos_zona_cero.txt");
        PrintWriter pw = new PrintWriter(fw);

        String linea;
        linea = br.readLine();
        int employeeCounter = 0;

        while (linea != null) {
            if (linea.contains("Zona Cero;")) {

                pw.println(linea);
                employeeCounter++;

            }
            linea = br.readLine();
        }

        System.out.println("Cantidad de empleados: " + employeeCounter);

        fr.close();
        br.close();

        fw.close();
        pw.close();

    }

    public static void readFile8digits(BufferedReader br) throws IOException {

        String linea;
        linea = br.readLine();
        char[] lineaArray = linea.toCharArray();

        char[] lineaArrayAux = new char[9];
        int counter = 0;
        boolean check;

        for (int i = 0; i < lineaArray.length; i++) {
            char c = lineaArray[i];

            switch (c) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    lineaArrayAux[counter] = c;
                    counter++;

                    if (counter == 8) {
                        System.out.println(lineaArrayAux);
                        counter = 0;
                    }

                    break;
                default:

                    counter = 0;

            }

        }

    }

    public static void writeFile8digits() throws IOException {

        FileReader fr = new FileReader("04dedf8afeb8a4177a009f41bb78018af601e341ed4322d4073911c9ac879726.txt");
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter("clave.txt");
        PrintWriter pw = new PrintWriter(fw);

        String linea;
        linea = br.readLine();
        char[] lineaArray = linea.toCharArray();

        char[] lineaArrayAux = new char[9];
        int counter = 0;

        for (int i = 0; i < lineaArray.length; i++) {
            char c = lineaArray[i];

            switch (c) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    lineaArrayAux[counter] = c;
                    counter++;

                    if (counter == 8) {

                        String lineToWrite = String.copyValueOf(lineaArrayAux);

                        pw.println(lineToWrite);
                        System.out.println(lineToWrite);
                        counter = 0;
                    }

                    break;
                default:

                    counter = 0;

            }

        }
        fr.close();
        br.close();

        fw.close();
        pw.close();
    }

}
