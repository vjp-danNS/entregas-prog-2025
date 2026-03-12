/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dan
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner
        Scanner escInt=new Scanner(System.in);
        //Variables
        int opcion;
        ArrayList<Empresa> listaEmpresas = new ArrayList<>();
        
        
        
        do {            
            System.out.print("\n--------MENU EMPRESA--------"
                    + "\nPulsa 1 para introducir empresas y sus empleados"
                    + "\nPulsa 2 para mostrar empresas y sus empleados"
                    + "\nPulsa 3 para mostrar a todos los empleados cuyo nombre cotenga la letra 'A'"
                    + "\nPulsa 4 para mostrar a todos los empleados ordenados por su sueldo "
                    + "\nPulsa 5 para salir"
                    + "\nOpcion: ");
            opcion = escInt.nextInt();
            
            switch (opcion) {
                case 1:
                    Empresa.crearEmpresa(listaEmpresas);
                    break;
                case 2:
                    Empresa.mostrarEmpresas(listaEmpresas);
                    break;
                case 3:
                    Empleados.mostrarEmpleadosContainsA(listaEmpresas);
                    break;
                case 4:
                    Empleados.mostrarEmpleadosPorSueldo(listaEmpresas);
                    break;
                case 5:
                    System.out.println("Salir...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion!=5);
    }
    
}
