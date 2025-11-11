/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Dan
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo objetos rueda y defino su material y pulgadas
        Rueda rueda1=new Rueda();
        rueda1.establecerMaterial("Acero");
        rueda1.establecerPulgadas(15);
        
        Rueda rueda2=new Rueda();
        rueda2.establecerMaterial("Aluminio");
        rueda2.establecerPulgadas(14);
        //Muestro los datos de las ruedas
        System.out.println("\nLos materiales y tamaño de la rueda1 son: "+rueda1.obtenerMaterial()+" y "+rueda1.obtenerPulgadas());
        
        System.out.println("\nLos materiales y tamaño de la rueda2 son: "+rueda2.obtenerMaterial()+" y "+rueda2.obtenerPulgadas());
        //Creo objetos coche
        Coche coche1=new Coche();
        Coche coche2=new Coche();
        Coche coche3=new Coche();
        //Les otorgo narca y modelo
        coche1.establecerMarca("Toyota");
        coche1.establecerModelo("Ciprus");
        
        coche2.establecerMarca("Citroen");
        coche2.establecerModelo("C4");
        
        coche3.establecerMarca("BMW");
        coche3.establecerModelo("ix3");
        //Les otorgo rueda a los coches
        coche1.establecerRueda(rueda1);
        coche2.establecerRueda(rueda1);
        coche3.establecerRueda(rueda2);
        
        System.out.println("\nLos datos del coche1 son: \nMarca: "+coche1.obtenerMarca()
                            +"\nModelo: "+coche1.obtenerModelo()
                            +"\nRuedas: "+(coche1.obtenerRueda()).obtenerMaterial()+"-"+(coche1.obtenerRueda()).obtenerPulgadas());
        System.out.println("\nLos datos del coche2 son: \nMarca: "+coche2.obtenerMarca()
                            +"\nModelo: "+coche2.obtenerModelo()
                            +"\nRuedas: "+(coche2.obtenerRueda()).obtenerMaterial()+"-"+(coche2.obtenerRueda()).obtenerPulgadas());
        System.out.println("\nLos datos del coche3 son: \nMarca: "+coche3.obtenerMarca()
                            +"\nModelo: "+coche3.obtenerModelo()
                            +"\nRuedas: "+(coche3.obtenerRueda()).obtenerMaterial()+"-"+(coche3.obtenerRueda()).obtenerPulgadas());
    }
    
}
