/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg15;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Dan
 */
public class Empresa {
    private String nombreEmpresa;
    private ArrayList<Empleados> listaEmpleados;
    

    //Constructores
    public Empresa(String nombreEmpresa, ArrayList<Empleados> listaEmpleados) {
        this.nombreEmpresa = nombreEmpresa;
        this.listaEmpleados = listaEmpleados;
    }
    
    public Empresa(){
         nombreEmpresa="";
         listaEmpleados= new ArrayList<>();
         
    }
    
    //Getter/Setter

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public ArrayList<Empleados> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleados> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    
    //toString

    @Override
    public String toString() {
        return "Empresa{" + "nombreEmpresa=" + nombreEmpresa + ", listaEmpleados=" + listaEmpleados + '}';
    }
    
    
    //---------------------Otros------------------------
    
    //Este metodo te permite agregar empresas y sus empleados hasta que el usuario decida
    public static void crearEmpresa( ArrayList<Empresa> listaEmpresas){
        
        //Scanner
        Scanner escInt = new Scanner(System.in);
        Scanner escString = new Scanner(System.in);
        boolean salir;
        //Bucle para crear empleados
        do {
            //Contador de empleados
            int contador=1;
            //Variables para empresa
            String nombreEmpresa;
            //Creo una lista de empleados para esta empresa 
            ArrayList<Empleados> listaEmpleados= new ArrayList<>();
            
            //Pido nombre empresa
            System.out.print("\nNombre de la empresa: ");
            nombreEmpresa=escString.nextLine();
            
            //Loop para pedir datos de empleados hasta que el usuario decida
            do {
                //Variables para empleados
                int sueldo;
                String nombreEmpleado;
                
                //Pido datos del empleado
                System.out.print("Nombre del empleado "+contador+": ");
                nombreEmpleado=escString.nextLine();
                
                System.out.print("Sueldo del empleado "+contador+": ");
                sueldo=escInt.nextInt();
                
                
                //Creo empleado
                Empleados empleado =new Empleados(nombreEmpleado, sueldo);
                listaEmpleados.add(empleado);
                
                //Aumento el contador
                contador++;
                //Loop para preguntar si se desea añadir mas empleados
                salir=siONo("Deseas incluir mas empleados?: ");
                
                
            } while (!salir);

            //Creo empresa
            Empresa empresa = new Empresa(nombreEmpresa, listaEmpleados);
            //Lo agrego a la lista de empleados
            listaEmpresas.add(empresa);
            //Bucle para pregutar si se quiere agregar otra empresa
            salir=siONo("Deseas incluir mas empresas?: ");
            
        } while (!salir);
    
    }
    
    //Metodo para preguntar si se desea añadir algo mas, respuesta "Si" o "No"
    public static boolean siONo(String mensaje){
        //Scanner
        Scanner escString=new Scanner(System.in);
        //Variables
        boolean check=false;
        boolean salir=false;
        do {
            System.out.print("\n"+mensaje);
            String opcion=escString.nextLine().toUpperCase();


            if (Objects.equals(opcion, "SI")){
                
                check=true;
            }
            else if (Objects.equals(opcion, "NO")) {
                check=true;
                salir=true;
            }
            else{
                System.out.println("Opcion no valida");
            }

        } while (!check);
        
        return salir;
    
        
    }
    
    //Metodo para mostrar una empresa y sus datos
    public static void mostrarEmpresas(ArrayList<Empresa> listaEmpresas){
        //Comprueba si existen empresas
        if (listaEmpresas.isEmpty()) {
            System.out.println("No existen empresas");
            
        //Si existen
        }else{
            //Bucle que recorre la lista de empresas mostrando todas las empresas y sus empleados
            for (int i = 0; i < listaEmpresas.size(); i++) {
                Empresa empresa = listaEmpresas.get(i);
                System.out.println("**Empresa: "+empresa.getNombreEmpresa()+"**");
                
                ArrayList<Empleados> listaEmpleados=empresa.getListaEmpleados();
                for (int j = 0; j < listaEmpleados.size(); j++) {
                    Empleados empleado = listaEmpleados.get(j);
                    System.out.println("Empleado "+(j+1)+": "+empleado.getNombreEmpleado());
                    System.out.println("Sueldo: "+empleado.getSueldo());
                }
            }

        }
        
    }
}
