/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author alumno
 */
//Estos metodos se reescribiran en Televisor y Radio
public interface ControlRemoto {
    public void apagar();
    public void encender();
    public void bajarVolumen();
    public void subirVolumen();
    public void cambiarCanal(float canal);
    
}
