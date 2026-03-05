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
        this.asignaturas = new Asignatura[3];
        
        
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
        
        Alumno alu = new Alumno(nombre);
        
       
        
        for (int i = 0; i < alu.getAsignaturas().length; i++) {
            
            System.out.print("Nota de "+alu.getAsignaturas()[i].getNombre()+": ");
            alu.getAsignaturas()[i].setNota(escInt.nextInt());
        }
        
        
        lista.add(alu);
        
    }
    
    //Mostrar todos los alumnos
    public static void mostrarTodosLosAlumnos(ArrayList<Alumno> lista){
        if (lista.isEmpty()) {
            System.out.println("No hay alumnos");
        } else {
            
            for (int i = 0; i < lista.size(); i++) {
                Alumno get = lista.get(i);
                
                System.out.println("\nNombre: "+get.getNombre());
                for (int j = 0; j < get.getAsignaturas().length; j++) {
                    Asignatura asignatura = get.getAsignaturas()[j];
                    
                    System.out.println(asignatura.toString());
                    
                }
            }
        }
        
    }
    
    //Devuelve la media de notas de un alumno
    public static float mediaAlumno (Alumno alum){
        
        float media=0;
        
        Asignatura[] asign =alum.getAsignaturas();

        for (int i = 0; i < asign.length; i++) {
            media+=asign[i].getNota();
            
        }
        
        return media/=asign.length;
        
    }
    
    //Muestra el alumno con la mejor media
    
    public static void mejorAlumno(ArrayList<Alumno> lista){
        if (lista.isEmpty()) {
            System.out.println("No hay alumnos"); 
        } else {
            
            float mejorMedia=mediaAlumno(lista.get(0));
            String nombreMejor=lista.get(0).getNombre();
            
            for (int i = 1; i < lista.size(); i++) {
                
                Alumno alum = lista.get(i);
                
                float nuevaMedia=mediaAlumno(lista.get(i));
                
                if (mejorMedia < nuevaMedia ) {
                    mejorMedia=nuevaMedia;
                    
                }
                
            }
            
            System.out.println("El mejor alumno es: "+nombreMejor+", con media: "+mejorMedia);
            
        }
    }
    
    //Muestra la asignatura mas dificil
    public static void masDificil(ArrayList<Alumno> lista){
        if (lista.isEmpty()) {
            System.out.println("No hay alumnos");
        } else {
            //Creo una lista de String con los nombres de las asignaturas
            ArrayList<String> nombreAsign= new ArrayList<>();
            
            Asignatura[] asignaturas = lista.get(0).getAsignaturas();
            
            for (int i = 0; i < asignaturas.length; i++) {
                Asignatura asignatura = asignaturas[i];
                
                nombreAsign.add(asignatura.getNombre());
                
            }
            
           
            
            //Creo un array para contar los suspensos de cada asignatura
            int[] suspensos= new int[lista.get(0).getAsignaturas().length]; 
            
             //Recorro la lista de alumnos
             for (int i = 0; i < lista.size(); i++) {
                Alumno alum = lista.get(i);
                Asignatura[] notas= alum.getAsignaturas();
                
                
                //Recorro el array de notas de un alumno
                 for (int j = 0; j < notas.length; j++) {
                     Asignatura asign = notas[j];
                     float nota = asign.getNota();
                     
                     if (nota < 5) {
                         suspensos[i]++;
                     }
                     
                 }
                
                
            }
             
            //Compruebo cual es la asignatura con mas suspensos y guardo su index
            int mayorSuspensos = suspensos[0];
            int idxMayorSuspensos=0;
            for (int i = 0; i < suspensos.length; i++) {
                
                
                if (mayorSuspensos<suspensos[i]) {
                    mayorSuspensos=suspensos[i];
                    idxMayorSuspensos=i;
                }
                
            }
            
            System.out.println("La asignatura con mas suspensos es "+nombreAsign.get(idxMayorSuspensos)+" con "+mayorSuspensos+" suspensos");
            
            
            
        }
        
    }
    
    
}
