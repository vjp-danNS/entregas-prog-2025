/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;



/**
 *
 * @author Dan
 */
public class Curso {
    private String nombre;
    private int numeroHoras;
    public static int numeroDeCursos=0;
    
    public static void sumarCursos (){
        numeroDeCursos++;
    }
    //Getters/Setters
    public void establecerNombreyHoras(String n, int h){    
        nombre=n;    
        numeroHoras=h;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerHoras(){
        return numeroHoras;
    }
    //Mostrar
    
    public static void verNumeroCursos(){
        System.out.println("El numero de cursos es: "+numeroDeCursos);
    }
}
