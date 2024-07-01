/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package languaje.java.completo;

import java.util.Scanner;

/**
 *
 * @author JEFFERSON
 */
public class Arreglos {
    
    public static void main(String[] args) {
        
        //Declaracion 
        int vector[] = new int[4];
        
        
        //Asignación ( por teclado)
        
        Scanner teclado = new Scanner(System.in);
        
         for(int i=0; i<vector.length; i++){
             System.out.println("Ingrese el valor para el indice: " + i);
             vector[i]= teclado.nextInt();
             System.out.println("==================================");
         }
        
     
        
        //recorrido

        
        for(int i=0; i<vector.length; i++){
        
        System.out.println("La posicion del vecto es: "+ i + "y su valor es: " + vector[i]);
       }
    }
    
}
