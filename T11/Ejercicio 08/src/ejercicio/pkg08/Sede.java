/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg08;

/**
 *
 * @author Dan
 */
public class Sede {
    
    String nombreSede;
    float ingresoAnual;

    //Constructores    
    public Sede(String nombreSede, float ingresoAnual) {
        this.nombreSede = nombreSede;
        this.ingresoAnual = ingresoAnual;
    }
    
    public Sede(){
        nombreSede="";
        ingresoAnual=0;
    }
    
    //Getter/Setter

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public float getIngresoAnual() {
        return ingresoAnual;
    }

    public void setIngresoAnual(float ingresoAnual) {
        this.ingresoAnual = ingresoAnual;
    }
    
    //toString

    @Override
    public String toString() {
        return "\nSede: " + nombreSede + "\nIngresoAnual: " + ingresoAnual + '}';
    }
    
    
}
