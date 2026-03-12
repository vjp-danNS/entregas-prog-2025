/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/**
 *
 * @author Dan
 */
public class Empleados {
    private String nombreEmpleado;
    private int sueldo;
    
    //Constructor

    public Empleados(String nombreEmpleado, int sueldo) {
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
    }
    public Empleados(){
        nombreEmpleado="";
        sueldo=0;
    }
    
    //Getter/Setter

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
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
        return "Empleados{" + "nombreEmpleado=" + nombreEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    
    //----------------Otros-------------
    public static void mostrarEmpleadosContainsA(ArrayList<Empresa> listaEmpresas){
        //Comprueba si existen empresas
        if (listaEmpresas.isEmpty()) {
            System.out.println("No existen empresas");
            
        //Si existen
        }else{
            //Contador de empleados para los guiones entre empleados
                int contador=0;
            //Bucle que recorre la lista de empresas y sus listas de empleados mostrando todos los empleados con "A"
            for (int i = 0; i < listaEmpresas.size(); i++) {
                
                //Convierto gets en nombres para facilitar escritura         
                ArrayList<Empleados> listaEmpleados=listaEmpresas.get(i).getListaEmpleados();
                
                
                for (int j = 0; j < listaEmpleados.size(); j++) {
                    //Convierto gets en nombres para facilitar escritura   
                    String nombreEmpleados = listaEmpleados.get(j).getNombreEmpleado();
                    if (nombreEmpleados.contains("a")||nombreEmpleados.contains("A")) {
                        
                        //Este if solo comprueba para poner un guion entre nombres
                        if (contador>0) {
                            System.out.print(" - ");
                        }
                        System.out.print(nombreEmpleados);
                        contador++;
                    }
                }
            }
            
            
        }
    
    
    }
    
    public static void mostrarEmpleadosPorSueldo(ArrayList<Empresa> listaEmpresas){
        //Comprueba si existen empresas
        if (listaEmpresas.isEmpty()) {
            System.out.println("No existen empresas");
            
        //Si existen
        }else{
            
            //Creo una lista para guardar los empleados ordenados
            ArrayList<Empleados> listaEmpleadosTmp=new ArrayList<>();
            
            //Bucle que recorre la lista de empresas y agrega cada lista de empleados a una lista unica
            for (int i = 0; i < listaEmpresas.size(); i++) {
                listaEmpleadosTmp.addAll(listaEmpresas.get(i).getListaEmpleados());
            }
            
            //Guardo el tamaño de listaEmpleadosTmp para evitar repetir escritura
            int sizeEmpleados = listaEmpleadosTmp.size();
            
            //Metodo burbuja
            for (int j = 0; j < sizeEmpleados-1; j++) {
                for (int k = 0; k < sizeEmpleados-j-1; k++) {
                    Empleados empleado1 = listaEmpleadosTmp.get(k);
                    Empleados empleado2 = listaEmpleadosTmp.get(k+1);

                    int sueldo1 = empleado1.getSueldo();
                    int sueldo2 = empleado2.getSueldo();
                    //Comparacion de sueldos
                    if (sueldo1 < sueldo2 ) {
                        Collections.swap(listaEmpleadosTmp, k, (k+1));
                    }

                }
            }
            
            //Bucle que muestra todos los nombre y sueldos
            System.out.println("\nLista de empleados ordenados por sueldo");
            for (int i = 0; i < sizeEmpleados; i++) {
                Empleados empleado = listaEmpleadosTmp.get(i);
                System.out.println(empleado.getNombreEmpleado()+" = "+empleado.getSueldo());
            }
            
            
        }
        
    
    
    }
}
