/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Empleado {
    //Atributos
    private String nombre;
    private int idEmpleado;
    private int horas;
    private int tarifa;
    private static int cantEmpleado=1;
    private int sueldo;
    //Constructor
    public Empleado() {
        Scanner entrada= new Scanner(System.in);//Creo objeto entrada
        idEmpleado=cantEmpleado;//Le asigno un numero a cada empleado dependiente de la cantidad de empleados
        //Pido el nombre
        System.out.println("Ingrese el nombre del empleado numero "+idEmpleado+": ");
        nombre=entrada.nextLine();
        //Pido las horas trabajadas
        System.out.println("Ingrese las horas trabajadas de "+nombre+": ");
        horas=entrada.nextInt();
        //Pido la tarifa
        System.out.println("Ingrese la tarifa que cobra "+nombre+": \n");
        tarifa=entrada.nextInt();
        //Aumento la cantidad de empleados
        cantEmpleado++;
    }
    //Getters, no creo setters pues todos se deben atribuir en el constructor si o si

    public String getNombre() {
        return nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public int getHoras() {
        return horas;
    }

    public static int getCantEmpleado() {
        return cantEmpleado;
    }

    public int getTarifa() {
        return tarifa;
    }

    public int getSueldo() {
        return sueldo;
    }
    
    
    
    
}
