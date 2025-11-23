
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
        
        //Bici1 con Constructor por defecto y su propietario
        Propietario propetario1 = new Propietario("Pepe", 25);       
        Bicicleta bici1 = new Bicicleta();
        bici1.setMarca("Orbea");
        bici1.setColor("Azul");
        bici1.setTipo("Montaña");
        bici1.setAntiguedad(6);
        bici1.setPropietario(propetario1);
        
        //Bici2 con Constructor parametrizado y nombre y edad de su propietaria
        Bicicleta bici2 = new Bicicleta("Cannodale", "Roja", "Carretera", 15, "Cristina", 40);
        
        //Bici3 con el segundo constructor parametrizado y su propietario
        Propietario propietario3 = new Propietario("Pedro", 31);      
        Bicicleta bici3 = new Bicicleta("Mitical");
        bici3.setColor("Negro");
        bici3.setTipo("Montaña");
        bici3.setAntiguedad(3);
        bici3.setPropietario(propietario3);
        
        //Mostramos el número de bicicletas creadas
        System.out.println("Número de bicicletas: " + Bicicleta.getContadorBicicletas());
        
        System.out.println("\n****** DATOS DE BICICLETAS ******");
        //Mostramos los datos de las tres bicicletas
        bici1.mostrarBicicleta();
        System.out.println("");
        //Mostramos bici2
        System.out.println(bici2.toString());
        //También podríamos mostrar directamente el objeto teniendo el toString implementado:
        //System.out.println(bici2);
        System.out.println("");
        //Mostramos bici3
        bici3.mostrarBicicleta();
        System.out.println("");       
        
        //Mostramos solo un atributo usando el método get (por ejemplo, la marca de bici2).
        System.out.println("Marca de bici2: " + bici2.getMarca());
        
        //Mostrar antigüedad de bici1 y bici2        
        bici1.mostrarAntiguedad();
        bici2.mostrarAntiguedad();   
        
        System.out.println("\n****** DATOS DE PROPIETARIOS ******");
        //Mostramos los datos del propietario de la bici1 obteniendo previamente el objeto
        Propietario p1 = bici1.getPropietario();
        System.out.println(p1.toString());
        
        //Mostramos los datos del propietario de la bici2 directamente
        System.out.println(bici2.getPropietario().toString());
        
        //Mostramos solo un atributo del propietario usando el método get(por ejemplo, el nombre del propietario de bici3).
        System.out.println("Propietario de bici3: " + bici3.getPropietario().getNombre());
    }

}
