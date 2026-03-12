/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex.ra.pkg6;

import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Coche {
    //Variables
    private String nombreTitular;
    private String matricula;
    
    
    //Constructores

    public Coche(String nombreTitular, String matricula) {
        this.nombreTitular = nombreTitular;
        this.matricula = matricula;
    }
    
    public Coche(){
        nombreTitular= "";
        matricula="";
    }
    
    //Getter/Setter

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //toString

    @Override
    public String toString() {
        return "Coche{" + "nombreTitular=" + nombreTitular + ", matricula=" + matricula + '}';
    }
    
    
    
    
    //Otros
    
    //Pido los datos de un objeto Coche y los ingreso en una posicion vacia de un array
    public static void aparcarCoche(Coche[] garaje){
        
        //Variable
        String nombreTitular;
        String matricula;
        
        int posicionAparcamiento;
        boolean aparcado=false;
        
        //Objeto coche
        Coche coche;
        
        //Scanner
        Scanner escString= new Scanner(System.in);
        Scanner escInt=new Scanner(System.in);
        
        
        //Pedimos datos y los guardamos en variables
        System.out.println("Por favor ingrese los datos del coche: ");
        System.out.print("Ingrese el nombre del titular: ");
        nombreTitular=escString.nextLine();
        
        System.out.print("Ingrese la matricula del coche: ");
        matricula=escString.nextLine();
        
        //Ingresamos los datos del coche mediante su constructor parametrizado y mostramos un mensaje una vez guardados los datos
        
        coche=new Coche(nombreTitular, matricula);
        
        System.out.println("Informacion de coche recibida...");
        
        //Pedimos al usuario un numero de aparcamiento y revisamos si esta vacio, si no lo esta lo volvemos a pedir
       
            do {                
                System.out.print("\nPor favor ingrese el numero de aparcamiento que quiere utilizar: ");
                //Comprobamos que el usuario no este ingresando letras
                try {
                    posicionAparcamiento=escInt.nextInt();
                    
                    //En caso  de que la posicion este vacia guardamos el coche
                    if (Objects.isNull(garaje[posicionAparcamiento])) {
                        garaje[posicionAparcamiento]=coche;
                        aparcado=true;
                    //Si  esta ocupada avisamos
                    }else{
                        System.out.println("Posicion ya ocupada");
                        
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Tipo de caracter no valido");
                    escInt.nextLine();
                }
               
                
                
            } while (!aparcado);
        
        
    
    
    
    }
    
    //Metodo que muestra las plazas libres de garaje
    public static void mostrarVacias (Coche[] garaje){
        System.out.println("Las plazas libres de el garaje son: ");
        
        for (int i = 0; i < garaje.length; i++) {
            if (Objects.isNull(garaje[i])) {
                System.out.print("["+i+"]");
            }
            
            
        }
    
    }
    //Metodo que muestra los datos de los coches aparcados
    public static void mostrarAparcados(Coche[] garaje){
        System.out.println("Los datos de los coches aparcados son: ");
        
        for (int i = 0; i < garaje.length; i++) {
            if (Objects.nonNull(garaje[i])) {
                System.out.println("Posicion: "+i+": "+garaje[i].toString());
            }
        }
    
    }
    
    //Metodo que permite buscar el titular de los coches aparcados que empiecen por cierto texto
    public static void buscarPorFiltroTitular(Coche[] garaje){
        //Variable
        String filtro;
        
        //Scanner
        Scanner escString=new Scanner(System.in);
        
        //Pido al usuario el texto de filtro
        System.out.print("Ingrese el texto por el cual quiere filtrar: ");
        filtro=escString.nextLine();
        //Lo llevo a mayusculas todos para evitar errores de usuario
        filtro=filtro.toUpperCase();
        
        //Busco por todos los coches el texto de filtro
        for (int i = 0; i < garaje.length; i++) {
            if (Objects.nonNull(garaje[i])) {
                Coche coche = garaje[i];
                String titular =coche.getNombreTitular();
                //Llevo el nombre del titular del coche aparcado a mayusculas para realizar la busqueda
                titular=titular.toUpperCase();
                //Reviso que el nombre del titular empiece por lo filtrado
                if (titular.indexOf(filtro)==0) {
                    System.out.println(titular+"#");
                }
            }
        }
    }
    
    //Metodo que permite buscar por matricula entre los coches aparcados
    public static void bucarPorMatricula(Coche[] garaje){
       
        //Variable
        String filtro;
        boolean encontrado=false;
        int idx=0;
        
        
        
        //Scanner
        Scanner escString=new Scanner(System.in);
        
        //Pido el filtro de matricula al usuario
        System.out.print("Ingrese la matricula que quiere buscar: ");
        filtro=escString.nextLine();
        //Pongo el filtro en mayusculas para evitar errores
        filtro=filtro.toUpperCase();
        
        //Busco la matricula en los coches que tengo aparcados, pongo la matricula en mayusculas para evitar errores por mayusculas
        while (!encontrado && idx < garaje.length) {
            //Reviso que la posicion no este vacia para evitar NullPointerException
            if (Objects.nonNull(garaje[idx])) {
                String matriculaCoche = garaje[idx].getMatricula().toUpperCase();
                //Comparo matriculas con el filtro ingresado
                if (Objects.equals(matriculaCoche, filtro)) {
                    System.out.println("\nLa posicion de este coche es: "+idx);
                    encontrado=true;
                    
                }
            }
            idx++;
        }
        
        //Si no encuentra nada avisa al usuario
        if (!encontrado) {
            System.out.println("Ningun coche encontrado con esa matricula");
        }

    }
    
    //Metodo que convierte el array garaje en una matriz 3x3 y que muestra si estan vacias (L) o ocupadas (X)
    public static void cuadriculaDisponibilidad(Coche[] garaje){
        //Contador para mostrar en filas y columnas
        int contador=0;
        //Matriz de char para guardar L o X
        char[][] matriz= new char[3][3];
        
        //Vuelco al informacion del array en la matriz 3x3
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (Objects.isNull(garaje[contador])) {
                    matriz[i][j]='L';
                }else{
                    matriz[i][j]='X';
                }
                contador++;
            }
            
        }
        //Muestro el array
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
    
    
    }
    
}
