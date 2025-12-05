/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4;

/**
 *
 * @author alumno
 */
public abstract class Canidos extends Animales{

    public Canidos(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }

    public Canidos() {
    }
    @Override
    public String toString() {
        return "Canidos{" + "nombre=" + getNombre() + ", edad=" + getEdad() + ", peso=" + getPeso() + '}';
    }
}
