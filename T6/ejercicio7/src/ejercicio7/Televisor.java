/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author alumno
 */
public class Televisor implements ControlRemoto{
    //Atributos
    private boolean encendido;
    private int canal;
    private int volumen;
    
    //Constructores

    public Televisor() {
        this.encendido=false;
        this.canal=1;
        this.volumen=10;
    }

    public Televisor(boolean encendido, int canal, int volumen) {
        this.encendido = encendido;
        this.canal = canal;
        this.volumen = volumen;
    }  
    //Getter/Setter

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    //Metodos interfaz
    //Enciende el Televisor si esta apagado y muestra un mensaje del canal actual.
    @Override
    public void encender(){
        if (!encendido) {
            encendido=true;
            System.out.println("El canal actual es: "+getCanal());          
        }
    }
    //Muestra un mensaje de aviso de apagado de la television y apaga la television.
    @Override
    public void apagar(){
        if (encendido) {
            System.out.println("La TV se apagara en 10s");
            encendido=false;
        }
    }
    //Subida y bajada de volumen de 1 en 1 y muestra el volumen actual
    @Override
    public void bajarVolumen(){
        if (encendido) {
            volumen--;
            System.out.println("Volumen: "+volumen);
            
        }
    }
    @Override
    public void subirVolumen(){
        if (encendido) {
            volumen++;
            System.out.println("Volumen: "+volumen);
            
        }
    }
    //Cambia el atributo canal a lo ingresado. Requiere un cast pues canal es de base, un float.
    @Override
    public void cambiarCanal(float n){
        if (encendido) {
            canal=(int)n;
            System.out.println("Canal: "+canal);
        }
    }
    //toString()

    @Override
    public String toString() {
        return "Televisor{" + "encendido=" + encendido + ", canal=" + canal + ", volumen=" + volumen + '}';
    }
    
    
    
}
