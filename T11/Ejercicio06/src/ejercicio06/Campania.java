/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Dan
 */
public class Campania {
    private Set<Donacion> donaciones;
    private String nombre;
    
    //Constructores

    public Campania(Set<Donacion> donaciones, String nombre) {
        this.donaciones = donaciones;
        this.nombre = nombre;
    }
    
    public Campania(){
        donaciones= new LinkedHashSet<>();
        nombre="";
    }
    
    //Getter / Setter

    public Set<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(Set<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //toString

    @Override
    public String toString() {
        return "Campania{" + "donaciones=" + donaciones + ", nombre=" + nombre + '}';
    }
    
    //----------------------OTROS-----------------------------
    
    //Añade una donacion al set de Camapaña
    public static void añadirDonacion(Campania campania){
        //Scanner
        Scanner escFloat = new Scanner(System.in);
        Scanner escString = new Scanner(System.in);
        
        //Variables
        String nombre;
        float cantidad;
        Donacion donacion;
        

        //Metodo
        
        //Pido datos
        System.out.println("\nAnadamos una donacion");
        System.out.print("\nNombre: ");
        nombre=escString.nextLine();
        System.out.print("\nCantidad: ");
        cantidad=escFloat.nextFloat();
        
        //Ingreso los datos en una donacion auxiliar
        donacion=new Donacion(nombre, cantidad);
        
        //Añado los datos al set
        campania.getDonaciones().add(donacion);
        
        System.out.println("\nDonacion añadida");
    }
    //Muestra las donaciones de una camapaña
    public static void showDonaciones(Campania campania){
        //Variables
        Set<Donacion> donaciones = campania.getDonaciones(); // Guardo la lista de donaciones en un objeto para mostrar
        
        //Muestro la lista de donaciones
        System.out.println("Donaciones: ");
        System.out.println(donaciones);
        
    }
    
    //Muestra las donaciones de una campaña segun nombre
    public static void showDonacionesByName(Campania campania){
        //Scanner
        Scanner escString= new Scanner(System.in);
        
        //Variables
        Set<Donacion> donaciones = campania.getDonaciones();
        String nombre;
        boolean encontrado=false;
        //Metodo
        //Pido el nombre
        System.out.print("Por cual nombre quiere filtrar?: ");
        nombre=escString.nextLine();
        
        //Recorro toda las donaciones de la campaña
        for (Donacion donacion : donaciones) {
            //Si encuentro una donacion vinculada a ese nombre, imprimo los datos de esta
            if (donacion.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(donacion.toString());
                encontrado=true;
            }
        }
        //Si  no encuentro ninguna le aviso al usuario
        if (!encontrado) {
            System.out.println("No se encontro un donante con ese nombre");
        }
    }
    //Cuenta las donaciones
    public static void contarDonaciones (Campania campania){
        //Metodo
        System.out.println("Cantidad de donaciones: "+ campania.getDonaciones().size());
    }
    
    //Muestra el total de donaciones
    public static void sumarDonaciones (Campania campania){
        //Variables
        float suma=0;
        Set<Donacion> donaciones = campania.getDonaciones();
        //Metodo
        for (Donacion donacion : donaciones) {
            suma=+donacion.getCantidad();
        }
        System.out.println("Total de donaciones: "+suma);
    }
    
    //Ordena las donaciones
    public static void ordenarDonaciones(Campania campania){
        //Variables
        Set<Donacion> donaciones = campania.getDonaciones();
        Donacion[] arrDonaciones= new Donacion[donaciones.size()];
        
        int i=0;
        //Metodo
        
        //Guardo el set en un array
        for (Donacion donacion : donaciones) {
            arrDonaciones[i]=donacion;
            i++;
        }
        //Ordeno el array
        for (int j = 0; j < arrDonaciones.length-1; j++) {
            for (int k = 0; k < arrDonaciones.length-1-j; k++) {
                float d1=arrDonaciones[k].getCantidad();
                float d2=arrDonaciones[k+1].getCantidad();
                Donacion aux;
                if (d1 < d2) {
                    aux=arrDonaciones[k];
                    arrDonaciones[k]=arrDonaciones[k+1];
                    arrDonaciones[k+1]=aux;
                }
                
            }
            
        }
        
        //Limpio el set y reingreso los datos
        
        campania.getDonaciones().clear();
        
        for (int j = 0; j < arrDonaciones.length; j++) {
            Donacion arrDonacione = arrDonaciones[j];
            
            campania.getDonaciones().add(arrDonacione);
        }
        
        System.out.println("Lista de donaciones:"
                + "\n"+campania.getDonaciones());
        
    }
}
