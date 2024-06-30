/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package languaje.java.completo.ejercicios;

import java.util.Scanner;

/**
 *
 * @author JEFFERSON
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        
        
        
          System.out.println("Ingrese la palabra a imprimir: ");
        Scanner teclado = new Scanner(System.in);
        
       String palabra = teclado.nextLine();

        
        while(!palabra.equalsIgnoreCase("salir") ){

            System.out.println("La palabra ingresada es: " + palabra);
            
             System.out.println("Ingrese la palabra a imprimir: ");
            palabra = teclado.nextLine();

        }
    }
    
}
