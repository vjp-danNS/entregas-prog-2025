
package pruebaclases;

/**
 * Clase Main
 * 
 * @author Daniel
 */
public class PruebaClases {

    /**
     * Método main
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos bici1 con el constructor por defecto
        Bicicleta bici1 = new Bicicleta();
        bici1.setMarca("Orbea");
        bici1.setColor("Azul");
        bici1.setTipo("Montaña");
        bici1.setAntiguedad(6);
        
        //Creamos bici2 con el constructor parametrizado
        Bicicleta bici2 = new Bicicleta("Cannodale", "Roja", "Carretera", 15);
        
        //Mostramos bici1
        bici1.mostrarBicicleta();
        System.out.println("");
        //Mostramos solo la marca de la bici2
        System.out.println("Marca: " + bici2.getMarca());
        System.out.println("");
        //Mostramos bici2
        System.out.println(bici2.toString());
        System.out.println(""); 
        //Para mostrar un objeto, podemos ahorrarnos el invocar al método toString() si lo tenemos implementado.
        //Podemos mostrar directamente el objeto:
        //System.out.println(bici2);
        
        //Mostrar antigüedad de bici1 y bici2        
        bici1.mostrarAntiguedad();
        bici2.mostrarAntiguedad();    
    }

}
