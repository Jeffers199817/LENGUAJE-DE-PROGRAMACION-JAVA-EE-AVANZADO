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
public class Ejercicio9 {
    public static void main(String[] args) {
        
        //definir las variables
        
        String nombres[] = new String[8];
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("Programa que permite Ingresar e imprimir 8 nombres.");
        System.out.println("====================================================");
        for(int i=0; i<nombres.length;i++){
            
            System.out.println("Ingrese el nombre: " + (i+1) );
            nombres[i]=teclado.nextLine();

        }
        
        System.out.println("=====================================================");
        for(int j=0; j<nombres.length; j++){ 
            
            System.out.println("Los nombres registrados son:");
            System.out.println((j+1) + ".-"+ nombres[j]);
            
            
        }
        System.out.println("Gracias por proferirnos, Excelente dia.");
    }
    
}
