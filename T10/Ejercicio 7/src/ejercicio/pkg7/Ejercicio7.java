/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner esc =new Scanner(System.in);
        
        ArrayList<ArrayList<Integer>> listaMes= new ArrayList<>();
        ArrayList<String> listaDiasNombres = new ArrayList<>();
        
        int opcion;
        
        MTArrayList.rellenarListaDiasSemana(listaDiasNombres);
        
        do {
            System.out.print("\n---------MENU TEMPERATURAS--------"
                    + "\n1.- Rellenar temperaturas"
                    + "\n2.- Mostrar temperaturas"
                    + "\n3.- Visualizar la temperatura media del mes"
                    + "\n4.- Dia o dias mas calurosos del mes"
                    + "\n5.- Salir del programa"
                    + "\nOpcion: ");
            
            opcion=esc.nextInt();
            
            switch (opcion) {
                case 1:
                    //MTArrayList.rellenarMes(listaMes, listaDiasNombres);
                    MTArrayList.rellenarMesRandom(listaMes, listaDiasNombres);
                    break;
                case 2:
                    MTArrayList.mostrarMesTemp(listaMes, listaDiasNombres);
                    break;
                case 3:
                    System.out.println("La media de temperatura del mes es: "+MTArrayList.mediaListaDeLista(listaMes));
                    break;
                case 4:
                    MTArrayList.mayorTempMes(listaMes, listaDiasNombres);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida, seleccione una dentro del menu");
            }
            
        } while (opcion!=5);
    }
    
}
