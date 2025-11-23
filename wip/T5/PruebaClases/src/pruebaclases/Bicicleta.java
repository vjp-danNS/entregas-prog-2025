
package pruebaclases;

/**
 * Clase Bicicleta
 * 
 * @author Daniel
 */
public class Bicicleta {
    
    //Atributos
    private String marca;
    private String color;
    private String tipo;
    private int antiguedad;
    private Propietario propietario;
    
    //Atributo static para contar el número de bicicletas
    private static int contadorBicicletas = 0;
    
    //Constructores
    public Bicicleta(){
        marca="";
        color="";
        tipo="";
        antiguedad=0;
        propietario=new Propietario();
        aumentarContadorBicicletas();
    }
    
    public Bicicleta(String m, String c, String t, int a, String nomPropietario, int edadPropietario){
        marca=m;
        color=c;
        tipo=t;
        antiguedad=a;
        propietario=new Propietario(nomPropietario, edadPropietario);
        aumentarContadorBicicletas();
    }
    
    public Bicicleta(String m){
        marca=m;
        color="";
        tipo="";
        antiguedad=0;
        propietario= new Propietario();
        aumentarContadorBicicletas();
    
    }
    
    //Getters/Setters
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String m){
        marca = m;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String c){
        color = c;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String t){
        tipo = t;
    }
    
    public int getAntiguedad(){
        return antiguedad;
    }
    
    public void setAntiguedad(int a){
        antiguedad = a;
    }

    public static int getContadorBicicletas() {
        return contadorBicicletas;
    }

    public static void setContadorBicicletas(int contadorBicicletas) {
        Bicicleta.contadorBicicletas = contadorBicicletas;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    
    
    //Otros métodos
    public void mostrarAntiguedad(){
        if(antiguedad > 10){
            System.out.println("La bici " + marca + " es antigüa");
        } else {
            System.out.println("La bici " + marca + " es nueva");
        }
    }
    
    public static void aumentarContadorBicicletas(){
        contadorBicicletas++;
    }
    
    //Mostrar bicicleta
    public void mostrarBicicleta(){
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Tipo: " + tipo);
        System.out.println("Antigüedad: " + antiguedad);
        System.out.println(propietario.toString());
    }

    //Método toString() de la clase
    @Override
    public String toString() {
        return "Bicicleta{" 
                + "marca=" + marca 
                + ", color=" + color 
                + ", tipo=" + tipo 
                + ", antiguedad=" + antiguedad          
                + ", " + propietario.toString()
                + '}';
    }
    
    
    
}
