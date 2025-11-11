/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Dan
 */
public class Coche {
    private  String marca,modelo;
    private  Rueda ruedas;
    
    public void establecerMarca(String m){
        marca=m;
    }
    public void establecerModelo(String m){
        modelo=m;
    }
    public String obtenerMarca(){
        return marca;
    }
    public String obtenerModelo(){
        return modelo;
    }
    public void establecerRueda(Rueda r){
        ruedas=r;
        
    }
    public Rueda obtenerRueda(){
        return ruedas;
    }
}
