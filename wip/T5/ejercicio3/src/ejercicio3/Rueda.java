/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Dan
 */
public class Rueda {
    private String material;
    private int pulgadas;
    
    //Getters/Setters
    public void establecerMaterial(String m){
        material=m;
    }
    public void establecerPulgadas(int p){
        pulgadas=p;
    }
    public String obtenerMaterial(){
        return material;
    }
    public int obtenerPulgadas(){
        return pulgadas;
    }
    
}
