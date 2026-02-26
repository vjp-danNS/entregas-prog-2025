/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author Dan
 */
public class Empleados {
    private String nombre;
    private int horasTrabajadas, tarifa, sueldo;
    
    //Constructores

    public Empleados(String nombre, int horasTrabajadas, int tarifa, int sueldo) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifa = tarifa;
        this.sueldo = sueldo;
    }
    
    public Empleados(){
        nombre="";
        horasTrabajadas=0;
        tarifa=0;
        sueldo=0;
    }
    
    //Getter/Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    
    //toString

    @Override
    public String toString() {
        return nombre+" trabajo "+horasTrabajadas+" horas, cobra "+tarifa+" por lo que le corresponde un sueldo de "+sueldo+" euros.";
    }
    
    //Otros
    
    public static Empleados[] ingresoEmpleados(){
        Scanner escInt =new Scanner(System.in);
        Scanner escString =new Scanner(System.in);
        
        Empleados[] lista; //Array para devolver una vez listo
        int empDeseados; //Limitador del loop de ingreso de empleados
        
        //Variables auxiliares para almacenar datos del empleado antes de crear su objeto designado e ingresarlo a el array
        String nombre;
        int sueldo, tarifa, horasTrabajadas;
        
        //Pido la cantidad de empleados
        System.out.println("Cuantos empleados quieres introducir?: ");
        empDeseados=escInt.nextInt();
        
        //Le reservo el espacio a la lista(array) de empleados
        lista= new Empleados[empDeseados];
        
        //Comienzo el ingreso de empleados a dicha lista el loop comienza en 
        for (int i = 0; i <empDeseados ; i++) {
            //Ingreso de datos por parte del usuario
            System.out.println("-EMPLEADO "+(i+1)+"-");
            System.out.print("Introduzca el nombre del empleado: ");
            nombre=escString.nextLine();
            System.out.print("Cuantas horas trabajo este mes?: ");
            horasTrabajadas=escInt.nextInt();
            System.out.print("Cual es su tarifa de hora de trabajo?: ");
            tarifa=escInt.nextInt();
            //Calculo del sueldo
            if (horasTrabajadas<=40) {
                sueldo=horasTrabajadas*tarifa;
                
            } else {
                sueldo=(tarifa*40)+(horasTrabajadas-40)*(tarifa+tarifa/2);
            }
            lista[i]=new Empleados(nombre, horasTrabajadas, tarifa, sueldo);
            System.out.println("-EMPLEADO "+(i+1)+" ALMACENADO CON EXITO-");
        }
        
        //Devuelvo el array para su posterior lectura
        return lista;
        
        
    }
    
}
