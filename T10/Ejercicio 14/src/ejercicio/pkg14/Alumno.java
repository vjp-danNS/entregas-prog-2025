/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Alumno {
    private String nombre;
    private Asignatura[] asignaturas;
    
    //Constructores
    public Alumno(String nombre, Asignatura[] asignaturas) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
    }
    public Alumno() {
        
        this.nombre = nombre;
        this.asignaturas = new Asignatura[3];
    }
    //Este constructor me permite crear un alumno con su nombre y asignarle un array con las 3 asignaturas con nombre y sin nota
    public Alumno (String nombre){
        this.nombre=nombre;
        Asignatura[] asignaturas = new Asignatura[3];
        asignaturas[0]= new Asignatura("Lengua", 0);
        asignaturas[1] = new Asignatura("Mates", 0);
        asignaturas[2] = new Asignatura("Fisica", 0);
    }
    
    //Getter/Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    //toString()

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", asignaturas=" + asignaturas + '}';
    }
    
    //Otros
    
    public static void nuevoAlumno(ArrayList<Alumno> lista){
        Scanner escString = new Scanner(System.in);
        Scanner escInt = new Scanner(System.in);
        
        String nombre;
        
        
        System.out.println("Cual es el nombre del alumno?");
        nombre= escString.nextLine();
        
        Alumno alumno = new Alumno(nombre);
        
        for (int i = 0; i < alumno.getAsignaturas().length; i++) {
            
            System.out.println("Nota de "+alumno.getAsignaturas()[i]+": ");
            alumno.getAsignaturas()[i].setNota(i)= escInt.nextInt();
        }
        
        
        lista.add(alumno));
        
    }
    
    
}
