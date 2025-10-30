/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo variables
        int num;
        boolean comprobar;
        
        //Invoco metodos
        num=Multiplos3.numero();
        comprobar=Multiplos3.comprobacion(num);
        Multiplos3.resultado(comprobar, num);
    }
    
}
