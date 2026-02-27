/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed.complejidad.ciclomatica;

/**
 *
 * @author Dan
 */
public class ComplejidadCiclomatica {
    
    
    private int[] array= new int[]{1,2,3,4,5,6,7,8,9,10}; 
            
    public int busquedaBinariaMT (int numero){
    
        int umbral_inferior=0;                                  //N 1
        int umbral_superior=array.length-1;
        int respuesta= -1;
        int index;
        
        while (umbral_inferior<=umbral_superior) {              //N 2          
            index = (umbral_inferior + umbral_superior)/2;      //N 3
            
            if (array[index] == numero) {                       //N 4
                respuesta=index;                                //N 5    
                umbral_inferior = umbral_superior+1;
            }// fin if                                          //N 6
            else if (array[index] < numero) {                   //N 7
                umbral_inferior=index+1;                        //N 8
            } // fin else if                                    //N 9
            else {                                              //N 10
                umbral_superior= index-1;                       //N 11
            } //fin else                                        //N 12
        }//fin while                                            //N 13
            
        return respuesta;                                       //N 14
    }// fin metodo
    
    public static int sumaPrimos(int numeroMaximo){
        int acumulador=0;                                   //N 1
        int numero=2;
        int contador;
        boolean primo;
        
        do {                                                //N 2
            System.out.println(numero);                   //N 3
            contador=2;
            primo=true;
            while ((primo)&&(contador != numero)) {         //N 4  
                if (numero % contador == 0) {               //N 5
                    primo =false;                           //N 6
                }//fin if                                   //N 7
                contador++;                                 //N 8
            }//fin while
            if (primo) {                                    //N 9
                acumulador=acumulador+numero;               //N 10
            }//fin if
            
            numero++;                                       //N 11
        } while (numero<=numeroMaximo);                     //N 12
        
        return acumulador;                                  //N 13
    }//fin metodo
    
    public boolean burbuja(int[] arrayNumeros){
        boolean ordenado = true;                                    //N 1
        int elementoActual, elementoSiguiente;
        
        for (int x = 0; x < arrayNumeros.length; x++) {             //N 2
            for (int y = 0; y < arrayNumeros.length-1; y++) {       //N 3
                elementoActual = arrayNumeros[y];                   //N 4
                elementoSiguiente = arrayNumeros[y+1];
                
                if (elementoActual>elementoSiguiente ) {            //N 5
                    
                    arrayNumeros[y]=elementoSiguiente;              //N 6
                    arrayNumeros[y+1]=elementoActual;
                    ordenado=false;
                    
                }                                                   //N 7
            }                                                       //N 8
        }                                                           //N 9
        
        return ordenado;                                            //N 10
    }
}
