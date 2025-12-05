/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4;

/**
 *
 * @author alumno
 */
public abstract class Animales {
    private String nombre;
    private int edad;
    private int peso;
    //Constructores
    public Animales(String nombre, int edad, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    public Animales(){
        this.nombre="";
        this.edad=0;
        this.peso=0;
    }
    //Getters/Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    //Abstracts
    public abstract void showSound();
    public abstract void showAlimentacion();
    public abstract void showHabitat();
    public abstract void showCientName();
    
    //toString()

    @Override
    public String toString() {
        return "Animales{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
    
    
}
