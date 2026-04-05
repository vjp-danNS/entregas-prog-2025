 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg16;

import  java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner y variable para manejar el menu
        Scanner esc = new Scanner(System.in);
        int opcion;
        
        //Lista de Productos
        ArrayList<Producto> lista=new ArrayList<>();
        
        //Menu de menus
        do {            
            System.out.print("\n-------------MENU PRODUCTOS------------"
                    + "\n1.- MENU ADMINISTRACION"
                    + "\n2.- MENU COMPRA"
                    + "\n3.- SALIR"
                    + "\nOPCION: ");
            opcion=esc.nextInt();
            
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcion!=3);
        
        
    }
    
}
