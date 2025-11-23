/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;
/* • iii.Los productos congelados deben llevar la temperatura de congelación 
    recomendada.
*/
/**
 *
 * @author Usuario
 */
public class ProductoCongelado extends Productos{
    private int tempRecomendada;

    public ProductoCongelado(int temp, String f, int num) {
        super(f, num);
        tempRecomendada = temp;
    }

    public int getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(int temp) {
        tempRecomendada = temp;
    }
    public void showProductoCongelado(String nombreProducto){
        super.showProducto(nombreProducto);
        System.out.println("La temperatura recomendada de congelacion es: "+tempRecomendada);
    }
    
}
