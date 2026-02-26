/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

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
        Scanner entrada=new Scanner(System.in);
        int opcion=0;
        int[][] notas;
        String[] asignaturas={"Lengua","Mates","Historia","Fisica"},
                 nombres={"Pepe","Juan","Ana","Marta","Pedro","Maria"};
        
        
        notas=MTMethod.crearMatriz(nombres.length, asignaturas.length);
        
        
              
        do {
            System.out.print("\n-------MENU ALUMNOS--------"+
                    "\n1.- Rellenar notas de los alumnos"+
                    "\n2.- Mostrar las notas"+
                    "\n3.- Mejor de la clase"+
                    "\n4.- Alumno con mas suspensos"+
                    "\n5.- Asignatura mas dificil"+
                    "\n6.- Salir del programa"+
                    "\n--------------------------"+
                    "\n"+
                    "Opcion: ");
            opcion=entrada.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1:
                    //MTMethod.fillMatrizRandom(notas, 0, 10); //Para probar sin tener que rellenar todas las notas se puede rellenar con este metodo
                    MTMethod.fillMatrizAsk(notas);
                    break;
                case 2:
                    
                    MTMethod.showMatrizCuadriculaNames(notas, asignaturas, nombres);
                    break;
                case 3:
                    System.out.println("El alumno con la mejor media es: "+ ArMethod.getArrayString(nombres,MTMethod.getMediaMejorFila(notas) ));
                    break;
                case 4:
                    System.out.println("El alumno con mas suspensos es: "+ArMethod.getArrayString(nombres, MTMethod.getBellowHalfFila(notas, 10)));
                    break;
                case 5:
                    System.err.println("La asignatura mas dificil es: "+ArMethod.getArrayString(asignaturas, MTMethod.getMediaWorstColumn(notas,10)));
                    break;
                case 6:
                    System.out.println("Adios!");
                    break;
                    
                default:
                    System.err.println("Opcion no valida");;
            }
        } while (opcion!=6);
                
                
        
    }
    
}
