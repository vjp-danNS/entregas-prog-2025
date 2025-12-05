/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4;

/**
 *
 * @author alumno
 */
public class Perros extends Canidos {
    private String sound;
    private String alimentacion;
    private String habitat;
    private String cientName;
    
    //Constructores

    public Perros(String sound, String alimentacion, String habitat, String cientName, String nombre, int edad, int peso) {
        super(nombre, edad, peso);
        this.sound = sound;
        this.alimentacion = alimentacion;
        this.habitat = habitat;
        this.cientName = cientName;
    }

    public Perros() {
        super();
        this.sound = "";
        this.alimentacion = "";              
        this.habitat = "";
        this.cientName = "";
    }
    //Getter/Setters

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getCientName() {
        return cientName;
    }

    public void setCientName(String cientName) {
        this.cientName = cientName;
    }
    //Show
    @Override
    public void showSound(){
        System.out.println("sonido= "+sound);
    }
    @Override
    public void showAlimentacion(){
        System.out.println("alimentacion= "+alimentacion);
    }
    @Override
    public void showHabitat(){
        System.out.println("habitat= "+habitat);
    }
    @Override
    public void showCientName(){
        System.out.println("cientName= "+cientName);
    }
    
    //toString()

    @Override
    public String toString() {
        return "Perros{" + "nombre=" + getNombre()+ ", edad=" + getEdad() + ", peso=" + getPeso()+ ", sound=" + sound + ", alimentacion=" + alimentacion + ", habitat=" + habitat + ", cientName=" + cientName + '}';
    }
    //
    
    
    
    
    
}
