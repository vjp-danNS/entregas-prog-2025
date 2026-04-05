/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Autobus {

    //Variables
    String matricula;
    //Mapa para almacenar conductores
    Map<String, String> conductores = new HashMap<>(); //DNI (Clave), nombre (Valor)

    //Constructores
    //Asumo que ambos constructores tendran de base su hashmap vacio
    public Autobus(String matricula) {
        this.matricula = matricula;

    }

    public Autobus() {
        matricula = "";
    }

    //Getter/Setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Map<String, String> getConductores() {
        return conductores;
    }

    public void setConductores(Map<String, String> conductores) {
        this.conductores = conductores;
    }

    //toString
    @Override
    public String toString() {
        return "Autobus{" + "matricula=" + matricula + ", conductores=" + conductores + '}';
    }

    //------------------------------------------Otros----------------------------------------
    //Este metodo permite crear y guardar en un vector a un autobus
    public static void aparcar(Autobus[] aparcamiento) {
        //Objeto autobus a default para almacenar los datos posteriormente
        Autobus autobus = new Autobus();
        //Mapa para guardar conductores
        Map<String, String> conductores = autobus.getConductores(); //DNI key, nombre value

        //Scanner
        Scanner escInt = new Scanner(System.in);
        Scanner escString = new Scanner(System.in);
        //Variables
        String nombre; //Variable para guardar nombre de conductores
        String dni;//Variable para guardar dni de conductores
        String opcion;

        int pos;//Posicion que el usuario quiere aparcar
        boolean aparcado = false;//Comprueba de que se aparque o no un autobus.
        boolean conductoresListos = false;//Comprobacion de que no se quieres ingresar mas conductores
        boolean checker;//Comprueba que no se pongan opciones fuera del rango permitido

        //Menu
        System.out.println("\nGuardemos los datos del autobus:");
        System.out.print("\nMatricula: ");
        autobus.setMatricula(escString.nextLine());
        System.out.println("\nGuardemos los conductores de este autobus");

        //Datos Conductor, loop hasta no querer guardar mas
        do {
            System.out.print("\nNombre: ");
            nombre = escString.nextLine();
            System.out.print("\nDNI: ");
            dni = escString.nextLine();

            conductores.put(dni, nombre);
            System.out.print("\nGuardando conductor");

            //Loop conductores, para guardar los conductores que se quiera
            checker = false;
            do {
                System.out.println("\nDeseas guardar mas conductores Y/N: ");
                opcion = escString.nextLine();
                if (opcion.equalsIgnoreCase("y")) {
                    checker = true;//Sale del loop de pregunta
                } else if (opcion.equalsIgnoreCase("n")) {
                    conductoresListos = true;//Sale del loop de ingreso de conductores
                    checker = true;//Sale del loop de pregunta
                } else {
                    System.out.println("Opcion no valida");
                }
            } while (!checker);

        } while (!conductoresListos);

        //Selecciona posicion
        do {
            System.out.print("\nEn que posicion quieres aparcar?: ");
            pos = escInt.nextInt();

            //Si esta vacio lo guarda si no, vuelve a pedir
            if (Objects.isNull(aparcamiento[pos])) {
                aparcamiento[pos] = autobus;
                aparcado = true;
            } else {
                System.out.println("\nPosicion ocupada, selecciona otra ");
            }

        } while (!aparcado);
    }

    ;
    
    //Muestra posiciones libres del vector
    public static void aparcamientosVacios(Autobus[] aparcamiento) {
        //Recorre el vector aparcamiento completo y comprueba si los espacios estan vacios, si lo estan devuelve un mensaje
        for (int i = 0; i < aparcamiento.length; i++) {
            if (Objects.isNull(aparcamiento[i])) {
                System.out.println("Aparcamiento " + i + " vacio: ");
            }

        }

    }

    //Devuelve la informacion de un autobus dada una matricula
    public static void buscarAutobus(Autobus[] aparcamiento) {
        //Objeto scaner
        Scanner escString = new Scanner(System.in);

        //Variables
        boolean vacio = aparcamientoIsEmpty(aparcamiento); //Comprobacion de que el aparcamiento no este vacio
        boolean encontrado = false;   //Comprobacion para terminar loop while
        int i = 0;
        String matriculaBuscada, matriculaAutobus;
        Autobus autobus;

        //Si no esta vacio pide al usuario la matricula, si lo esta envia un mensaje informativo
        if (vacio) {
            System.out.println("\nEl aparcamiento esta vacio");
        } else {
            //Pido matricula
            System.out.print("\nQue matricula quieres buscar?: ");

            matriculaBuscada = escString.nextLine();

            //Loop que busca hasta encontrar un autobus con esa matricula
            while (!encontrado && i != aparcamiento.length) {
                //Compruebo que no este vacio el espacio, evita NullPointerException
                if (Objects.nonNull(aparcamiento[i])) {
                    autobus = aparcamiento[i];          //Guardo el autobus en una variable
                    matriculaAutobus = autobus.getMatricula();  //Guardo la matricula
                    Map<String, String> conductores = autobus.getConductores();   //Guardo sus conductores en un objeto

                    //Comparo matricula del autobus actual con la buscada, si lo encuentra: 
                    if (matriculaBuscada.equalsIgnoreCase(matriculaAutobus)) {
                        System.out.println("\nMatricula: " + autobus.getMatricula());

                        for (String dni : conductores.keySet()) {
                            String nombre = conductores.get(dni);
                            System.out.println("DNI: " + dni + ", Nombres: " + nombre);
                        }
                        encontrado = true;
                    }
                }
                i++;
            }
            if (!encontrado) {
                System.out.println("No hay autobuses con esa matricula");
            }
        }

    }

    //Busca por el nombre del conductor, si lo encuentra, muestra la matricula del bus asignado.
    public static void buscarConductor(Autobus[] aparcamiento) {
        //Objeto scaner
        Scanner escString = new Scanner(System.in);

        //Variables
        boolean vacio = aparcamientoIsEmpty(aparcamiento); //Comprobacion de que el aparcamiento no este vacio
        boolean encontrado = false;
        int i = 0;

        String nombreBuscado;
        String matriculaAutobus;
        Autobus autobus;

        //Comprueba si esta vacio, si no lo esta comienza a pedir y buscar
        if (vacio) {
            System.out.println("\nEl aparcamiento esta vacio");
        } else {

            System.out.print("\nCual es el nombre del conductor?: ");
            nombreBuscado = escString.nextLine();

            //Revisa todos los espacios de el aparcamiento hasta encontrar el nombre
            while (!encontrado && i != aparcamiento.length) {
                //Si el aparcamiento no esta vacio busca
                if (Objects.nonNull(aparcamiento[i])) {
                    autobus = aparcamiento[i];          //Guardo el autobus en una variable
                    matriculaAutobus = autobus.getMatricula();  //Guardo la matricula
                    Map<String, String> conductores = autobus.getConductores(); //Guardo la lista de conductores
                    Iterator<String> MapIt = conductores.keySet().iterator();//Iterador para realizar la busqueda

                    //Recorro con iterador hasta encontrar el nombre, si lo encuentra sale del bucle
                    while (MapIt.hasNext() && !encontrado) {
                        String dni = MapIt.next();
                        String nombre = conductores.get(dni);
                        if (nombre.equalsIgnoreCase(nombreBuscado)) {
                            System.out.println("La matricula asignada a este conductor es: " + matriculaAutobus);
                            encontrado = true;
                        }
                    }

                }
                i++;
            }
            if (!encontrado) {
                System.out.println("No hay conductores con ese nombre");
            }
        }
    }

    //Muestra el aparcamiento con el autobus con el mayor numero de conductores asignados
    public static void mayorNDeConductores(Autobus[] aparcamiento) {
        //Comprueba que el aparcamiento este vacio antes de realizar cualquier operacion
        boolean vacio = aparcamientoIsEmpty(aparcamiento);
        if (vacio) {
            System.out.println("\n El aparcamiento esta vacio");
        } else {
            //Variables
            int posAutMayor = 0;    //Posicion del autobus con mayor cantidad de conductores
            int sizeMayor = 0;    //Tamaño de la lista de conductores asignados a el bus
            
            //Recorre todas las posiciones del vector
            for (int i = 0; i < aparcamiento.length; i++) {
                //Comprueba que no este vacia dicha posicion
                if (Objects.nonNull(aparcamiento[i])) {
                    //Asigno nombres para ahorrar repetir escritura
                    Autobus autobus = aparcamiento[i];
                    Map<String, String> conductores = autobus.getConductores();
                    int sizeActual = conductores.size();
                    //Compruebo que el tamaño de la lista de este autobus sea mayor que la anterior, si lo es, cambio la posicion del autobus con mayor tamaño
                    if (sizeMayor < sizeActual) {
                        sizeMayor = sizeActual;
                        posAutMayor = i;
                    }
                }

            }
            //Imprimo la posicion del autobus con mayor tamaño de lista de conductores.
            System.out.println("El autobus con mas conductores asignados se encuentra en la posicion: "+posAutMayor);

        }
    }

    //comprube a que el aparcamiento este vacio
    private static boolean aparcamientoIsEmpty(Autobus[] aparcamiento) {
        boolean vacio = true;
        int i = 0;

        while (vacio && i != aparcamiento.length) {
            if (Objects.nonNull(aparcamiento[i])) {
                vacio = false;
            }
            i++;
        }

        if (vacio) {
            return true;
        } else {
            return false;
        }
    }

}
