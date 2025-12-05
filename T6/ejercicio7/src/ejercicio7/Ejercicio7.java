/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author alumno
 */
public class Ejercicio7 {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Televisor
        System.out.println("--------------Televisor----------------");
        Televisor t=new Televisor();
        
        //Operamos con el televisor
        t.encender();
        System.out.println("\n"+t.toString());
        for (int i = 0; i < 3; i++) {
            t.subirVolumen();
        }
        System.out.println("\nEl volumen actual es: "+t.getVolumen());
        t.cambiarCanal(7);
        t.bajarVolumen();
        t.apagar();
        System.out.println("\n"+t.toString());
        
        //Radio
        System.out.println("--------------Radio----------------");
        Radio r=new Radio();
        
        //Operamos Radio
        r.encender();   
        System.out.println("\n"+r.toString());
        for (int i = 0; i < 3; i++) {
            r.subirVolumen();
        }
        System.out.println("\nEl volumen actual es: "+r.getVolumen());
        r.cambiarCanal(123.1f);
        r.bajarVolumen();
        r.apagar();
        System.out.println("\n"+r.toString());
        
    }
    
}
