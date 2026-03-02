/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escaner opcion
        Scanner esc= new Scanner(System.in);
        //Variable opcion
        int opcion;
        //Lista
        ArrayList<Alumno> lista =new ArrayList<>();
        do {
            System.out.print("\n-----MENU ALUMNOS----"
                    + "\n1.- Introducir 1 alumno nuevo con sus notas"
                    + "\n2.- Mostrar alumnos"
                    + "\n3.- Mejor alumno de la clase"
                    + "\n4.- Asignatura mas dificil"
                    + "\n5.- Salir"
                    + "\nOpcion: ");
            opcion=esc.nextInt();
            
            switch (opcion) {
                case 1 -> {
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                default -> throw new AssertionError();
            }
        } while (opcion!=5);
    }
    
}
