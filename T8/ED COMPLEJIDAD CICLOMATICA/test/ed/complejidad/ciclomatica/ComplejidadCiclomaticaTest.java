/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ed.complejidad.ciclomatica;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dan
 */
public class ComplejidadCiclomaticaTest {
    
    public ComplejidadCiclomaticaTest() {
    }

   /*
    @Test
    public void BusquedaBinariaCajaNegra() {
       
        ComplejidadCiclomatica test = new ComplejidadCiclomatica();
        assertEquals(0, test.busquedaBinariaMT(1));
    }
    
    @Test
    //Este revisa el camino  donde se busca un numero fuera del array
    public void BusquedaBinariaWhiteBox1(){
        ComplejidadCiclomatica test = new ComplejidadCiclomatica();
        
        assertEquals(-1, test.busquedaBinariaMT(11));
    }
    
    @Test
    //Este revisa el camino donde se busca un numero dentro del array dando la respuesta inmediata pasando solo por el nodo 4
    public void BusquedaBinariaWhiteBox2(){
        ComplejidadCiclomatica test = new ComplejidadCiclomatica();
        
        assertEquals(4, test.busquedaBinariaMT(5));
    }
    
     @Test
    //Este revisa el camino donde se busca un numero dentro del array menor que el index inicial, pasando por el nodo 10
    public void BusquedaBinariaWhiteBox3(){
        ComplejidadCiclomatica test = new ComplejidadCiclomatica();
        
        assertEquals(1, test.busquedaBinariaMT(2));
    }
    @Test
    //Este revisa el camino donde se busca un numero dentro del array mayor que el index inicial, pasando por el nodo 7
    public void BusquedaBinariaWhiteBox4(){
        ComplejidadCiclomatica test = new ComplejidadCiclomatica();
        
        assertEquals(9, test.busquedaBinariaMT(10));
    }
    */
    
    /*
    @Test
    //Test caja negra
    public void SumaPrimosCajaNegra(){
        
        ComplejidadCiclomatica test = new ComplejidadCiclomatica();
        
        assertEquals(77, test.sumaPrimos(20));
    
    }
    @Test
    //
    public void SumaPrimosCajaBlanca1(){
         ComplejidadCiclomatica test = new ComplejidadCiclomatica();
        
        assertEquals(2, test.sumaPrimos(2));
    }
    @Test
    //
    public void SumaPrimosCajaBlanca2(){
         ComplejidadCiclomatica test = new ComplejidadCiclomatica();
        
        assertEquals(5, test.sumaPrimos(3));
    }
    @Test
    //
    public void SumaPrimosCajaBlanca3(){
         ComplejidadCiclomatica test = new ComplejidadCiclomatica();
        
        assertEquals(5, test.sumaPrimos(4));
    }
    @Test
    //
    public void SumaPrimosCajaBlanca4(){
         ComplejidadCiclomatica test = new ComplejidadCiclomatica();
        
        assertEquals(2, test.sumaPrimos(2));
    }
    @Test
    //
    public void SumaPrimosCajaBlanca5(){
         ComplejidadCiclomatica test = new ComplejidadCiclomatica();
        
        assertEquals(2, test.sumaPrimos(1));
    }
    */
    @Test
    public void BurbujaCajaNegra(){
         ComplejidadCiclomatica test = new ComplejidadCiclomatica();
         
         int[] array= new int[]{1,6,7,2};
         
         assertFalse(test.burbuja(array));
        
    }
    
    
    @Test
    public void BurbujaCajaBlanca1(){
         ComplejidadCiclomatica test = new ComplejidadCiclomatica();
         
         int[] array= new int[]{};
         
         assertTrue(test.burbuja(array));
        
    }
    @Test
    public void BurbujaCajaBlanca2(){
         ComplejidadCiclomatica test = new ComplejidadCiclomatica();
         
         int[] array= new int[]{1,2,3,4};
         
         assertTrue(test.burbuja(array));
        
    }
    @Test
    public void BurbujaCajaBlanca3(){
         ComplejidadCiclomatica test = new ComplejidadCiclomatica();
         
         int[] array= new int[]{1,8,3,9,5};
         
         assertFalse(test.burbuja(array));
        
    }
    
}
