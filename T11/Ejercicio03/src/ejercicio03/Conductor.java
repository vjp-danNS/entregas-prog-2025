/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author alumno
 */
public class Conductor {
    int dni;
    String nombre;
    
    //Constructor
    public Conductor(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    public Conductor(){
        dni=0;
        nombre="";
    }
    //Get/set

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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
        return "Conductor{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }
    
}
