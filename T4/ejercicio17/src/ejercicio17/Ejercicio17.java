/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author alumno
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro variables
        char letraCorrecta;
        int letterId;
        //Empiezo a invocar variables
        letterId=(int)LetraAleatoria.genRandomLetterNumberId();//Guardo el numero equivalente a la letra
        letraCorrecta=LetraAleatoria.genRandomLetter(letterId);//Guardo la letra
        LetraAleatoria.userAdivina(letterId);//El usuario adivina aqui
    }
    
}
