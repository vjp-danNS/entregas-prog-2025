/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;
/*
Ejercicio 24.- 
Se plantea desarrollar un programa Java que permita la gestión de una empresa 
agroalimentaria que trabaja con tres tipos de productos: productos frescos, 
productos refrigerados y productos congelados. 
• Todos los productos llevan esta información común: fecha de caducidad y 
número de lote. 
• A su vez,cada tipo de producto lleva alguna información específica: 
    • i. Los productos frescos deben llevar la fecha de envasado y el país de
    origen.
    • ii.Los productos refrigerados deben llevar el código del organismo de 
    supervisión alimentaria. 
    • iii.Los productos congelados deben llevar la temperatura de congelación 
    recomendada. 
• Crear el código de las clases Java implementando una relación de herencia 
desde la superclase Producto hasta las subclases ProductoFresco, ProductoRefrigerado 
y ProductoCongelado. 
• Cada clase debe disponer de constructor y permitir establecer (set) y recuperar (get) 
el valor de sus atributos y tener un método que permita mostrar la información del objeto. 
• Crear una clase Test con el método main donde se cree un objeto de cada tipo y se muestren 
los datos de cada uno de los objetos creados.
*/

/**
 *
 * @author Usuario
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo un objeto de cada uno de los posibles tipos de producto
        ProductoFresco manzana=new ProductoFresco("01/02/2026", 011, "05/12/2025", "Chile");
        ProductoRefigerado guacamole=new ProductoRefigerado("12/05/2026", 145, "AESAN");
        ProductoCongelado tacosCerdo=new ProductoCongelado(-10, "15/12/2025", 331);
        
        //Muestro cada uno
        manzana.showProductoFresco("Manzana");
        guacamole.showProductoRefigerado("Guacamole");
        tacosCerdo.showProductoCongelado("Tacos de Cerdo");
    }
    
}
