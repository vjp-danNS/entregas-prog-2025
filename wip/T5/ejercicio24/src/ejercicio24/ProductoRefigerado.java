/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;
/*• ii.Los productos refrigerados deben llevar el código del organismo de 
    supervisión alimentaria.
*/

/**
 *
 * @author Usuario
 */
public class ProductoRefigerado extends Productos{
    private String codigoOrganismo;
    public ProductoRefigerado(String fC, int num, String cod) {
        super(fC, num);
        codigoOrganismo=cod;
    }

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String cod) {
        codigoOrganismo = cod;
    }
    public void showProductoRefigerado(String nombreProducto){
        super.showProducto(nombreProducto);
        System.out.println("El codigo del organismo de supervision alimentaria es: "+codigoOrganismo);
    }
    
    
    
}
