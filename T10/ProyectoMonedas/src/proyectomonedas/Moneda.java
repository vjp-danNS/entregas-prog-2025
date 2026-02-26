/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomonedas;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Moneda {
    private int valor;
    private String procedencia, material;
    
//Constructores
    //Parametrizado
    public Moneda(int valor, String procedencia, String material) {
        this.valor = valor;
        this.procedencia = procedencia;
        this.material = material;
    }
    
    //Default
    public Moneda(){
        valor=0;
        procedencia="";
        material="";
    }
    
//Getter/Setter

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
//toString

    @Override
    public String toString() {
        return "Moneda(" + "valor: " + valor + ", procedencia: " + procedencia + ", material: " + material + ')';
    }
    
//Otros Metodos
    
    /*Este metodo utiliza un loop for para recorrer el array de Moneda y poner en cada posicion una moneda con
    los datos entregados por el usuario*/
    public static Moneda[][] rellenarCajaFuerte(Moneda[][] cajaFuerte){
        //Objetos Scanner
        Scanner escString =new Scanner(System.in);
        Scanner escInt =new Scanner(System.in);
        
        //Variables que almacenan temporalmente los datos
        int valor;
        String procedencia, material;
        
        //Mensaje de comienzo 
        System.out.println("\nAhora comenzaremos a rellenar la caja fuerte con 9 monedas y sus datos:");
        
        //Comienza el loop de relleno, pido los datos que almacen en variables para despues crear el objeto en el loop
        for (int i = 0; i < cajaFuerte.length; i++) {
            for (int j = 0; j < cajaFuerte[i].length; j++) {
                System.out.println("\nMoneda "+(i+1)+(j+1)+": ");
                System.out.print("Valor: ");
                valor=escInt.nextInt();
                System.out.print("Procedencia: ");
                procedencia=escString.nextLine();
                System.out.print("Material: ");
                material=escString.nextLine();

                cajaFuerte[i][j]= new Moneda(valor, procedencia, material);

                //Mensaje de fin de relleno de cada moneda
                System.out.println("\nMoneda "+(i+1)+(j+1)+" rellenada de forma correcta.");
            }
        }
        
        //Devuelvo el array lleno
        return cajaFuerte;
    }
    
    /*Este metodo busca el material indicado por el usuario de cada uno de los objetos moneda,
    si uno coincide con el buscado devuelve el toString de dicha moneda, en caso no encontrar 
    ninguno devuelve un mensaje de error*/
    public static void buscarMaterial(Moneda[][] cajaFuerte){
        //Objeto Scanner
        Scanner escString=new Scanner(System.in);
        //Variables
        String materialBuscado;
        boolean encontrado=false;
        
        //Pido al usuario el material
        System.out.print("Introduzca el nombre que busca del material, siga el formato que uso al ingresar los datos: ");
        materialBuscado=escString.nextLine();
        
        //Loop for de busqueda que recorre siempre todo el array
        for (int i = 0; i < cajaFuerte.length; i++) {
            for (int j = 0; j < cajaFuerte[i].length; j++) {
                //Si encuentra el material, imprime los datos de dicha moneda y marca como encontrado el material
                if (Objects.equals(materialBuscado, cajaFuerte[i][j].getMaterial())) {
                    System.out.println(cajaFuerte[i][j].toString());
                    encontrado=true;
                }
            }
        }
        //Si no encuentra el material buscado, error de busqueda
        if (!encontrado) {
            System.err.println("Material no encontrado entre las monedas, revise el formato de escritura");
        }
        
        
    }
    
    /*Este metodo recorre todo el array con un for loop revisando el valor de cada moneda y guardando el "id"
    o posicion de la moneda con el valor mas alto para despues imprimir sus datos
    */
    
    public static void monedaMasValiosa(Moneda[][] cajaFuerte){
        //Variables
        int linea=1, compartimento=1;
        int valorMasAlto=cajaFuerte[0][0].getValor();
        
        //Recorre la matriz buscando el mas valioso
        for (int i = 0; i < cajaFuerte.length; i++) {
            for (int j = 0; j < cajaFuerte.length; j++) {
                if (valorMasAlto<cajaFuerte[i][j].getValor()) {
                    valorMasAlto=cajaFuerte[i][j].getValor();
                    linea=i;
                    compartimento=j;
                }
            }
        }
        //Muestra la moneda mas valiosa y sus datos
        System.out.println("La moneda con el valor mas alto se encuentra en la linea "
                +(linea+1)+" compartimiento "+(compartimento+1)+"\nDatos: \n"
                +cajaFuerte[linea][compartimento].toString());
        
    }
}
