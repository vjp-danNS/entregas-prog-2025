/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4;

/**
 *
 * @author alumno
 */
public abstract class Felinos extends Animales {
    //Constructores
    public Felinos(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }

    public Felinos() {
        super();
    }
    //Mostrar

    @Override
    public String toString() {
        return "Felinos{" + "nombre=" + getNombre() + ", edad=" + getEdad() + ", peso=" + getPeso() + '}';
    }
    
    
    
}
