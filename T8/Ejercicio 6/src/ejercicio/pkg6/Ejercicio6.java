/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6;

/**
 *
 * @author Dan
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo el array que almacenara el array que se creara en otro metodo
        Empleados[] listaEmpleados;
        
        //Llamo al metodo ingresoEmpleados que pedira rellenar los datos de los empleados, que se devolveran en forma de un array
        listaEmpleados=Empleados.ingresoEmpleados();
        
        //Utilizo el metodo toString en un loop de la clase empleados para leer la lista de empleados con sus datos
        for (int i = 0; i < listaEmpleados.length; i++) {
            System.out.println(listaEmpleados[i].toString());
        }
        
        
    }
    
}
