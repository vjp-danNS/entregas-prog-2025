/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Alumno {
    //Atributos
    private String nombre;
    private int nota;
    private int numAlumno;
    private static int contadorAlumno=1;
    //Constructor

    public Alumno() {
        nombre="";
        nota=0;
        numAlumno=contadorAlumno;
        contadorAlumno++;
        
    }
    public Alumno(String name, int n){
        nombre=name;
        nota=n;
        numAlumno=contadorAlumno;
        contadorAlumno++;
        
        
    }
    //Getter/Setter

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }
   
    
    

    public void setNombre() {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Por favor introduzca el nombre del alumno "+numAlumno+": ");
        nombre = entrada.nextLine();
    }
    public int setNota(){
        Scanner entrada= new Scanner(System.in);
        do {            
            System.out.println("Por favor introduzca la nota de "+nombre+": ");
            nota=entrada.nextInt();
            if (nota>10||nota<0) {
                System.err.println("NUMERO NO VALIDO, INTRODUZCA UNA NOTA ENTRE 0 Y 10");
                
            }
        } while (nota>10||nota<0);
        
        return nota;
    }
    //Otros 
    public String calcularCalificacion(){
        switch (nota) {
            case 5:
            case 6:
                return ("Bien");
                
            case 7:
            case 8:
                return ("Notable");
                
            case 9:
            case 10:
                return ("Sobresaliente");
                
            default:
                return("Suspenso");
        }
        
    }
    public void getCalificacion(){
        System.out.println("La nota de "+nombre+" es calificada como: "+calcularCalificacion()+"\n");
    }
    
    

    
    
    
}
