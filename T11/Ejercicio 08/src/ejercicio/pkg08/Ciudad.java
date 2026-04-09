/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

import java.util.Scanner;
import java.util.TreeMap;


/**
 *
 * @author Dan
 */
public class Ciudad {
    
    String nombreCiudad;
    LinkedHashSet<Sede> sedes;
    
    //Constructor
    public Ciudad(String nombreCiudad, LinkedHashSet<Sede> sedes) {
        this.nombreCiudad = nombreCiudad;
        this.sedes = sedes;
    }
    
    public Ciudad (){
        nombreCiudad="";
        sedes= new LinkedHashSet<>();
    }
    
    //Getter/Setter

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public LinkedHashSet<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(LinkedHashSet sedes) {
        this.sedes = sedes;
    }
    
    //toString;

    @Override
    public String toString() {
        return "Ciudad:"+ nombreCiudad + "\nSedes=" + sedes + '}';
    }
    
    //------------------OTROS----------------
    //Metodo para añadir ciudades y sus sedes
    public static void addCiudad(ArrayList<Ciudad> ciudades) {
        //Variables
        String nombreCiudad, nombreSede, opcion; //Variables temporales de ciudad y sede y lector de opcion
            
        float ingresoAnual; //Variable temporal de ingresoAnual de sede
        LinkedHashSet<Sede> sedes = new LinkedHashSet<>(); //Set de sedes de esta ciudad
        boolean ready=false, check=true;    //Booleans para salir de bucles
        //Metodo
        //Pido los datos de la ciudad
        System.out.println("\nAnadamos una ciudad");
        //Nombre ciudad
        System.out.print("\nNombre de la ciudad: ");
        nombreCiudad=escanerString();
        //Pido datos de sede hasta que ya no quiera añadir mas el usuario
        do {            
            System.out.println("\nAnadamos una sede");
            //Nombre sede
            System.out.print("\nNombre de la sede: ");
            nombreSede=escanerString();
            //Ingreso anual de la sede
            System.out.println("\nIngreso anual de la sede: ");
            ingresoAnual=escanerFloat();
            //Creo un objeto sede temporal y lo añado al set de esta ciudad
            Sede sede =new Sede(nombreSede, ingresoAnual);
            sedes.add(sede);
            
            //Pregunto si desea agregar mas sedes
            
            //Controlo la respuesta del usuario y si es Y lo matengo en el loop, hago lo contrario en caso de N, controlo que la respuesta sea una de estas dos
            do {                
               System.out.println("\nDesea agregar mas sedes? Y/n: ");
               opcion=escanerString();
               
               //Si es y, salgo del bucle de preguntar sobre mas agregaciones, continuo agregando
                if (opcion.equalsIgnoreCase("Y")) {
                    check=true;
                }
                //Si es n, salgo del bucle de preguntar sobre mas agregaciones, salgo del bucle de agregacion
                else if (opcion.equalsIgnoreCase("n")) {
                    check=true;
                    ready=true;
                }
                //Si no es ninguna de las anteriores, pido de vuelta
                else  {
                    System.err.println("OPCION NO VALIDA");
                }
            } while (!check);
            
            
            
            
        } while (!ready);
        
        //Una vez terminado el bucle agrego todo lo creado a un objeto ciudad y lo agrego a la Arraylist
        Ciudad ciudad=new Ciudad(nombreCiudad, sedes);
        ciudades.add(ciudad);
        System.out.println("\n Ciudad agregada de forma correcta.");
    }
    
    //Metodo para mostrar ciudades y sus sedes
    public static void showCiudades(ArrayList<Ciudad> ciudades){
        //Compruebo que la lista no este vacia
        if (ciudades.isEmpty()) {
            System.out.println("\nNo hay ciudades introducidas");
        }
        //Si no lo esta
        else{
            //Loop que recorre toda la lista de ciudades y las muestra
            for (Ciudad ciudad : ciudades) {
                System.out.println("\n"+ciudad.toString());
            }
        }
    }
    
    //Metodo que muestra las sedes cuyos ingresos sean mayores a la media
    public static void showSedesGreaterThanMedia(ArrayList<Ciudad> ciudades){
        //Compruebo que la lista no este vacia
        if (ciudades.isEmpty()) {
            System.out.println("\nNo hay ciudades introducidas");
        }
        //Si no lo esta
        else{
            //Variables
            float media=0; //Almacena el calculo de la media de las sedes
            int sedeCount=0; //Contador de sedes
            
            //Loop para obtener la suma total del ingreso anual de todas las sedes
            for (Ciudad ciudad : ciudades) {
                LinkedHashSet<Sede> sedes=ciudad.getSedes();
                for (Sede sede : sedes) {
                    media=+sede.getIngresoAnual();
                    sedeCount++;
                }
            }
            
            media=media/sedeCount; //Calculo la media de ingreso anual
            
            //Mostramos las sedes con ingreso anual mayor a la media
            for (Ciudad ciudad : ciudades) {
                LinkedHashSet<Sede> sedes=ciudad.getSedes();
                boolean ciudadMostrada=false; //Boolean para mostrar el nombre de la ciudad antes de los datos de la sede
                
                //Loop que compara el ingreso anual de cada sede con la media
                for (Sede sede : sedes) {
                    float ingresoAnual=sede.getIngresoAnual();
                    if (ingresoAnual>=media) {
                        //Si el nombre de la ciudad no ha sido mostrado, muestralo
                        
                        if (!ciudadMostrada) {
                            System.out.println("\n"+ciudad.getNombreCiudad()+": ");
                            ciudadMostrada=true;
                        }
                        //Datos de la sede
                        System.out.println(sede.toString()+"\n");
                    }
                }
            }
        
        
        }
    }
    
    //Metodo que busca el nombre de una sede y devuelve un boolean, true si encuentra una sede con ese nombre, false si no hay ciudades o no hay sedes con ese nombre
    public static boolean searchSedeName(ArrayList<Ciudad> ciudades){
        
        
        //Compruebo que la lista no este vacia
        if (ciudades.isEmpty()) {
            System.out.println("\nNo hay ciudades introducidas");
            return false;
        }
        //Si no lo esta
        else{
        
            //Variables
            String nombreBuscado;
            boolean encontrado=false;
            
            //Metodo
            //Pido el nombre de la sede
            System.out.print("\nCual es el nombre de la sede que deseas buscar?: ");
            nombreBuscado=escanerString();
            
            //Bucle que busca la sede
            Iterator<Ciudad> itCiudad = ciudades.iterator();
            
            while (!encontrado && itCiudad.hasNext()) {
                Ciudad ciudad= itCiudad.next();
                LinkedHashSet<Sede> sedes=ciudad.getSedes();
                Iterator<Sede> it = sedes.iterator();
                while (!encontrado && it.hasNext()) {
                    Sede sede=it.next();
                    //Si lo encuentra da la informaciond de la sede y el nombre de la ciudad
                    if (sede.getNombreSede().equals(nombreBuscado)) {
                        System.out.println("\nSede encontrada: "
                                + "\nCiudad: "+ciudad.getNombreCiudad()
                                + "\n"+sede.toString());
                        encontrado=true;
                    }
                }
            }
            
            //Si no encuentra le da un aviso al usuario
            if (!encontrado) {
                System.out.println("No encontrada ninguna sede con ese nombre");
            }
            
            return encontrado;
        }
    }
    
    //Metodo que permite añadir una sede a una ciudad existente
    public static void addSede(ArrayList<Ciudad> ciudades){
        //Compruebo que la lista no este vacia
        if (ciudades.isEmpty()) {
            System.out.println("\nNo hay ciudades introducidas");
            
        }
        //Si no lo esta
        else{
            //Variables
            String nombreCiudad, nombreSede; //nombre ciudad buscado, nombre de sede a agregar
            boolean encontrado=false;
            float ingresoAnual;
            
            //Metodo
            //Pido nombre de la ciudad a modificar
            System.out.print("\nCual es el nombre de la ciudad a la que quieres agregar una sede?: ");
            nombreCiudad=escanerString();
            
            //Busco la ciudad
            Iterator<Ciudad> it = ciudades.iterator();
            
            while (it.hasNext() && !encontrado) {
                Ciudad ciudad = it.next();
                //Si encuentra una ciudad con el nombre
                if (ciudad.getNombreCiudad().equalsIgnoreCase(nombreCiudad)) {
                    //Marco que esta encontrada la ciudad
                    encontrado=true;
                    //Pido los datos de la sede
                    System.out.println("\nCiudad encontrada!");
                    System.out.print("\nCual es el nombre de la nueva sede: ");
                    nombreSede=escanerString();
                    System.out.print("\nCuanto es el ingreso anual de la nueva sede:  ");
                    ingresoAnual=escanerFloat();
                    
                    //Los añado a una sede nueva y esta al set de sedes
                    Sede sede = new Sede(nombreSede, ingresoAnual);
                    
                    ciudad.getSedes().add(sede);
                    
                    System.out.println("\nSede agregada correctamente");
                    
                }
                
            }
            
            //Si no encuentra una ciudad con el nombre
            if (!encontrado) {
                System.out.println("\nNo hay una ciudad con ese nombre, pruebe de nuevo");
            }
        }
    }
    
    //Metodo para mostrar ordenadas las sedes segun sus ingresos anuales
    public static void showSortedSedes (ArrayList<Ciudad> ciudades){
        //Compruebo que la lista no este vacia
        if (ciudades.isEmpty()) {
            System.out.println("\nNo hay ciudades introducidas");
            
        }
        //Si no lo esta
        else{
            System.out.println("\nSedes ordenadas de mayor a menor \n");
            //Variables
            
            TreeMap<Float,Sede> sedesMap = new TreeMap<>();
            //Metodo
            
            //Loop que agrega todos las sedes a un TreeMap, que ordena los valores segun Ingreso
            for (Ciudad ciudad : ciudades) {
                LinkedHashSet<Sede> sedes=ciudad.getSedes();
                for (Sede sede : sedes) {
                    float ingresoAnual=sede.getIngresoAnual();
                    sedesMap.put(ingresoAnual, sede);
                    
                }
            }
            //Loop que lee el treeMap y lo muestra de manera inversa
            for (Float ingresoAnual : sedesMap.descendingMap().keySet()) {
                Sede sede= sedesMap.get(ingresoAnual);
                String nombre =sede.getNombreSede();
                System.out.println("Nombre sede: " + nombre + "\nIngreso anual: " + ingresoAnual);
            }
            
        
        }
    
    }
    
    
    
    //-----------------SCANNERS------------------
    //Scanner de String
    public static String escanerString(){
        //Scanner
        Scanner esc = new Scanner(System.in);
        return esc.nextLine();
        
    }
    //Scanner de Float
    public static float escanerFloat(){
        //Scanner
        Scanner esc = new Scanner(System.in);
        return esc.nextFloat();
        
    } 
}
