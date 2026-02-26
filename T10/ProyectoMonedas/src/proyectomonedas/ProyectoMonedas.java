/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectomonedas;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ProyectoMonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner escInt=new Scanner(System.in);
        
        int opcion=0;
        Moneda[][] cajaFuerte= new Moneda[3][3];
        System.out.println("Bienvenido al menu de la caja fuerte");
        do {
            System.out.print("Opciones:"
                    + "\n1.- Rellena la caja fuerte de monedas"
                    + "\n2.- Mostrar las monedas de un material"
                    + "\n3.- Mostrar las moneda mas valiosa"
                    + "\n4.- Salir"
                    + "\nOpcion: ");    
            opcion=escInt.nextInt();
            
            switch (opcion) {
                case 1:
                    Moneda.rellenarCajaFuerte(cajaFuerte);
                    break;
                case 2:
                    Moneda.buscarMaterial(cajaFuerte);
                    break;
                case 3:
                    Moneda.monedaMasValiosa(cajaFuerte);
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema de inspeccion de caja fuerte!");
                    break;
                    
                default:
                    System.out.println("Elija una opcion aceptada en el menu");
            }
        } while (opcion!=4);
    }
    
}
