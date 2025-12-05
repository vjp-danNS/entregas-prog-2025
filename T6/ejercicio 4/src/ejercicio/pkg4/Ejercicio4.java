/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;

/**
 *
 * @author alumno
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo los objetos de los diferentes animales mediante sus constructores parametrizados
        Perros perro=new Perros("Ladrido", "Carnivora", "Domestico", "Canis lupus familiaris", "Lupita", 5, 12);
        Lobos lobo=new Lobos("Aullido",  "Carnivora", "Bosque", "Canis lupus", "Balto", 6, 25);
        Leones leon=new Leones("Rugido", "Carnivora", "Sabana", "Panthera leo", "Leo", 3, 30);
        Gatos gato=new Gatos("Maullido", "Ratones","Domestico", "Felis silvestris catus", "Felix", 12, 7);
        //Creo objeto con polimorfismo
        Animales copito;
        copito= new Gatos("Maullido", "Ratones", "Domestico", "Felis silvestris catus", "Copito", 3, 10);
        //Muestro los resultados
        System.out.println(perro);
        System.out.println(lobo);
        System.out.println(leon);
        System.out.println(gato);
        System.out.println(copito);
    }
    
}
