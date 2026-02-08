/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg13.y.pkg14;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Dan
 */
public class Ejercicio13Y14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Esto es un menu para elegir el ejercicio
        Scanner escIntEj=new Scanner(System.in);
        
        int opcionEj=0;
        do{
            System.out.print("EJERCICIOS \n\n1.- EJ 13 \n2.- EJ 14 \nOpcion: ");
            opcionEj=escIntEj.nextInt();
           
            if (!(opcionEj==1||opcionEj==2)) {
                System.err.println("Elija opcion 1 o 2");   
            }
            System.out.println("");
        } while(opcionEj!=1&&opcionEj!=2);
        //----------------EJERCICIOS---------------------
        switch (opcionEj) {
            
            
            //Ejercicio 13
            case 1:
                System.out.println("----EJERCICIO 13----\n");
                
                //Creo dos objetos Alumno, con distintos constructores
                Alumno alumno1= new Alumno("Pepe", 12, 6.7);
                Alumno alumno2= new Alumno();
                
                //Muestro con toString su estado
                System.out.println(alumno1.toString()+"\n"+alumno2.toString());
                
                //Le doy parametros a las variables mediante set a alumno2
                alumno2.setNombre("Marta");
                alumno2.setEdad(13);
                alumno2.setNotaMedia(9.4f);
                
                //Muestro los datos obteniendolos mediante metodos get
                System.out.println("Nombre: "+alumno1.getNombre()+" Edad: "+alumno1.getEdad()+" Nota Media: "+alumno1.getNotaMedia()+
                        "\nNombre: "+alumno2.getNombre()+" Edad: "+alumno2.getEdad()+" Nota Media: "+alumno2.getNotaMedia());
                
                break;
                
                
                
                
            //Ejercicio 14
            case 2:
                System.out.println("----EJERCICIO 14----\n");
                
                //Creo diferentes objetos de tipo Scanner para evitar errores por distintos tipos de variable
                Scanner escInt =new Scanner(System.in);
                Scanner escString =new Scanner(System.in);
                Scanner escDouble =new Scanner(System.in);
                //Creo un array de 5 espacios de Alumno
                Alumno[] lista =new Alumno[5];
                int opcionAlumno=0; //Variable para navegar el menu
                
                //Variables para operar en el menu
                boolean check=false;
                int posicion, edad,contadorSuspensos=0;
                String nombre,nombreBuscado;
                double notaMedia,notaMediaMinima;
                //Creo un menu para operar con objetos Alumno
                do {                    
                    System.out.print("\n-------MENU ALUMNO------"+
                            "\n1.- Rellena datos de un alumno"+
                            "\n2.- Mostrar lista de alumnos"+
                            "\n3.- Mostrar alumnos con nota media por encima de x nota"+
                            "\n4.- Mostar cuantos alumnos hay con la nota media suspensa"+
                            "\n5.- Buscar alumnos por su nombre"+
                            "\n6.- Salir"+
                            "\n\nOpcion: ");
                    opcionAlumno=escInt.nextInt();
                    System.out.println("");
                    
                    switch (opcionAlumno) {
                        //Rellena datos de un alumno
                        case 1:
                            do {
                                //Pido posicion para el alumno
                                System.out.print("En que posicion quiere guardar este alumno? (1-5): ");
                                posicion=escInt.nextInt();
                                
                                //Compruebo si esta vacia esa posicion, si es asi, le pido los datos del alumno
                                if (lista[posicion-1]==null) {
                                    System.out.println("Guardemos al alumno en la posicion "+posicion);
                                    System.out.print("\nNombre del alumno: ");
                                    nombre= escString.nextLine();
                                    System.out.print("\nEdad: ");
                                    edad= escInt.nextInt();
                                    System.out.print("\nNota Media ej:(0,0): ");
                                    notaMedia=(double)escDouble.nextDouble();
                                    lista[posicion-1]=new Alumno(nombre, edad, notaMedia);
                                    check=true;
                                }else{
                                    System.out.println("Posicion ya ocupada elija otra posicion\n");
                                }
                            } while (!check);
                            check=false;
                            break;
                            
                        //Mostrar lista de alumnos
                        case 2:
                            System.out.println("---LISTA ALUMNOS---\n");
                            for (int i = 0; i < lista.length; i++) {
                                if (lista[i]!=null) {
                                    System.out.println("N."+(i+1)+" "+lista[i].toString());
                                    
                                }
                            }
                            
                            break;
                            
                        //Mostrar alumnos con nota media por encima de x nota
                        case 3:
                            System.out.print("A partir de que nota media quieres ver alumnos?: ");
                            notaMediaMinima=(double)escDouble.nextDouble();
                            System.out.println("---LISTA ALUMNOS CON NOTA MEDIA IGUAL O SOBRE "+notaMediaMinima+"---\n");
                            for (int i = 0; i < lista.length; i++) {
                               
                                if (lista[i]!=null) {
                                    if (lista[i].getNotaMedia()>=notaMediaMinima) {
                                        System.out.println("N."+(i+1)+" "+lista[i].toString());
                                    }
                                    
                                }
                            }
                            break;
                            
                        //Mostrar cuantos alumnos hay con la nota media suspensa
                        case 4:
                            System.out.println("---LISTA ALUMNOS CON NOTA MEDIA SUSPENSA---\n");
                            for (int i = 0; i < lista.length; i++) {
                                
                                if (lista[i]!=null) {
                                    if (lista[i].getNotaMedia()< 5) {
                                        System.out.println("N."+(i+1)+" "+lista[i].toString());
                                        contadorSuspensos++;
                                    }
                                    
                                }
                                
                            }
                            System.out.println("\nAlumnos suspensos: "+contadorSuspensos);
                            contadorSuspensos=0;
                            break;
                        //Buscar alumno por nombre
                        case 5:
                            System.out.print("Introduzca el nombre del alumno buscado: ");
                            nombreBuscado=escString.nextLine();
                            for (int i = 0; i < lista.length; i++) {
                                
                                if (lista[i]!=null) {
                                    if (Objects.equals(lista[i].getNombre(), nombreBuscado)) {
                                        System.out.println("Alumno matriculado \nN."+(i+1)+" "+lista[i].toString());
                                        check=true;
                                    }
                                    
                                }
                                
                            }
                            if (!check) {
                                System.err.println("Alumno no matriculado");
                                
                            }
                            check=false;
                            break;
                        //Salir de la aplicacion
                        case 6:
                            System.out.println("Gracias por usar esta aplicacion");
                            break;
                        default:
                            throw new AssertionError();
                    }
                } while (opcionAlumno!=6);
                
                break;

            default:
                throw new AssertionError();
        }
    }
    
}
