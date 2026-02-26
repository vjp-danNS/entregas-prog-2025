/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg11.y.pkg12;

import java.util.Scanner;

/**
 *
 * @author Dan
 */
public class Ejercicio11Y12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Esto es un menu para elegir el ejercicio
        Scanner escIntEj=new Scanner(System.in);
        
        int opcionEj=0;
        do{
            System.out.print("EJERCICIOS \n\n1.- EJ 11 \n2.- EJ 12 \nOpcion: ");
            opcionEj=escIntEj.nextInt();
           
            if (!(opcionEj==1||opcionEj==2)) {
                System.err.println("Elija opcion 1 o 2");   
            }
            System.out.println("");
        } while(opcionEj!=1&&opcionEj!=2);
        
        switch (opcionEj) {
        //----------------EJERCICIOS-----------------   
            
            //----------Ejercicio 11-----------
            case 1:

            
            System.out.println("---EJERCICIO 11---\n");
            //Creo dos objetos de la clase Mueble
            Mueble mueble1 = new Mueble(200, "Lorem ipsum");
            Mueble mueble2 = new Mueble();

            //Muestro los datos de los muebles con toString
            System.out.println(mueble1.toString()+"\n"+mueble2.toString()+"\n");
            //Prueba de operacion de los muebles
            //Otorgo datos a mueble2
            mueble2.setPrecio(155);
            mueble2.setDescripcion("This one rides the boogie");

            //Cambio los datos de mueble1
            mueble1.setPrecio(3000);
            mueble1.setDescripcion("This one doesnt ride the boogie :(");

            //Muestor los datos de los muebles de nuevo con gets
            System.out.println("Mueble 1: Precio= "+mueble1.getPrecio()+" Descricion= "+mueble1.getDescripcion()+
                    "\nMueble 2: Precio= "+mueble2.getPrecio()+" Descripcion= "+mueble2.getDescripcion());

            System.out.println("------------------");
            //FIN EJERCICIO 11


                break;
                
            //----------Ejercicio 12------------        
            case 2:
            
                System.out.println("---EJERCICIO 12---");
                
                //Creo dos objetos Scanner para evitar errores por ingresar 2 tipos de variable distintas en el Scanner
                Scanner escInt= new Scanner(System.in);
                Scanner escString= new Scanner(System.in);
                
                Mueble[] lista=new Mueble[4]; //Array de clase muebles
                int opcionEj12=0; //Variable para manejar el menu del ejercicio 12
                
                //Variables auxiliares para crear los objetos de la clase Mueble en el array
                int precio;
                String descripcion;
                
                //Variable auxiliar para el precio maximo de la opcion 3
                int precioMax=0;
                
                //Introduccion de opcion del menu
                
                do { 
                    System.out.print("\n---OPCIONES MUEBLE---"+
                        "\n1.- Rellenar muebles (4 muebles)"+
                        "\n2.- Mostrar muebles"+
                        "\n3.- Mostrar muebles por precio (en el precio o debajo de este)"+
                        "\n4.- Salir"+
                        "\n\nOPCION: ");
                    opcionEj12=escInt.nextInt();
                    System.out.println("");
                    switch (opcionEj12) {
                        //Rellenar muebles
                        case 1:
                            System.out.println("Por favor rellene los datos de 4 muebles");
                            for (int i = 0; i < lista.length; i++) {
                                System.out.print("\nIntroduzca el precio del mueble "+(i+1)+": ");
                                precio=escInt.nextInt();
                                System.out.print("Introduzca la descricion del mueble "+(i+1)+": ");
                                descripcion=escString.nextLine();
                                
                                lista[i]= new Mueble(precio, descripcion);
                                
                                System.out.println("---MUEBLE INGRESADO DE FORMA CORRECTA---\n");
                            }
                            break;
                        //Mostrar muebles
                        case 2:
                            System.out.println("------TODOS LOS MUEBLES--------\n");
                            for (int i = 0; i < lista.length; i++) {
                                System.out.println(lista[i].toString());
                            }
                            
                            break;
                        //Mostrar muebles con un limite de precio
                        case 3:
                            System.out.print("Introduzca el precio mas alto que quiere buscar: ");
                            precioMax=escInt.nextInt();
                            System.out.println("\n------MUEBLES DENTRO DEL PRECIO--------\n");
                            for (int i = 0; i < lista.length; i++) {
                                if (lista[i].getPrecio() <= precioMax) {
                                    System.out.println(lista[i].toString());
                                }
                            }
                            break;
                        //Salir del menu
                        case 4:
                            System.out.println("Gracias por usar esta aplicacion");
                            break;
                        default:
                            System.err.println("Elija una opcion entre 1 y 4");
                    }
                    
                } while (opcionEj12!=4);
            //FIN EJERCICIO 12
                break;
            default:
                throw new AssertionError();
        }
        
        
    }
    
}
