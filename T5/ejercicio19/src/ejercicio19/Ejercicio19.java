/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author Usuario
 */
public class Ejercicio19 {

    public static void calcularYMostrarSueldo(Empleado e){
        //Pido los atributos de los empleados para reducir la cantidad de veces que escribo getX
        int horas=e.getHoras();
        int sueldo=e.getSueldo();
        int tarifa=e.getTarifa();
        String nombre=e.getNombre();
        
        if (horas<=40) {
            sueldo=horas*tarifa;
        }else{
            sueldo=horas*tarifa+((horas-40)*(tarifa/2));
        }
        System.out.println(nombre+" trabajo "+horas+" horas, cobra "+tarifa+
                "euros la hora por lo que le corresponde un sueldo de "+sueldo+" euros\n");
    }
    
    public static void main(String[] args) {
        //Creo los objetos empleados que pediran datos al usuario
        
        Empleado empleado1=new Empleado();
        Empleado empleado2=new Empleado();
        Empleado empleado3=new Empleado();
        
        //Calculo sus sueldos
        calcularYMostrarSueldo(empleado1);
        calcularYMostrarSueldo(empleado2);
        calcularYMostrarSueldo(empleado3);
    }
    
}
