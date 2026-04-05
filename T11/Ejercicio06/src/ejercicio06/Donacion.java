/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author Dan
 */
public class Donacion {
    //Variables
    private String nombre;
    private float cantidad;
    
    //Constructores

    public Donacion(String nombre, float cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    public Donacion (){
        nombre="";
        cantidad=0;
    }
    
    //Getter / Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
    
    //toString

    @Override
    public String toString() {
        return "Donacion{" + "nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }
    
}
