/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;
/*
• i. Los productos frescos deben llevar la fecha de envasado y el país de
    origen.
*/
/**
 *
 * @author Usuario
 */
public class ProductoFresco extends Productos{
    private String fechaEnvasado, paisOrigen;

    public ProductoFresco(String fC, int num, String fE,String p) {
        super(fC, num);
        fechaEnvasado=fE;
        paisOrigen=p;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String f) {
        fechaEnvasado = f;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String p) {
        paisOrigen = p;
    }
    
    public void showProductoFresco(String nombreProducto){
        super.showProducto(nombreProducto);
        System.out.println("El pais de origen de este pais: "+paisOrigen+"\nLa fecha de envasado de este producto es: "+fechaEnvasado);
    }
    
}
