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
            System.out.println("\n-------MENU ALUMNOS--------"+
                    "\n1.- Rellenar notas de los alumnos"+
                    "\n2.- Mostrar las notas"+
                    "\n3.- ¿Cual es el mejor de la clase?"+
                    "\n4.- Alumno con mas suspensos"+
                    "\n5.- Asignatura mas dificil"+
                    "\n6.- Salir del programa");
            opcion=entrada.nextInt();
            switch (opcion) {
                case 1:
                    MTMethod.fillMatrizRandom(notas, 0, 10);
                    //MTMethod.fillMatrizAsk(notas);
                    break;
                case 2:
                    MTMethod.showMatrizCuadricula(notas);
                    break;
                case 3:
                    System.out.println("Se mostrara la fila con la mejor media:"+ MTMethod.getMediaMejor(notas) );
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                    
                default:
                    throw new AssertionError();
            }
        } while (opcion!=6);
                
                
        
    }
    
}
