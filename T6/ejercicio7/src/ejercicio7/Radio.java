/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author alumno
 */
public class Radio implements ControlRemoto{
    //Atributos
    private boolean encendido;
    private float emisora;
    private int volumen;
    
    //Constructores

    public Radio() {
        this.encendido=false;
        this.emisora= 80.0f;
        this.volumen=15;
    }

    public Radio(boolean encendido, float emisora, int volumen) {
        this.encendido = encendido;
        this.emisora = emisora;
        this.volumen = volumen;
    }  
    //Getter/Setter

    public float getEmisora() {
        return emisora;
    }

    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    //Metodos interfaz
    
    @Override
    public void encender(){
        if (!encendido) {
            encendido=true;
                    
        }
    }
    @Override
    public void apagar(){
        if (encendido) {
           encendido=false;
        }
    }
    @Override
    public void bajarVolumen(){
        if (encendido) {
            volumen=volumen-5;
            
        }
    }
    @Override
    public void subirVolumen(){
        if (encendido) {
            volumen=volumen+5;
            
        }
    }
    @Override
    public void cambiarCanal(float n){
        if (encendido) {
            emisora=n;
            System.out.println("emisora: "+emisora);
        }
    }
    //toString()

    @Override
    public String toString() {
        return "Radio{" + "encendido=" + encendido + ", emisora=" + emisora + ", volumen=" + volumen + '}';
    }
    
    
    
}