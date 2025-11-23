/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author Usuario
 */
public class Empleados {
    //Atributos
    private String nombre;
    private int salario;
    private Direccion direccion;
    private int numeroEmpleado;
    private static int contadorEmpleados=0;
    //Constructores

    public Empleados(String n, int s,Direccion d) {
        nombre = n;
        salario=s;
        aumentarContadorEmpleados();
        numeroEmpleado=contadorEmpleados;
        direccion=d;
       
    }
    public Empleados(){
        nombre="";
        salario=0;
        aumentarContadorEmpleados();
        numeroEmpleado=contadorEmpleados;
        direccion=new Direccion();
        
    }
    //Getters/Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int s) {
        salario = s;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion d) {
        direccion = d;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }

    
    
    //Otros metodos
    public static void aumentarContadorEmpleados(){
        contadorEmpleados++;
    }
    //Mostrar
    public void mostrarEmpleado(){
    System.out.println("EMPLEADO "+numeroEmpleado+
                "\nNombre: "+nombre+
                "\nSalario: "+salario+
                "\nDireccion:"+
                "\n     Calle: "+direccion.getCalle()+
                "\n     Numero: "+direccion.getNumero()+
                "\n     Puerta: "+direccion.getPiso()+
                "\n     Ciudad: "+direccion.getCiudad()+
                "\n");
    }
}     
