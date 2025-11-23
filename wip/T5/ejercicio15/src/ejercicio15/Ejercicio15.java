/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author Usuario
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo las 3 direcciones, con sus atributos
        Direccion direccion1=new Direccion("Calle nueva", 10, 3, "Madrid");
        Direccion direccion2=new Direccion("El Sol", 367, 4, "Barcelona");
        Direccion direccion3=new Direccion("Construccion",67,1,"Valencia");
        //Creo empleados
        Empleados empleado1=new Empleados("Javier Norambuena", 1000, direccion1);
        Empleados empleado2=new Empleados("Silvia Rodriguez", 1300, direccion2);
        Empleados empleado3=new Empleados("Eric Maguire", 3700, direccion3);
        //Muestro los datos de los empleados
        empleado1.mostrarEmpleado();
        empleado2.mostrarEmpleado();
        empleado3.mostrarEmpleado();
        
        
        
    }
    
}
