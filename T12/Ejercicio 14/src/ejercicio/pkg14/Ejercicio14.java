/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg14;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Dan
 */
public class Ejercicio14 {

    public static String NAME_FICHERO = "DatosBeca.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables para operar el metodo de bsuqueda
        String lineaBuscada;//Variable para almacenar la linea donde se esta operando
        int lineasASaltarXBecario = 7; //Multiplicando esta variable por la cantidad de usuarios ya revisados deberia devolver la busqueda del siguiente usuario
        int cantidadDeBecariosRevisados = 0; //Contador de becarios ya revisados
        int lineasASaltar = lineasASaltarXBecario * cantidadDeBecariosRevisados; //Lineas a saltar en x loop

        String comprobacion ; //Este string se usa para comprobar que sigan habiendo lineas despues de esta busqueda
        
        //Variables para almacenar datos de usuario 
        String aux;//String auxiliar para operar datos que no son String
        String nombreYApellido="", residenciaFamiliar=""; // Ej: Dan Neculman //Si o No, inicializado en "" para evitar errores
        String sexo; // H o M
        int edad=0, suspensos=0;//Inicializo suspensos y edad para evitar errores mas adelante
        float ingresosAnualesFamilia=0; //Inicializo singresosAnualesFamilia para evitar errores mas adelante
        int beca;

        //Ejercemos este metodo hasta que no haya mas lineas 
        do {
            beca=0;//Inicializo beca en 0 para evitar errores mas adelante de conteo o de compilacion
            
            //BUSCAMOS DATOS Y LOS MOSTRAMOS
            
            System.out.println("-Postulante N "+(cantidadDeBecariosRevisados+1));
            
            
            //Buscamos nombre
            lineaBuscada = "Nombre completo: ";
            aux = search(NAME_FICHERO, lineaBuscada, lineasASaltar);
            if (aux != null) {
                nombreYApellido = aux.split(lineaBuscada)[1];
                System.out.println(nombreYApellido);
            }

            //Buscamos sexo
            lineaBuscada = "Sexo: ";
            aux = search(NAME_FICHERO, lineaBuscada, lineasASaltar);
            if (aux != null) {

                sexo = aux.split(lineaBuscada)[1];
                System.out.println(sexo);
            }

            //Buscamos edad
            lineaBuscada = "Edad: ";
            aux = search(NAME_FICHERO, lineaBuscada, lineasASaltar);
            if (aux != null) {

                edad = Integer.parseInt(aux.split(lineaBuscada)[1]);
                System.out.println(edad);
            }

            //Buscamos numero de suspensos
            lineaBuscada = "Numero de suspensos del curso anterior: ";
            aux = search(NAME_FICHERO, lineaBuscada, lineasASaltar);
             
            if (aux != null) {
                suspensos = Integer.parseInt(aux.split(lineaBuscada)[1]);
                System.out.println(suspensos);
            }
            //Buscamos residencia familiar, siempre sera en mayusculas
            lineaBuscada = "Residencia familiar: ";
            aux = search(NAME_FICHERO, lineaBuscada, lineasASaltar);
            if (aux != null) {
                residenciaFamiliar = aux.split(lineaBuscada)[1].toUpperCase();
                System.out.println(residenciaFamiliar);
            }
            //Buscamos ingesos anuales familiares
            lineaBuscada = "Ingresos anuales de la familia: ";
            aux = search(NAME_FICHERO, lineaBuscada, lineasASaltar);
            if (aux != null) {
                ingresosAnualesFamilia = Float.parseFloat(aux.split(lineaBuscada)[1]);
                System.out.println(ingresosAnualesFamilia);
            }

            //--------------------Operamos los datos------------------------------
            
            //Compruebo que no hayan mas de 2 suspensos ya que es un requisito para la beca 
            if (suspensos< 2) {
                beca = 1500;//Base fija de la beca
                
                //Compruebo los ingresos anuales
                if (ingresosAnualesFamilia<=12000) {
                    beca+=500;
                }
                //Compruebo la edad
                if (edad < 23) {
                    beca+=200;
                }
                //Compruebo los suspensos
                if (suspensos==0) {
                    beca+=500;
                }
                if (suspensos==1) {
                    beca+=200;
                }
                //Compruebo residencia familiar
                if (residenciaFamiliar.equalsIgnoreCase("no")) {
                    beca+=1000;
                }
            }
            //--------------Muestro los becados y sus montos--------------
            if (beca!=0) {
                System.out.println("\nBECA:"
                        + "\nNombre completo: "+nombreYApellido+"\nBeca: "+beca);
            }else{
                System.out.println("\nNO BECADO");
            }
            
            
            
            cantidadDeBecariosRevisados++; //Aumento contador de becarios
            //Se comprueba que exista una linea con - para comprobar que existe una siguiente instancia de becario
            comprobacion = search(NAME_FICHERO, "-", (lineasASaltar + lineasASaltarXBecario));
            //Calculo lineas a saltar en el siguiente loop
            lineasASaltar = lineasASaltarXBecario * cantidadDeBecariosRevisados;
            System.out.println("\n");

        } while (comprobacion != null);

    }

    //Metodo buscar, permite buscar un String dentro de las lineas de un txt a partir de n lineas. Si la linea buscada es ---------------------------------------------------------------------------- no devuelve linea
    public static String search(String NAME_FICHERO, String lineaBuscada, int lineasASaltar) {
        String linea = null;
        boolean encontrado = false;
        int i = 1; //Contador de lineas, comienza en 1 por que se lee la primera linea fuera del bucle
        try {
            //Abro protocolo de lectura de archivo
            FileReader fr = new FileReader(NAME_FICHERO);
            BufferedReader br = new BufferedReader(fr);

            //Busco por cada linea hasta encontrar una linea con los datos buscados, ocupo un contador para que salte entre grupos de objetos (Ej: Hay 3 becarios, se salta 7 lineas que es lo consta un becario)
            linea = br.readLine();
            while (linea != null && !encontrado) {

                if (linea.contains(lineaBuscada) && i > lineasASaltar) {
                    encontrado = true;
                } else {
                    linea = br.readLine();
                    i++;
                }
            }

            if (!encontrado && !lineaBuscada.equals("-")) {
                System.err.println("LINEA NO ENCONTRADA");
            }

            //Cierro protocolo de lectura de archivo
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

        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
            System.out.println(e.getMessage());
        }

        return linea;
    }

    //Metodo que comprueba que hayan mas becarios 
    public static boolean comprobador(String NAME_FICHERO, String lineaBuscada, int lineasASaltar) {
        String linea = null;
        boolean encontrado = false;
        int i = 1; //Contador de lineas, comienza en 1 por que se lee la primera linea fuera del bucle
        try {
            //Abro protocolo de lectura de archivo
            FileReader fr = new FileReader(NAME_FICHERO);
            BufferedReader br = new BufferedReader(fr);

            //Busco por cada linea hasta encontrar una linea con los datos buscados
            linea = br.readLine();
            while (linea != null && !encontrado) {

                if (linea.contains(lineaBuscada) && i <= lineasASaltar) {
                    encontrado = true;
                } else {
                    linea = br.readLine();
                    i++;
                }
            }

            if (!encontrado && !lineaBuscada.equals("--")) {
                System.err.println("LINEA NO ENCONTRADA");
            }

            //Cierro protocolo de lectura de archivo
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

        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
            System.out.println(e.getMessage());
        }

        return encontrado;

    }

    //-------------------ESCANER-------------------
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
