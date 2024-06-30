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
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el limite de numeros a mostrar: ");
        
        int entrada = teclado.nextInt();
        
        
        for(int contador= 0; contador<= entrada; contador++){ 
            
            System.out.println("El numero es: " +  contador);
            
            
            
        }
        
        
        
        
    }
    
}
