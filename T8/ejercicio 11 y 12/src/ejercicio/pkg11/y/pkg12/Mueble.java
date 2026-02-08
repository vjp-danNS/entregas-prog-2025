/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg11.y.pkg12;

/**
 *
 * @author Dan
 */
public class Mueble {
    
    private int precio;
    private String descripcion;
    
    //Constructores

    public Mueble(int precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }
    public Mueble(){
        precio=0;
        descripcion="";
    }
    
    
    //Getter/setter

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //toString

    @Override
    public String toString() {
        return "Mueble{" + "precio=" + precio + ", descripcion=" + descripcion + '}';
    }
    
    
    
}
