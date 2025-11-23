package ejercicio15;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Direccion {
    
    //Atributos
    private String calle;
    private int numero;
    private int piso;
    private String ciudad;
    //Construtor
    public Direccion(){
    calle="";
    numero=0;
    piso=0;
    ciudad="";
    }

    public Direccion(String c, int num, int p, String city) {
        calle = c;
        numero = num;
        piso = p;
        ciudad = city;
    }
    


    //Getter/Setters

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public int getPiso() {
        return piso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCalle(String c) {
        calle = c;
    }

    public void setNumero(int n) {
        numero = n;
    }

    public void setPiso(int p) {
        piso = p;
    }

    public void setCiudad(String c) {
        ciudad = c;
    }
    
    
}
