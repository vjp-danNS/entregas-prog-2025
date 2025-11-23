/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;
/*
• Todos los productos llevan esta información común: fecha de caducidad y 
número de lote. 

/**
 *
 * @author Usuario
 */
public class Productos {
    private String fechaCaducidad;
    private int numeroLote;

    public Productos(String f, int num) {
        fechaCaducidad = f;
        numeroLote = num;
    }
    public Productos(){
        fechaCaducidad="";
        numeroLote=000;
        
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String f) {
        fechaCaducidad = f;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int num) {
        numeroLote = num;
    }
    public void showProducto(String nombreProducto){
        System.out.println("\n**************DATOS DE "+nombreProducto+"**************"
                +"\nLa fecha de caducidad de este producto es: "+fechaCaducidad+
                "\nEl numero de lote de este producto es: "+numeroLote);
    }
}