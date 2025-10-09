package ejercicio32fix;

import java.util.Scanner;

/**
 *
 * @author Dan
 */
public class Ejercicio32fix {

   
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in); //Creo objeto entrada
         long numEntrada;
         long aux1;
         long bill50;
         long bill20;
         long bill10;
         long bill5;
         long bill2;
         long bill1;
         //Declaracion de variables, declaro un auxiliar para no perder monto de numEntrada.
         System.out.print("Por favor, indique una cantidad de dinero: "); numEntrada=entrada.nextLong();
         
         aux1=numEntrada;
         bill50=aux1/50; aux1= aux1%50;
         bill20=aux1/20; aux1= aux1%20;
         bill10=aux1/10; aux1=aux1%10;
         bill5=aux1/5; aux1= aux1%5;
         bill2=aux1/2; aux1=aux1%2;
         bill1= aux1;
         //Calculo de billetes, utilizando auxiliar como memoria para reducir espacio de calculo
         System.out.println(numEntrada+" Euros se descomponen en "+bill50+" billetes de 50, "+bill20+" billetes de 20, "+bill10+" billetes de 10, "
         +bill5+" billetes de 5, "+bill2+" monedas de 2 euros y "+bill1+" monedas de 1 euro");
         
    }
    
}

