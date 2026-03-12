/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.ra.pkg6;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EXRA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int opcion;
        
        //Array de Coche
        Coche[] garaje = new Coche[9];
        
        //Scanner para opciones
        Scanner esc = new Scanner(System.in);
        
        //Menu
        
        do {
            //Muestro en terminal las opciones al usuario
            System.out.print("\n--------MENU GARAJE--------"
                    + "\n1.- Aparcar coche"
                    + "\n2.- Mostrar plazas de garaje libres"
                    + "\n3.- Mostrar los datos de los coches aparcados"
                    + "\n4.- Buscar por filtro titular"
                    + "\n5.- Buscar por matricula"
                    + "\n6.- Mostrar cuadricula de disponibilidad"
                    + "\n7.- Salir"
                    + "\nOpcion: ");
            //Selector de opciones
            opcion=esc.nextInt();
            //Salto de linea
            System.out.println();
            
            //Opciones
            switch (opcion) {
                case 1:
                    Coche.aparcarCoche(garaje);
                    break;
                case 2:
                    Coche.mostrarVacias(garaje);
                    break;
                case 3:
                    Coche.mostrarAparcados(garaje);
                    break;
                case 4:
                    Coche.buscarPorFiltroTitular(garaje);
                    break;
                case 5:
                    Coche.bucarPorMatricula(garaje);
                    break;
                case 6:
                    Coche.cuadriculaDisponibilidad(garaje);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
            }
            
        } while (opcion!=7);
        
        
        
    }
    
}
