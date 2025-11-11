/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Dan
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Curso curso1=new Curso();
        curso1.establecerNombreyHoras("Programacion", 9);
        Curso.sumarCursos();
        
        Curso curso2=new Curso();
        curso2.establecerNombreyHoras("IPE", 4);
        Curso.sumarCursos();
        
        System.out.println("Nombre: "+ curso1.obtenerNombre()+"\nHoras: "+curso1.obtenerHoras());
        
        System.out.println("Nombre: "+ curso2.obtenerNombre()+"\nHoras: "+curso2.obtenerHoras());
      
        Curso.verNumeroCursos();
    }
    
}
