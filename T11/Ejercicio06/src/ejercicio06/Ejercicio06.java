/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner
        Scanner escInt = new Scanner(System.in);
        
        //Variables
        int opcion;
        Campania campania = new Campania();
        
        
        //lOOP DE MENU HASTA DECISION DEL USUARIO
        do {      
            System.out.print("-------MENU DONACIONES-------"
                    + "\n1.- Anadir donacion"
                    + "\n2.- Mostrar donaciones"
                    + "\n3.- Mostrar donaciones por nombre de donante"
                    + "\n4.- Mostrar numero de donaciones"
                    + "\n5.- Mostrar total de dinero recaudado"
                    + "\n6.- Ordenar donaciones"
                    + "\n7.- Salir"
                    + "\nOpcion: ");
            opcion=escInt.nextInt();//Pido opcion
            
            switch (opcion) {
                case 1:
                    Campania.añadirDonacion(campania);
                    break;
                case 2:
                    Campania.showDonaciones(campania);
                    break;
                case 3:
                    Campania.showDonacionesByName(campania);
                    break;
                case 4:
                    Campania.contarDonaciones(campania);
                    break;
                case 5:
                    Campania.sumarDonaciones(campania);
                    break;
                case 6:
                    Campania.ordenarDonaciones(campania);
                    break;
                case 7:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion!=7);
    }
    
}
